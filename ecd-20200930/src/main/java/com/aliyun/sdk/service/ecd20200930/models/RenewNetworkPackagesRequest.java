// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewNetworkPackagesRequest} extends {@link RequestModel}
 *
 * <p>RenewNetworkPackagesRequest</p>
 */
public class RenewNetworkPackagesRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    private java.util.List < String > networkPackageId;

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

    private RenewNetworkPackagesRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.networkPackageId = builder.networkPackageId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewNetworkPackagesRequest create() {
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
     * @return networkPackageId
     */
    public java.util.List < String > getNetworkPackageId() {
        return this.networkPackageId;
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

    public static final class Builder extends Request.Builder<RenewNetworkPackagesRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List < String > networkPackageId; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenewNetworkPackagesRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.networkPackageId = request.networkPackageId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to automatically complete the payment. Valid values:
         * <p>
         * 
         * *   `true`: automatically completes the payment. Make sure that your Alibaba Cloud account has sufficient balance. If your Alibaba Cloud account does not have sufficient balance, abnormal orders are generated.
         * *   `false`: does not complete the payment. In this case, an order is generated, but no payment is made. You can log on to the Elastic Desktop Service (EDS) console and complete the payment based on the order ID on the **Orders** page.
         * 
         * Default value: `true`.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The ID of the Internet access package. You can specify 1 to 100 IDs of Internet access packages.
         */
        public Builder networkPackageId(java.util.List < String > networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * The renewal period. Valid values of this parameter are determined by the value of the `PeriodUnit` parameter.
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
         * The unit of the renewal period. Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the promotion. You can call the `GetResourcePrice` operation to query the promotion ID.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RenewNetworkPackagesRequest build() {
            return new RenewNetworkPackagesRequest(this);
        } 

    } 

}
