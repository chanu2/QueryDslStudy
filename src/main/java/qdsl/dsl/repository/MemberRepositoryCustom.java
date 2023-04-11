package qdsl.dsl.repository;

import qdsl.dsl.entity.MemberSearchCondition;
import qdsl.dsl.entity.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    // data jpa,querydsl 같이 사용하기
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
