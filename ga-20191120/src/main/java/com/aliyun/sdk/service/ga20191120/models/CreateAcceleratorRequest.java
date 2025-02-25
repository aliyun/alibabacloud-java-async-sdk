// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>CreateAcceleratorRequest</p>
 */
public class CreateAcceleratorRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSetConfig")
    private IpSetConfig ipSetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateAcceleratorRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidthBillingType = builder.bandwidthBillingType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.duration = builder.duration;
        this.instanceChargeType = builder.instanceChargeType;
        this.ipSetConfig = builder.ipSetConfig;
        this.name = builder.name;
        this.pricingCycle = builder.pricingCycle;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAcceleratorRequest create() {
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return ipSetConfig
     */
    public IpSetConfig getIpSetConfig() {
        return this.ipSetConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateAcceleratorRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoUseCoupon; 
        private String bandwidthBillingType; 
        private String clientToken; 
        private Boolean dryRun; 
        private Integer duration; 
        private String instanceChargeType; 
        private IpSetConfig ipSetConfig; 
        private String name; 
        private String pricingCycle; 
        private String promotionOptionNo; 
        private String regionId; 
        private String resourceGroupId; 
        private String spec; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateAcceleratorRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoUseCoupon = request.autoUseCoupon;
            this.bandwidthBillingType = request.bandwidthBillingType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.duration = request.duration;
            this.instanceChargeType = request.instanceChargeType;
            this.ipSetConfig = request.ipSetConfig;
            this.name = request.name;
            this.pricingCycle = request.pricingCycle;
            this.promotionOptionNo = request.promotionOptionNo;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.spec = request.spec;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to enable automatic payment. Default value: false. Valid values:
         * <p>
         * 
         * *   **false:** disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.
         * *   **true:** enables automatic payment. Payments are automatically completed.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:
         * <p>
         * 
         * *   **true:** enables auto-renewal.
         * *   **false:** disables auto-renewal.
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
         * >  This parameter takes effect only when **AutoRenew** is set to **true**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * Specifies whether to automatically use coupons when making payments. Default value: false. Valid values:
         * <p>
         * 
         * *   **true:** automatically pays bill by using coupons.
         * *   **false:** does not automatically pay bills by using coupons.
         * 
         * >  This parameter takes effect only when **AutoPay** is set to **true**.
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The bandwidth billing method.
         * <p>
         * 
         * *   **BandwidthPackage:** billed based on bandwidth plans.
         * *   **CDT:** billed based on data transfer.
         * *   **CDT95:** billed based on the 95th percentile bandwidth. The billing is managed by Cloud Data Transfer (CDT). This bandwidth billing method is not available by default. Contact your Alibaba Cloud account manager for more information.
         */
        public Builder bandwidthBillingType(String bandwidthBillingType) {
            this.putQueryParameter("BandwidthBillingType", bandwidthBillingType);
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** of each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to precheck the request. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false**: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
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
         * *   If the **PricingCycle** parameter is set to **Month**, the valid values for the **Duration** parameter are **1** to **9**.
         * *   If the **PricingCycle** parameter is set to **Year**, the valid values for the **Duration** parameter are **1** to **3**.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The billing method of the GA. Default value is PREPAY (subscription).
         * <p>
         * 
         * *   PREPAY : subscription.
         * *   POSTPAY : pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The configurations of the acceleration area.
         */
        public Builder ipSetConfig(IpSetConfig ipSetConfig) {
            this.putQueryParameter("IpSetConfig", ipSetConfig);
            this.ipSetConfig = ipSetConfig;
            return this;
        }

        /**
         * The name of the GA instance.
         * <p>
         * 
         * The name must be 2 to 128 characters in length and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The billing cycle of the GA instance. Valid values:
         * <p>
         * 
         * *   **Month:** billed on a monthly basis.
         * *   **Year:** billed on an annual basis.
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
         * >
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * The ID of the region in which to create the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the standard GA instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of GA instance. Valid values:
         * <p>
         * 
         * *   **1:** Small Ⅰ
         * *   **2:** Small Ⅱ
         * *   **3:** Small Ⅲ
         * *   **5:** Medium Ⅰ
         * *   **8:** Medium Ⅱ
         * *   **10:** Medium Ⅲ
         * *   **20:** Large Ⅰ
         * *   **30:** Large Ⅱ
         * *   **40:** Large Ⅲ
         * *   **50:** Large Ⅳ
         * *   **60:** Large Ⅴ
         * *   **70:** Large Ⅵ
         * *   **80:** Large VⅡ
         * *   **90:** Large VⅢ
         * *   **100:** Super Large Ⅰ
         * *   **200:** Super Large Ⅱ
         * 
         * >  GA instances Large III and above are not available by default. To use these instances , contact your Alibaba Cloud account manager.
         * 
         * Each instance type provides different capabilities. For more information, see [Instance specifications](~~153127~~).
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * The tags of the GA instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateAcceleratorRequest build() {
            return new CreateAcceleratorRequest(this);
        } 

    } 

    public static class IpSetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        private IpSetConfig(Builder builder) {
            this.accessMode = builder.accessMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSetConfig create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        public static final class Builder {
            private String accessMode; 

            /**
             * The access mode of the acceleration area. Valid values:
             * <p>
             * 
             * *   **UserDefine:** custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate EIP to each acceleration region.
             * *   **Anycast:** automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            public IpSetConfig build() {
                return new IpSetConfig(this);
            } 

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
             * The tag key of the GA instance. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             * 
             * You can specify up to 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the GA instance. The tag value cannot be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
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
