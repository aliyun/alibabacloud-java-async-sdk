// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    private java.util.List < DBProxyNodes> DBProxyNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveSpecificTime")
    private String effectiveSpecificTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateAZ")
    private java.util.List < MigrateAZ> migrateAZ;

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
    public java.util.List < DBProxyNodes> getDBProxyNodes() {
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
    public java.util.List < MigrateAZ> getMigrateAZ() {
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
        private java.util.List < DBProxyNodes> DBProxyNodes; 
        private String effectiveSpecificTime; 
        private String effectiveTime; 
        private java.util.List < MigrateAZ> migrateAZ; 
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
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
         * <p>The number of database proxies. If you set this parameter to 0, the database proxy feature is disabled for the instance. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p> The capability of the database proxy feature to process requests increases with the number of database proxies that are enabled. You can monitor the load on the instance and specify an appropriate number of database proxies based on the load monitoring data.</p>
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
         * <p>The database proxy type. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: general-purpose database proxy</li>
         * <li><strong>exclusive</strong> (default): dedicated database proxy</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DedicatedProxy</p>
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.putQueryParameter("DBProxyInstanceType", DBProxyInstanceType);
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * DBProxyNodes.
         */
        public Builder DBProxyNodes(java.util.List < DBProxyNodes> DBProxyNodes) {
            String DBProxyNodesShrink = shrink(DBProxyNodes, "DBProxyNodes", "json");
            this.putQueryParameter("DBProxyNodes", DBProxyNodesShrink);
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The point in time that you want to specify. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> If the <strong>EffectiveTime</strong> parameter is set to <strong>SpecificTime</strong>, you must specify this parameter.</p>
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
         * <p>The effective time. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The effective time is immediate.</li>
         * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecificTime</strong>: The effective time is a specified point in time.</li>
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
         * MigrateAZ.
         */
        public Builder migrateAZ(java.util.List < MigrateAZ> migrateAZ) {
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
         * <p>The ID of the vSwitch in the destination zone. You can call the <a href="https://help.aliyun.com/document_detail/610431.html">DescribeVSwitches</a> operation to query existing vSwitches.</p>
         * <blockquote>
         * <p> Only database proxies for ApsaraDB RDS for MySQL instances that use cloud disks can be migrated to different zones.</p>
         * </blockquote>
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

            /**
             * cpuCores.
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * nodeCounts.
             */
            public Builder nodeCounts(String nodeCounts) {
                this.nodeCounts = nodeCounts;
                return this;
            }

            /**
             * zoneId.
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

        private MigrateAZ(Builder builder) {
            this.dbProxyEndpointId = builder.dbProxyEndpointId;
            this.destVSwitchId = builder.destVSwitchId;
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

        public static final class Builder {
            private String dbProxyEndpointId; 
            private String destVSwitchId; 

            /**
             * dbProxyEndpointId.
             */
            public Builder dbProxyEndpointId(String dbProxyEndpointId) {
                this.dbProxyEndpointId = dbProxyEndpointId;
                return this;
            }

            /**
             * destVSwitchId.
             */
            public Builder destVSwitchId(String destVSwitchId) {
                this.destVSwitchId = destVSwitchId;
                return this;
            }

            public MigrateAZ build() {
                return new MigrateAZ(this);
            } 

        } 

    }
}
