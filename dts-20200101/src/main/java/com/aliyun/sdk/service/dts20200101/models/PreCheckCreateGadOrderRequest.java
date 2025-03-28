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
 * {@link PreCheckCreateGadOrderRequest} extends {@link RequestModel}
 *
 * <p>PreCheckCreateGadOrderRequest</p>
 */
public class PreCheckCreateGadOrderRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDbInstanceId")
    private String slaveDbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDbInstanceRegion")
    private String slaveDbInstanceRegion;

    private PreCheckCreateGadOrderRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDbInstanceId = builder.slaveDbInstanceId;
        this.slaveDbInstanceRegion = builder.slaveDbInstanceRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCheckCreateGadOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return slaveDbInstanceId
     */
    public String getSlaveDbInstanceId() {
        return this.slaveDbInstanceId;
    }

    /**
     * @return slaveDbInstanceRegion
     */
    public String getSlaveDbInstanceRegion() {
        return this.slaveDbInstanceRegion;
    }

    public static final class Builder extends Request.Builder<PreCheckCreateGadOrderRequest, Builder> {
        private String instanceId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String slaveDbInstanceId; 
        private String slaveDbInstanceRegion; 

        private Builder() {
            super();
        } 

        private Builder(PreCheckCreateGadOrderRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.slaveDbInstanceId = request.slaveDbInstanceId;
            this.slaveDbInstanceRegion = request.slaveDbInstanceRegion;
        } 

        /**
         * InstanceId.
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

        /**
         * SlaveDbInstanceId.
         */
        public Builder slaveDbInstanceId(String slaveDbInstanceId) {
            this.putQueryParameter("SlaveDbInstanceId", slaveDbInstanceId);
            this.slaveDbInstanceId = slaveDbInstanceId;
            return this;
        }

        /**
         * SlaveDbInstanceRegion.
         */
        public Builder slaveDbInstanceRegion(String slaveDbInstanceRegion) {
            this.putQueryParameter("SlaveDbInstanceRegion", slaveDbInstanceRegion);
            this.slaveDbInstanceRegion = slaveDbInstanceRegion;
            return this;
        }

        @Override
        public PreCheckCreateGadOrderRequest build() {
            return new PreCheckCreateGadOrderRequest(this);
        } 

    } 

}
