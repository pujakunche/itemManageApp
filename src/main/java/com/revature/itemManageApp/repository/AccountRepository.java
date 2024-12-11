package com.revature.itemManageApp.repository;

import com.revature.itemManageApp.entities.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
//public interface AccountRepository extends JpaRepositoryImplementation<Account,Integer> {}
public interface AccountRepository extends CrudRepository<Account,Integer> {
//    @Modifying
//    @Query(value = "INSERT INTO account (username, email, role, password) VALUES( :username,:email,:role,:password)",nativeQuery = true)
//   void save(@Param("username")String username,@Param("email")String email,@Param("role")String role,@Param("password")String password);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Account VALUES ({account.username, account.email, account.role, account.password)", nativeQuery = true)
    public abstract void saveUser (@Param("account") Account account);


//    public void saveUser(Account account)

}
