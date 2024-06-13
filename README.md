[Java__badge]:https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white
[Spring__badge]:https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[Spring_Security__badge]:https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white
[Maven__badge]:https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white
[PostgreSQL__badge]:https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white
[Lombok__badge]:https://img.shields.io/badge/Lombok-6DB33F?style=for-the-badge&logo=lombok&logoColor=white
[JPA__badge]:https://img.shields.io/badge/JPA-007396?style=for-the-badge&logo=java&logoColor=white
[JWT__badge]:https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=json-web-tokens&logoColor=white




<h1 align="center">AuthProject</h1>


![java][Java__badge]
![spring][Spring__badge]
![spring_security][Spring_Security__badge]
![lombook][Lombok__badge]
![jpa][JPA__badge]
![jwt][JWT__badge]
![maven][Maven__badge]
![postgres][PostgreSQL__badge]


<p align="center">
    <a href="#started">Getting Started</a> |
    <a href="#routes">Endpoints</a>
</p>

<b>AuthProject is a simple authentication project using Spring Security.</b>


<h2 id="started">Getting Started</h2>
<h3>Prerequisites</h3>
<ul>
    <li><b><a href="https://www.oracle.com/java/technologies/downloads/">Java:</a></b> 17</li>
    <li><b><a href="https://maven.apache.org/download.cgi">Maven:</a></b> 3.8.7</li>
    <li><b><a href="https://www.postgresql.org/download/">PostgreSQL:</a></b> 15.6-0</li>
    <li><b><a href="https://www.git-scm.com/downloads">Git:</a></b> 2.39.2</li>
</ul>

<h3>Cloning</h3>

```bash
    git clone https://github.com/Ismael-Moreira-Kt/AuthProject
```

<h3>Starting</h3>

<h5>Build the project</h5>

```bash
    mvn clean install
```

<h5>Run the project</h5>

```bash
    java -jar target/eventschedulr-0.0.1-SNAPSHOT.jar
```


<h2 id="routes">Endpoints</h2>

<table align="center">
    <tr>
        <th>Method</th>
        <th>Path</th>
        <th>Details</th>
    </tr>
    <tr>
        <th>POST</th>
        <th>/auth/register</th>
        <th><a href="register">Register details</a></th>
    </tr>
    <tr>
        <th>POST</th>
        <th>/auth/login</th>
        <th><a href="register">Login details</a></th>
    </tr>
</table>