package co.jp.foobar.dao;

import co.jp.foobar.entity.Staff;
import java.util.Optional;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface SkeletonDao {

  /**
   * データを1件取得します。
   *
   * @param id
   * @return
   */
  @Select
  Optional<Staff> selectById(int id);
}
