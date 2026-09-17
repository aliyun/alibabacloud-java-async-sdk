// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetChunkRequest} extends {@link RequestModel}
 *
 * <p>GetChunkRequest</p>
 */
public class GetChunkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkSeq")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer chunkSeq;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    private GetChunkRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.chunkSeq = builder.chunkSeq;
        this.documentId = builder.documentId;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChunkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return chunkSeq
     */
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<GetChunkRequest, Builder> {
        private String catalog; 
        private Integer chunkSeq; 
        private String documentId; 
        private String knowledgeBaseName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetChunkRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.chunkSeq = request.chunkSeq;
            this.documentId = request.documentId;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The sequence number of the chunk within the document, starting from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder chunkSeq(Integer chunkSeq) {
            this.putQueryParameter("ChunkSeq", chunkSeq);
            this.chunkSeq = chunkSeq;
            return this;
        }

        /**
         * <p>The document ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-bp1xxxxxxxxxxxx</p>
         */
        public Builder documentId(String documentId) {
            this.putQueryParameter("DocumentId", documentId);
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name is unique within the namespace and is determined at creation time. It cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putQueryParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public GetChunkRequest build() {
            return new GetChunkRequest(this);
        } 

    } 

}
