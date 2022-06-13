package com.sparta.mini_projcet.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sparta.mini_projcet.model.Notice;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class NoticeResponseDto {
    private Long id;
    private String title;
    private String nickname;
    private String username;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime modifiedAt;
//    private int countReply;

    @Builder
    public NoticeResponseDto(Notice description) {
        this.id = description.getId();
        this.title = description.getTitle();
        this.nickname = description.getNickname();
        this.username = description.getUsername();
        this.description = description.getDescription();
        this.modifiedAt = description.getModifiedAt();
//        this.countReply = countReply;
    }
}
