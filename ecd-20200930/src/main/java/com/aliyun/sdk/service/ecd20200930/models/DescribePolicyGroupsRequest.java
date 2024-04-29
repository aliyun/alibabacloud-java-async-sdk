// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyGroupsRequest</p>
 */
public class DescribePolicyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private java.util.List < String > policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private DescribePolicyGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyGroupId = builder.policyGroupId;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGroupsRequest create() {
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
     * @return policyGroupId
     */
    public java.util.List < String > getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<DescribePolicyGroupsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > policyGroupId; 
        private String regionId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyGroupId = request.policyGroupId;
            this.regionId = request.regionId;
            this.scope = request.scope;
        } 

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 1 to 100
         * *   Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The policy IDs. You can specify one or more policy IDs.
         */
        public Builder policyGroupId(java.util.List < String > policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The effective scope of the policy. Valid values:
         * <p>
         * 
         * *   GLOBAL: The policy takes effect globally.
         * *   IP: The policy takes effect based on the IP address.
         * *   ALL: The policy takes effect without limits.
         * 
         * Default value: GLOBAL.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public DescribePolicyGroupsRequest build() {
            return new DescribePolicyGroupsRequest(this);
        } 

    } 

}
