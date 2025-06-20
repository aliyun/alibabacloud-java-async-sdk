// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListNetTestResultsRequest} extends {@link RequestModel}
 *
 * <p>ListNetTestResultsRequest</p>
 */
public class ListNetTestResultsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetTestType")
    private String netTestType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListNetTestResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.netTestType = builder.netTestType;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetTestResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return netTestType
     */
    public String getNetTestType() {
        return this.netTestType;
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

    public static final class Builder extends Request.Builder<ListNetTestResultsRequest, Builder> {
        private String regionId; 
        private Long maxResults; 
        private String netTestType; 
        private String nextToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListNetTestResultsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.netTestType = request.netTestType;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not configure this parameter or if you set this parameter to a value less than 20, the default value is 20.</li>
         * <li>If you set this parameter to a value that is greater than 100, the default value is 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The type of the network test.</p>
         * 
         * <strong>example:</strong>
         * <p>DelayTest</p>
         */
        public Builder netTestType(String netTestType) {
            this.putBodyParameter("NetTestType", netTestType);
            this.netTestType = netTestType;
            return this;
        }

        /**
         * <p>The token that determines the start position of the query. Set this parameter to the value of the NextToken parameter that is returned from the last call.</p>
         * 
         * <strong>example:</strong>
         * <p>3a6b93229825ac667104463b56790c91</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxno4vh5muoq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListNetTestResultsRequest build() {
            return new ListNetTestResultsRequest(this);
        } 

    } 

}
