package co.jp.foobar.entity;

import co.jp.foobar.entity.common.DomaEntity;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;

@Entity
@Getter
@Setter
public class Staff extends DomaEntity {

  @Id
  @Column(name = "staff_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  // 名前
  String firstName;

  // 苗字
  String lastName;
}
