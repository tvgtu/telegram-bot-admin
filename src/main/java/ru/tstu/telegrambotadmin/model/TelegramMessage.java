package ru.tstu.telegrambotadmin.model;

import javax.persistence.*;

/**
 * Created by user on 29.11.17.
 */
@Entity
@Table(name = "messages")
public class TelegramMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "telebot-admin-get-id")
    @SequenceGenerator(name = "telebot-admin-get-id", sequenceName = "messages_id_seq")
    private Long id;

    @Column(name = "user_id", columnDefinition = "varchar(255)")
    private String userId;
    @Column(name = "message", columnDefinition = "text")
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
