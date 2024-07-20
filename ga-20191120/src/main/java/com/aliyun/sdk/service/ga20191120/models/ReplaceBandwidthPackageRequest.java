// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>ReplaceBandwidthPackageRequest</p>
 */
public class ReplaceBandwidthPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetBandwidthPackageId;

    private ReplaceBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.regionId = builder.regionId;
        this.targetBandwidthPackageId = builder.targetBandwidthPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceBandwidthPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetBandwidthPackageId
     */
    public String getTargetBandwidthPackageId() {
        return this.targetBandwidthPackageId;
    }

    public static final class Builder extends Request.Builder<ReplaceBandwidthPackageRequest, Builder> {
        private String acceleratorId; 
        private String bandwidthPackageId; 
        private String regionId; 
        private String targetBandwidthPackageId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceBandwidthPackageRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.regionId = request.regionId;
            this.targetBandwidthPackageId = request.targetBandwidthPackageId;
        } 

        /**
         * The GA instance ID.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the required bandwidth plan. When you specify a replacement bandwidth plan, take note of the following items:
         * <p>
         * 
         * *   Only a bandwidth plan that is not associated with a GA instance can be specified.
         * *   If you want to replace a basic bandwidth plan, make sure that the bandwidth provided by the replacement bandwidth plan is not less than the total bandwidth allocated to the acceleration area.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the bandwidth plan that you want to replace.
         */
        public Builder targetBandwidthPackageId(String targetBandwidthPackageId) {
            this.putQueryParameter("TargetBandwidthPackageId", targetBandwidthPackageId);
            this.targetBandwidthPackageId = targetBandwidthPackageId;
            return this;
        }

        @Override
        public ReplaceBandwidthPackageRequest build() {
            return new ReplaceBandwidthPackageRequest(this);
        } 

    } 

}
