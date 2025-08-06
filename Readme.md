added by other developer

# todoapi_pg

## Docker command to run PG database server: ##

```bash
docker run -d -p 5432:5432 --name postgres-container -e POSTGRES_USER=root -e POSTGRES_PASSWORD=p@ssw0rd -e POSTGRES_DB=todoapi postgres:latest
```

docker ps

## Add Dependency ##

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
    <version>42.5.0</version>
</dependency>
```

## Add Configuration ##

```properties
# PostgreSQL database connection properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todoapi
spring.datasource.username=root
spring.datasource.password=p@ssw0rd
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA (Hibernate) properties
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

