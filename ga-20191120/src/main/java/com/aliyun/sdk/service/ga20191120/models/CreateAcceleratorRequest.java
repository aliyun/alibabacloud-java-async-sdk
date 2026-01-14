// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

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
    @Deprecated
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
    private java.util.List<Tag> tag;

    private CreateAcceleratorRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidth = builder.bandwidth;
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateAcceleratorRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoUseCoupon; 
        private Integer bandwidth; 
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
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateAcceleratorRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoUseCoupon = request.autoUseCoupon;
            this.bandwidth = request.bandwidth;
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
         * <p>Specifies whether to enable automatic payment. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>false:</strong> disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</li>
         * <li><strong>true:</strong> enables automatic payment. Payments are automatically completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> enables auto-renewal.</li>
         * <li><strong>false:</strong> disables auto-renewal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration. Unit: months.</p>
         * <p>Valid values: <strong>1</strong> to <strong>12</strong>. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>Specifies whether to automatically use coupons when making payments. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> automatically pays bill by using coupons.</li>
         * <li><strong>false:</strong> does not automatically pay bills by using coupons.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The bandwidth billing method.</p>
         * <ul>
         * <li><strong>BandwidthPackage:</strong> billed based on bandwidth plans.</li>
         * <li><strong>CDT:</strong> billed based on data transfer.</li>
         * <li><strong>CDT95:</strong> billed based on the 95th percentile bandwidth. The billing is managed by Cloud Data Transfer (CDT). This bandwidth billing method is not available by default. Contact your Alibaba Cloud account manager for more information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BandwidthPackage</p>
         */
        public Builder bandwidthBillingType(String bandwidthBillingType) {
            this.putQueryParameter("BandwidthBillingType", bandwidthBillingType);
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The subscription duration of the GA instance.</p>
         * <ul>
         * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Month</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>9</strong>.</li>
         * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Year</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>3</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>InstanceChargeType</strong> parameter is set to <strong>PREPAY</strong>, you must configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The billing method of the GA instance.</p>
         * <ul>
         * <li>PREPAY (default): subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The configurations of the acceleration area.</p>
         */
        public Builder ipSetConfig(IpSetConfig ipSetConfig) {
            this.putQueryParameter("IpSetConfig", ipSetConfig);
            this.ipSetConfig = ipSetConfig;
            return this;
        }

        /**
         * <p>The name of the GA instance.</p>
         * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The billing cycle of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>Month:</strong> billed on a monthly basis.</li>
         * <li><strong>Year:</strong> billed on an annual basis.</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>InstanceChargeType</strong> parameter is set to <strong>PREPAY</strong>, you must configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>50003298014****</p>
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the standard GA instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzrnd67gq****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Small Ⅰ.</li>
         * <li><strong>2</strong>: Small Ⅱ.</li>
         * <li><strong>3</strong>: Small Ⅲ.</li>
         * <li><strong>5</strong>: Medium Ⅰ.</li>
         * <li><strong>8</strong>: Medium Ⅱ.</li>
         * <li><strong>10</strong>: Medium Ⅲ.</li>
         * <li><strong>20</strong>: Large Ⅰ.</li>
         * <li><strong>30</strong>: Large Ⅱ.</li>
         * <li><strong>40</strong>: Large Ⅲ.</li>
         * <li><strong>50</strong>: Large IV.</li>
         * <li><strong>60</strong>: Large V.</li>
         * <li><strong>70</strong>: Large VI.</li>
         * <li><strong>80</strong>: Large VII.</li>
         * <li><strong>90</strong>: Large VIII.</li>
         * <li><strong>100</strong>: Super Large Ⅰ.</li>
         * <li><strong>200</strong>: Super Large Ⅱ.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>GA instances Large III and above are not available by default. To use these instances, contact your Alibaba Cloud account manager.</li>
         * <li>If the <strong>InstanceChargeType</strong> parameter is set to <strong>PREPAY</strong>, you must configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>Different specifications provide different capabilities. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance type</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The tags of the GA instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateAcceleratorRequest build() {
            return new CreateAcceleratorRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>CreateAcceleratorRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(IpSetConfig model) {
                this.accessMode = model.accessMode;
            } 

            /**
             * <p>The access mode of the acceleration area. Valid values:</p>
             * <ul>
             * <li><strong>UserDefine:</strong> custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate EIP to each acceleration region.</li>
             * <li><strong>Anycast:</strong> automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserDefine</p>
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
    /**
     * 
     * {@link CreateAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>CreateAcceleratorRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the GA instance. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * <p>You can specify up to 20 tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the GA instance. The tag value cannot be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * <p>You can specify up to 20 tag values.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
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
