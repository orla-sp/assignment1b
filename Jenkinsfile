pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				echo 'Building...'
                bat 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				bat 'gradle war'
				bat 'xcopy C:\\Users\\orlam\\Documents\\4th_year\\Software_Eng\\A1A\\build\\libs\\A1A-1.0-SNAPSHOT.war C:\\Users\\orlam\\apache-tomcat-8.5.72\\webapps'
            }
        }
    }
}
