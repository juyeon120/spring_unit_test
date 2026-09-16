package com.example.springboot_test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class MemberService {
    private final MemberRepository memberRepository;

    void save(){
        memberRepository.save(Member.builder()
                .age(1)
                .email("jjpp72@naver.com")
                .name("name")
                .build());
    }
}
