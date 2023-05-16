package Online.Shop.Shop.Member;

public interface MemberService {

    void save(Member member);

    Member findById(long memberId);

    void membership_join(Member member);
}
