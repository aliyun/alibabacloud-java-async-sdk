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
            this.nameLike = request.nameLike;
            this.nextToken = request.nextToken;
        } 

        /**
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
         * credentialType.
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("credentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * nextToken.
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
