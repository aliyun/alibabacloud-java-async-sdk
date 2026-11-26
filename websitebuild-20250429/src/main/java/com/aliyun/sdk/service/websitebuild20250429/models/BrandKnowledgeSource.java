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
 * {@link BrandKnowledgeSource} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeSource</p>
 */
public class BrandKnowledgeSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("ContentHash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    private BrandKnowledgeSource(Builder builder) {
        this.content = builder.content;
        this.contentHash = builder.contentHash;
        this.documentId = builder.documentId;
        this.sourceUrl = builder.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeSource create() {
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
     * @return contentHash
     */
    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public static final class Builder {
        private String content; 
        private String contentHash; 
        private String documentId; 
        private String sourceUrl; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeSource model) {
            this.content = model.content;
            this.contentHash = model.contentHash;
            this.documentId = model.documentId;
            this.sourceUrl = model.sourceUrl;
        } 

        /**
         * <p>The extracted or parsed content.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Technology provides enterprise software services</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The content hash of the material body.</p>
         * 
         * <strong>example:</strong>
         * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * <p>The knowledge base document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bkd_example001</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The source web address of the material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/about">https://example.com/about</a></p>
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        public BrandKnowledgeSource build() {
            return new BrandKnowledgeSource(this);
        } 

    } 

}
