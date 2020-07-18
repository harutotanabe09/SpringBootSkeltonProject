package com.app.skelton.entity;

import com.app.skelton.entity.common.DomaEntity;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;

@Table(name = "staffs")
@Entity
@Getter
@Setter
public class Staff extends DomaEntity {

  private static final long serialVersionUID = -3762941082070995608L;

  @Id
  @Column(name = "staff_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  // 名前
  String firstName;

  // 苗字
  String lastName;
}
