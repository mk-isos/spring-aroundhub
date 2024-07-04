package studio.aroundhub.demo.Member.sercice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import studio.aroundhub.demo.Member.repository.MemberRepository;
import studio.aroundhub.demo.Member.repository.entity.Member;

@Service
@RequiredArgsConstructor
public class MemberServicempl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
        memberRepository.save(member);
        return "Success";
    }
}
