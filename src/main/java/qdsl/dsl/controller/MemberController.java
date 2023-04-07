package qdsl.dsl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qdsl.dsl.entity.MemberJpaRepository;
import qdsl.dsl.entity.MemberSearchCondition;
import qdsl.dsl.entity.MemberTeamDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberJpaRepository memberJpaRepository;
    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1(MemberSearchCondition condition)
    {
        return memberJpaRepository.search(condition);
    }
}