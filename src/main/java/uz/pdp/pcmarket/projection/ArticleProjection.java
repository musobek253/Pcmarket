package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
@Projection(types = Article.class)
public interface ArticleProjection {
    Integer getId();

    String getTitle();

    String getDescription();

    String getUrlLink();

    Attachment getAttachment();
}
