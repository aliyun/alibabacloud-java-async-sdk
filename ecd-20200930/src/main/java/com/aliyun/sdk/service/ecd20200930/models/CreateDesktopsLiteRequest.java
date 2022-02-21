// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopsLiteRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopsLiteRequest</p>
 */
public class CreateDesktopsLiteRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(maximum = 20)
    private Integer amount;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 1000, minimum = 10)
    private Integer bandwidth;

    @Query
    @NameInMap("BundleId")
    private String bundleId;

    @Query
    @NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserAssignMode")
    private String userAssignMode;

    private CreateDesktopsLiteRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bandwidth = builder.bandwidth;
        this.bundleId = builder.bundleId;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.endUserId = builder.endUserId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.userAssignMode = builder.userAssignMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopsLiteRequest create() {
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return enableInternetAccess
     */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userAssignMode
     */
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

    public static final class Builder extends Request.Builder<CreateDesktopsLiteRequest, Builder> {
        private Integer amount; 
        private Integer bandwidth; 
        private String bundleId; 
        private Boolean enableInternetAccess; 
        private java.util.List < String > endUserId; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String userAssignMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopsLiteRequest response) {
            super(response);
            this.amount = response.amount;
            this.bandwidth = response.bandwidth;
            this.bundleId = response.bundleId;
            this.enableInternetAccess = response.enableInternetAccess;
            this.endUserId = response.endUserId;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.regionId = response.regionId;
            this.userAssignMode = response.userAssignMode;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * EnableInternetAccess.
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserAssignMode.
         */
        public Builder userAssignMode(String userAssignMode) {
            this.putQueryParameter("UserAssignMode", userAssignMode);
            this.userAssignMode = userAssignMode;
            return this;
        }

        @Override
        public CreateDesktopsLiteRequest build() {
            return new CreateDesktopsLiteRequest(this);
        } 

    } 

}
