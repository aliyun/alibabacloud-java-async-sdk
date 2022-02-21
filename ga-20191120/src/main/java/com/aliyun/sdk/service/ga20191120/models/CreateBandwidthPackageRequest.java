// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateBandwidthPackageRequest</p>
 */
public class CreateBandwidthPackageRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoUseCoupon")
    private String autoUseCoupon;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Integer bandwidth;

    @Query
    @NameInMap("BandwidthType")
    private String bandwidthType;

    @Query
    @NameInMap("BillingType")
    private String billingType;

    @Query
    @NameInMap("CbnGeographicRegionIdA")
    private String cbnGeographicRegionIdA;

    @Query
    @NameInMap("CbnGeographicRegionIdB")
    private String cbnGeographicRegionIdB;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Duration")
    private String duration;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("Ratio")
    private Integer ratio;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidth = builder.bandwidth;
        this.bandwidthType = builder.bandwidthType;
        this.billingType = builder.billingType;
        this.cbnGeographicRegionIdA = builder.cbnGeographicRegionIdA;
        this.cbnGeographicRegionIdB = builder.cbnGeographicRegionIdB;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.pricingCycle = builder.pricingCycle;
        this.ratio = builder.ratio;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBandwidthPackageRequest create() {
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
     * @return autoUseCoupon
     */
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return cbnGeographicRegionIdA
     */
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    /**
     * @return cbnGeographicRegionIdB
     */
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateBandwidthPackageRequest, Builder> {
        private Boolean autoPay; 
        private String autoUseCoupon; 
        private Integer bandwidth; 
        private String bandwidthType; 
        private String billingType; 
        private String cbnGeographicRegionIdA; 
        private String cbnGeographicRegionIdB; 
        private String chargeType; 
        private String clientToken; 
        private String duration; 
        private String pricingCycle; 
        private Integer ratio; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateBandwidthPackageRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.autoUseCoupon = response.autoUseCoupon;
            this.bandwidth = response.bandwidth;
            this.bandwidthType = response.bandwidthType;
            this.billingType = response.billingType;
            this.cbnGeographicRegionIdA = response.cbnGeographicRegionIdA;
            this.cbnGeographicRegionIdB = response.cbnGeographicRegionIdB;
            this.chargeType = response.chargeType;
            this.clientToken = response.clientToken;
            this.duration = response.duration;
            this.pricingCycle = response.pricingCycle;
            this.ratio = response.ratio;
            this.regionId = response.regionId;
            this.type = response.type;
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
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
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
         * BandwidthType.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * BillingType.
         */
        public Builder billingType(String billingType) {
            this.putQueryParameter("BillingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * CbnGeographicRegionIdA.
         */
        public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.putQueryParameter("CbnGeographicRegionIdA", cbnGeographicRegionIdA);
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }

        /**
         * CbnGeographicRegionIdB.
         */
        public Builder cbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.putQueryParameter("CbnGeographicRegionIdB", cbnGeographicRegionIdB);
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Ratio.
         */
        public Builder ratio(Integer ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateBandwidthPackageRequest build() {
            return new CreateBandwidthPackageRequest(this);
        } 

    } 

}
