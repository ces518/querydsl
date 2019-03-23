package me.june.querydsl.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-03-23
 * Time: 20:16
 **/

/**
 * QuerydslPredicateExecutor 를 추가적으로 상속받는다.
 */
public interface AccountRepository extends JpaRepository<Account,Long>, QuerydslPredicateExecutor<Account> {
}
