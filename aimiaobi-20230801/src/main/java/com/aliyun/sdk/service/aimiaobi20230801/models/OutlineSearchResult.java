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
 * {@link OutlineSearchResult} extends {@link TeaModel}
 *
 * <p>OutlineSearchResult</p>
 */
public class OutlineSearchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Articles")
    private java.util.List<OutlineWritingArticle> articles;

    @com.aliyun.core.annotation.NameInMap("Outline")
    private String outline;

    @com.aliyun.core.annotation.NameInMap("OutlineId")
    private String outlineId;

    @com.aliyun.core.annotation.NameInMap("PrimaryOutline")
    private String primaryOutline;

    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    private OutlineSearchResult(Builder builder) {
        this.articles = builder.articles;
        this.outline = builder.outline;
        this.outlineId = builder.outlineId;
        this.primaryOutline = builder.primaryOutline;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutlineSearchResult create() {
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
     * @return primaryOutline
     */
    public String getPrimaryOutline() {
        return this.primaryOutline;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder {
        private java.util.List<OutlineWritingArticle> articles; 
        private String outline; 
        private String outlineId; 
        private String primaryOutline; 
        private String query; 

        private Builder() {
        } 

        private Builder(OutlineSearchResult model) {
            this.articles = model.articles;
            this.outline = model.outline;
            this.outlineId = model.outlineId;
            this.primaryOutline = model.primaryOutline;
            this.query = model.query;
        } 

        /**
         * Articles.
         */
        public Builder articles(java.util.List<OutlineWritingArticle> articles) {
            this.articles = articles;
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
         * PrimaryOutline.
         */
        public Builder primaryOutline(String primaryOutline) {
            this.primaryOutline = primaryOutline;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public OutlineSearchResult build() {
            return new OutlineSearchResult(this);
        } 

    } 

}
