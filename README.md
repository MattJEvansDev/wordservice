# An Example Service 
This project is an example Microservice based off the [ServiceTemplate project](https://github.com/MattJEvansDev/servicetemplate)

The Microservice simply returns a random word when a get request to /word/random is made.

### Prerequisites
* Docker is installed on your local box
* You are running JDK 1.8 or above
* Branches have been setup with GitFlow https://github.com/nvie/gitflow
* This project uses gradle wrapper

## Deployment instructions
To build run:
```
./gradlew clean build -PserviceVersion=0.1.1  docker
```

To run as a spring boot app run:
```
./gradlew bootRun
```

Or as a Docker container run:

```
docker run --name test-instance -p 8083:8083 -d wordservice/0.1.1
```

To test the deployment go to:
Go to http://localhost:8083/word/random 

## License
This project uses the Apache 2.0 License, please see LICENSE.md for a copy

For information on opensource projects that are have been used, please check OPENSOURCE-LICENSES.md


## Acknowledgements
This project compliments the [ServiceTemplate project](https://github.com/MattJEvansDev/servicetemplate). 
All ideas are based around Microservice Architecture best practises