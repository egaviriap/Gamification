package com.gamification.rest.domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@Setter
@EqualsAndHashCode
public class GameStats {


	private final Long user_Id;
	private final int score;
	private final List<Badge> badges;
	
	public GameStats()
	{
		this.user_Id = 0L;
		this.score = 0;
		this.badges = new ArrayList<>();
	}
	
	public static GameStats emptyStats(final Long userId) {
		return new GameStats(userId, 0, Collections.emptyList());
	}
	
	public List<Badge> getBadges(){
		return Collections.unmodifiableList(badges);
	}
	
	
}
