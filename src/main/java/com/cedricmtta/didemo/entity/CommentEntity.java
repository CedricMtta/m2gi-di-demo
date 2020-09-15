package com.cedricmtta.didemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    private Long id;
}
