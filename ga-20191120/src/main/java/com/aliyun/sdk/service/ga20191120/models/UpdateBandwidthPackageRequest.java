// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>UpdateBandwidthPackageRequest</p>
 */
public class UpdateBandwidthPackageRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Query
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    private String bandwidthPackageId;

    @Query
    @NameInMap("BandwidthType")
    private String bandwidthType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.bandwidthType = builder.bandwidthType;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBandwidthPackageRequest create() {
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
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateBandwidthPackageRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoUseCoupon; 
        private Integer bandwidth; 
        private String bandwidthPackageId; 
        private String bandwidthType; 
        private String description; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBandwidthPackageRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.autoUseCoupon = response.autoUseCoupon;
            this.bandwidth = response.bandwidth;
            this.bandwidthPackageId = response.bandwidthPackageId;
            this.bandwidthType = response.bandwidthType;
            this.description = response.description;
            this.name = response.name;
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
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
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
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public UpdateBandwidthPackageRequest build() {
            return new UpdateBandwidthPackageRequest(this);
        } 

    } 

}
