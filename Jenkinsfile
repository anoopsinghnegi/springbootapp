pipeline {
    agent any
    tools {
        maven "mvn"
    }
    stages{
        stage ("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/anoopsinghnegi/springbootapp.git'
            }
        }
        stage ("Build") {
            steps {
                sh 'mvn clean package'
            }
        }
        stage ("Build Docker Image") {
            steps {
                sh "docker build -t springboot:$BUILD_ID ."
            }
        }
        stage ("Kubernetes") {
            steps {
                sh "echo $KUBECONFIG"
                sh "kubectl get nodes"
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
        }
    }
}
