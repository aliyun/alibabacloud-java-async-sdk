// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifyConsumptionTimestampRequest} extends {@link RequestModel}
 *
 * <p>ModifyConsumptionTimestampRequest</p>
 */
public class ModifyConsumptionTimestampRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumptionTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumptionTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceId;

    private ModifyConsumptionTimestampRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.consumptionTimestamp = builder.consumptionTimestamp;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumptionTimestampRequest create() {
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
     * @return consumptionTimestamp
     */
    public String getConsumptionTimestamp() {
        return this.consumptionTimestamp;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyConsumptionTimestampRequest, Builder> {
        private String accountId; 
        private String consumptionTimestamp; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConsumptionTimestampRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.consumptionTimestamp = request.consumptionTimestamp;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The consumption checkpoint. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z. The time is displayed in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-15T17:20:03Z</p>
         */
        public Builder consumptionTimestamp(String consumptionTimestamp) {
            this.putQueryParameter("ConsumptionTimestamp", consumptionTimestamp);
            this.consumptionTimestamp = consumptionTimestamp;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsg2m10r1x15a****</p>
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        @Override
        public ModifyConsumptionTimestampRequest build() {
            return new ModifyConsumptionTimestampRequest(this);
        } 

    } 

}
