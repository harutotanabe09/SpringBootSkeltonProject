package co.jp.foobar.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Component;

@Component
@Configuration
/**
 * データベース接続をカスタマイズ。暗号化
 */
public class DatasourceConfig {

  @Value("${datasource.driver-class-name}")
  private String driveName;

  @Value("${datasource.url}")
  private String url;

  @Value("${datasource.username}")
  private String userName;

  @Value("${datasource.password}")
  private String password;

  private String secret = "1234";
  private String salt = "5678";

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(driveName);
    dataSource.setUrl(url);
    dataSource.setUsername(userName);
    TextEncryptor encryptor = Encryptors.text(secret, salt);
    String textDecryptText = encryptor.decrypt(password);
    dataSource.setPassword(textDecryptText);
    return dataSource;  
  }
}
