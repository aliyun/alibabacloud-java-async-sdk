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
 * {@link ListChunksRequest} extends {@link RequestModel}
 *
 * <p>ListChunksRequest</p>
 */
public class ListChunksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListChunksRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.documentId = builder.documentId;
        this.enabled = builder.enabled;
        this.keyword = builder.keyword;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.maxResults = builder.maxResults;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksRequest create() {
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
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListChunksRequest, Builder> {
        private String catalog; 
        private String documentId; 
        private Boolean enabled; 
        private String keyword; 
        private String knowledgeBaseName; 
        private Integer maxResults; 
        private String namespace; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListChunksRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.documentId = request.documentId;
            this.enabled = request.enabled;
            this.keyword = request.keyword;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.maxResults = request.maxResults;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
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
         * <p>Optional. If specified, only chunks of the specified document are returned, sorted by ChunkSeq in ascending order within the document. If not specified, chunks of all documents in the knowledge base are returned, sorted by DocumentId in lexicographic ascending order, and within the same document by ChunkSeq in ascending order, with chunks listed contiguously. In full knowledge base mode, Keyword filtering is not supported (use SearchKnowledgeBase instead), and TotalCount is not returned. Pagination ends when NextToken is empty.</p>
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
         * <p>Optional. Set to true to return only enabled chunks, or false to return only disabled chunks. If not specified, all chunks are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Optional. Active only when DocumentId is specified. Filters chunks by keyword in the chunk body. Only chunks that contain the specified keyword are returned. In full knowledge base pattern (when DocumentId is not specified), passing this parameter causes an error. To retrieve content across the full text, use SearchKnowledgeBase (set Mode to KEYWORD for full-text index).</p>
         * 
         * <strong>example:</strong>
         * <p>Installation</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name is unique within a namespace and is determined at creation time. It cannot be modified.</p>
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
         * <p>The maximum number of results to return per page. If not specified or set to 0, the default value 20 is used. The maximum value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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

        /**
         * <p>Not required for the first query. For subsequent queries, pass the NextToken returned in the previous response. An empty value indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListChunksRequest build() {
            return new ListChunksRequest(this);
        } 

    } 

}
