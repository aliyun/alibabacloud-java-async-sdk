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

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, ?> tags;

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
        this.tags = builder.tags;
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
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
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
        private java.util.Map<String, ?> tags; 
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
            this.tags = model.tags;
            this.title = model.title;
            this.websiteAuthorityScore = model.websiteAuthorityScore;
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
         * <p>The dynamic authority score, which ranges from 0 to 2 and is calculated based on the relevance to the query content.</p>
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
         * <p><a href="https://www.china.com/zh_cn/img1905/2023/logo.png">https://www.china.com/zh_cn/img1905/2023/logo.png</a></p>
         */
        public Builder hostLogo(String hostLogo) {
            this.hostLogo = hostLogo;
            return this;
        }

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>China.com</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The images from the search result web page, up to three.</p>
         */
        public Builder images(java.util.List<String> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The full URL pointed to by the search result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://hea.china.com/articles/20250427/202504271666343.html">https://hea.china.com/articles/20250427/202504271666343.html</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The full text of the searched web page.</p>
         * 
         * <strong>example:</strong>
         * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO.\n&quot;AITO M9 and M8 are reshaping the landscape of China\&quot;s luxury car market,&quot; Zhang Xinghai said, (omitted here....).\nEditor: kj005\n Article complaint hotline: 157 3889 8464 Complaint email: 7983347 <a href="mailto:16@qq.com">16@qq.com</a>\nKeywords:</p>
         */
        public Builder mainText(String mainText) {
            this.mainText = mainText;
            return this;
        }

        /**
         * <p>The Markdown content.</p>
         * 
         * <strong>example:</strong>
         * <h1>Industry leaders gather at the Shanghai Auto Show as AITO becomes the center of attention<strong>Source</strong>: Caixun.com</h1>
         * <p><strong>Time</strong>: 2025-04-27 20:36:04<br>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO.
         * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531927023138.png" alt="Image">Yu Chengdong stated that AITO M9, M8, M7, and M5 are all deeply loved by consumers! AITO M9 has ranked first in the residual value rate of pure electric models in China for three consecutive months! Pure electric and extended-range models took the top two spots in the residual value rate of new energy large SUVs!
         * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531312025791.jpeg" alt="Image">&quot;I am an AITO M9 user
         * <em>Editor: kj005</em>Article complaint hotline: 157 3889 8464<br>Complaint email: <a href="mailto:798334716@qq.com">798334716@qq.com</a></p>
         */
        public Builder markdownText(String markdownText) {
            this.markdownText = markdownText;
            return this;
        }

        /**
         * <p>The publish time of the web page in ISO format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-27T20:36:04+08:00</p>
         */
        public Builder publishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }

        /**
         * <p>The rerank score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7786493301391602</p>
         */
        public Builder rerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }

        /**
         * <p>The full rich text body, which preserves the order of text, images, audio, video, tables, and code on the web page.</p>
         * 
         * <strong>example:</strong>
         * <p>Salute	to	the	workers	!	\n	[	Building	dreams	for	modernization	 	and	drawing	a	new	picture	together	·	Song	of	the	workers	]	Make	new	contributions	to	promoting	Chinese	modernization	\n	<quark-image available_status="3" caption="CCTV news studio" fetch_status="0" is_broken="0" is_high_quality_chart="0" is_high_quality_text="0" is_watermark="0" ori_height="1080" ori_width="1920" phash="13061254655082448525" relevant_score="0.5" render_height="137.046875" render_width="243.65625" tag="CCTV logo, studio, architecture, scenery" url="http://s2.zimgs.cn/ims?kt=url&amp;key=aHR0cHM6Ly92Mi5jcmkuY24vTTAwLzg2LzAyL3JCQUJDbVkzRzhDQVhFR0pBQUFBQUFBQUFBQTQ0LjE5MjB4MTA4MC5qcGVn&amp;sign=yx:G3TGlZZMQhnxU2bJSDcb_g8xPQ0=&amp;tv=0_0&amp;p=" value_score="0.5"><quark-ocr>	CCTV	 	13	 	News	 	CTVR	 	Morning	World	</quark-ocr></quark-image>	\n	More	&gt;	&gt;	&gt;	 	Most	beautiful	workers	\n</p>
         */
        public Builder richMainBody(String richMainBody) {
            this.richMainBody = richMainBody;
            return this;
        }

        /**
         * <p>The summary.</p>
         * 
         * <strong>example:</strong>
         * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO. ..</p>
         */
        public Builder snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
         * <p>The enhanced summary, 400 words or more.</p>
         * 
         * <strong>example:</strong>
         * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO. &quot;I am an AITO M9 user, and the driving experience is excellent,&quot; Chen Daoming said, adding that he only dared to recommend it on the spot after experiencing it himself. In the future, he hopes to achieve special customization of the AITO M9, making the exterior, interior, and seat layout more in line with his own needs. It is reported that the 2025 AITO M9 delivered over 10,000 units within 25 days of its launch, and has been the sales champion of 500,000 RMB luxury cars for 11 consecutive months; the AITO M8 received over 50,000 firm orders within 4 days of its launch, and is deeply loved by the market and users... &quot;AITO M9 and M8 are reshaping the landscape of China\&quot;s luxury car market,&quot; Zhang Xinghai said. He recently test-drove the AITO M8 to the limit, departing from Chongqing and arriving at Mount Kailash after 55 hours and over 3,500 kilometers. Throughout the journey, the safety and experience of the vehicle performed excellently</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The web page tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;genre&quot;:&quot;NewsPortal&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The full URL pointed to by the search result.</p>
         * 
         * <strong>example:</strong>
         * <p>Industry leaders gather at the Shanghai Auto Show as AITO becomes the center of attention</p>
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

        public UnifiedPageItem build() {
            return new UnifiedPageItem(this);
        } 

    } 

}
