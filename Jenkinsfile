node {
 stage('checkout') {
  checkout scm
 }
 stage('deploy') {
  echo 'branch name ' + env.BRANCH_NAME
 
  if (env.BRANCH_NAME.startsWith("f")) {
   echo "Deploying to Dev environment after build"
  } else if (env.BRANCH_NAME.startsWith("r")) {
   echo "Deploying to Stage after build and Dev Deployment"
  } else if (env.BRANCH_NAME.startsWith("tst")) {
   echo "Deploying to TST environment"
  } else if (env.BRANCH_NAME.startsWith("master")) {
   echo "Deploying to PROD environment"
  }
 }
}
