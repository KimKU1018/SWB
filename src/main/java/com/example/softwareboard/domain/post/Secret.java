package com.example.softwareboard.domain.post;

import com.example.softwareboard.BaseTimeEntity;
import com.example.softwareboard.domain.user.member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Secret extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Secid")
    private Long id;

    @Column(length = 40, nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Long hit;

    @Column(nullable = false)
    private LocalDateTime datetime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_num")
    private member mem_num;

    @Builder
    public Secret(String title, String content, Long hit, LocalDateTime datetime) {
        this.content = content;
        this.title = title;
        this.hit = hit;
        this.datetime = datetime;
    }
}

