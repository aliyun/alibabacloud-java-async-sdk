// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkPackagesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkPackagesRequest</p>
 */
public class DeleteNetworkPackagesRequest extends Request {
    @Query
    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    private java.util.List < String > networkPackageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteNetworkPackagesRequest(Builder builder) {
        super(builder);
        this.networkPackageId = builder.networkPackageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPackageId
     */
    public java.util.List < String > getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkPackagesRequest, Builder> {
        private java.util.List < String > networkPackageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkPackagesRequest request) {
            super(request);
            this.networkPackageId = request.networkPackageId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of Internet access packages.
         */
        public Builder networkPackageId(java.util.List < String > networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteNetworkPackagesRequest build() {
            return new DeleteNetworkPackagesRequest(this);
        } 

    } 

}
