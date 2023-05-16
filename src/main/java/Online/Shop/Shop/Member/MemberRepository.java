package Online.Shop.Shop.Member;

public interface MemberRepository {

    //회원 가입 기능
    void save(Member member);

    Member findById(Long memberId);

    void membership_join(Member member);


}
