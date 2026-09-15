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
 * {@link SearchLumaKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>SearchLumaKnowledgeBaseRequest</p>
 */
public class SearchLumaKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetadataFilter")
    private String metadataFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rerank")
    private Boolean rerank;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private SearchLumaKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.catalog = builder.catalog;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.metadataFilter = builder.metadataFilter;
        this.mode = builder.mode;
        this.namespace = builder.namespace;
        this.query = builder.query;
        this.rerank = builder.rerank;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchLumaKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return metadataFilter
     */
    public String getMetadataFilter() {
        return this.metadataFilter;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rerank
     */
    public Boolean getRerank() {
        return this.rerank;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<SearchLumaKnowledgeBaseRequest, Builder> {
        private String agentName; 
        private String catalog; 
        private String knowledgeBaseName; 
        private String metadataFilter; 
        private String mode; 
        private String namespace; 
        private String query; 
        private Boolean rerank; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(SearchLumaKnowledgeBaseRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.catalog = request.catalog;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.metadataFilter = request.metadataFilter;
            this.mode = request.mode;
            this.namespace = request.namespace;
            this.query = request.query;
            this.rerank = request.rerank;
            this.topK = request.topK;
        } 

        /**
         * <p>The name of the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>The name of the data catalog bound to the Agent. You can call ListLumaCatalogs to obtain the catalog name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putBodyParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The name of the knowledge base bound to the Agent. You can call ListLumaKnowledgeBases to obtain the knowledge base name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putBodyParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>A JSON string that filters the retrieval scope based on document metadata. For available fields, refer to the MetadataSchema of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;category&quot;:&quot;faq&quot;}</p>
         */
        public Builder metadataFilter(String metadataFilter) {
            this.putBodyParameter("MetadataFilter", metadataFilter);
            this.metadataFilter = metadataFilter;
            return this;
        }

        /**
         * <p>Valid values: vector (AISearch), keyword (keyword match), hybrid (hybrid search). If not specified, the retrieve configuration of the knowledge base is used.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The name of the namespace bound to the Agent. You can call ListLumaNamespaces to obtain the namespace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The natural language query for retrieval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How to configure event rules</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to enable reranking for the retrieved results. Reranking improves accuracy but increases latency. If not specified, the retrieval configuration of the knowledge base is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rerank(Boolean rerank) {
            this.putBodyParameter("Rerank", rerank);
            this.rerank = rerank;
            return this;
        }

        /**
         * <p>Valid values: 1 to 100. If not specified, the retrieval configuration of the knowledge base is used.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public SearchLumaKnowledgeBaseRequest build() {
            return new SearchLumaKnowledgeBaseRequest(this);
        } 

    } 

}
