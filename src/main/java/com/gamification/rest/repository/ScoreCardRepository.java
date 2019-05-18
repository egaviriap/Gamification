package com.gamification.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gamification.rest.domain.LeaderBoardRow;
import com.gamification.rest.domain.ScoreCard;

public interface ScoreCardRepository extends CrudRepository<ScoreCard, Long> {
	
	
	
	@Query("SELECT SUM(s.score) FROM com.gamification.rest.domain.ScoreCard s "
			+ "WHERE s.userId = :userId GROUP BY s.UserId")
	int getTotalScoreForUser(@Param("userId") final Long userId);	
	
	@Query("SELECT NEW com.gamification.rest.domain.LeaderBoardRow(s.userId, SUM(s.score))"
			+ "FROM com.gamification.rest.domain.ScoreCard s "
			+ "GROUP BY s.userId ORDER BY SUM(s.score) DESC")
	List<LeaderBoardRow> findFirst10();	
	
	List<ScoreCard> findByUserIdOrderByScoreTimestampDesc(final Long userId);



}