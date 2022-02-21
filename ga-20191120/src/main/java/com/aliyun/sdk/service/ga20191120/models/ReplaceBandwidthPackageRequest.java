// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>ReplaceBandwidthPackageRequest</p>
 */
public class ReplaceBandwidthPackageRequest extends Request {
    @Query
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    private String bandwidthPackageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TargetBandwidthPackageId")
    @Validation(required = true)
    private String targetBandwidthPackageId;

    private ReplaceBandwidthPackageRequest(Builder builder) {
        super(builder);
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
        private String bandwidthPackageId; 
        private String regionId; 
        private String targetBandwidthPackageId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceBandwidthPackageRequest response) {
            super(response);
            this.bandwidthPackageId = response.bandwidthPackageId;
            this.regionId = response.regionId;
            this.targetBandwidthPackageId = response.targetBandwidthPackageId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TargetBandwidthPackageId.
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
