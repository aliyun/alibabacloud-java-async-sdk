// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateCenBandwidthPackageRequest</p>
 */
public class CreateCenBandwidthPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageChargeType")
    private String bandwidthPackageChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GeographicRegionAId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String geographicRegionAId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GeographicRegionBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String geographicRegionBId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateCenBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageChargeType = builder.bandwidthPackageChargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.geographicRegionAId = builder.geographicRegionAId;
        this.geographicRegionBId = builder.geographicRegionBId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.pricingCycle = builder.pricingCycle;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenBandwidthPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageChargeType
     */
    public String getBandwidthPackageChargeType() {
        return this.bandwidthPackageChargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return geographicRegionAId
     */
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    /**
     * @return geographicRegionBId
     */
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateCenBandwidthPackageRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private Integer bandwidth; 
        private String bandwidthPackageChargeType; 
        private String clientToken; 
        private String description; 
        private String geographicRegionAId; 
        private String geographicRegionBId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String pricingCycle; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenBandwidthPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.bandwidth = request.bandwidth;
            this.bandwidthPackageChargeType = request.bandwidthPackageChargeType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.geographicRegionAId = request.geographicRegionAId;
            this.geographicRegionBId = request.geographicRegionBId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.pricingCycle = request.pricingCycle;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to automatically complete the payment of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false** (default): no
         * 
         * If you set the parameter to false, go to Billing Management to complete the payment after you call this operation. The instance is created only after you complete the payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable the auto-renewal feature. Valid values:
         * <p>
         * 
         * *   **true**: enables auto-renewal.
         * *   **false** (default): disables auto-renewal.
         * 
         * > Only subscription bandwidth plans support auto-renewal.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. Unit: months. Valid values: **0** to **2147483647**. Default value: **1**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * The maximum bandwidth value of the bandwidth plan. Unit: Mbit/s. Valid values: **2** to **10000**.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The billing method of the bandwidth plan. Set the value to **PREPAY**, which indicates that the billing method is pay-as-you-go.
         */
        public Builder bandwidthPackageChargeType(String bandwidthPackageChargeType) {
            this.putQueryParameter("BandwidthPackageChargeType", bandwidthPackageChargeType);
            this.bandwidthPackageChargeType = bandwidthPackageChargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the bandwidth plan.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The area where the network instance is deployed. Valid values:
         * <p>
         * 
         * *   **China**: Chinese mainland
         * *   **North-America**: North America
         * *   **Asia-Pacific**: Asia Pacific
         * *   **Europe**: Europe
         * *   **Australia**: Australia
         */
        public Builder geographicRegionAId(String geographicRegionAId) {
            this.putQueryParameter("GeographicRegionAId", geographicRegionAId);
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }

        /**
         * The area where the other network instance is deployed. Valid values: Valid values:
         * <p>
         * 
         * *   **China**: Chinese mainland
         * *   **North-America**: North America
         * *   **Asia-Pacific**: Asia Pacific
         * *   **Europe**: Europe
         * *   **Australia**: Australia
         */
        public Builder geographicRegionBId(String geographicRegionBId) {
            this.putQueryParameter("GeographicRegionBId", geographicRegionBId);
            this.geographicRegionBId = geographicRegionBId;
            return this;
        }

        /**
         * The name of the bandwidth plan.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The subscription duration of the bandwidth plan. Default value: 1.
         * <p>
         * 
         * *   If **PricingCycle** is set to **Month**, set **Period** to a value from **1** to **3** or **6**.
         * *   If **PricingCycle** is set to **Year**, set **Period** to a value from **1** to **3**.
         * 
         * > This parameter is required when **BandwidthPackageChargeType** is set to **PREPAY**.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The billing cycle of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **Month** (default): billed on a monthly basis.
         * *   **Year**: billed on an annual basis.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The information about the tags.
         * <p>
         * 
         * You can specify at most 20 tags in each call.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateCenBandwidthPackageRequest build() {
            return new CreateCenBandwidthPackageRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             * <p>
             * 
             * The tag keys cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             * 
             * You can specify at most 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             * 
             * Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
