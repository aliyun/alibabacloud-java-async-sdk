// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscriptionInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscriptionInstanceRequest</p>
 */
public class CreateSubscriptionInstanceRequest extends Request {
    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("UsedTime")
    private Integer usedTime;

    private CreateSubscriptionInstanceRequest(Builder builder) {
        super(builder);
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateSubscriptionInstanceRequest, Builder> {
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String clientToken; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscriptionInstanceRequest request) {
            super(request);
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.usedTime = request.usedTime;
        } 

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The billing method of the change tracking instance.
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The billing cycle of the subscription instance. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         * 
         * >  You must specify this parameter only if you set the PayType parameter to **Prepaid**.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the change tracking instance. The region ID is the same as that of the source instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The subscription length.
         * <p>
         * 
         * *   If the billing cycle is **Year**, the value range is **1 to 5**.
         * *   If the billing cycle is **Month**, the value range is **1 to 60**.
         * 
         * >  You must specify this parameter only if you set the PayType parameter to **Prepaid**.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateSubscriptionInstanceRequest build() {
            return new CreateSubscriptionInstanceRequest(this);
        } 

    } 

    public static class SourceEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            /**
             * The type of the source instance. Valid values: **MySQL**, **PolarDB**, **DRDS**, and **Oracle**.
             * <p>
             * 
             * >  Default value: **MySQL**.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
