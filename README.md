# 1. jdk22
```
https://www.oracle.com/java/technologies/downloads/
```

# 2. sts
```
https://spring.io/tools
```

# 3. Create new Spring Starter Project
```
Name : sbb
Java Version : 22
Group : com.mysite
Package : com.mysite.sbb

Spring Web
```

# 4. select jdk version
```
File > Properties
Java Build Path > Libararies 
Installed JREs
Add
Standard VM
C:\Program Files\Java\jdk-22
```

# 5.
```
Project 'sbb' has no explicit encoding set
Quick Fix
```

# 6. Spring Boot Devtools
```
developmentOnly 'org.springframework.boot:spring-boot-devtools'
Refresh Gradle project
서버재시작 
```

# 7. hello world
```
package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello spring boot board";
	}
}

http://localhost:8080/hello
```

# 8. lombok
```
https://projectlombok.org/download

compileOnly 'org.projectlombok:lombok'
annotationProcessor 'org.projectlombok:lombok'
Refresh Gradle project
```

# 9. annotation
```
@RequiredArgsConstructor
@Getter
@Setter
```

# 10. database (1)
```
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation group: 'com.mysql', name: 'mysql-connector-j', version: '8.0.33'
Refresh Gradle project
```

# 11. database (2)
```
application.properties

spring.application.name=sbb

spring.datasource.url=jdbc:mysql://localhost:3306/dev
spring.datasource.username=dev01
spring.datasource.password=dev01
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

# 12. Entity
```
class
Question.java
Answer.java
```

# 13. Repository
```
interface
QuestionRepository.java
AnswerRepository.java
```

# 14. JUnit
```
testImplementation 'org.junit.jupiter:junit-jupiter'
testRunTimeOnly 'org.junit.platform:junit-platform-launcher'
```

# 15. Bootstrap
```
https://getbootstrap.com/docs/5.3/getting-started/download/
```
