#!/usr/bin/env groovy

def getCurrentBranch () {
    return sh (
        script: 'git rev-parse --abbrev-ref HEAD',
        returnStdout: true
    ).trim()
}

def call() {
    def branchName = getCurrentBranch()
    echo 'My branch is' + branchName
    echo "building the Jar File for ${env.BRANCH_NAME}"
    sh "mvn package"
}
