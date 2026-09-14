// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListServerIdeEcsSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListServerIdeEcsSpecsRequest</p>
 */
public class ListServerIdeEcsSpecsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    private ListServerIdeEcsSpecsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceleratorType = builder.acceleratorType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerIdeEcsSpecsRequest create() {
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
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
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

    public static final class Builder extends Request.Builder<ListServerIdeEcsSpecsRequest, Builder> {
        private String regionId; 
        private String acceleratorType; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListServerIdeEcsSpecsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceleratorType = request.acceleratorType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The accelerator type. Valid values:</p>
         * <ul>
         * <li>CPU: uses only CPU.</li>
         * <li>GPU: uses GPU acceleration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putBodyParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The maximum number of records to return in a single request.</p>
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
         * <p>The pagination token used to retrieve the next page of results. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESG****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The DataWorks resource group identifier. You can specify the numeric ID of the resource group or the full identifier in the Serverless_res_group_{tenantId}_{resgId} format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_123456789012345_9876543210****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListServerIdeEcsSpecsRequest build() {
            return new ListServerIdeEcsSpecsRequest(this);
        } 

    } 

}
