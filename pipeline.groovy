pipeline {
    agent any
    stages{
        stage('pull'){
            steps{
                echo "hello pull complited"
                
            }
            
        }
        stage('build'){
            steps{
                 echo "hello build complited"
            }
           
        }
        stage('test'){
            steps{
                echo "hello test complited"
            }
            
        }
        stage('deloy'){
            steps{
                echo "hello deploy complited"
            }
           
        }
    }
}
