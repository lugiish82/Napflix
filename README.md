# cs122b-spring20-team-128
cs122b-spring20-team-128 created by GitHub Classroom

1.(Demo video on Google Drive -- accessible with an UCI.edu address)
//NEED TO UPDATE

2.How to run this on Tomcat?

  Preconditions:
  
    - You need to populate the database first.
    - Run the stored-procedure(IN THE NAPFLIX DIRECOTRY)
    - Encrypt passwords for both users and employees
    - You provide(hard code) your database URI, username, password into databaseAuthentication class.
    - Your Tomcat server is clean(fresh out of the zips with no other webapps)
    
  Steps:
  
    1. cd under the Napflix director where the pom.xml lies
    2. mvn package
    3. cp ./target/*.war /your-tomcat-directory/webapps
    4. bash /your-tomcat-directory/bin/catalina.sh run(or start)
    5. your-public-addres:your port/Napflix(or what ever application context you decided to use)
    
3.Prepared Statements:

    -UserAuth.java https://github.com/UCI-Chenli-teaching/cs122b-spring20-team-128/blob/master/Napflix/src/main/java/UserAuth.java
    
    -SingleStarSeverlet.java https://github.com/UCI-Chenli-teaching/cs122b-spring20-team-128/blob/master/Napflix/src/main/java/SingleStarServlet.java
    
    -PaymentServlet https://github.com/UCI-Chenli-teaching/cs122b-spring20-team-128/blob/master/Napflix/src/main/java/PaymentServlet.java
    
    -MovieListSeverlet.java https://github.com/UCI-Chenli-teaching/cs122b-spring20-team-128/blob/master/Napflix/src/main/java/MovieListServlet.java
    
    -MovieServelet.java https://github.com/UCI-Chenli-teaching/cs122b-spring20-team-128/blob/master/Napflix/src/main/java/MovieServlet.java
    
    
4.Two parsing time optimization strategies compared with the naive approach.
//NEED TO UPDATE
5.Inconsistent data report from parsing, it also can be referred from another separate report file generated by your code
//NEED TO UPDATE

  
6.Contributions

  Ganyu's Contribution:
  
    -HTTPS
    -Password Encryption
    -XML Parsing
    
  Boon's Contribution:
  
    -reCAPTCHA
    -Prepared Statement
    -Employee Dashboard
