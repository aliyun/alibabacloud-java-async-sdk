// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBundlesRequest} extends {@link RequestModel}
 *
 * <p>DeleteBundlesRequest</p>
 */
public class DeleteBundlesRequest extends Request {
    @Query
    @NameInMap("BundleId")
    @Validation(required = true)
    private java.util.List < String > bundleId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteBundlesRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBundlesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public java.util.List < String > getBundleId() {
        return this.bundleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBundlesRequest, Builder> {
        private java.util.List < String > bundleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBundlesRequest response) {
            super(response);
            this.bundleId = response.bundleId;
            this.regionId = response.regionId;
        } 

        /**
         * BundleId.
         */
        public Builder bundleId(java.util.List < String > bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
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
        public DeleteBundlesRequest build() {
            return new DeleteBundlesRequest(this);
        } 

    } 

}
