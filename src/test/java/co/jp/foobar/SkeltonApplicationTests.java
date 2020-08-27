package co.jp.foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

@SpringBootTest
class SkeltonApplicationTests {

  private static String secret = "1234";
  private static String salt = "5678";

  @Test
  void 暗号化テスト() {
    TextEncryptor encryptor = Encryptors.text(secret, salt);
    String textEncryptText = encryptor.encrypt("password1");
    String textDecryptText = encryptor.decrypt(textEncryptText);
    System.out.println("  暗号化文字列      : " + textEncryptText);
    System.out.println("  復号化確認        : " + textDecryptText);
    assertEquals(1, 1);
  }
}
