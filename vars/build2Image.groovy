def call(String imagename) {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t $imagename ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imagename"
    }
}
