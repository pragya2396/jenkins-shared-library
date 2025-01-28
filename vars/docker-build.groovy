def call(String ProjectName,String ImageTag,String DockerHubUser){
   echo "this is building the code"
   sh "whoami"
   sh "docker build -t "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" ."
}
