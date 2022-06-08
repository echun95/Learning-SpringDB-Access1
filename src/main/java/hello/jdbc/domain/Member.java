package hello.jdbc.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Member {

    private String memberId;
    private int money;

    public Member() {
    }

    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return getMoney() == member.getMoney() && Objects.equals(getMemberId(), member.getMemberId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMemberId(), getMoney());
    }
}
