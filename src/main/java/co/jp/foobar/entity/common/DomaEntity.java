package co.jp.foobar.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Column;
import org.seasar.doma.Version;

@Setter
@Getter
@SuppressWarnings("serial")
public abstract class DomaEntity implements Serializable {

  // 作成者
  @JsonIgnore String createdBy;

  // 作成日時
  @JsonIgnore LocalDateTime createdAt;

  // 更新者
  @JsonIgnore String updatedBy;

  // 更新日時
  @JsonIgnore LocalDateTime updatedAt;

  // 削除者
  @JsonIgnore String deletedBy;

  // 削除日時
  @JsonIgnore LocalDateTime deletedAt;

  // 楽観的排他制御で使用する改定番号
  @Version
  @Column(name = "version")
  Integer version;
}
