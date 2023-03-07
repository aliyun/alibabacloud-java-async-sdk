// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListMultiAccountResourceGroupsRequest</p>
 */
public class ListMultiAccountResourceGroupsRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupIds")
    private java.util.List < String > resourceGroupIds;

    private ListMultiAccountResourceGroupsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupIds = builder.resourceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountResourceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
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
     * @return resourceGroupIds
     */
    public java.util.List < String > getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public static final class Builder extends Request.Builder<ListMultiAccountResourceGroupsRequest, Builder> {
        private String accountId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListMultiAccountResourceGroupsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupIds = request.resourceGroupIds;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List < String > resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        @Override
        public ListMultiAccountResourceGroupsRequest build() {
            return new ListMultiAccountResourceGroupsRequest(this);
        } 

    } 

}
