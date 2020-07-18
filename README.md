### :green_book: Application Name

Spring Boot Application Name

### :blue_book: Description

| Label            | Description |
| ---------------- | ----------- |
| Program languege | Java 12     |

### :notebook: How to Begin

:orange:  Java Install

``

``

:apple:  Java Build

crated jar file

``
gradle build
``

### :star2: Reccomad Editor

Intelli J 

### :books: TODO

・DomaのAPI作成
・DBパスワード暗号化
・自動コード整形

### :man: DB Start

``
docker run -d --name postgres -e POSTGRES_PASSWORD=test -p 5432:5432 postgres
``

- default user : postgres

### :star: libraries

| library Name | Descritption |
| :---------------------------------------| :-------------------------------|
| [Lombok Project](https://projectlombok.org/)|Auto Java Beans |
| [Springframework](https://projects.spring.io/spring-framework/)| Spring Framework|
| [Doma2](https://doma.readthedocs.io/ja/stable/)| O/R Mapper |
| [spring-boot-doma2](https://github.com/domaframework/doma-spring-boot)| Doma and Spring Boot|
| [Flyway](https://flywaydb.org/)| DB mingration |
| [Thymeleaf](http://www.thymeleaf.org/)| Template engine |
| [WebJars](https://www.webjars.org/)| jQueryなどのクライアント側ライブラリをJARとして組み込む|
| [ModelMapper](http://modelmapper.org/)| Beanマッピングライブラリ|
| [Ehcache](http://www.ehcache.org/)| キャッシュライブラリ|
