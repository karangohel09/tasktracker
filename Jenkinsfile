pipeline {
    agent any

    environment {
        IMAGE_NAME = "tasktracker"
        CONTAINER_NAME = "tasktracker"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                        url: 'https://github.com/karangohel09/tasktracker.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t tasktracker .'
            }
        }

        stage('Stop Existing Containers') {
            steps {
                bat 'docker compose down'
            }
        }

        stage('Start Containers') {
            steps {
                bat 'docker compose up -d --build'
            }
        }

        stage('Verify Containers') {
            steps {
                bat 'docker ps'
            }
        }
    }

    post {
        success {
            echo 'Application deployed successfully.'
        }

        failure {
            echo 'Pipeline failed.'
        }
    }
}