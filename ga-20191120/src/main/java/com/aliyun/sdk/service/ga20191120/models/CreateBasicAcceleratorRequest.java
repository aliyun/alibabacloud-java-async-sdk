// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicAcceleratorRequest</p>
 */
public class CreateBasicAcceleratorRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private String autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthBillingType")
    private String bandwidthBillingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateBasicAcceleratorRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidthBillingType = builder.bandwidthBillingType;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.duration = builder.duration;
        this.pricingCycle = builder.pricingCycle;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAcceleratorRequest create() {
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
     * @return bandwidthBillingType
     */
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
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

    public static final class Builder extends Request.Builder<CreateBasicAcceleratorRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoUseCoupon; 
        private String bandwidthBillingType; 
        private String chargeType; 
        private String clientToken; 
        private Boolean dryRun; 
        private Integer duration; 
        private String pricingCycle; 
        private String promotionOptionNo; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicAcceleratorRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoUseCoupon = request.autoUseCoupon;
            this.bandwidthBillingType = request.bandwidthBillingType;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.duration = request.duration;
            this.pricingCycle = request.pricingCycle;
            this.promotionOptionNo = request.promotionOptionNo;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **false:** disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated. This is the default value.
         * *   **true:** enables automatic payment. Payments are automatically completed.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the basic GA instance. Valid values:
         * <p>
         * 
         * *   **true:** enables auto-renewal for the basic GA instance.
         * *   **false:** disables auto-renewal for the basic GA instance. This is the default value.
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
         * >  This parameter takes effect only when the **AutoPay** parameter is set to **true**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * Specifies whether to automatically apply coupons to your bills. Valid values:
         * <p>
         * 
         * *   **true:** automatically applies coupons to your bills.
         * *   **false:** does not automatically apply coupons to your bills. This is the default value.
         * 
         * >  This parameter takes effect only when the **AutoPay** parameter is set to **true**.
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The bandwidth billing method. Valid values:
         * <p>
         * 
         * *   **BandwidthPackage:** billed based on bandwidth plans.
         * *   **CDT:** billed based on data transfer. The bills are managed by using Cloud Data Transfer (CDT).
         * *   **CDT95:** billed based on the 95th percentile bandwidth. The bills are managed by using Cloud Data Transfer (CDT). This bandwidth billing method is not available by default. Contact your Alibaba Cloud account manager for more information.
         */
        public Builder bandwidthBillingType(String bandwidthBillingType) {
            this.putQueryParameter("BandwidthBillingType", bandwidthBillingType);
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **PREPAY** (default)
         * *   **POSTPAY**
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true:** performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**: performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed. This is the default value.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The subscription duration of the GA instance.
         * <p>
         * 
         * *   If you set **PricingCycle** to **Month**, the valid values for **Duration** are **1** to **9**.
         * *   If you set **PricingCycle** to **Year**, the valid values for **Duration** are **1** to **3**.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The billing cycle. Valid values:
         * <p>
         * 
         * *   **Month**
         * *   **Year**
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The code of the coupon.
         * <p>
         * 
         * >  This parameter takes effect only for accounts registered on the international site (alibabacloud.com).
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * The ID of the region where the basic GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the basic GA instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags of the basic GA instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateBasicAcceleratorRequest build() {
            return new CreateBasicAcceleratorRequest(this);
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
             * The tag key. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.
             * 
             * You can specify up to 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. The tag value cannot be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.
             * 
             * You can specify up to 20 tag values.
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
