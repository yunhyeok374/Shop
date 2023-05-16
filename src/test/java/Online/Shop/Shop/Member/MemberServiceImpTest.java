package Online.Shop.Shop.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImpTest {

    @Test
    void 회원가입() {

        MemberService memberService = new MemberServiceImp();

        Member member = new Member(1L, "memberA","naver","korea", Grade.BASIC);
        memberService.save(member);

        Member member1 = memberService.findById(1L);

        Assertions.assertThat(member).isEqualTo(member1);


    }
}