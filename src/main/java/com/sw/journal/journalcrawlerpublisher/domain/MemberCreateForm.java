package com.sw.journal.journalcrawlerpublisher.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateForm {  // DTO 클래스 역할을 하는 Form 클래스
    @NotEmpty(message = "아이디를 입력해주세요.")
    private String username;

    @NotEmpty(message = "닉네임을 입력해주세요.")
    private String nickname;

    @NotEmpty(message = "이메일을 입력해주세요.")
    @Email
    private String email;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password;

    @Size(min = 8, max = 16)
    @NotEmpty(message = "비밀번호를 다시 입력해주세요.")
    private String password2;
}
