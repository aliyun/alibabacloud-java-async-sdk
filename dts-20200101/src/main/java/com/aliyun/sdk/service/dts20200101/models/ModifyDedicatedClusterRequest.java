// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedClusterRequest</p>
 */
public class ModifyDedicatedClusterRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OversoldRatio")
    private Integer oversoldRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> You must specify one of the <strong>InstanceId</strong> and <strong>DedicatedClusterId</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_h3fl1cs217sx952</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_test_001</p>
         */
        public Builder dedicatedClusterName(String dedicatedClusterName) {
            this.putQueryParameter("DedicatedClusterName", dedicatedClusterName);
            this.dedicatedClusterName = dedicatedClusterName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You must specify one of the <strong>InstanceId</strong> and <strong>DedicatedClusterId</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The overcommit ratio. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
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
         * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
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
