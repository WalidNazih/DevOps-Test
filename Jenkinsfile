pipeline {
    
    agent any
    stages{
        stage('Compile'){
        	steps{
        	    bat 'mvn clean package'
        	}
        }
        
        parallel branchone:{
            
	        stage('Build'){
	        	steps{
	        	    bat 'java -jar target/DevOpsDemo-1.jar'
	        	}
	        }
	        
	        
        }, branchtwo:{
            stage('Test'){
	        	steps {
	        		sleep 10
		            bat 'mvn test'
		        }
	            
	        }
        }
		
		failFast: true

        


    }

    
}