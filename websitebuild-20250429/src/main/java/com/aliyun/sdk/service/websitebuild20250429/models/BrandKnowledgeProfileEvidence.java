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
 * {@link BrandKnowledgeProfileEvidence} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeProfileEvidence</p>
 */
public class BrandKnowledgeProfileEvidence extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Excerpt")
    private String excerpt;

    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("PageId")
    private String pageId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private BrandKnowledgeProfileEvidence(Builder builder) {
        this.excerpt = builder.excerpt;
        this.field = builder.field;
        this.pageId = builder.pageId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeProfileEvidence create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excerpt
     */
    public String getExcerpt() {
        return this.excerpt;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String excerpt; 
        private String field; 
        private String pageId; 
        private String url; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeProfileEvidence model) {
            this.excerpt = model.excerpt;
            this.field = model.field;
            this.pageId = model.pageId;
            this.url = model.url;
        } 

        /**
         * <p>The excerpt from the original text used to support brand analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>Provides enterprise collaboration software and implementation services</p>
         */
        public Builder excerpt(String excerpt) {
            this.excerpt = excerpt;
            return this;
        }

        /**
         * <p>The brand profile field corresponding to the evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>positioning</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>The ID of the web page in the collection batch.</p>
         * 
         * <strong>example:</strong>
         * <p>bwp_example001</p>
         */
        public Builder pageId(String pageId) {
            this.pageId = pageId;
            return this;
        }

        /**
         * <p>The original web address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/about">https://example.com/about</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public BrandKnowledgeProfileEvidence build() {
            return new BrandKnowledgeProfileEvidence(this);
        } 

    } 

}
