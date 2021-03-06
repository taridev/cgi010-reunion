package com.udev.reunion.model;

import lombok.Data;

import java.util.Date;

@Data
public class CommentJson {

    private UserJson sender;
    private Long messageId;
    private Long commentId;
    private String commentBody;
    private Date commentDate;

    public CommentJson() {
        // Constructeur par défaut
    }
}
