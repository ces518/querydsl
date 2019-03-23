package me.june.querydsl.account;

import com.querydsl.core.types.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void test() {

        QAccount account = QAccount.account;
        // predicate 를 활용 조건문 생성
        Predicate predicate = account.username.likeIgnoreCase("june")
                            .and(account.username.startsWithIgnoreCase("june"));

        Optional<Account> result = accountRepository.findOne(predicate);

        assertThat(result).isEmpty();
    }
}