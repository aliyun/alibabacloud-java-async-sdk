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
 * {@link PromoteToMasterRequest} extends {@link RequestModel}
 *
 * <p>PromoteToMasterRequest</p>
 */
public class PromoteToMasterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceId")
    private String masterDbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDbInstanceId")
    private String slaveDbInstanceId;

    private PromoteToMasterRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.masterDbInstanceId = builder.masterDbInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDbInstanceId = builder.slaveDbInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromoteToMasterRequest create() {
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
     * @return masterDbInstanceId
     */
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
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

    public static final class Builder extends Request.Builder<PromoteToMasterRequest, Builder> {
        private String instanceId; 
        private String masterDbInstanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private String slaveDbInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PromoteToMasterRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.masterDbInstanceId = request.masterDbInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.slaveDbInstanceId = request.slaveDbInstanceId;
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
         * MasterDbInstanceId.
         */
        public Builder masterDbInstanceId(String masterDbInstanceId) {
            this.putQueryParameter("MasterDbInstanceId", masterDbInstanceId);
            this.masterDbInstanceId = masterDbInstanceId;
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

        @Override
        public PromoteToMasterRequest build() {
            return new PromoteToMasterRequest(this);
        } 

    } 

}
