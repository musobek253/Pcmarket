package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entity.Article;

@Repository
@RepositoryRestResource(path = "Article", collectionResourceRel = "list", excerptProjection = ArticleRepository.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
