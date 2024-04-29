// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopChargeTypeRequest</p>
 */
public class ModifyDesktopChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > desktopId;

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
    @com.aliyun.core.annotation.NameInMap("UseDuration")
    private Integer useDuration;

    private ModifyDesktopChargeTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.desktopId = builder.desktopId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.useDuration = builder.useDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopChargeTypeRequest create() {
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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

    /**
     * @return useDuration
     */
    public Integer getUseDuration() {
        return this.useDuration;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopChargeTypeRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private java.util.List < String > desktopId; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private Integer useDuration; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopChargeTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.desktopId = request.desktopId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.useDuration = request.useDuration;
        } 

        /**
         * Specifies whether to enable automatic payment if you specify subscription as the new billing method for the cloud desktop.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The new billing method that you want to apply.
         * <p>
         * 
         * Valid values:
         * 
         * *   PostPaid: changes the billing method from subscription to pay-as-you-go.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PrePaid: changes the billing method from pay-as-you-go to subscription.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The IDs of the cloud computers. You can specify 1 to 20 IDs.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The subscription duration of the cloud computers if you set the ChargeType parameter to PrePaid. The unit is specified by the `PeriodUnit` parameter. This parameter is valid only when the `ChargeType` parameter is set to `PrePaid`. In this case, you must specify this parameter.
         * <p>
         * 
         * *   If the `PeriodUnit` parameter is set to `Week`, set the Period parameter to 1.
         * *   If the `PeriodUnit` parameter is set to `Month`, the valid values of the Period parameter are 1, 2, 3, and 6.
         * *   If the `PeriodUnit` parameter is set to `Year`, the valid values of the Period parameter are 1, 2, 3, 4, and 5.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration if you specify subscription as the new billing method for the cloud desktop.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the promotional activity.
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

        /**
         * >  This parameter is in invitational preview and not publicly available.
         */
        public Builder useDuration(Integer useDuration) {
            this.putQueryParameter("UseDuration", useDuration);
            this.useDuration = useDuration;
            return this;
        }

        @Override
        public ModifyDesktopChargeTypeRequest build() {
            return new ModifyDesktopChargeTypeRequest(this);
        } 

    } 

}
