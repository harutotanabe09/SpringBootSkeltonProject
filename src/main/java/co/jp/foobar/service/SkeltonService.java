package co.jp.foobar.service;

import co.jp.foobar.dao.SkeletonDao;
import co.jp.foobar.entity.Staff;
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
