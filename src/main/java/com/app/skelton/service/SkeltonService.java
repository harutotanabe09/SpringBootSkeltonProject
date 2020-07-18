package com.app.skelton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/** スケルトンサービス */
@Service
public class SkeltonService {

  /**
   * データを取得します。
   *
   * @return
   */
  @Transactional(readOnly = true)
  public int findOne(Long id) {
    Assert.notNull(id, "must not be null");
    return 1;
  }
}
