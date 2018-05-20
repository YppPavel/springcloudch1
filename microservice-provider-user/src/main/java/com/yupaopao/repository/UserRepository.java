package com.yupaopao.repository;

import com.yupaopao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liubao on 2018/5/20.
 *
 * @author liubao
 * @date 2018/5/20
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
