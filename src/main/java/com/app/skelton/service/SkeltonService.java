package com.app.skelton.service;

import com.app.skelton.dao.SkeletonDao;
import com.app.skelton.entity.Staff;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/** スケルトンサービス */
@Service
public class SkeltonService {

  @Autowired SkeletonDao dao;

  /**
   * データを取得します。
   *
   * @return
   */
  @Transactional(readOnly = true)
  public Optional<Staff> findOne(Long id) {
    Assert.notNull(id, "must not be null");
    return dao.selectById(id);
  }
}
