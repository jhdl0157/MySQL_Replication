# Replication 설정 방법

## 테스트 환경
- AWS EC2 amazon linux(t3.small)

## ec2에 필요한것들 설치
```java
#업데이트
sudo yum update -y

#git 설치
sudo yum install git -y

#도커 설치
sudo amazon-linux-extras install docker 

#도커 시작
sudo service docker start

#도커 컴포즈 설치
sudo curl -L https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
```

