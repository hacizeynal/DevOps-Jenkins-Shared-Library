#!/usr/bin/env groovy

def BRANCH_NAME = getCurrentBranch()
echo 'Current branch is' + BRANCH_NAME

def call() {
    echo "building the Jar File for ${env.BRANCH_NAME}"
    sh "mvn package"
}
