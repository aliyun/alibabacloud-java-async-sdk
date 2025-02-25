// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BandwidthPackageRemoveAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>BandwidthPackageRemoveAcceleratorRequest</p>
 */
public class BandwidthPackageRemoveAcceleratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private BandwidthPackageRemoveAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BandwidthPackageRemoveAcceleratorRequest create() {
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

    public static final class Builder extends Request.Builder<BandwidthPackageRemoveAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private String bandwidthPackageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BandwidthPackageRemoveAcceleratorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the bandwidth plan.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BandwidthPackageRemoveAcceleratorRequest build() {
            return new BandwidthPackageRemoveAcceleratorRequest(this);
        } 

    } 

}
