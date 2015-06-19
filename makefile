region = us-west-2
platform = docker

all: run

run:
	activator run

develop:
	$(eval cname := master-sproutup-co) 
	$(eval environment_name := master)
	$(eval configuration := master) 
	$(eval application_name := master)

master:
	$(eval cname := roger-sproutup-co) 
	$(eval environment_name := roger)
	$(eval configuration := roger) 
	$(eval application_name := roger)
	$(eval keypair := endurance)

status:
	echo $(environment_name)/$(application_name)

clean:
	activator clean

stage:
	activator docker:stage

init:
	cd target/docker; eb init -r $(region) -p $(platform) -k $(keypair) $(environment_name)

create: init
	cd target/docker; eb create $(application_name) -c $(cname) --cfg $(configuration)

deploy: master clean stage docker init
	cd target/docker; eb deploy

docker:
	cp -R Dockerfile target/docker/

developxx:
	cp conf/docker/master/Dockerfile target/docker/Dockerfile
	cd target/docker
	eb init -r us-west-2 -p docker -k endurance dev
	eb deploy

masterxx:
	cp -R Dockerfile target/docker/
	cd target/docker
	eb init -r us-west-2 -p docker -k $(keypair) sproutup
	eb deploy prod

create-master:
	eb create prod -r us-west-2 -c sproutup -t WebServer -i t2.small --scale 4 -k endurance

create-develop:
	eb create sproutup-dev -r us-west-2 -c sproutup-dev -t WebServer -i t2.small -s -k endurance

installmon:
	npm install -g browser-sync

mon:
	browser-sync start --proxy "0.0.0.0:9000" --files "**/*.js, **/*.java, **/*.html"

