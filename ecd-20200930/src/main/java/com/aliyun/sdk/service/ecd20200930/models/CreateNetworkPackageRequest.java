// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkPackageRequest</p>
 */
public class CreateNetworkPackageRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true, maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PromotionId")
    private String promotionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        } 

        /**
         * Specifies whether to enable the automatic payment feature.
         * <p>
         * 
         * Valid values:
         * 
         * *   true (default): enables the auto-payment feature.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     Make sure that your account has sufficient balance. Otherwise, no order is generated.
         * 
         *     <!-- -->
         * 
         * *   false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     To make the payment, log on to the WUYING Workspace console, go to the Orders page, and find the order based on the order ID.
         * 
         *     <!-- -->
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the premium bandwidth plan.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.
         * <p>
         * 
         * *   Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.
         * *   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.
         * *   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The charge type of the premium bandwidth plan.
         * <p>
         * 
         * *   Valid value when the `PayType` parameter is set to `PrePaid`:
         * 
         *     *   PayByBandwidth: charges by fixed bandwidth.
         * 
         * *   Valid values when the `PayType` parameter is set to `PostPaid`:
         * 
         *     *   PayByTraffic: charges by data transfer.
         *     *   PayByBandwidth: charges by fixed bandwidth.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The office network ID.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The billing method of the premium bandwidth plan.
         * <p>
         * 
         * Valid values:
         * 
         * *   PostPaid: pay-as-you-go
         * *   PrePaid: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the `PayType` parameter is set to `PrePaid`. The valid values of this parameter vary based on the `PeriodUnit` value.
         * <p>
         * 
         * *   Valid value when the `PeriodUnit` parameter is set to `Week`: 1
         * *   Valid values when the `PeriodUnit` parameter is set to `Month`: 1, 2, 3, and 6
         * *   Valid values when the `PeriodUnit` parameter is set to `Year`: 1, 2, and 3
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the `PayType` parameter is set to `PrePaid`.
         * <p>
         * 
         * Valid values:
         * 
         * *   Month
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Year
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Week
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the sales promotion.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateNetworkPackageRequest build() {
            return new CreateNetworkPackageRequest(this);
        } 

    } 

}
