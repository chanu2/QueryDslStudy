package qdsl.dsl.repository;

import qdsl.dsl.entity.MemberSearchCondition;
import qdsl.dsl.entity.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
}
