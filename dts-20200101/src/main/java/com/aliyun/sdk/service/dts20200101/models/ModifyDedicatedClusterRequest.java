// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedClusterRequest</p>
 */
public class ModifyDedicatedClusterRequest extends Request {
    @Query
    @NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @Query
    @NameInMap("DedicatedClusterName")
    private String dedicatedClusterName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OversoldRatio")
    private Integer oversoldRatio;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyDedicatedClusterRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dedicatedClusterName = builder.dedicatedClusterName;
        this.instanceId = builder.instanceId;
        this.oversoldRatio = builder.oversoldRatio;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedClusterRequest create() {
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
     * @return dedicatedClusterName
     */
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return oversoldRatio
     */
    public Integer getOversoldRatio() {
        return this.oversoldRatio;
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

    public static final class Builder extends Request.Builder<ModifyDedicatedClusterRequest, Builder> {
        private String dedicatedClusterId; 
        private String dedicatedClusterName; 
        private String instanceId; 
        private Integer oversoldRatio; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedClusterRequest request) {
            super(request);
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.dedicatedClusterName = request.dedicatedClusterName;
            this.instanceId = request.instanceId;
            this.oversoldRatio = request.oversoldRatio;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * >  You must specify one of the **InstanceId** and **DedicatedClusterId** parameters.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder dedicatedClusterName(String dedicatedClusterName) {
            this.putQueryParameter("DedicatedClusterName", dedicatedClusterName);
            this.dedicatedClusterName = dedicatedClusterName;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  You must specify one of the **InstanceId** and **DedicatedClusterId** parameters.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The overcommit ratio. Unit: %.
         */
        public Builder oversoldRatio(Integer oversoldRatio) {
            this.putQueryParameter("OversoldRatio", oversoldRatio);
            this.oversoldRatio = oversoldRatio;
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
         * The ID of the region in which the Data Transmission Service (DTS) instance resides.
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
        public ModifyDedicatedClusterRequest build() {
            return new ModifyDedicatedClusterRequest(this);
        } 

    } 

}
