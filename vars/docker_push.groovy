def call(String Project, String ImageTag, String dockerhubUser ){
  withCredentials([usernamePassword(
                    'credentialsId':'dockerHubCred', 
                    passwordVariable: 'dockerHubPass', 
                    usernameVariable:'dockerHubUser' )])
                {
                    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"                    
                }
                sh "docker push ${dockerHubuser}/${Project}:${ImageTag}"
        
}
