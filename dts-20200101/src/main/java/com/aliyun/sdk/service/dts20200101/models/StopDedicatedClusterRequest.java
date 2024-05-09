// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>StopDedicatedClusterRequest</p>
 */
public class StopDedicatedClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterName")
    private String dedicatedClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private StopDedicatedClusterRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dedicatedClusterName = builder.dedicatedClusterName;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDedicatedClusterRequest create() {
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

    public static final class Builder extends Request.Builder<StopDedicatedClusterRequest, Builder> {
        private String dedicatedClusterId; 
        private String dedicatedClusterName; 
        private String instanceId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(StopDedicatedClusterRequest request) {
            super(request);
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.dedicatedClusterName = request.dedicatedClusterName;
            this.instanceId = request.instanceId;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
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
        public StopDedicatedClusterRequest build() {
            return new StopDedicatedClusterRequest(this);
        } 

    } 

}
