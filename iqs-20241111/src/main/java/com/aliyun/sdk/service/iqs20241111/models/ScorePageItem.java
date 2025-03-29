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
 * {@link ScorePageItem} extends {@link TeaModel}
 *
 * <p>ScorePageItem</p>
 */
public class ScorePageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardType;

    @com.aliyun.core.annotation.NameInMap("displayLink")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayLink;

    @com.aliyun.core.annotation.NameInMap("hostLogo")
    private String hostLogo;

    @com.aliyun.core.annotation.NameInMap("hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("htmlSnippet")
    @com.aliyun.core.annotation.Validation(required = true)
    private String htmlSnippet;

    @com.aliyun.core.annotation.NameInMap("htmlTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String htmlTitle;

    @com.aliyun.core.annotation.NameInMap("images")
    private java.util.List<IncludeImage> images;

    @com.aliyun.core.annotation.NameInMap("link")
    @com.aliyun.core.annotation.Validation(required = true)
    private String link;

    @com.aliyun.core.annotation.NameInMap("mainText")
    private String mainText;

    @com.aliyun.core.annotation.NameInMap("markdownText")
    private String markdownText;

    @com.aliyun.core.annotation.NameInMap("mime")
    private String mime;

    @com.aliyun.core.annotation.NameInMap("pageMap")
    private java.util.Map<String, String> pageMap;

    @com.aliyun.core.annotation.NameInMap("publishTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long publishTime;

    @com.aliyun.core.annotation.NameInMap("score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("siteLabel")
    private String siteLabel;

    @com.aliyun.core.annotation.NameInMap("snippet")
    private String snippet;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private ScorePageItem(Builder builder) {
        this.cardType = builder.cardType;
        this.displayLink = builder.displayLink;
        this.hostLogo = builder.hostLogo;
        this.hostname = builder.hostname;
        this.htmlSnippet = builder.htmlSnippet;
        this.htmlTitle = builder.htmlTitle;
        this.images = builder.images;
        this.link = builder.link;
        this.mainText = builder.mainText;
        this.markdownText = builder.markdownText;
        this.mime = builder.mime;
        this.pageMap = builder.pageMap;
        this.publishTime = builder.publishTime;
        this.score = builder.score;
        this.siteLabel = builder.siteLabel;
        this.snippet = builder.snippet;
        this.summary = builder.summary;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScorePageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardType
     */
    public String getCardType() {
        return this.cardType;
    }

    /**
     * @return displayLink
     */
    public String getDisplayLink() {
        return this.displayLink;
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
     * @return htmlSnippet
     */
    public String getHtmlSnippet() {
        return this.htmlSnippet;
    }

    /**
     * @return htmlTitle
     */
    public String getHtmlTitle() {
        return this.htmlTitle;
    }

    /**
     * @return images
     */
    public java.util.List<IncludeImage> getImages() {
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
     * @return mime
     */
    public String getMime() {
        return this.mime;
    }

    /**
     * @return pageMap
     */
    public java.util.Map<String, String> getPageMap() {
        return this.pageMap;
    }

    /**
     * @return publishTime
     */
    public Long getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return siteLabel
     */
    public String getSiteLabel() {
        return this.siteLabel;
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

    public static final class Builder {
        private String cardType; 
        private String displayLink; 
        private String hostLogo; 
        private String hostname; 
        private String htmlSnippet; 
        private String htmlTitle; 
        private java.util.List<IncludeImage> images; 
        private String link; 
        private String mainText; 
        private String markdownText; 
        private String mime; 
        private java.util.Map<String, String> pageMap; 
        private Long publishTime; 
        private Double score; 
        private String siteLabel; 
        private String snippet; 
        private String summary; 
        private String title; 

        private Builder() {
        } 

        private Builder(ScorePageItem model) {
            this.cardType = model.cardType;
            this.displayLink = model.displayLink;
            this.hostLogo = model.hostLogo;
            this.hostname = model.hostname;
            this.htmlSnippet = model.htmlSnippet;
            this.htmlTitle = model.htmlTitle;
            this.images = model.images;
            this.link = model.link;
            this.mainText = model.mainText;
            this.markdownText = model.markdownText;
            this.mime = model.mime;
            this.pageMap = model.pageMap;
            this.publishTime = model.publishTime;
            this.score = model.score;
            this.siteLabel = model.siteLabel;
            this.snippet = model.snippet;
            this.summary = model.summary;
            this.title = model.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>structure_web_info</p>
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>baijiahao.baidu.com</p>
         */
        public Builder displayLink(String displayLink) {
            this.displayLink = displayLink;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100km/h-0制动能力上，仅有33.3m，不黑不吹，单看这个，<em>小米SU7</em>确实表现不错。而续航方面，101kWh电池容量，实现CLTC续航800km，还有现5分钟补能220km，15分钟补能510km的800V高压平台。而在...</p>
         */
        public Builder htmlSnippet(String htmlSnippet) {
            this.htmlSnippet = htmlSnippet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em>小米</em>SU7售价22.99万元起 高管亲自辟谣：发布前不会有<em>价格</em>-百家号</p>
         */
        public Builder htmlTitle(String htmlTitle) {
            this.htmlTitle = htmlTitle;
            return this;
        }

        /**
         * images.
         */
        public Builder images(java.util.List<IncludeImage> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://baijiahao.baidu.com/s?id=1787881554557805096">https://baijiahao.baidu.com/s?id=1787881554557805096</a></p>
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
         * mime.
         */
        public Builder mime(String mime) {
            this.mime = mime;
            return this;
        }

        /**
         * pageMap.
         */
        public Builder pageMap(java.util.Map<String, String> pageMap) {
            this.pageMap = pageMap;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1704426524000</p>
         */
        public Builder publishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * score.
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * siteLabel.
         */
        public Builder siteLabel(String siteLabel) {
            this.siteLabel = siteLabel;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>小米SU7售价22.99万元起 高管亲自辟谣：发布前不会有价格</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public ScorePageItem build() {
            return new ScorePageItem(this);
        } 

    } 

}
