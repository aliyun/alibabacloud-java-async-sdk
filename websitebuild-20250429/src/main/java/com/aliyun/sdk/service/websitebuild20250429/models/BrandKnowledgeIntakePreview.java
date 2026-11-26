// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeIntakePreview} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeIntakePreview</p>
 */
public class BrandKnowledgeIntakePreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Pages")
    private java.util.List<BrandKnowledgePageLink> pages;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private BrandKnowledgeIntakePreview(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.pages = builder.pages;
        this.sourceUrl = builder.sourceUrl;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeIntakePreview create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return pages
     */
    public java.util.List<BrandKnowledgePageLink> getPages() {
        return this.pages;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String content; 
        private String description; 
        private java.util.List<BrandKnowledgePageLink> pages; 
        private String sourceUrl; 
        private String title; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeIntakePreview model) {
            this.content = model.content;
            this.description = model.description;
            this.pages = model.pages;
            this.sourceUrl = model.sourceUrl;
            this.title = model.title;
        } 

        /**
         * <p>The extracted or parsed body text.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Technology provides enterprise software services</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The brand or collection target profile.</p>
         * 
         * <strong>example:</strong>
         * <p>Provides software services to enterprises</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of web pages discovered or processed.</p>
         */
        public Builder pages(java.util.List<BrandKnowledgePageLink> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>The source web address of the data.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/about">https://example.com/about</a></p>
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * <p>The web page or content title.</p>
         * 
         * <strong>example:</strong>
         * <p>About Example Technology</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public BrandKnowledgeIntakePreview build() {
            return new BrandKnowledgeIntakePreview(this);
        } 

    } 

}
