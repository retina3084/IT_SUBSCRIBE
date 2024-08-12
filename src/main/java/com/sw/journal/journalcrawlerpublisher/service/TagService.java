package com.sw.journal.journalcrawlerpublisher.service;

import com.sw.journal.journalcrawlerpublisher.domain.OurArticle;
import com.sw.journal.journalcrawlerpublisher.domain.Tag;
import com.sw.journal.journalcrawlerpublisher.domain.TagArticle;
import com.sw.journal.journalcrawlerpublisher.repository.OurArticleRepository;
import com.sw.journal.journalcrawlerpublisher.repository.TagArticleRepository;
import com.sw.journal.journalcrawlerpublisher.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TagService {
    // 0809 wildmantle : 안쓰이는 변수 제거
    private final TagArticleRepository tagArticleRepository;

    public List<Tag> findByArticle(OurArticle article) {
        List<TagArticle> tagArticleList = tagArticleRepository.findByArticle(article);
        return tagArticleList.stream()
                .map(TagArticle::getTag)
                .collect(Collectors.toList());
    }

}
