package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Component
public class MemoryMemberRepository implements MemberRepository{ //option+enter
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}
