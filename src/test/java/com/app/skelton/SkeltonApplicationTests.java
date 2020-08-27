package com.app.skelton;

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
    TextEncryptor encryptor3 = Encryptors.text(secret, salt);
    String textEncryptText = encryptor3.encrypt("password1");
    String textDecryptText = encryptor3.decrypt(textEncryptText);
    System.out.println("  暗号化文字列      : " + textEncryptText);
    System.out.println("  復号化確認        : " + textDecryptText);
  }
}
