package com.udev.reunion.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MessageJson {

    private Long senderId;
    private String senderFirstname;
    private String senderLastname;
    private Long messageId;
    private String messageTitle;
    private String messageBody;
    private Date publicationDate;
    private List<CommentJson> commentJsonList;

    public MessageJson() {
        // Constructeur par défaut
    }
}
