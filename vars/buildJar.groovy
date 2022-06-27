#!/usr/bin/env groovy

<<<<<<< HEAD
def call() {
    echo "building the application..."
    sh 'mvn package'
=======
def getCurrentBranch () {
    def fullRemoteBranchName =  sh (
        script: 'git name-rev --name-only HEAD',
        returnStdout: true
    ).trim()
    
    echo "Full Remote Branch Name: " + fullRemoteBranchName
    
    def currentBranch = fullRemoteBranchName.substring(fullRemoteBranchName.lastIndexOf('/') + 1, fullRemoteBranchName.length())
    return currentBranch
}

def call() {
    def branchName = getCurrentBranch()
    echo 'My branch is ' + branchName
    echo "<==================================>"
    echo "building the Jar File for " + branchName
    sh "mvn package"
>>>>>>> 483533836c5be100ccf12329730465de67cebe59
}
