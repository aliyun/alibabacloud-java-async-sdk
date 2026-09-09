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
 * {@link ListCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListCredentialsRequest</p>
 */
public class ListCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialType")
    private String credentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListCredentialsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialType = builder.credentialType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nameLike = builder.nameLike;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialsRequest create() {
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
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
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
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListCredentialsRequest, Builder> {
        private String workspaceId; 
        private String credentialType; 
        private Integer maxResults; 
        private String name; 
        private String nameLike; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCredentialsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialType = request.credentialType;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nameLike = request.nameLike;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Filters by credential type. Currently, only apiKey is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("credentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * <p>The maximum number of records per page. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>Filters by credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>credentialxxx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The filter condition for fuzzy match by credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>The pagination token for the next page. Do not specify this parameter for the first request. For subsequent requests, set this parameter to the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListCredentialsRequest build() {
            return new ListCredentialsRequest(this);
        } 

    } 

}
