// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAggregateResourceInventoryRequest} extends {@link RequestModel}
 *
 * <p>GenerateAggregateResourceInventoryRequest</p>
 */
public class GenerateAggregateResourceInventoryRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private String accountIds;

    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("Regions")
    private String regions;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    private GenerateAggregateResourceInventoryRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.aggregatorId = builder.aggregatorId;
        this.regions = builder.regions;
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
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<GenerateAggregateResourceInventoryRequest, Builder> {
        private String accountIds; 
        private String aggregatorId; 
        private String regions; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAggregateResourceInventoryRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.aggregatorId = request.aggregatorId;
            this.regions = request.regions;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The IDs of member accounts in the account group. Separate multiple member account IDs with commas (,).
         */
        public Builder accountIds(String accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The IDs of the regions to which the resources belong. Separate multiple region IDs with commas (,).
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The resource types. Separate multiple resource types with commas (,).
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
