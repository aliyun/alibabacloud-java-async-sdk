// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateVirtualBridgeRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualBridgeRequest</p>
 */
public class CreateVirtualBridgeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeLevel")
    private String bridgeLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidCallBackUrl")
    private String paidCallBackUrl;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateVirtualBridgeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bridgeLevel = builder.bridgeLevel;
        this.officeSiteId = builder.officeSiteId;
        this.paidCallBackUrl = builder.paidCallBackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualBridgeRequest create() {
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
     * @return bridgeLevel
     */
    public String getBridgeLevel() {
        return this.bridgeLevel;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return paidCallBackUrl
     */
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateVirtualBridgeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bridgeLevel; 
        private String officeSiteId; 
        private String paidCallBackUrl; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualBridgeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bridgeLevel = request.bridgeLevel;
            this.officeSiteId = request.officeSiteId;
            this.paidCallBackUrl = request.paidCallBackUrl;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment.</p>
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
         * <p>Specifies whether to enable auto-renewal.</p>
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
         * <p>The bridge specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>vb.ultra</p>
         */
        public Builder bridgeLevel(String bridgeLevel) {
            this.putQueryParameter("BridgeLevel", bridgeLevel);
            this.bridgeLevel = bridgeLevel;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-467671****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The payment callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://wya.wuying.aliyun.com/mobileClaw">https://wya.wuying.aliyun.com/mobileClaw</a></p>
         */
        public Builder paidCallBackUrl(String paidCallBackUrl) {
            this.putQueryParameter("PaidCallBackUrl", paidCallBackUrl);
            this.paidCallBackUrl = paidCallBackUrl;
            return this;
        }

        /**
         * <p>The duration for which you want to purchase the resource. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>6</li>
         * </ul>
         * </li>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>4</li>
         * <li>5</li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The unit of duration for the subscription billable methods.</p>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. This feature is not region-specific. Set this parameter to cn-shanghai.</p>
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

        @Override
        public CreateVirtualBridgeRequest build() {
            return new CreateVirtualBridgeRequest(this);
        } 

    } 

}
