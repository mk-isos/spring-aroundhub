package studio.aroundhub.demo.Member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.demo.Member.repository.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
