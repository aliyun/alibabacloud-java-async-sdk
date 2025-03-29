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
 * {@link WeiboItem} extends {@link TeaModel}
 *
 * <p>WeiboItem</p>
 */
public class WeiboItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardType;

    @com.aliyun.core.annotation.NameInMap("homepageLink")
    private String homepageLink;

    @com.aliyun.core.annotation.NameInMap("htmlSnippet")
    @com.aliyun.core.annotation.Validation(required = true)
    private String htmlSnippet;

    @com.aliyun.core.annotation.NameInMap("images")
    private java.util.List<String> images;

    @com.aliyun.core.annotation.NameInMap("link")
    @com.aliyun.core.annotation.Validation(required = true)
    private String link;

    @com.aliyun.core.annotation.NameInMap("publishDisplayTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publishDisplayTime;

    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private WeiboItem(Builder builder) {
        this.cardType = builder.cardType;
        this.homepageLink = builder.homepageLink;
        this.htmlSnippet = builder.htmlSnippet;
        this.images = builder.images;
        this.link = builder.link;
        this.publishDisplayTime = builder.publishDisplayTime;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WeiboItem create() {
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
     * @return homepageLink
     */
    public String getHomepageLink() {
        return this.homepageLink;
    }

    /**
     * @return htmlSnippet
     */
    public String getHtmlSnippet() {
        return this.htmlSnippet;
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
     * @return publishDisplayTime
     */
    public String getPublishDisplayTime() {
        return this.publishDisplayTime;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String cardType; 
        private String homepageLink; 
        private String htmlSnippet; 
        private java.util.List<String> images; 
        private String link; 
        private String publishDisplayTime; 
        private String username; 

        private Builder() {
        } 

        private Builder(WeiboItem model) {
            this.cardType = model.cardType;
            this.homepageLink = model.homepageLink;
            this.htmlSnippet = model.htmlSnippet;
            this.images = model.images;
            this.link = model.link;
            this.publishDisplayTime = model.publishDisplayTime;
            this.username = model.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>weibo_strong</p>
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * homepageLink.
         */
        public Builder homepageLink(String homepageLink) {
            this.homepageLink = homepageLink;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>【小调查：你会买<em>小米SU7</em>吗？】#小米SU7路测覆盖300多城市#4月17日，@小米汽车 发文称SU7道路测试覆盖全国300多个城市，涵盖极寒，极热天气，总里程数高达540万公里，目前仍在进行中。  网页链接</p>
         */
        public Builder htmlSnippet(String htmlSnippet) {
            this.htmlSnippet = htmlSnippet;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://m.weibo.cn/detail/5024099350350075?wm=90194_90009">https://m.weibo.cn/detail/5024099350350075?wm=90194_90009</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1小时前</p>
         */
        public Builder publishDisplayTime(String publishDisplayTime) {
            this.publishDisplayTime = publishDisplayTime;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public WeiboItem build() {
            return new WeiboItem(this);
        } 

    } 

}
