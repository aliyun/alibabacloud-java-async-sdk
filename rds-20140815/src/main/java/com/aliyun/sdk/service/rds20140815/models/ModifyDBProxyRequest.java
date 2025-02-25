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
         * <p>Specifies whether to enable or disable the database proxy feature. Valid values:</p>
         * <ul>
         * <li><strong>Startup</strong>: enables the feature.</li>
         * <li><strong>Shutdown</strong>: disables the feature.</li>
         * <li><strong>Modify</strong>: modifies the configuration of the feature.</li>
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
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
         * <p>The number of proxy instances that are enabled. Valid values: <strong>1</strong> to <strong>16</strong>. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p> The capability of the database proxy to process requests increases with the number of proxy instances that are enabled. You can monitor the load on the instance and specify an appropriate number of proxy instances based on the load monitoring data.</p>
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
         * <p>The database proxy type. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: general-purpose database proxy</li>
         * <li><strong>exclusive</strong> (default): dedicated database proxy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.putQueryParameter("DBProxyInstanceType", DBProxyInstanceType);
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * <p>The proxy nodes.</p>
         */
        public Builder DBProxyNodes(java.util.List<DBProxyNodes> DBProxyNodes) {
            String DBProxyNodesShrink = shrink(DBProxyNodes, "DBProxyNodes", "json");
            this.putQueryParameter("DBProxyNodes", DBProxyNodesShrink);
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
         * <blockquote>
         * <p>This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
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
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is available only for instances that run MySQL.</p>
         * </li>
         * <li><p>If you want to modify persistent connections, you must set the <strong>ConfigDBProxyService</strong> parameter to <strong>Modify</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder persistentConnectionStatus(String persistentConnectionStatus) {
            this.putQueryParameter("PersistentConnectionStatus", persistentConnectionStatus);
            this.persistentConnectionStatus = persistentConnectionStatus;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>rg-acfmy*****</p>
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
         * <p>The ID of the virtual private cloud (VPC) to which the instance belongs. You can call the DescribeDBInstanceAttribute operation to query the VPC ID.</p>
         * <blockquote>
         * <p> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxxxxxx</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the vSwitch ID.</p>
         * <blockquote>
         * <p> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxxxxxx</p>
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

            /**
             * <p>The number of CPU cores of the node. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
             * <blockquote>
             * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
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
             * <p>The number of proxy nodes in the zone. Valid values: <strong>1</strong> and <strong>2</strong>.</p>
             * <blockquote>
             * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
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
             * <p>The ID of the zone in which the node resides.</p>
             * <blockquote>
             * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hagnzhou-c</p>
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
