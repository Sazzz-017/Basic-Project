pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Sazzz-017/Basic-Project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'echo Building Spring Boot app...'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'echo Running JUnit tests...'
                sh './mvnw test'
            }
        }

        stage('Run') {
            steps {
                sh 'echo Starting Spring Boot app...'
                sh 'java -jar target/*.jar &'
            }
        }
    }
}
