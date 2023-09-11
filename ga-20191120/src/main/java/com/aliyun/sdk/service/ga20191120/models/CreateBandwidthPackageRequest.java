// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateBandwidthPackageRequest</p>
 */
public class CreateBandwidthPackageRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewDuration")
    @Validation(maximum = 12, minimum = 1)
    private Integer autoRenewDuration;

    @Query
    @NameInMap("AutoUseCoupon")
    private String autoUseCoupon;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Integer bandwidth;

    @Query
    @NameInMap("BandwidthType")
    private String bandwidthType;

    @Query
    @NameInMap("BillingType")
    private String billingType;

    @Query
    @NameInMap("CbnGeographicRegionIdA")
    private String cbnGeographicRegionIdA;

    @Query
    @NameInMap("CbnGeographicRegionIdB")
    private String cbnGeographicRegionIdB;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Duration")
    private String duration;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @Query
    @NameInMap("Ratio")
    private Integer ratio;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidth = builder.bandwidth;
        this.bandwidthType = builder.bandwidthType;
        this.billingType = builder.billingType;
        this.cbnGeographicRegionIdA = builder.cbnGeographicRegionIdA;
        this.cbnGeographicRegionIdB = builder.cbnGeographicRegionIdB;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.pricingCycle = builder.pricingCycle;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.ratio = builder.ratio;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBandwidthPackageRequest create() {
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
     * @return autoUseCoupon
     */
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return cbnGeographicRegionIdA
     */
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    /**
     * @return cbnGeographicRegionIdB
     */
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateBandwidthPackageRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoUseCoupon; 
        private Integer bandwidth; 
        private String bandwidthType; 
        private String billingType; 
        private String cbnGeographicRegionIdA; 
        private String cbnGeographicRegionIdB; 
        private String chargeType; 
        private String clientToken; 
        private String duration; 
        private String pricingCycle; 
        private String promotionOptionNo; 
        private Integer ratio; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateBandwidthPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoUseCoupon = request.autoUseCoupon;
            this.bandwidth = request.bandwidth;
            this.bandwidthType = request.bandwidthType;
            this.billingType = request.billingType;
            this.cbnGeographicRegionIdA = request.cbnGeographicRegionIdA;
            this.cbnGeographicRegionIdB = request.cbnGeographicRegionIdB;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.duration = request.duration;
            this.pricingCycle = request.pricingCycle;
            this.promotionOptionNo = request.promotionOptionNo;
            this.ratio = request.ratio;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.type = request.type;
        } 

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **false** (default): disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.
         * *   **true**: enables automatic payment. Payments are automatically completed.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **true**: enables auto-renewal.
         * *   **false** (default): does not enable auto-renewal.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. Unit: months.
         * <p>
         * 
         * Valid values: **1** to **12**. Default value: **1**.
         * 
         * >  This parameter is required only if **AutoRenew** is set to **true**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * Specifies whether to automatically pay bills by using coupons. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false** (default): no
         * 
         * >  This parameter is required only if **AutoPay** is set to **true**.
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The bandwidth of the bandwidth plan. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **2** to **2000**.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The type of the bandwidth. Valid values:
         * <p>
         * 
         * *   **Basic**: standard bandwidth
         * *   **Enhanced**: enhanced bandwidth
         * *   **Advanced**: premium bandwidth
         * 
         * If **Type** is set to **Basic**, this parameter is required.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * The metering method that is used when you use the pay-as-you-go billing method. Valid values:
         * <p>
         * 
         * *   **PayByTraffic** (default): pay-by-data-transfer
         * *   **PayBY95**: pay-by-95th-percentile By default, the pay-by-95th-percentile metering method is unavailable. If you want to use the metering method, contact your account manager.
         */
        public Builder billingType(String billingType) {
            this.putQueryParameter("BillingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * Area A to be connected. Set the value to **China-mainland**.
         * <p>
         * 
         * You can set this parameter only if you call this operation on the international site (alibabacloud.com).
         */
        public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.putQueryParameter("CbnGeographicRegionIdA", cbnGeographicRegionIdA);
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }

        /**
         * Area B to be connected. Set the value to **Global**.
         * <p>
         * 
         * You can set this parameter only if you call this operation on the international site (alibabacloud.com).
         */
        public Builder cbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.putQueryParameter("CbnGeographicRegionIdB", cbnGeographicRegionIdB);
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }

        /**
         * The billing method of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **PREPAY** (default): subscription.
         * *   **POSTPAY**: pay-as-you-go. By default, the pay-as-you-go billing method is unavailable. If you want to use the billing method, contact your account manager.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among all requests. The ClientToken value contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** of each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The subscription duration.
         * <p>
         * 
         * *   If the **PricingCycle** parameter is set to **Month**, the valid values for the **Duration** parameter are **1** to **9**.
         * *   If the **PricingCycle** parameter is set to **Year**, the valid values for the **Duration** parameter are **1** to **3**.
         * 
         * If **ChargeType** is set to **PREPAY**, this parameter is required.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The billing cycle. Valid values:
         * <p>
         * 
         * *   **Month**: billed on a monthly basis.
         * *   **Year**: billed on an annual basis.
         * 
         * If **ChargeType** is set to **PREPAY**, this parameter is required.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The coupon code.
         * <p>
         * 
         * >  This parameter is only available on the international site (alibabacloud.com).
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: **30** to **100**.
         * <p>
         * 
         * >  This parameter is required only if **BillingType** is set to **PayBY95**.
         */
        public Builder ratio(Integer ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. **cn-hangzhou** is returned.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags to add to the bandwidth plan.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **Basic**: a basic bandwidth plan
         * *   **CrossDomain**: a cross-region acceleration bandwidth plan
         * 
         * If you call this operation on the Alibaba Cloud China site, only **Basic** is supported.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateBandwidthPackageRequest build() {
            return new CreateBandwidthPackageRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Each tag key corresponds to a tag value. Valid values of **N**: **1** to **20**.
             * 
             * The value cannot exceed 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
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
