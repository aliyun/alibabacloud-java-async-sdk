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
 * {@link CreateNetworkPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkPackageRequest</p>
 */
public class CreateNetworkPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    private CreateNetworkPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bandwidth = builder.bandwidth;
        this.internetChargeType = builder.internetChargeType;
        this.officeSiteId = builder.officeSiteId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkPackageRequest create() {
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static final class Builder extends Request.Builder<CreateNetworkPackageRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer bandwidth; 
        private String internetChargeType; 
        private String officeSiteId; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bandwidth = request.bandwidth;
            this.internetChargeType = request.internetChargeType;
            this.officeSiteId = request.officeSiteId;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
        } 

        /**
         * <p>Specifies whether to enable the automatic payment feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true (default): enables the auto-payment feature.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
         * <!-- -->
         * </li>
         * <li><p>false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>To make the payment, log on to the Elastic Desktop Service console, go to the Orders page, and find the order based on the order ID.</p>
         * <!-- --></li>
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
         * <p>Specifies whether to enable auto-renewal for the premium bandwidth plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
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
         * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
         * <ul>
         * <li>Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.</li>
         * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.</li>
         * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The charge type of the premium bandwidth plan.</p>
         * <ul>
         * <li><p>Valid value when the <code>PayType</code> parameter is set to <code>PrePaid</code>:</p>
         * <ul>
         * <li>PayByBandwidth: charges by fixed bandwidth.</li>
         * </ul>
         * </li>
         * <li><p>Valid values when the <code>PayType</code> parameter is set to <code>PostPaid</code>:</p>
         * <ul>
         * <li>PayByTraffic: charges by data transfer.</li>
         * <li>PayByBandwidth: charges by fixed bandwidth.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The billing method of the premium bandwidth plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the <code>PayType</code> parameter is set to <code>PrePaid</code>. The valid values of this parameter vary based on the <code>PeriodUnit</code> value.</p>
         * <ul>
         * <li>Valid value when the <code>PeriodUnit</code> parameter is set to <code>Week</code>: 1</li>
         * <li>Valid values when the <code>PeriodUnit</code> parameter is set to <code>Month</code>: 1, 2, 3, and 6</li>
         * <li>Valid values when the <code>PeriodUnit</code> parameter is set to <code>Year</code>: 1, 2, and 3</li>
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
         * <p>The unit of the subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the <code>PayType</code> parameter is set to <code>PrePaid</code>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Month</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Year</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Week</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
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
         * <p>The ID of the sales promotion.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        @Override
        public CreateNetworkPackageRequest build() {
            return new CreateNetworkPackageRequest(this);
        } 

    } 

}
