package com.example.springboot_test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    void save(){
        memberRepository.save(
                Member.builder().age(1).email("jjpp72@naver.com").name("adam").build()
        );
    }
}
