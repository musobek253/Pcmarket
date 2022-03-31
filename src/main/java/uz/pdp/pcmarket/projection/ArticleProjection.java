package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;

@Projection(name = "ArticleProjection" , types = Article.class)
public interface ArticleProjection {
    Integer getId();

    String getTitle();

    String getDescription();

    String getUrlLink();

    Integer getAttachment();

}
