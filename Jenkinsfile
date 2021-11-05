pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
				echo 'Building...'
                bat 'gradle build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				bat 'gradle war'
				bat 'xcopy C:\\Users\\orlam\\Documents\\4th_year\\Software_Eng\\A1B\\build\\libs\\A1B-v1.0.1.war C:\\Users\\orlam\\apache-tomcat-8.5.72\\webapps'
            }
        }
    }
}
