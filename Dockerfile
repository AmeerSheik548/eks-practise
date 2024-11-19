FROM openjdk:17
ADD build/libs/eks-practise.jar eks-practise.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "eks-practise.jar"]
