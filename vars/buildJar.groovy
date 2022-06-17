#!/usr/bin/env groovy

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
    echo "building the Jar File for ${env.BRANCH_NAME}"
    sh "mvn package"
}
