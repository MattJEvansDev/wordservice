# An Example Service 
This project is an example Microservice based off the [ServiceTemplate project](https://github.com/MattJEvansDev/servicetemplate)

The Microservice simply returns a random word when a get request to /word/random is made.

### Prerequisites
* You are running JDK 1.8 or above
* This project uses gradle wrapper

## Deployment instructions
To build run:
```
./gradlew clean build -PserviceVersion=0.1.1  dockerTag
```

To run as a spring boot app run:
```
./gradlew bootRun
```

Or as a Docker container run:

```
docker run --name test-instance -p 8083:8083 -d mjevans/wordservice
```

To test the deployment go to:
Go to http://localhost:8083/word/random 

To Run via Kuberentes, please view [Running within Kuberenetes from the associated Service Template project ](https://github.com/MattJEvansDev/servicetemplate/blob/master/README.md)



## License
This project uses the Apache 2.0 License, please see LICENSE.md for a copy

A report of runtime open source licenses can be generated using the gradle task
```
./gradlew downloadLicenses
```

This generates a html document within build/reports/license
To view third party testing libraries, set 
```
dependencyConfiguration = 'compileTest'
```

## Acknowledgements
This project compliments the [ServiceTemplate project](https://github.com/MattJEvansDev/servicetemplate). 
All ideas are based around Microservice Architecture best practises