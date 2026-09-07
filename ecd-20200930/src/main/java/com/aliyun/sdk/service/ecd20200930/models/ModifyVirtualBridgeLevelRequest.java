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
 * {@link ModifyVirtualBridgeLevelRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualBridgeLevelRequest</p>
 */
public class ModifyVirtualBridgeLevelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bridgeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bridgeLevel;

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

    private ModifyVirtualBridgeLevelRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bridgeId = builder.bridgeId;
        this.bridgeLevel = builder.bridgeLevel;
        this.paidCallBackUrl = builder.paidCallBackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualBridgeLevelRequest create() {
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
     * @return bridgeId
     */
    public String getBridgeId() {
        return this.bridgeId;
    }

    /**
     * @return bridgeLevel
     */
    public String getBridgeLevel() {
        return this.bridgeLevel;
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

    public static final class Builder extends Request.Builder<ModifyVirtualBridgeLevelRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bridgeId; 
        private String bridgeLevel; 
        private String paidCallBackUrl; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualBridgeLevelRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bridgeId = request.bridgeId;
            this.bridgeLevel = request.bridgeLevel;
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
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect and is optional only when the billing method is <code>PrePaid</code>.</p>
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
         * <p>The virtual bridge ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vb-sfjoasjfosdfj**</p>
         */
        public Builder bridgeId(String bridgeId) {
            this.putQueryParameter("BridgeId", bridgeId);
            this.bridgeId = bridgeId;
            return this;
        }

        /**
         * <p>The virtual bridge specifications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vb.pro</p>
         */
        public Builder bridgeLevel(String bridgeLevel) {
            this.putQueryParameter("BridgeLevel", bridgeLevel);
            this.bridgeLevel = bridgeLevel;
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
         * <p>The renewal duration. Valid values of this parameter are determined by the value of the <code>PeriodUnit</code> parameter.</p>
         * <ul>
         * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, and 6.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are 1, 2, and 3.</li>
         * </ul>
         * <p>Default value: 1.</p>
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
         * <p>The unit of the subscription duration for the prepaid cloud disk. This parameter takes effect and is required only when the <code>CdsChargeType</code> parameter is set to <code>PrePaid</code>.</p>
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
         * <p>The promotion ID. You can call the pricing query operation to obtain the list of matched promotion IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>23141</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by WUYING Workspace.</p>
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
        public ModifyVirtualBridgeLevelRequest build() {
            return new ModifyVirtualBridgeLevelRequest(this);
        } 

    } 

}
