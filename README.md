### :green_book: Application Name

Spring Boot Application Name

### :blue_book: Description

| Label            | Description |
| ---------------- | ----------- |
| Program languege | Java 12     |

### :notebook: How to Begin

:orange:  Java Install

``
gradle bootRun
``

:apple:  Java Build

crated jar file

``
gradle build
``

### :star2: Reccomad Editor

Intelli J 

- Settings > Build, Excecution, Deployment > Compiler > Annotation Processor > `Enable Annotation Processing`
- Intellij > Ctrl+Shift+A > type Registry... > `compiler.automake.allow.when.app.running`
- http://livereload.com/extensions/

### :books: TODO

- [x] Doma導入
- [x] コードチェック
- [x] 自動コード整形
- [ ] Javaコンパイルチェック pre commit 
- [ ] DomaのAPI作成 
- [ ] DBパスワード暗号化
- [ ] 便利ライブラリ
- [ ] テストクラス作成
- [ ] テンプレート作成

### :man: DB Start

``
docker run -d --name postgres -e POSTGRES_PASSWORD=test -p 5432:5432 postgres
``

- default user : postgres

### :star: libraries

| library Name | Descritption |
| :---------------------------------------| :-------------------------------|
| [Springframework](https://projects.spring.io/spring-framework/)| Framework |
| [Doma2](https://doma.readthedocs.io/ja/stable/)| O/R Mapper |
| [spring-boot-doma2](https://github.com/domaframework/doma-spring-boot)| O/R Mapper Library |
| [Flyway](https://flywaydb.org/)| DB Mingration |
| [Thymeleaf](http://www.thymeleaf.org/)| Template Engine |
| [WebJars](https://www.webjars.org/)| JavaScript Library |
| [ModelMapper](http://modelmapper.org/)| Model Library |
| [Ehcache](http://www.ehcache.org/)| Chache Library |
| [Spotless](https://github.com/diffplug/spotless/tree/master/plugin-gradle) | Code Formmatter |
| [Lombok Project](https://projectlombok.org/) | Java Beans Library |

### Referer

https://github.com/miyabayt/spring-boot-doma2-sample

### Point

- [ ] Gradleに最新のバージョンをセット
- [ ] Migrationを使ったSQLファイル
- [ ] SpotlessCheckでコード自動生成
- [ ] 汎用のEntityクラス
- [ ] 暗号化スクリプトのテスト

### IDE

- [ ] パッケージ名を一括リネーム
