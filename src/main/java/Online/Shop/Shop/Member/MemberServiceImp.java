package Online.Shop.Shop.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImp implements MemberService {


    private Map<Long, Member> store = new HashMap<>();

    private Map<Long, Member> membership_store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(long memberId) {
        return store.get(memberId);
    }

    @Override
    public void membership_join(Member member) {
        membership_store.put(member.getId(), member);

    }
}

