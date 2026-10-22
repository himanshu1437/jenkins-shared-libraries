def call (string ProjectName, string ImageTag, string DockerHubUser){
  sh"dockerbuild -t ${ProjectName}, ${ImageTag}, ${DockerHubUser}"
}
