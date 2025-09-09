def call(String Project, String ImageTag, String dockerhubUser ){
  withCredentials([usernamePassword(
                    'credentialsId':'docker', 
                    passwordVariable: 'dockerhubPass', 
                    usernameVariable:'dockerhubUser' )])
                {
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"                    
                }
                sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
        
}
