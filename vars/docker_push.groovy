def call (String Project, String ImageTag, String DockerHubUser){
   withCredentials ([usernamePassword(
     'credentialsId':"DockerHubcred",
      usernameVariable:"dockerHubUser", 
     passwordVariable:"dockerHubPass")]){
     sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
     }
     sh "docker image tag notes-app:latest ${dockerHubUser}/notes-app:latest"
     sh "docker push ${dockerHubUser}/notes-app:latest"
    }
