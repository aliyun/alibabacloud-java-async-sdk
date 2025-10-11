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
 * {@link WritingOutline} extends {@link TeaModel}
 *
 * <p>WritingOutline</p>
 */
public class WritingOutline extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Articles")
    private java.util.List<OutlineWritingArticle> articles;

    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List<WritingOutline> children;

    @com.aliyun.core.annotation.NameInMap("Outline")
    private String outline;

    @com.aliyun.core.annotation.NameInMap("OutlineId")
    private String outlineId;

    @com.aliyun.core.annotation.NameInMap("SearchKeyWordList")
    private java.util.List<String> searchKeyWordList;

    @com.aliyun.core.annotation.NameInMap("WordCount")
    private String wordCount;

    @com.aliyun.core.annotation.NameInMap("WritingTips")
    private String writingTips;

    private WritingOutline(Builder builder) {
        this.articles = builder.articles;
        this.children = builder.children;
        this.outline = builder.outline;
        this.outlineId = builder.outlineId;
        this.searchKeyWordList = builder.searchKeyWordList;
        this.wordCount = builder.wordCount;
        this.writingTips = builder.writingTips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WritingOutline create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articles
     */
    public java.util.List<OutlineWritingArticle> getArticles() {
        return this.articles;
    }

    /**
     * @return children
     */
    public java.util.List<WritingOutline> getChildren() {
        return this.children;
    }

    /**
     * @return outline
     */
    public String getOutline() {
        return this.outline;
    }

    /**
     * @return outlineId
     */
    public String getOutlineId() {
        return this.outlineId;
    }

    /**
     * @return searchKeyWordList
     */
    public java.util.List<String> getSearchKeyWordList() {
        return this.searchKeyWordList;
    }

    /**
     * @return wordCount
     */
    public String getWordCount() {
        return this.wordCount;
    }

    /**
     * @return writingTips
     */
    public String getWritingTips() {
        return this.writingTips;
    }

    public static final class Builder {
        private java.util.List<OutlineWritingArticle> articles; 
        private java.util.List<WritingOutline> children; 
        private String outline; 
        private String outlineId; 
        private java.util.List<String> searchKeyWordList; 
        private String wordCount; 
        private String writingTips; 

        private Builder() {
        } 

        private Builder(WritingOutline model) {
            this.articles = model.articles;
            this.children = model.children;
            this.outline = model.outline;
            this.outlineId = model.outlineId;
            this.searchKeyWordList = model.searchKeyWordList;
            this.wordCount = model.wordCount;
            this.writingTips = model.writingTips;
        } 

        /**
         * Articles.
         */
        public Builder articles(java.util.List<OutlineWritingArticle> articles) {
            this.articles = articles;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List<WritingOutline> children) {
            this.children = children;
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
         * OutlineId.
         */
        public Builder outlineId(String outlineId) {
            this.outlineId = outlineId;
            return this;
        }

        /**
         * SearchKeyWordList.
         */
        public Builder searchKeyWordList(java.util.List<String> searchKeyWordList) {
            this.searchKeyWordList = searchKeyWordList;
            return this;
        }

        /**
         * WordCount.
         */
        public Builder wordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }

        /**
         * WritingTips.
         */
        public Builder writingTips(String writingTips) {
            this.writingTips = writingTips;
            return this;
        }

        public WritingOutline build() {
            return new WritingOutline(this);
        } 

    } 

}
