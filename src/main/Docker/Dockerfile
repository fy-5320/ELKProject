FROM java:8
MAINTAINER ant-fy
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac /src/main/java/com/mayi/Main.java
CMD ["java", "Main"]