// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclsRequest} extends {@link RequestModel}
 *
 * <p>ListAclsRequest</p>
 */
public class ListAclsRequest extends Request {
    @Query
    @NameInMap("AclIds")
    private java.util.List < String > aclIds;

    @Query
    @NameInMap("AclNames")
    private java.util.List < String > aclNames;

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

    private ListAclsRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.aclNames = builder.aclNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    /**
     * @return aclNames
     */
    public java.util.List < String > getAclNames() {
        return this.aclNames;
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

    public static final class Builder extends Request.Builder<ListAclsRequest, Builder> {
        private java.util.List < String > aclIds; 
        private java.util.List < String > aclNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListAclsRequest response) {
            super(response);
            this.aclIds = response.aclIds;
            this.aclNames = response.aclNames;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * 访问控制策略Id
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * 访问控制策略名称
         */
        public Builder aclNames(java.util.List < String > aclNames) {
            this.putQueryParameter("AclNames", aclNames);
            this.aclNames = aclNames;
            return this;
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

        @Override
        public ListAclsRequest build() {
            return new ListAclsRequest(this);
        } 

    } 

}
