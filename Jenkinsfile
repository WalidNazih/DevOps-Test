pipeline {
    
    agent any
    stages{
        stage('Build'){
            bat('mvn clean package')
        }
        
        stage('Test'){
            bat('mvn test')
        }


    }

    
}