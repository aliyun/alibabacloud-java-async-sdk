// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>StopDedicatedClusterRequest</p>
 */
public class StopDedicatedClusterRequest extends Request {
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
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private StopDedicatedClusterRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dedicatedClusterName = builder.dedicatedClusterName;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<StopDedicatedClusterRequest, Builder> {
        private String dedicatedClusterId; 
        private String dedicatedClusterName; 
        private String instanceId; 
        private String ownerId; 
        private String regionId; 

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

        @Override
        public StopDedicatedClusterRequest build() {
            return new StopDedicatedClusterRequest(this);
        } 

    } 

}
