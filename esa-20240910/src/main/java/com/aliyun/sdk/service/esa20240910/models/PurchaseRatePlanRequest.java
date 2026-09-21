// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PurchaseRatePlanRequest} extends {@link RequestModel}
 *
 * <p>PurchaseRatePlanRequest</p>
 */
public class PurchaseRatePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 99, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coverage")
    private String coverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OveragePolicy")
    private String overagePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanCode")
    private String planCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private PurchaseRatePlanRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.channel = builder.channel;
        this.chargeType = builder.chargeType;
        this.coverage = builder.coverage;
        this.overagePolicy = builder.overagePolicy;
        this.period = builder.period;
        this.planCode = builder.planCode;
        this.planName = builder.planName;
        this.siteName = builder.siteName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseRatePlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return overagePolicy
     */
    public String getOveragePolicy() {
        return this.overagePolicy;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return planCode
     */
    public String getPlanCode() {
        return this.planCode;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PurchaseRatePlanRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String channel; 
        private String chargeType; 
        private String coverage; 
        private String overagePolicy; 
        private Integer period; 
        private String planCode; 
        private String planName; 
        private String siteName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseRatePlanRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.channel = request.channel;
            this.chargeType = request.chargeType;
            this.coverage = request.coverage;
            this.overagePolicy = request.overagePolicy;
            this.period = request.period;
            this.planCode = request.planCode;
            this.planName = request.planName;
            this.siteName = request.siteName;
            this.type = request.type;
        } 

        /**
         * <p>The number of plans to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Set this parameter to true when you directly call this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The channel field.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxWodkxxx</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription.</li>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * <p>Set this parameter to PREPAY when you directly call this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li>domestic: the Chinese mainland only.</li>
         * <li>global: global.</li>
         * <li>overseas: global (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * <p>The overage policy.</p>
         * 
         * <strong>example:</strong>
         * <p>limit_speed</p>
         */
        public Builder overagePolicy(String overagePolicy) {
            this.putQueryParameter("OveragePolicy", overagePolicy);
            this.overagePolicy = overagePolicy;
            return this;
        }

        /**
         * <p>The purchase period, in months. This parameter is required when you directly call this operation.</p>
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
         * <p>The plan code.</p>
         * <p>China site</p>
         * <ul>
         * <li>Free Edition: entranceplan</li>
         * <li>Basic: basicplan</li>
         * <li>Standard: standardplan</li>
         * <li>Advanced: advancedplan</li>
         * </ul>
         * <p>International site</p>
         * <ul>
         * <li>Entrance: entranceplan</li>
         * <li>Pro: standardplan</li>
         * <li>Premium: advancedpla</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basicplan</p>
         */
        public Builder planCode(String planCode) {
            this.putQueryParameter("PlanCode", planCode);
            this.planCode = planCode;
            return this;
        }

        /**
         * <p>The plan name.</p>
         * <p>China site</p>
         * <ul>
         * <li>Free Edition: entranceplan</li>
         * <li>Basic: basic</li>
         * <li>Standard: medium</li>
         * <li>Advanced: high</li>
         * </ul>
         * <p>International site</p>
         * <ul>
         * <li>Entrance: entranceplan_intl</li>
         * <li>Pro: basicplan_intl</li>
         * <li>Premium: vipplan_intl</li>
         * </ul>
         * <p>Note: For Enterprise Edition plans, the plan name is provided after backend configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder siteName(String siteName) {
            this.putQueryParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>The site access type. Valid values:</p>
         * <ul>
         * <li>NS: NS access.</li>
         * <li>CNAME: CNAME access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNAME</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PurchaseRatePlanRequest build() {
            return new PurchaseRatePlanRequest(this);
        } 

    } 

}
