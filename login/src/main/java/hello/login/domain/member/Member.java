package hello.login.domain.member;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Member {

    private Long id;
    @NotEmpty
    private String loginId; //로그인 ID @NotEmpty
    @NotEmpty
    private String name; //사용자 이름 @NotEmpty
    @NotEmpty
    private String password;
}