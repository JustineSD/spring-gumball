# CMPE 172 - Final Notes

# Docker MYSQL Setup
1. First set up a mysql container in docker by running th commands

```
docker network create --driver bridge gumball

docker run -d --network gumball --name mysql -td -p 3306:3306 -e MYSQL_ROOT_PASSWORD=cmpe172 mysql:8.0
```

2. Next I manually created a database named "gumballAmount" to match my application.properties using this command"

```
docker exec -it mysql bash

mysql --password ("cmpe172")

create database gumballAmount;
```

# Docker Image Push
1. To push my project image onto dockerhub I used the following commands in my project directory

```
gradle clean

gradle build -x test

gradle bootJar

docker build -t spring-gumball .

docker run --network gumball -e "MYSQL_HOST=mysql" --name spring-gumball -td -p 8080:8080 spring-gumball

docker login

docker build -t juss2000/spring-gumball:latest -t juss2000/spring-gumball:latest .

docker push juss2000/spring-gumball:latest
```

![](images/imagepush1.jpeg)
![](images/imagepush2.jpeg)
![](images/containers.png)
![](images/dockerhub.png)


Service Accounts
![](images/serviceaccounts.png)

Keys
![](images/sakey.png)

Secrets
![](images/secrets.png)

Clusters
![](images/clusters.png)

Release
![](images/release.png)

Workflows
![](images/workflows.png)

GKE Deployment on Github
![](images/GKEdeploy.png)

Workloads
![](images/workloads.png)

Services
![](images/services.png)

Ingress Creation
![](images/ingresscreation.png)

Ingress
![](images/ingress.png)

Gumball Deployment
![](images/gumball.jpeg)