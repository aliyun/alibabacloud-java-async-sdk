// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateMobileAgentPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateMobileAgentPackageRequest</p>
 */
public class CreateMobileAgentPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelCookie")
    private String channelCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditAmount")
    private String creditAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditConfig")
    private String creditConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileAgentPackageSpec")
    private String mobileAgentPackageSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageSpecId")
    private Long packageSpecId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidCallbackUrl")
    private String paidCallbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateMobileAgentPackageRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.channelCookie = builder.channelCookie;
        this.creditAmount = builder.creditAmount;
        this.creditConfig = builder.creditConfig;
        this.imageId = builder.imageId;
        this.instanceName = builder.instanceName;
        this.mobileAgentPackageSpec = builder.mobileAgentPackageSpec;
        this.packageSpecId = builder.packageSpecId;
        this.paidCallbackUrl = builder.paidCallbackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMobileAgentPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return channelCookie
     */
    public String getChannelCookie() {
        return this.channelCookie;
    }

    /**
     * @return creditAmount
     */
    public String getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return creditConfig
     */
    public String getCreditConfig() {
        return this.creditConfig;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return mobileAgentPackageSpec
     */
    public String getMobileAgentPackageSpec() {
        return this.mobileAgentPackageSpec;
    }

    /**
     * @return packageSpecId
     */
    public Long getPackageSpecId() {
        return this.packageSpecId;
    }

    /**
     * @return paidCallbackUrl
     */
    public String getPaidCallbackUrl() {
        return this.paidCallbackUrl;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateMobileAgentPackageRequest, Builder> {
        private String amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private String channelCookie; 
        private String creditAmount; 
        private String creditConfig; 
        private String imageId; 
        private String instanceName; 
        private String mobileAgentPackageSpec; 
        private Long packageSpecId; 
        private String paidCallbackUrl; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateMobileAgentPackageRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.channelCookie = request.channelCookie;
            this.creditAmount = request.creditAmount;
            this.creditConfig = request.creditConfig;
            this.imageId = request.imageId;
            this.instanceName = request.instanceName;
            this.mobileAgentPackageSpec = request.mobileAgentPackageSpec;
            this.packageSpecId = request.packageSpecId;
            this.paidCallbackUrl = request.paidCallbackUrl;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.tag = request.tag;
        } 

        /**
         * <p>The number of resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong> (default): Only an order is generated. No payment is made.</li>
         * </ul>
         * <blockquote>
         * <p>If your payment method has an insufficient balance, set this parameter to false. An unpaid order is generated. You can log on to the Elastic Cloud Phone console to complete the payment.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong> (default): Auto-renewal is disabled.</li>
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
         * <p>The region where the instance resides. Currently, only cn-hangzhou is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChannelCookie.
         */
        public Builder channelCookie(String channelCookie) {
            this.putQueryParameter("ChannelCookie", channelCookie);
            this.channelCookie = channelCookie;
            return this;
        }

        /**
         * <p>The credit quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10000.0</p>
         */
        public Builder creditAmount(String creditAmount) {
            this.putQueryParameter("CreditAmount", creditAmount);
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * <p>The credit limit configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder creditConfig(String creditConfig) {
            this.putQueryParameter("CreditConfig", creditConfig);
            this.creditConfig = creditConfig;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the node instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudPhone</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The resource plan specification.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder mobileAgentPackageSpec(String mobileAgentPackageSpec) {
            this.putQueryParameter("MobileAgentPackageSpec", mobileAgentPackageSpec);
            this.mobileAgentPackageSpec = mobileAgentPackageSpec;
            return this;
        }

        /**
         * PackageSpecId.
         */
        public Builder packageSpecId(Long packageSpecId) {
            this.putQueryParameter("PackageSpecId", packageSpecId);
            this.packageSpecId = packageSpecId;
            return this;
        }

        /**
         * <p>The redirect URL after a successful payment.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
         */
        public Builder paidCallbackUrl(String paidCallbackUrl) {
            this.putQueryParameter("PaidCallbackUrl", paidCallbackUrl);
            this.paidCallbackUrl = paidCallbackUrl;
            return this;
        }

        /**
         * <p>The duration for which you want to purchase the resource. The unit is specified by <code>PeriodUnit</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the duration for which you want to purchase the resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: month.</li>
         * <li><strong>Year</strong>: year.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the promotional campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateMobileAgentPackageRequest build() {
            return new CreateMobileAgentPackageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMobileAgentPackageRequest} extends {@link TeaModel}
     *
     * <p>CreateMobileAgentPackageRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
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
             * <p>The tag key. This parameter cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
