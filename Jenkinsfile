pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/2200030884/SpringMVCwithCI-CD.git' // Replace with your GitHub repo URL
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean package' // Build your project using Maven wrapper
            }
        }
        stage('Docker Build & Run') {
            steps {
                sh 'docker-compose down'  // Stop any running containers
                sh 'docker-compose build' // Build Docker images
                sh 'docker-compose up -d' // Run containers in detached mode
            }
        }
    }
}
