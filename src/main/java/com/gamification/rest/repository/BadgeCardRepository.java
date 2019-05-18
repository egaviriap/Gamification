package com.gamification.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gamification.rest.domain.BadgeCard;

public interface BadgeCardRepository extends CrudRepository<BadgeCard, Long> {
	
List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(final Long userId);

}
