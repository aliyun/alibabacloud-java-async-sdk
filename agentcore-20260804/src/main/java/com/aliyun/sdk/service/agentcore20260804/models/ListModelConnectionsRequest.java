// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListModelConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListModelConnectionsRequest</p>
 */
public class ListModelConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeModels")
    private Boolean includeModels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("providerType")
    private String providerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    private ListModelConnectionsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.includeModels = builder.includeModels;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.protocol = builder.protocol;
        this.providerType = builder.providerType;
        this.searchType = builder.searchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return includeModels
     */
    public Boolean getIncludeModels() {
        return this.includeModels;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    public static final class Builder extends Request.Builder<ListModelConnectionsRequest, Builder> {
        private String workspaceId; 
        private Boolean includeModels; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String protocol; 
        private String providerType; 
        private String searchType; 

        private Builder() {
            super();
        } 

        private Builder(ListModelConnectionsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.includeModels = request.includeModels;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.protocol = request.protocol;
            this.providerType = request.providerType;
            this.searchType = request.searchType;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Specifies whether to return associated model summaries for each model connection. By default, model summaries are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeModels(Boolean includeModels) {
            this.putQueryParameter("includeModels", includeModels);
            this.includeModels = includeModels;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values: 0 to 100. If this parameter is not set or is set to 0, the default value 10 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The pagination token. Pass the token returned in the previous query. An empty response indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWwtY29ubmVjdGlvbjoxMA</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The invocation protocol used to filter model connections.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The model provider type used to filter model connections.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder providerType(String providerType) {
            this.putQueryParameter("providerType", providerType);
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>The name matching mode. Takes effect only when Name is set. Valid values: accurate (exact match), blur (fuzzy match). Default value: blur.</p>
         * 
         * <strong>example:</strong>
         * <p>blur</p>
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        @Override
        public ListModelConnectionsRequest build() {
            return new ListModelConnectionsRequest(this);
        } 

    } 

}
