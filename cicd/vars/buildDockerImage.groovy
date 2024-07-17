def call() {
    if (env.BRANCH_NAME == 'main') {
        sh '''
            echo "Building Docker image: ${IMAGE_NAME}:${IMAGE_TAG}"
            cp cicd/logos/logo.svg src/logo.svg
            docker build -t ${DOCKER_REGISTRY}/${IMAGE_NAME}:${IMAGE_TAG} .
        '''
    } else if (env.BRANCH_NAME == 'dev') {
        sh '''
            echo "Building Docker image: ${IMAGE_NAME}:${IMAGE_TAG}"
            cp cicd/logos/logo2.svg src/logo.svg
            docker build -t ${DOCKER_REGISTRY}/${IMAGE_NAME}:${IMAGE_TAG} .
        '''
    }
}
