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
 * {@link RenewVirtualBridgeRequest} extends {@link RequestModel}
 *
 * <p>RenewVirtualBridgeRequest</p>
 */
public class RenewVirtualBridgeRequest extends Request {
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

    private RenewVirtualBridgeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bridgeId = builder.bridgeId;
        this.paidCallBackUrl = builder.paidCallBackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewVirtualBridgeRequest create() {
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

    public static final class Builder extends Request.Builder<RenewVirtualBridgeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bridgeId; 
        private String paidCallBackUrl; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenewVirtualBridgeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bridgeId = request.bridgeId;
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
         * <p>false</p>
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
         * <p>The virtual bridge ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vb-shfisahfihs***</p>
         */
        public Builder bridgeId(String bridgeId) {
            this.putQueryParameter("BridgeId", bridgeId);
            this.bridgeId = bridgeId;
            return this;
        }

        /**
         * <p>The payment callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://edu.wuying.aliyun.com/edu/school-manage">https://edu.wuying.aliyun.com/edu/school-manage</a></p>
         */
        public Builder paidCallBackUrl(String paidCallBackUrl) {
            this.putQueryParameter("PaidCallBackUrl", paidCallBackUrl);
            this.paidCallBackUrl = paidCallBackUrl;
            return this;
        }

        /**
         * <p>The renewal duration. The valid values of this parameter are determined by the value of the <code>PeriodUnit</code> parameter.</p>
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
         * <p>The unit of the renewal duration, which is the unit of the <code>Period</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
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
         * <p>50003836003****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
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
        public RenewVirtualBridgeRequest build() {
            return new RenewVirtualBridgeRequest(this);
        } 

    } 

}
