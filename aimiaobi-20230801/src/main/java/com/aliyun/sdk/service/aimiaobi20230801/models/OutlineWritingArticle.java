// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link OutlineWritingArticle} extends {@link TeaModel}
 *
 * <p>OutlineWritingArticle</p>
 */
public class OutlineWritingArticle extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Outline")
    private String outline;

    @com.aliyun.core.annotation.NameInMap("PrimaryOutline")
    private String primaryOutline;

    @com.aliyun.core.annotation.NameInMap("PubTime")
    private String pubTime;

    @com.aliyun.core.annotation.NameInMap("SearchSource")
    private String searchSource;

    @com.aliyun.core.annotation.NameInMap("SearchSourceName")
    private String searchSourceName;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private OutlineWritingArticle(Builder builder) {
        this.content = builder.content;
        this.outline = builder.outline;
        this.primaryOutline = builder.primaryOutline;
        this.pubTime = builder.pubTime;
        this.searchSource = builder.searchSource;
        this.searchSourceName = builder.searchSourceName;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutlineWritingArticle create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return outline
     */
    public String getOutline() {
        return this.outline;
    }

    /**
     * @return primaryOutline
     */
    public String getPrimaryOutline() {
        return this.primaryOutline;
    }

    /**
     * @return pubTime
     */
    public String getPubTime() {
        return this.pubTime;
    }

    /**
     * @return searchSource
     */
    public String getSearchSource() {
        return this.searchSource;
    }

    /**
     * @return searchSourceName
     */
    public String getSearchSourceName() {
        return this.searchSourceName;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String content; 
        private String outline; 
        private String primaryOutline; 
        private String pubTime; 
        private String searchSource; 
        private String searchSourceName; 
        private String title; 
        private String url; 

        private Builder() {
        } 

        private Builder(OutlineWritingArticle model) {
            this.content = model.content;
            this.outline = model.outline;
            this.primaryOutline = model.primaryOutline;
            this.pubTime = model.pubTime;
            this.searchSource = model.searchSource;
            this.searchSourceName = model.searchSourceName;
            this.title = model.title;
            this.url = model.url;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Outline.
         */
        public Builder outline(String outline) {
            this.outline = outline;
            return this;
        }

        /**
         * PrimaryOutline.
         */
        public Builder primaryOutline(String primaryOutline) {
            this.primaryOutline = primaryOutline;
            return this;
        }

        /**
         * PubTime.
         */
        public Builder pubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }

        /**
         * SearchSource.
         */
        public Builder searchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }

        /**
         * SearchSourceName.
         */
        public Builder searchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public OutlineWritingArticle build() {
            return new OutlineWritingArticle(this);
        } 

    } 

}
