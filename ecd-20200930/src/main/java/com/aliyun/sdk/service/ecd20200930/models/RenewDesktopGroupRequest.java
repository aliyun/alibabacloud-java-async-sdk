// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>RenewDesktopGroupRequest</p>
 */
public class RenewDesktopGroupRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("KeepSamePeriod")
    private Integer keepSamePeriod;

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

    private RenewDesktopGroupRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopGroupId = builder.desktopGroupId;
        this.keepSamePeriod = builder.keepSamePeriod;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewDesktopGroupRequest create() {
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
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return keepSamePeriod
     */
    public Integer getKeepSamePeriod() {
        return this.keepSamePeriod;
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

    public static final class Builder extends Request.Builder<RenewDesktopGroupRequest, Builder> {
        private Boolean autoPay; 
        private String desktopGroupId; 
        private Integer keepSamePeriod; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenewDesktopGroupRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.desktopGroupId = response.desktopGroupId;
            this.keepSamePeriod = response.keepSamePeriod;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.regionId = response.regionId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * KeepSamePeriod.
         */
        public Builder keepSamePeriod(Integer keepSamePeriod) {
            this.putQueryParameter("KeepSamePeriod", keepSamePeriod);
            this.keepSamePeriod = keepSamePeriod;
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

        @Override
        public RenewDesktopGroupRequest build() {
            return new RenewDesktopGroupRequest(this);
        } 

    } 

}
