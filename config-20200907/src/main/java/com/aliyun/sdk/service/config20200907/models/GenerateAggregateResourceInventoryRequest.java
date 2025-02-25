// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GenerateAggregateResourceInventoryRequest} extends {@link RequestModel}
 *
 * <p>GenerateAggregateResourceInventoryRequest</p>
 */
public class GenerateAggregateResourceInventoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private String accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private String regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
    private Integer resourceDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    private GenerateAggregateResourceInventoryRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.aggregatorId = builder.aggregatorId;
        this.regions = builder.regions;
        this.resourceDeleted = builder.resourceDeleted;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAggregateResourceInventoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public String getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceDeleted
     */
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<GenerateAggregateResourceInventoryRequest, Builder> {
        private String accountIds; 
        private String aggregatorId; 
        private String regions; 
        private Integer resourceDeleted; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAggregateResourceInventoryRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.aggregatorId = request.aggregatorId;
            this.regions = request.regions;
            this.resourceDeleted = request.resourceDeleted;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * <p>The IDs of member accounts in the account group. Separate multiple member account IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>126672004088****</p>
         */
        public Builder accountIds(String accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The ID of the account group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a91d626622af0035****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The IDs of the regions to which the resources belong. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>Indicates whether the resource is deleted. Valid values:</p>
         * <ul>
         * <li>1 (default): The resource is retained.</li>
         * <li>0: The resource is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceDeleted(Integer resourceDeleted) {
            this.putQueryParameter("ResourceDeleted", resourceDeleted);
            this.resourceDeleted = resourceDeleted;
            return this;
        }

        /**
         * <p>The resource types. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public GenerateAggregateResourceInventoryRequest build() {
            return new GenerateAggregateResourceInventoryRequest(this);
        } 

    } 

}
