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
 * {@link ListLumaKnowledgeBasesRequest} extends {@link RequestModel}
 *
 * <p>ListLumaKnowledgeBasesRequest</p>
 */
public class ListLumaKnowledgeBasesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListLumaKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.catalog = builder.catalog;
        this.maxResults = builder.maxResults;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLumaKnowledgeBasesRequest create() {
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

    public static final class Builder extends Request.Builder<ListLumaKnowledgeBasesRequest, Builder> {
        private String agentName; 
        private String catalog; 
        private Integer maxResults; 
        private String namespace; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListLumaKnowledgeBasesRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.catalog = request.catalog;
            this.maxResults = request.maxResults;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The name of the agent.</p>
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
         * <p>The name of the data catalog bound to the agent. You can call ListLumaCatalogs to obtain the catalog name.</p>
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
         * <p>The maximum number of entries to return. Valid values: 1 to 100. If you do not specify this parameter, the server uses the default value of 100. Each entry requires a back-to-origin metadata query, so this value also limits the number of back-to-origin requests per call.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the namespace bound to the agent. You can call ListLumaNamespaces to obtain the namespace name.</p>
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
         * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, set this parameter to the NextToken value returned in the previous response. This value is an opaque string. Do not parse it.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListLumaKnowledgeBasesRequest build() {
            return new ListLumaKnowledgeBasesRequest(this);
        } 

    } 

}
