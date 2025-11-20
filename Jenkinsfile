pipeline {
    agent any

    tools {
        maven "maven_3"   // Name you configured in Jenkins → Global Tool Configuration
        jdk "jdk17"       // Name of your JDK in Jenkins
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/YOUR_USER/YOUR_REPO.git'
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean compile"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

        stage('Package') {
            steps {
                sh "mvn package"
            }
        }

        stage('Deploy') {
            steps {
                echo "Simulating Deployment..."
                echo "Deploying target/my-hello-world-1.0-SNAPSHOT.jar"
            }
        }
    }

    post {
        success {
            echo "Build Successful!"
        }
        failure {
            echo "Build Failed!"
        }
    }
}
