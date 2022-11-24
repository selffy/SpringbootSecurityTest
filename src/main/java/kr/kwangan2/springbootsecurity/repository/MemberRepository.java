package kr.kwangan2.springbootsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.springbootsecurity.entity.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
