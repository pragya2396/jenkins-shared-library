def call(String Project,String ImageTag,String dockerhubUser){
  withCredentials([usernamePassword
                ('credentialsId':"dockerhubcred",
                'passwordVariable':"dockerHubPass",
                'usernameVariable':'dockerHubUser')]){
                echo "this is pushing the image"
                sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
                sh "docker image tag ${Project}:${ImageTag} ${dockerhubUser}/${Project}:${ImageTag}"
                sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
  } 
}
