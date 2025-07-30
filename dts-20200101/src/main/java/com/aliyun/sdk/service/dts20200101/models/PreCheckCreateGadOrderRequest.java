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
    @com.aliyun.core.annotation.NameInMap("MasterDatabaseName")
    private String masterDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterEngineArchType")
    private String masterEngineArchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterShardAccountName")
    private String masterShardAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterShardAccountPassword")
    private String masterShardAccountPassword;

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
    @com.aliyun.core.annotation.NameInMap("SlaveDatabaseName")
    private String slaveDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDbInstanceId")
    private String slaveDbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDbInstanceRegion")
    private String slaveDbInstanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveEngineArchType")
    private String slaveEngineArchType;

    private PreCheckCreateGadOrderRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.masterDatabaseName = builder.masterDatabaseName;
        this.masterEngineArchType = builder.masterEngineArchType;
        this.masterShardAccountName = builder.masterShardAccountName;
        this.masterShardAccountPassword = builder.masterShardAccountPassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDatabaseName = builder.slaveDatabaseName;
        this.slaveDbInstanceId = builder.slaveDbInstanceId;
        this.slaveDbInstanceRegion = builder.slaveDbInstanceRegion;
        this.slaveEngineArchType = builder.slaveEngineArchType;
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
     * @return masterDatabaseName
     */
    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    /**
     * @return masterEngineArchType
     */
    public String getMasterEngineArchType() {
        return this.masterEngineArchType;
    }

    /**
     * @return masterShardAccountName
     */
    public String getMasterShardAccountName() {
        return this.masterShardAccountName;
    }

    /**
     * @return masterShardAccountPassword
     */
    public String getMasterShardAccountPassword() {
        return this.masterShardAccountPassword;
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
     * @return slaveDatabaseName
     */
    public String getSlaveDatabaseName() {
        return this.slaveDatabaseName;
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

    /**
     * @return slaveEngineArchType
     */
    public String getSlaveEngineArchType() {
        return this.slaveEngineArchType;
    }

    public static final class Builder extends Request.Builder<PreCheckCreateGadOrderRequest, Builder> {
        private String instanceId; 
        private String masterDatabaseName; 
        private String masterEngineArchType; 
        private String masterShardAccountName; 
        private String masterShardAccountPassword; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String slaveDatabaseName; 
        private String slaveDbInstanceId; 
        private String slaveDbInstanceRegion; 
        private String slaveEngineArchType; 

        private Builder() {
            super();
        } 

        private Builder(PreCheckCreateGadOrderRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.masterDatabaseName = request.masterDatabaseName;
            this.masterEngineArchType = request.masterEngineArchType;
            this.masterShardAccountName = request.masterShardAccountName;
            this.masterShardAccountPassword = request.masterShardAccountPassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.slaveDatabaseName = request.slaveDatabaseName;
            this.slaveDbInstanceId = request.slaveDbInstanceId;
            this.slaveDbInstanceRegion = request.slaveDbInstanceRegion;
            this.slaveEngineArchType = request.slaveEngineArchType;
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
         * MasterDatabaseName.
         */
        public Builder masterDatabaseName(String masterDatabaseName) {
            this.putQueryParameter("MasterDatabaseName", masterDatabaseName);
            this.masterDatabaseName = masterDatabaseName;
            return this;
        }

        /**
         * MasterEngineArchType.
         */
        public Builder masterEngineArchType(String masterEngineArchType) {
            this.putQueryParameter("MasterEngineArchType", masterEngineArchType);
            this.masterEngineArchType = masterEngineArchType;
            return this;
        }

        /**
         * MasterShardAccountName.
         */
        public Builder masterShardAccountName(String masterShardAccountName) {
            this.putQueryParameter("MasterShardAccountName", masterShardAccountName);
            this.masterShardAccountName = masterShardAccountName;
            return this;
        }

        /**
         * MasterShardAccountPassword.
         */
        public Builder masterShardAccountPassword(String masterShardAccountPassword) {
            this.putQueryParameter("MasterShardAccountPassword", masterShardAccountPassword);
            this.masterShardAccountPassword = masterShardAccountPassword;
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
         * SlaveDatabaseName.
         */
        public Builder slaveDatabaseName(String slaveDatabaseName) {
            this.putQueryParameter("SlaveDatabaseName", slaveDatabaseName);
            this.slaveDatabaseName = slaveDatabaseName;
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

        /**
         * SlaveEngineArchType.
         */
        public Builder slaveEngineArchType(String slaveEngineArchType) {
            this.putQueryParameter("SlaveEngineArchType", slaveEngineArchType);
            this.slaveEngineArchType = slaveEngineArchType;
            return this;
        }

        @Override
        public PreCheckCreateGadOrderRequest build() {
            return new PreCheckCreateGadOrderRequest(this);
        } 

    } 

}
