pipeline {
    
    agent any
    stages{
        stage('Compile'){
        	steps{
        	    bat 'mvn clean package'
        	}
        }
        
        stage('Build'){
        	steps{
        	    bat 'java -jar target/DevOpsDemo1.jar'
        	}
        }
        
        stage('Test'){
        	steps {
	            bat 'mvn test'
	        }
            
        }


    }

    
}