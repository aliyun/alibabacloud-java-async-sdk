// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobDedicatedClusterRequest</p>
 */
public class ModifyDtsJobDedicatedClusterRequest extends Request {
    @Query
    @NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @Query
    @NameInMap("DtsJobIds")
    private String dtsJobIds;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyDtsJobDedicatedClusterRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dtsJobIds = builder.dtsJobIds;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobDedicatedClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return dtsJobIds
     */
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobDedicatedClusterRequest, Builder> {
        private String dedicatedClusterId; 
        private String dtsJobIds; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobDedicatedClusterRequest request) {
            super(request);
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.dtsJobIds = request.dtsJobIds;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * DedicatedClusterId.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * DtsJobIds.
         */
        public Builder dtsJobIds(String dtsJobIds) {
            this.putQueryParameter("DtsJobIds", dtsJobIds);
            this.dtsJobIds = dtsJobIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyDtsJobDedicatedClusterRequest build() {
            return new ModifyDtsJobDedicatedClusterRequest(this);
        } 

    } 

}
