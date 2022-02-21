// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkPackageRequest</p>
 */
public class ModifyNetworkPackageRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 200, minimum = 1)
    private Integer bandwidth;

    @Query
    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    private String networkPackageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyNetworkPackageRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.networkPackageId = builder.networkPackageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkPackageRequest, Builder> {
        private Integer bandwidth; 
        private String networkPackageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkPackageRequest response) {
            super(response);
            this.bandwidth = response.bandwidth;
            this.networkPackageId = response.networkPackageId;
            this.regionId = response.regionId;
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
         * NetworkPackageId.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
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
        public ModifyNetworkPackageRequest build() {
            return new ModifyNetworkPackageRequest(this);
        } 

    } 

}
