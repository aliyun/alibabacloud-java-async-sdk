// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBProxyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyRequest</p>
 */
public class ModifyDBProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigDBProxyService")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configDBProxyService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceNum")
    private String DBProxyInstanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceType")
    private String DBProxyInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
    private java.util.List<DBProxyNodes> DBProxyNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersistentConnectionStatus")
    private String persistentConnectionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private ModifyDBProxyRequest(Builder builder) {
        super(builder);
        this.configDBProxyService = builder.configDBProxyService;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyInstanceNum = builder.DBProxyInstanceNum;
        this.DBProxyInstanceType = builder.DBProxyInstanceType;
        this.DBProxyNodes = builder.DBProxyNodes;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerId = builder.ownerId;
        this.persistentConnectionStatus = builder.persistentConnectionStatus;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configDBProxyService
     */
    public String getConfigDBProxyService() {
        return this.configDBProxyService;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return DBProxyInstanceNum
     */
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    /**
     * @return DBProxyInstanceType
     */
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    /**
     * @return DBProxyNodes
     */
    public java.util.List<DBProxyNodes> getDBProxyNodes() {
        return this.DBProxyNodes;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return persistentConnectionStatus
     */
    public String getPersistentConnectionStatus() {
        return this.persistentConnectionStatus;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<ModifyDBProxyRequest, Builder> {
        private String configDBProxyService; 
        private String DBInstanceId; 
        private String DBProxyEngineType; 
        private String DBProxyInstanceNum; 
        private String DBProxyInstanceType; 
        private java.util.List<DBProxyNodes> DBProxyNodes; 
        private String instanceNetworkType; 
        private Long ownerId; 
        private String persistentConnectionStatus; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyRequest request) {
            super(request);
            this.configDBProxyService = request.configDBProxyService;
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.DBProxyInstanceNum = request.DBProxyInstanceNum;
            this.DBProxyInstanceType = request.DBProxyInstanceType;
            this.DBProxyNodes = request.DBProxyNodes;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ownerId = request.ownerId;
            this.persistentConnectionStatus = request.persistentConnectionStatus;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Specifies whether to enable, disable, or modify the database proxy. Valid values:</p>
         * <ul>
         * <li><strong>Startup</strong>: Enables the database proxy.</li>
         * <li><strong>Shutdown</strong>: Disables the database proxy.</li>
         * <li><strong>Modify</strong>: Modifies the database proxy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Startup</p>
         */
        public Builder configDBProxyService(String configDBProxyService) {
            this.putQueryParameter("ConfigDBProxyService", configDBProxyService);
            this.configDBProxyService = configDBProxyService;
            return this;
        }

        /**
         * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The number of proxy instances. Valid values: <strong>1</strong> to <strong>16</strong>. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>More proxy instances can handle more requests. You can check the monitoring data to understand the load on proxy instances and then set an appropriate number of proxy instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBProxyInstanceNum(String DBProxyInstanceNum) {
            this.putQueryParameter("DBProxyInstanceNum", DBProxyInstanceNum);
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * <p>The type of the database proxy instance. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: general-purpose database proxy</li>
         * <li><strong>exclusive</strong>: dedicated database proxy (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exclusive</p>
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.putQueryParameter("DBProxyInstanceType", DBProxyInstanceType);
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * <p>The list of proxy nodes.</p>
         */
        public Builder DBProxyNodes(java.util.List<DBProxyNodes> DBProxyNodes) {
            String DBProxyNodesShrink = shrink(DBProxyNodes, "DBProxyNodes", "json");
            this.putQueryParameter("DBProxyNodes", DBProxyNodesShrink);
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The network type of the instance. Only Virtual Private Cloud (VPC) is supported. Set the value to <strong>VPC</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when you enable the database proxy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable persistent connections. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enables persistent connections.</li>
         * <li><strong>Disabled</strong>: disables persistent connections.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Only RDS MySQL supports this parameter.</li>
         * <li>To modify the persistent connection status, set <strong>ConfigDBProxyService</strong> to <strong>Modify</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder persistentConnectionStatus(String persistentConnectionStatus) {
            this.putQueryParameter("PersistentConnectionStatus", persistentConnectionStatus);
            this.persistentConnectionStatus = persistentConnectionStatus;
            return this;
        }

        /**
         * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
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
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The VPC ID of the instance. You can call DescribeDBInstanceAttribute to obtain the VPC ID.</p>
         * <blockquote>
         * <p>This parameter is required when you enable the database proxy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance. You can call DescribeDBInstanceAttribute to obtain the vSwitch ID.</p>
         * <blockquote>
         * <p>This parameter is required when you enable the database proxy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyDBProxyRequest build() {
            return new ModifyDBProxyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBProxyRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBProxyRequest</p>
     */
    public static class DBProxyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("nodeCounts")
        private String nodeCounts;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private DBProxyNodes(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.nodeCounts = builder.nodeCounts;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyNodes create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return nodeCounts
         */
        public String getNodeCounts() {
            return this.nodeCounts;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cpuCores; 
            private String nodeCounts; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBProxyNodes model) {
                this.cpuCores = model.cpuCores;
                this.nodeCounts = model.nodeCounts;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CPU cores for the node. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
             * <blockquote>
             * <p>This parameter is required when you specify <strong>DBProxyNodes</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The number of proxy nodes in the zone. Valid values: <strong>1</strong> to <strong>2</strong>.</p>
             * <blockquote>
             * <p>This parameter is required when you specify <strong>DBProxyNodes</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCounts(String nodeCounts) {
                this.nodeCounts = nodeCounts;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * <blockquote>
             * <p>This parameter is required when you specify <strong>DBProxyNodes</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBProxyNodes build() {
                return new DBProxyNodes(this);
            } 

        } 

    }
}
