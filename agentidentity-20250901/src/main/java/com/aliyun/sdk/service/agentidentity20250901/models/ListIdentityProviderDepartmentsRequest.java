// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListIdentityProviderDepartmentsRequest} extends {@link RequestModel}
 *
 * <p>ListIdentityProviderDepartmentsRequest</p>
 */
public class ListIdentityProviderDepartmentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentDepartmentId")
    private String parentDepartmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private ListIdentityProviderDepartmentsRequest(Builder builder) {
        super(builder);
        this.identityProviderType = builder.identityProviderType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentDepartmentId = builder.parentDepartmentId;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderDepartmentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentDepartmentId
     */
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<ListIdentityProviderDepartmentsRequest, Builder> {
        private String identityProviderType; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentDepartmentId; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentityProviderDepartmentsRequest request) {
            super(request);
            this.identityProviderType = request.identityProviderType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentDepartmentId = request.parentDepartmentId;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * IdentityProviderType.
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putBodyParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ParentDepartmentId.
         */
        public Builder parentDepartmentId(String parentDepartmentId) {
            this.putBodyParameter("ParentDepartmentId", parentDepartmentId);
            this.parentDepartmentId = parentDepartmentId;
            return this;
        }

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public ListIdentityProviderDepartmentsRequest build() {
            return new ListIdentityProviderDepartmentsRequest(this);
        } 

    } 

}
