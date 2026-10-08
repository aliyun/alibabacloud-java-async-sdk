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
 * {@link ModifyDBProxyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyInstanceRequest</p>
 */
public class ModifyDBProxyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyInstanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
    private java.util.List<DBProxyNodes> DBProxyNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveSpecificTime")
    private String effectiveSpecificTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateAZ")
    private java.util.List<MigrateAZ> migrateAZ;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    private ModifyDBProxyInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyInstanceNum = builder.DBProxyInstanceNum;
        this.DBProxyInstanceType = builder.DBProxyInstanceType;
        this.DBProxyNodes = builder.DBProxyNodes;
        this.effectiveSpecificTime = builder.effectiveSpecificTime;
        this.effectiveTime = builder.effectiveTime;
        this.migrateAZ = builder.migrateAZ;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return effectiveSpecificTime
     */
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return migrateAZ
     */
    public java.util.List<MigrateAZ> getMigrateAZ() {
        return this.migrateAZ;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<ModifyDBProxyInstanceRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyEngineType; 
        private String DBProxyInstanceNum; 
        private String DBProxyInstanceType; 
        private java.util.List<DBProxyNodes> DBProxyNodes; 
        private String effectiveSpecificTime; 
        private String effectiveTime; 
        private java.util.List<MigrateAZ> migrateAZ; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyInstanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.DBProxyInstanceNum = request.DBProxyInstanceNum;
            this.DBProxyInstanceType = request.DBProxyInstanceType;
            this.DBProxyNodes = request.DBProxyNodes;
            this.effectiveSpecificTime = request.effectiveSpecificTime;
            this.effectiveTime = request.effectiveTime;
            this.migrateAZ = request.migrateAZ;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchIds = request.vSwitchIds;
        } 

        /**
         * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3a****</p>
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
         * <p>The number of proxy instances. If this parameter is set to 0, the proxy service of this type is disabled for the instance. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p>More proxy instances can handle more requests. You can check the load of proxy instances based on monitoring data and then specify an appropriate number of proxy instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>This parameter is required.</p>
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
         * <blockquote>
         * <p>This parameter is required when the current proxy instance uses multi-active zone deployment.</p>
         * </blockquote>
         */
        public Builder DBProxyNodes(java.util.List<DBProxyNodes> DBProxyNodes) {
            String DBProxyNodesShrink = shrink(DBProxyNodes, "DBProxyNodes", "json");
            this.putQueryParameter("DBProxyNodes", DBProxyNodesShrink);
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The specified time for the modification to take effect. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <p>This parameter is required when <strong>EffectiveTime</strong> is set to <strong>SpecificTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-07-10T13:15:12Z</p>
         */
        public Builder effectiveSpecificTime(String effectiveSpecificTime) {
            this.putQueryParameter("EffectiveSpecificTime", effectiveSpecificTime);
            this.effectiveSpecificTime = effectiveSpecificTime;
            return this;
        }

        /**
         * <p>The effective period. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The modification takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The modification takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecificTime</strong>: The modification takes effect at a specified time.</li>
         * </ul>
         * <p>Default value: <strong>MaintainTime</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The list of active zones for proxy migration.</p>
         * <blockquote>
         * <p>Currently, only ApsaraDB RDS for MySQL proxy instances with cloud disks support active zone migration.</p>
         * </blockquote>
         */
        public Builder migrateAZ(java.util.List<MigrateAZ> migrateAZ) {
            String migrateAZShrink = shrink(migrateAZ, "MigrateAZ", "json");
            this.putQueryParameter("MigrateAZ", migrateAZShrink);
            this.migrateAZ = migrateAZ;
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
         * <p>A deprecated parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2p****</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public ModifyDBProxyInstanceRequest build() {
            return new ModifyDBProxyInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBProxyInstanceRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBProxyInstanceRequest</p>
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
             * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
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
             * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
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
             * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
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
    /**
     * 
     * {@link ModifyDBProxyInstanceRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBProxyInstanceRequest</p>
     */
    public static class MigrateAZ extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dbProxyEndpointId")
        private String dbProxyEndpointId;

        @com.aliyun.core.annotation.NameInMap("destVSwitchId")
        private String destVSwitchId;

        @com.aliyun.core.annotation.NameInMap("destVpcId")
        private String destVpcId;

        private MigrateAZ(Builder builder) {
            this.dbProxyEndpointId = builder.dbProxyEndpointId;
            this.destVSwitchId = builder.destVSwitchId;
            this.destVpcId = builder.destVpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateAZ create() {
            return builder().build();
        }

        /**
         * @return dbProxyEndpointId
         */
        public String getDbProxyEndpointId() {
            return this.dbProxyEndpointId;
        }

        /**
         * @return destVSwitchId
         */
        public String getDestVSwitchId() {
            return this.destVSwitchId;
        }

        /**
         * @return destVpcId
         */
        public String getDestVpcId() {
            return this.destVpcId;
        }

        public static final class Builder {
            private String dbProxyEndpointId; 
            private String destVSwitchId; 
            private String destVpcId; 

            private Builder() {
            } 

            private Builder(MigrateAZ model) {
                this.dbProxyEndpointId = model.dbProxyEndpointId;
                this.destVSwitchId = model.destVSwitchId;
                this.destVpcId = model.destVpcId;
            } 

            /**
             * <p>The proxy endpoint ID. You can call DescribeDBProxyEndpoint to obtain the proxy endpoint ID.</p>
             * <blockquote>
             * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>yhw429********</p>
             */
            public Builder dbProxyEndpointId(String dbProxyEndpointId) {
                this.dbProxyEndpointId = dbProxyEndpointId;
                return this;
            }

            /**
             * <p>The ID of the destination vSwitch for the proxy instance migration.</p>
             * <blockquote>
             * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-sw0qq49d1m****</p>
             */
            public Builder destVSwitchId(String destVSwitchId) {
                this.destVSwitchId = destVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the destination VPC for the proxy instance migration.</p>
             * <blockquote>
             * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-2vcicu73rdylp****</p>
             */
            public Builder destVpcId(String destVpcId) {
                this.destVpcId = destVpcId;
                return this;
            }

            public MigrateAZ build() {
                return new MigrateAZ(this);
            } 

        } 

    }
}
