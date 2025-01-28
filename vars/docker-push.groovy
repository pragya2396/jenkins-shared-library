def call(){
  withCredentials([usernamePassword
                ('credentialsId':"dockerhubcred",
                'passwordVariable':"dockerHubPass",
                'usernameVariable':'dockerHubUser')]){
                echo "this is pushing the image"
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag notes-app:latest pragya01/notes-app:latest"
                sh "docker push pragya01/notes-app:latest"
                }
}
