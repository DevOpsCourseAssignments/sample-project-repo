pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
                failure {
                    githubNotify credentialsId: '43337632-f8f1-4f5a-9ee3-3abf3e53bcf1', description: 'Tests has failed.',  status: 'FAILURE'
                }
            }
        }
        stage('Deliver') { 
            steps {
                sh 'mvn install' 
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
