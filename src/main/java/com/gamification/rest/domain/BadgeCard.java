package com.gamification.rest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

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
public final class BadgeCard {

	
	@Id
	@GeneratedValue
	@Column(name = "BADGE_ID")
	private final Long badgeId;
	
	private final Long userId;
	private final long badgeTimeStamp;
	private final Badge badge;
	
	public BadgeCard() {
		this(null, null, 0, null);
	}
	
	public BadgeCard(final Long userId, final Badge badge) {
		this(null, userId, System.currentTimeMillis(), badge);
	}	
	
}
