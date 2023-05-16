package Online.Shop.Shop;


import Online.Shop.Shop.Member.Grade;
import Online.Shop.Shop.Member.Member;
import Online.Shop.Shop.Member.MemberService;
import Online.Shop.Shop.Member.MemberServiceImp;

public class MemberApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImp();

        Member member1 = new Member(1L, "memberA", "123@naver.com", "korea", Grade.BASIC);
        memberService.save(member1);

        Member member2 = memberService.findById(1L);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);


    }


}
