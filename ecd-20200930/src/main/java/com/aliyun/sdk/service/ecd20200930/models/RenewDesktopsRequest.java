// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopsRequest} extends {@link RequestModel}
 *
 * <p>RenewDesktopsRequest</p>
 */
public class RenewDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private RenewDesktopsRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopId = builder.desktopId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
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

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<RenewDesktopsRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List < String > desktopId; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private String resourceType; 

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
            this.resourceType = request.resourceType;
        } 

        /**
         * Specifies whether to enable the auto-payment feature.
         * <p>
         * 
         * Default value: true. Valid values:
         * 
         * *   true: enables the auto-payment feature.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     Make sure that you have sufficient balance in your Alibaba Cloud account. Otherwise, your order becomes invalid.
         * 
         *     <!-- -->
         * 
         * *   false: disables the auto-payment feature. In this case, an order is generated, and no payment is automatically made.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     You can log on to the WUYING Workspace console and complete the payment based on the order ID on the Orders page.
         * 
         *     <!-- -->
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The IDs of the cloud computers. Only IDs of subscription cloud computers are supported.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The renewal duration. Valid values of this parameter are determined by the value of the `PeriodUnit` parameter.
         * <p>
         * 
         * *   Valid values if you set the `PeriodUnit` parameter to `Month`: 1, 2, 3, and 6
         * *   Valid values if you set the `PeriodUnit` parameter to `Year`: 1, 2, 3, 4, 5, and 6
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the renewal duration specified by the `Period` parameter.
         * <p>
         * 
         * Default value: Month. Valid values:
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public RenewDesktopsRequest build() {
            return new RenewDesktopsRequest(this);
        } 

    } 

}
