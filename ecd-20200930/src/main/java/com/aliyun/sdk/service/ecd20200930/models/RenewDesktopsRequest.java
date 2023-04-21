// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopsRequest} extends {@link RequestModel}
 *
 * <p>RenewDesktopsRequest</p>
 */
public class RenewDesktopsRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

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

    private RenewDesktopsRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopId = builder.desktopId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewDesktopsRequest create() {
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
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
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

    public static final class Builder extends Request.Builder<RenewDesktopsRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List < String > desktopId; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenewDesktopsRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.desktopId = request.desktopId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   true: enables automatic payment. Make sure that you have sufficient balance in your account. Otherwise, abnormal orders are generated.
         * *   false: generates the order with no payment made. You can log on to the EDS console and complete the payment based on the order number.
         * 
         * Default value: true.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The IDs of cloud desktops.
         * <p>
         * 
         * Only subscription cloud desktops can be renewed by calling this operation.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The renewal duration. The valid values of this parameter are determined by the PeriodUnit value.
         * <p>
         * 
         * *   If PeriodUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, and 6.
         * *   If PeriodUnit is set to Year, the valid values of the Period parameter are 1, 2, 3, 4, and 5.
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the renewal duration specified by the Period parameter. Valid values:
         * <p>
         * 
         * *   Month
         * *   Year
         * 
         * Default value: Month.
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
         * The region ID of the cloud desktop.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RenewDesktopsRequest build() {
            return new RenewDesktopsRequest(this);
        } 

    } 

}
