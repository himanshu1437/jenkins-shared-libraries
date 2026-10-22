def call (String ProjectName, String ImageTag, String DockerHubUser){
  sh"docker build -t ${ProjectName}, ${ImageTag}, ${DockerHubUser}"
}
