// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnifiedPageItem} extends {@link TeaModel}
 *
 * <p>UnifiedPageItem</p>
 */
public class UnifiedPageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("correlationTag")
    private Integer correlationTag;

    @com.aliyun.core.annotation.NameInMap("hostAuthorityScore")
    private Double hostAuthorityScore;

    @com.aliyun.core.annotation.NameInMap("hostLogo")
    private String hostLogo;

    @com.aliyun.core.annotation.NameInMap("hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("images")
    private java.util.List<String> images;

    @com.aliyun.core.annotation.NameInMap("link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("mainText")
    private String mainText;

    @com.aliyun.core.annotation.NameInMap("markdownText")
    private String markdownText;

    @com.aliyun.core.annotation.NameInMap("publishedTime")
    private String publishedTime;

    @com.aliyun.core.annotation.NameInMap("rerankScore")
    private Double rerankScore;

    @com.aliyun.core.annotation.NameInMap("richMainBody")
    private String richMainBody;

    @com.aliyun.core.annotation.NameInMap("snippet")
    private String snippet;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("websiteAuthorityScore")
    private Integer websiteAuthorityScore;

    private UnifiedPageItem(Builder builder) {
        this.correlationTag = builder.correlationTag;
        this.hostAuthorityScore = builder.hostAuthorityScore;
        this.hostLogo = builder.hostLogo;
        this.hostname = builder.hostname;
        this.images = builder.images;
        this.link = builder.link;
        this.mainText = builder.mainText;
        this.markdownText = builder.markdownText;
        this.publishedTime = builder.publishedTime;
        this.rerankScore = builder.rerankScore;
        this.richMainBody = builder.richMainBody;
        this.snippet = builder.snippet;
        this.summary = builder.summary;
        this.title = builder.title;
        this.websiteAuthorityScore = builder.websiteAuthorityScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedPageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return correlationTag
     */
    public Integer getCorrelationTag() {
        return this.correlationTag;
    }

    /**
     * @return hostAuthorityScore
     */
    public Double getHostAuthorityScore() {
        return this.hostAuthorityScore;
    }

    /**
     * @return hostLogo
     */
    public String getHostLogo() {
        return this.hostLogo;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return images
     */
    public java.util.List<String> getImages() {
        return this.images;
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return mainText
     */
    public String getMainText() {
        return this.mainText;
    }

    /**
     * @return markdownText
     */
    public String getMarkdownText() {
        return this.markdownText;
    }

    /**
     * @return publishedTime
     */
    public String getPublishedTime() {
        return this.publishedTime;
    }

    /**
     * @return rerankScore
     */
    public Double getRerankScore() {
        return this.rerankScore;
    }

    /**
     * @return richMainBody
     */
    public String getRichMainBody() {
        return this.richMainBody;
    }

    /**
     * @return snippet
     */
    public String getSnippet() {
        return this.snippet;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return websiteAuthorityScore
     */
    public Integer getWebsiteAuthorityScore() {
        return this.websiteAuthorityScore;
    }

    public static final class Builder {
        private Integer correlationTag; 
        private Double hostAuthorityScore; 
        private String hostLogo; 
        private String hostname; 
        private java.util.List<String> images; 
        private String link; 
        private String mainText; 
        private String markdownText; 
        private String publishedTime; 
        private Double rerankScore; 
        private String richMainBody; 
        private String snippet; 
        private String summary; 
        private String title; 
        private Integer websiteAuthorityScore; 

        private Builder() {
        } 

        private Builder(UnifiedPageItem model) {
            this.correlationTag = model.correlationTag;
            this.hostAuthorityScore = model.hostAuthorityScore;
            this.hostLogo = model.hostLogo;
            this.hostname = model.hostname;
            this.images = model.images;
            this.link = model.link;
            this.mainText = model.mainText;
            this.markdownText = model.markdownText;
            this.publishedTime = model.publishedTime;
            this.rerankScore = model.rerankScore;
            this.richMainBody = model.richMainBody;
            this.snippet = model.snippet;
            this.summary = model.summary;
            this.title = model.title;
            this.websiteAuthorityScore = model.websiteAuthorityScore;
        } 

        /**
         * correlationTag.
         */
        public Builder correlationTag(Integer correlationTag) {
            this.correlationTag = correlationTag;
            return this;
        }

        /**
         * hostAuthorityScore.
         */
        public Builder hostAuthorityScore(Double hostAuthorityScore) {
            this.hostAuthorityScore = hostAuthorityScore;
            return this;
        }

        /**
         * hostLogo.
         */
        public Builder hostLogo(String hostLogo) {
            this.hostLogo = hostLogo;
            return this;
        }

        /**
         * hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * images.
         */
        public Builder images(java.util.List<String> images) {
            this.images = images;
            return this;
        }

        /**
         * link.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * mainText.
         */
        public Builder mainText(String mainText) {
            this.mainText = mainText;
            return this;
        }

        /**
         * markdownText.
         */
        public Builder markdownText(String markdownText) {
            this.markdownText = markdownText;
            return this;
        }

        /**
         * publishedTime.
         */
        public Builder publishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }

        /**
         * rerankScore.
         */
        public Builder rerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }

        /**
         * richMainBody.
         */
        public Builder richMainBody(String richMainBody) {
            this.richMainBody = richMainBody;
            return this;
        }

        /**
         * snippet.
         */
        public Builder snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * websiteAuthorityScore.
         */
        public Builder websiteAuthorityScore(Integer websiteAuthorityScore) {
            this.websiteAuthorityScore = websiteAuthorityScore;
            return this;
        }

        public UnifiedPageItem build() {
            return new UnifiedPageItem(this);
        } 

    } 

}
