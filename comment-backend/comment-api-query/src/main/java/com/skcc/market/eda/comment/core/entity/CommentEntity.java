package com.skcc.market.eda.comment.core.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "COMMENT")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENT_ID", nullable = false)
	private Long id;
	
	@NonNull
	@Column(name = "POST_ID", nullable = false)
	private Long postId;
	
	@NonNull
	@Column(name = "MEMBER_ID", nullable = false)
	private Long memberId;
	
	@Column(name = "POST_TYPE")
	private String postType;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "DISPLAY_YN")
	private String displayYn;
	
	@Column(name = "REGISTER_TIME", updatable = false)
	private LocalDateTime registerTime; 
	
	@Column(name = "UPDATE_TIME", updatable = true)
	private LocalDateTime updateTime;
	
}
