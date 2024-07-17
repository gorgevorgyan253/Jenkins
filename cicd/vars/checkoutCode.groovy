def call() {
    checkout scm
    echo "Branch name: ${env.BRANCH_NAME}"
    if (env.BRANCH_NAME == 'main') {
        env.PORT = '3000'
        env.IMAGE_NAME = 'nodemain'
        env.CONTAINER_NAME = 'nodemain'
    } else if (env.BRANCH_NAME == 'dev') {
        env.PORT = '3001'
        env.IMAGE_NAME = 'nodedev'
        env.CONTAINER_NAME = 'nodedev'
    }
}
