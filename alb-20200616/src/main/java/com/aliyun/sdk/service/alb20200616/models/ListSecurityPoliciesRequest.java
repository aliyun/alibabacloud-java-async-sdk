// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityPoliciesRequest</p>
 */
public class ListSecurityPoliciesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityPolicyIds")
    private java.util.List < String > securityPolicyIds;

    @Query
    @NameInMap("SecurityPolicyNames")
    private java.util.List < String > securityPolicyNames;

    private ListSecurityPoliciesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityPolicyIds = builder.securityPolicyIds;
        this.securityPolicyNames = builder.securityPolicyNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityPolicyIds
     */
    public java.util.List < String > getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

    /**
     * @return securityPolicyNames
     */
    public java.util.List < String > getSecurityPolicyNames() {
        return this.securityPolicyNames;
    }

    public static final class Builder extends Request.Builder<ListSecurityPoliciesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private java.util.List < String > securityPolicyIds; 
        private java.util.List < String > securityPolicyNames; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityPoliciesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.resourceGroupId = response.resourceGroupId;
            this.securityPolicyIds = response.securityPolicyIds;
            this.securityPolicyNames = response.securityPolicyNames;
        } 

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 安全策略id
         */
        public Builder securityPolicyIds(java.util.List < String > securityPolicyIds) {
            this.putQueryParameter("SecurityPolicyIds", securityPolicyIds);
            this.securityPolicyIds = securityPolicyIds;
            return this;
        }

        /**
         * 安全策略名称
         */
        public Builder securityPolicyNames(java.util.List < String > securityPolicyNames) {
            this.putQueryParameter("SecurityPolicyNames", securityPolicyNames);
            this.securityPolicyNames = securityPolicyNames;
            return this;
        }

        @Override
        public ListSecurityPoliciesRequest build() {
            return new ListSecurityPoliciesRequest(this);
        } 

    } 

}
