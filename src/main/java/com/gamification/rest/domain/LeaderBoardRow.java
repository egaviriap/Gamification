package com.gamification.rest.domain;

import javax.persistence.Entity;

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
@Entity 
public class LeaderBoardRow {

	private final Long userId;
	private final int totalScore;
	
	public LeaderBoardRow() {
		this( 0L, 0);
	}
}
