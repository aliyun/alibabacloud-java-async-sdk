// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateNetworkPackageRequest} extends {@link RequestModel}
 *
 * <p>DissociateNetworkPackageRequest</p>
 */
public class DissociateNetworkPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DissociateNetworkPackageRequest(Builder builder) {
        super(builder);
        this.networkPackageId = builder.networkPackageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateNetworkPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DissociateNetworkPackageRequest, Builder> {
        private String networkPackageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DissociateNetworkPackageRequest request) {
            super(request);
            this.networkPackageId = request.networkPackageId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the premium bandwidth plan. You can call the [DescribeNetworkPackages](~~216079~~) operation to obtain the ID.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
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

        @Override
        public DissociateNetworkPackageRequest build() {
            return new DissociateNetworkPackageRequest(this);
        } 

    } 

}
