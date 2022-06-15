def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t zhajili/devops:jma-4.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push zhajili/devops:jma-4.0'
    }
}
