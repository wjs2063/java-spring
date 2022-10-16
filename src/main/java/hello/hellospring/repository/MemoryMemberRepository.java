package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;
    // 실무에서는 동시성 문제때문에 atomic 연산을 활용해야


    @Override
    public Member save(Member member) {
        return member.setId(++sequence);
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
