// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAreaBlockRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebAreaBlockRequest</p>
 */
public class ModifyWebAreaBlockRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Regions")
    private java.util.List < String > regions;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyWebAreaBlockRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
        this.regions = builder.regions;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebAreaBlockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regions
     */
    public java.util.List < String > getRegions() {
        return this.regions;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyWebAreaBlockRequest, Builder> {
        private String domain; 
        private String regionId; 
        private java.util.List < String > regions; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebAreaBlockRequest response) {
            super(response);
            this.domain = response.domain;
            this.regionId = response.regionId;
            this.regions = response.regions;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyWebAreaBlockRequest build() {
            return new ModifyWebAreaBlockRequest(this);
        } 

    } 

}
