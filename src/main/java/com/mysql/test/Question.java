package com.mysql.test;

import java.util.List;

import java.time.LocalDateTime;

import javax.persistence.CascadeTyple;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany(mappedBy = "question", cascade = Cascade.REMOVE)
    private List<Answer> answerList;
        
    private LocalDateTime createDate;
}
