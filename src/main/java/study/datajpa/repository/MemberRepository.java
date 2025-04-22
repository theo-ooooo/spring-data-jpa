package study.datajpa.repository;

import org.springframework.data.jpa.repository.*;

import study.datajpa.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}
