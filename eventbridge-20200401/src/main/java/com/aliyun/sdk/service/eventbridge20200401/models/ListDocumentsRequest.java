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
 * {@link ListDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentsRequest</p>
 */
public class ListDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileNamePrefix")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String fileNamePrefix;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDocumentsRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.fileNamePrefix = builder.fileNamePrefix;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.maxResults = builder.maxResults;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentsRequest create() {
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
     * @return fileNamePrefix
     */
    public String getFileNamePrefix() {
        return this.fileNamePrefix;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDocumentsRequest, Builder> {
        private String catalog; 
        private String fileNamePrefix; 
        private String knowledgeBaseName; 
        private Integer maxResults; 
        private String namespace; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentsRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.fileNamePrefix = request.fileNamePrefix;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.maxResults = request.maxResults;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
            this.status = request.status;
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
         * <p>Optional. Filters documents by file name prefix (prefix match, with the same semantics as the NamePrefix parameter of ListEventStreamings). If this parameter is not specified or is set to an empty string, no filtering is applied. Maximum length: 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>AfterSalesPolicy</p>
         */
        public Builder fileNamePrefix(String fileNamePrefix) {
            this.putQueryParameter("FileNamePrefix", fileNamePrefix);
            this.fileNamePrefix = fileNamePrefix;
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
         * <p>The maximum number of results to return per page. If this parameter is not specified or is set to 0, the default value of 20 is used. Maximum value: 100.</p>
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
         * <p>Not required for the first query. For subsequent queries, use the NextToken value returned in the previous response. An empty value indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Optional. Filters documents by exact status match. Valid values:</p>
         * <ul>
         * <li>UPLOADING: uploading</li>
         * <li>PENDING: pending processing</li>
         * <li>PROCESSING: processing</li>
         * <li>COMPLETED: completed</li>
         * <li>FAILED: failed</li>
         * <li>DELETING: deleting</li>
         * </ul>
         * <p>If this parameter is not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDocumentsRequest build() {
            return new ListDocumentsRequest(this);
        } 

    } 

}
