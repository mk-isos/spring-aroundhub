package studio.aroundhub.demo.member.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import studio.aroundhub.demo.Member.repository.MemberRepository;
import studio.aroundhub.demo.Member.repository.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("mkisos")
                .name("김문기")
                .phoneNumber("010-0000-0000")
                .build();

        //create test
        memberRepository.save(member);

        //get test
        Member foundMember = memberRepository.findById(1L).get();
    }
}
