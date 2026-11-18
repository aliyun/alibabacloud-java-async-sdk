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

    @com.aliyun.core.annotation.NameInMap("correlationTag")
    private Integer correlationTag;

    @com.aliyun.core.annotation.NameInMap("displayLink")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayLink;

    @com.aliyun.core.annotation.NameInMap("hostAuthorityScore")
    private Double hostAuthorityScore;

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

    @com.aliyun.core.annotation.NameInMap("richMainBody")
    private String richMainBody;

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

    @com.aliyun.core.annotation.NameInMap("websiteAuthorityScore")
    private Integer websiteAuthorityScore;

    private ScorePageItem(Builder builder) {
        this.cardType = builder.cardType;
        this.correlationTag = builder.correlationTag;
        this.displayLink = builder.displayLink;
        this.hostAuthorityScore = builder.hostAuthorityScore;
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
        this.richMainBody = builder.richMainBody;
        this.score = builder.score;
        this.siteLabel = builder.siteLabel;
        this.snippet = builder.snippet;
        this.summary = builder.summary;
        this.title = builder.title;
        this.websiteAuthorityScore = builder.websiteAuthorityScore;
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
     * @return correlationTag
     */
    public Integer getCorrelationTag() {
        return this.correlationTag;
    }

    /**
     * @return displayLink
     */
    public String getDisplayLink() {
        return this.displayLink;
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
     * @return richMainBody
     */
    public String getRichMainBody() {
        return this.richMainBody;
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

    /**
     * @return websiteAuthorityScore
     */
    public Integer getWebsiteAuthorityScore() {
        return this.websiteAuthorityScore;
    }

    public static final class Builder {
        private String cardType; 
        private Integer correlationTag; 
        private String displayLink; 
        private Double hostAuthorityScore; 
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
        private String richMainBody; 
        private Double score; 
        private String siteLabel; 
        private String snippet; 
        private String summary; 
        private String title; 
        private Integer websiteAuthorityScore; 

        private Builder() {
        } 

        private Builder(ScorePageItem model) {
            this.cardType = model.cardType;
            this.correlationTag = model.correlationTag;
            this.displayLink = model.displayLink;
            this.hostAuthorityScore = model.hostAuthorityScore;
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
            this.richMainBody = model.richMainBody;
            this.score = model.score;
            this.siteLabel = model.siteLabel;
            this.snippet = model.snippet;
            this.summary = model.summary;
            this.title = model.title;
            this.websiteAuthorityScore = model.websiteAuthorityScore;
        } 

        /**
         * <p>The search result template. Different templates return different fields.</p>
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
         * <p>The relevance tag. A value of 0 indicates low relevance, and 1 indicates non-low relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder correlationTag(Integer correlationTag) {
            this.correlationTag = correlationTag;
            return this;
        }

        /**
         * <p>The abbreviated URL of this search result.</p>
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
         * <p>The dynamic authority score, which ranges from 0 to 2 and is calculated based on the relevance of the query content.</p>
         * 
         * <strong>example:</strong>
         * <p>1.923339</p>
         */
        public Builder hostAuthorityScore(Double hostAuthorityScore) {
            this.hostAuthorityScore = hostAuthorityScore;
            return this;
        }

        /**
         * <p>The site logo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://s2.zimgs.cn/ims?kt=url&at=smstruct&key=aHR0cHM6Ly9ndy5hbGljZG4uY29tL0wxLzcyMy8xNTY1MjU2NjAwLzJhL2YwL2I0LzJhZjBiNDQxMGI5YmVlMDVjOGVlNGJmODk3MTNkNTFjLnBuZw==&sign=yx:CUlNNQVJQjFrk3Kxt2F3KWhTOFU=&tv=400_400">https://s2.zimgs.cn/ims?kt=url&amp;at=smstruct&amp;key=aHR0cHM6Ly9ndy5hbGljZG4uY29tL0wxLzcyMy8xNTY1MjU2NjAwLzJhL2YwL2I0LzJhZjBiNDQxMGI5YmVlMDVjOGVlNGJmODk3MTNkNTFjLnBuZw==&amp;sign=yx:CUlNNQVJQjFrk3Kxt2F3KWhTOFU=&amp;tv=400_400</a></p>
         */
        public Builder hostLogo(String hostLogo) {
            this.hostLogo = hostLogo;
            return this;
        }

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>Xinhua News</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The description snippet of the search result in HTML format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>In terms of 100 km/h-0 braking capability, it is only 33.3m. Without bias, just looking at this, the <em>Xiaomi SU7</em> indeed performs well. As for range, with a 101 kWh battery capacity, it achieves a CLTC range of 800 km, and features an 800V high-voltage platform that can add 220 km of range in 5 minutes and 510 km in 15 minutes. And..</p>
         */
        public Builder htmlSnippet(String htmlSnippet) {
            this.htmlSnippet = htmlSnippet;
            return this;
        }

        /**
         * <p>The search result title in HTML format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em>Xiaomi</em> SU7 priced from 229,900 yuan, executive personally dispels rumors: no <em>price</em> before launch - Baijiahao</p>
         */
        public Builder htmlTitle(String htmlTitle) {
            this.htmlTitle = htmlTitle;
            return this;
        }

        /**
         * <p>The image information.</p>
         */
        public Builder images(java.util.List<IncludeImage> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The full URL that the search result points to.</p>
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
         * <p>The full text of the search result, which is available in some scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Yesterday, Xiaomi Auto was not launched, but related information has been mostly revealed. At the launch event, Lei Jun directly stated that Xiaomi SU7 benchmarks Tesla and Porsche, with 100 industry-leading features. It seems that &quot;far ahead&quot; is no longer a Huawei patent? When introducing the technology, Lei Jun also expanded on five major aspects: motor, battery, mega casting, autonomous driving, and smart cockpit, fully demonstrating Xiaomi Auto\&quot;s technology and technical reserves. All the materials that can be stacked are stacked... Regarding the performance that everyone is interested in, 0-100 km/h acceleration in 2.78s, and a top speed of 265 km/h</p>
         */
        public Builder mainText(String mainText) {
            this.mainText = mainText;
            return this;
        }

        /**
         * <p>The web page body in Markdown format.</p>
         * 
         * <strong>example:</strong>
         * <h1>2022 Apsara Conference Homepage</h1>
         */
        public Builder markdownText(String markdownText) {
            this.markdownText = markdownText;
            return this;
        }

        /**
         * <p>The MIME type of the search result.</p>
         * 
         * <strong>example:</strong>
         * <p>text/html</p>
         */
        public Builder mime(String mime) {
            this.mime = mime;
            return this;
        }

        /**
         * <p>The supplementary page information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder pageMap(java.util.Map<String, String> pageMap) {
            this.pageMap = pageMap;
            return this;
        }

        /**
         * <p>The publish time.</p>
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
         * <p>The full rich text body, which preserves the order of text, images, audio, video, tables, and code in the web page.</p>
         * 
         * <strong>example:</strong>
         * <p><quark-ocr> 24 hx 3 </quark-ocr></p>
         */
        public Builder richMainBody(String richMainBody) {
            this.richMainBody = richMainBody;
            return this;
        }

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.234325235</p>
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The site label. Two types are currently supported:</p>
         * <ul>
         * <li>Authoritative media</li>
         * <li>Party and government organs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Authoritative media</p>
         */
        public Builder siteLabel(String siteLabel) {
            this.siteLabel = siteLabel;
            return this;
        }

        /**
         * <p>The description snippet of the search result in text format.</p>
         * 
         * <strong>example:</strong>
         * <p>In terms of 100 km/h-0 braking capability, it is only 33.3m. Without bias, just looking at this, the Xiaomi SU7 indeed performs well. As for range, with a 101 kWh battery capacity, it achieves a CLTC range of 800 km, and features an 800V high-voltage platform that can add 220 km of range in 5 minutes and 510 km in 15 minutes. And..</p>
         */
        public Builder snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
         * <p>The enhanced summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Tomorrow</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The search result title in plain text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiaomi SU7 priced from 229,900 yuan, executive personally dispels rumors: no price before launch</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The static authority score, which is determined solely by the authority of the website itself and is independent of the query content.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder websiteAuthorityScore(Integer websiteAuthorityScore) {
            this.websiteAuthorityScore = websiteAuthorityScore;
            return this;
        }

        public ScorePageItem build() {
            return new ScorePageItem(this);
        } 

    } 

}
