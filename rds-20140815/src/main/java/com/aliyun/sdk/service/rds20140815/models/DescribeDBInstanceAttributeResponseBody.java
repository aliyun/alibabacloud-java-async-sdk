// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAttributeResponseBody</p>
 */
public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * The details of the instance.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    public static class BabelfishConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BabelfishEnabled")
        private String babelfishEnabled;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private String migrationMode;

        private BabelfishConfig(Builder builder) {
            this.babelfishEnabled = builder.babelfishEnabled;
            this.migrationMode = builder.migrationMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BabelfishConfig create() {
            return builder().build();
        }

        /**
         * @return babelfishEnabled
         */
        public String getBabelfishEnabled() {
            return this.babelfishEnabled;
        }

        /**
         * @return migrationMode
         */
        public String getMigrationMode() {
            return this.migrationMode;
        }

        public static final class Builder {
            private String babelfishEnabled; 
            private String migrationMode; 

            /**
             * Indicates whether Babelfish is enabled.
             * <p>
             * 
             * >  If Babelfish is enabled when you purchase an ApsaraDB RDS for PostgreSQL instance, this parameter is fixed as **true**.
             */
            public Builder babelfishEnabled(String babelfishEnabled) {
                this.babelfishEnabled = babelfishEnabled;
                return this;
            }

            /**
             * The migration mode for Babelfish. Valid values:
             * <p>
             * 
             * *   **single-db**
             * *   **multi-db**
             * 
             * >  For more information about migration modes for Babelfish, see [Migration modes](~~428613~~).
             */
            public Builder migrationMode(String migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            public BabelfishConfig build() {
                return new BabelfishConfig(this);
            } 

        } 

    }
    public static class DBClusterNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassType")
        private String classType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeRegionId")
        private String nodeRegionId;

        @com.aliyun.core.annotation.NameInMap("NodeRole")
        private String nodeRole;

        @com.aliyun.core.annotation.NameInMap("NodeZoneId")
        private String nodeZoneId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DBClusterNode(Builder builder) {
            this.classCode = builder.classCode;
            this.classType = builder.classType;
            this.cpu = builder.cpu;
            this.memory = builder.memory;
            this.nodeId = builder.nodeId;
            this.nodeRegionId = builder.nodeRegionId;
            this.nodeRole = builder.nodeRole;
            this.nodeZoneId = builder.nodeZoneId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterNode create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return classType
         */
        public String getClassType() {
            return this.classType;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeRegionId
         */
        public String getNodeRegionId() {
            return this.nodeRegionId;
        }

        /**
         * @return nodeRole
         */
        public String getNodeRole() {
            return this.nodeRole;
        }

        /**
         * @return nodeZoneId
         */
        public String getNodeZoneId() {
            return this.nodeZoneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String classCode; 
            private String classType; 
            private String cpu; 
            private String memory; 
            private String nodeId; 
            private String nodeRegionId; 
            private String nodeRole; 
            private String nodeZoneId; 
            private String status; 

            /**
             * The node specification.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The node type. Default value: true. Valid values:
             * <p>
             * 
             * *   d: dedicated node type
             * *   x: general-purpose node type
             */
            public Builder classType(String classType) {
                this.classType = classType;
                return this;
            }

            /**
             * The number of CPU cores of the node.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The memory capacity of the node. Unit: MB.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder nodeRegionId(String nodeRegionId) {
                this.nodeRegionId = nodeRegionId;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **primary**
             * *   **secondary**
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder nodeZoneId(String nodeZoneId) {
                this.nodeZoneId = nodeZoneId;
                return this;
            }

            /**
             * The node status. Default value: true. Valid values:
             * <p>
             * 
             * *   active
             * *   creating
             * *   deleting
             * *   classchanging
             * *   restarting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DBClusterNode build() {
                return new DBClusterNode(this);
            } 

        } 

    }
    public static class DBClusterNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterNode")
        private java.util.List < DBClusterNode> DBClusterNode;

        private DBClusterNodes(Builder builder) {
            this.DBClusterNode = builder.DBClusterNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterNodes create() {
            return builder().build();
        }

        /**
         * @return DBClusterNode
         */
        public java.util.List < DBClusterNode> getDBClusterNode() {
            return this.DBClusterNode;
        }

        public static final class Builder {
            private java.util.List < DBClusterNode> DBClusterNode; 

            /**
             * DBClusterNode.
             */
            public Builder DBClusterNode(java.util.List < DBClusterNode> DBClusterNode) {
                this.DBClusterNode = DBClusterNode;
                return this;
            }

            public DBClusterNodes build() {
                return new DBClusterNodes(this);
            } 

        } 

    }
    public static class DBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private java.util.List < String > DBInstanceId;

        private DBInstanceIds(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public java.util.List < String > getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > DBInstanceId; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(java.util.List < String > DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        private Extra(Builder builder) {
            this.DBInstanceIds = builder.DBInstanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public static final class Builder {
            private DBInstanceIds DBInstanceIds; 

            /**
             * The instance IDs.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
    public static class ReadOnlyDBInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        private ReadOnlyDBInstanceId(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceId create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private String DBInstanceId; 

            /**
             * The read-only instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceId build() {
                return new ReadOnlyDBInstanceId(this);
            } 

        } 

    }
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId;

        private ReadOnlyDBInstanceIds(Builder builder) {
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public java.util.List < ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPause")
        private Boolean autoPause;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private Double scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private Double scaleMin;

        @com.aliyun.core.annotation.NameInMap("SwitchForce")
        private Boolean switchForce;

        private ServerlessConfig(Builder builder) {
            this.autoPause = builder.autoPause;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.switchForce = builder.switchForce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return autoPause
         */
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        /**
         * @return scaleMax
         */
        public Double getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public Double getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return switchForce
         */
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

        public static final class Builder {
            private Boolean autoPause; 
            private Double scaleMax; 
            private Double scaleMin; 
            private Boolean switchForce; 

            /**
             * Indicates whether the automatic start and stop feature is enabled for the serverless instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * >  After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * The maximum number of RCUs.
             */
            public Builder scaleMax(Double scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * The minimum number of RDS Capacity Units (RCUs).
             */
            public Builder scaleMin(Double scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * Indicates whether the forced scaling feature is enabled for the serverless instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * >  In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance.
             */
            public Builder switchForce(Boolean switchForce) {
                this.switchForce = switchForce;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
    public static class SlaveZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private SlaveZone(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZone create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public SlaveZone build() {
                return new SlaveZone(this);
            } 

        } 

    }
    public static class SlaveZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlaveZone")
        private java.util.List < SlaveZone> slaveZone;

        private SlaveZones(Builder builder) {
            this.slaveZone = builder.slaveZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZones create() {
            return builder().build();
        }

        /**
         * @return slaveZone
         */
        public java.util.List < SlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

        public static final class Builder {
            private java.util.List < SlaveZone> slaveZone; 

            /**
             * SlaveZone.
             */
            public Builder slaveZone(java.util.List < SlaveZone> slaveZone) {
                this.slaveZone = slaveZone;
                return this;
            }

            public SlaveZones build() {
                return new SlaveZones(this);
            } 

        } 

    }
    public static class DBInstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountMaxQuantity")
        private Integer accountMaxQuantity;

        @com.aliyun.core.annotation.NameInMap("AdvancedFeatures")
        private String advancedFeatures;

        @com.aliyun.core.annotation.NameInMap("AutoUpgradeMinorVersion")
        private String autoUpgradeMinorVersion;

        @com.aliyun.core.annotation.NameInMap("AvailabilityValue")
        private String availabilityValue;

        @com.aliyun.core.annotation.NameInMap("BabelfishConfig")
        private BabelfishConfig babelfishConfig;

        @com.aliyun.core.annotation.NameInMap("BpeEnabled")
        private String bpeEnabled;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("CanTempUpgrade")
        private Boolean canTempUpgrade;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ColdDataEnabled")
        private Boolean coldDataEnabled;

        @com.aliyun.core.annotation.NameInMap("Collation")
        private String collation;

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("ConsoleVersion")
        private String consoleVersion;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @com.aliyun.core.annotation.NameInMap("DBClusterNodes")
        private DBClusterNodes DBClusterNodes;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDiskUsed")
        private String DBInstanceDiskUsed;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DBMaxQuantity")
        private Integer DBMaxQuantity;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private Extra extra;

        @com.aliyun.core.annotation.NameInMap("GeneralGroupName")
        private String generalGroupName;

        @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("IncrementSourceDBInstanceId")
        private String incrementSourceDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("InstructionSetArch")
        private String instructionSetArch;

        @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
        private String ioAccelerationEnabled;

        @com.aliyun.core.annotation.NameInMap("LatestKernelVersion")
        private String latestKernelVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("MasterZone")
        private String masterZone;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOMBPS")
        private Integer maxIOMBPS;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("PGBouncerEnabled")
        private String PGBouncerEnabled;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private Integer proxyType;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("ReadonlyInstanceSQLDelayedTime")
        private String readonlyInstanceSQLDelayedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SecurityIPMode")
        private String securityIPMode;

        @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
        private ServerlessConfig serverlessConfig;

        @com.aliyun.core.annotation.NameInMap("SlaveZones")
        private SlaveZones slaveZones;

        @com.aliyun.core.annotation.NameInMap("SuperPermissionMode")
        private String superPermissionMode;

        @com.aliyun.core.annotation.NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("TempUpgradeTimeEnd")
        private String tempUpgradeTimeEnd;

        @com.aliyun.core.annotation.NameInMap("TempUpgradeTimeStart")
        private String tempUpgradeTimeStart;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("TipsLevel")
        private Integer tipsLevel;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("kindCode")
        private String kindCode;

        private DBInstanceAttribute(Builder builder) {
            this.accountMaxQuantity = builder.accountMaxQuantity;
            this.advancedFeatures = builder.advancedFeatures;
            this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
            this.availabilityValue = builder.availabilityValue;
            this.babelfishConfig = builder.babelfishConfig;
            this.bpeEnabled = builder.bpeEnabled;
            this.burstingEnabled = builder.burstingEnabled;
            this.canTempUpgrade = builder.canTempUpgrade;
            this.category = builder.category;
            this.coldDataEnabled = builder.coldDataEnabled;
            this.collation = builder.collation;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.consoleVersion = builder.consoleVersion;
            this.creationTime = builder.creationTime;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.DBClusterNodes = builder.DBClusterNodes;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceDiskUsed = builder.DBInstanceDiskUsed;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBMaxQuantity = builder.DBMaxQuantity;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.deletionProtection = builder.deletionProtection;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.extra = builder.extra;
            this.generalGroupName = builder.generalGroupName;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.IPType = builder.IPType;
            this.incrementSourceDBInstanceId = builder.incrementSourceDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instructionSetArch = builder.instructionSetArch;
            this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
            this.latestKernelVersion = builder.latestKernelVersion;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.masterInstanceId = builder.masterInstanceId;
            this.masterZone = builder.masterZone;
            this.maxConnections = builder.maxConnections;
            this.maxIOMBPS = builder.maxIOMBPS;
            this.maxIOPS = builder.maxIOPS;
            this.PGBouncerEnabled = builder.PGBouncerEnabled;
            this.payType = builder.payType;
            this.port = builder.port;
            this.proxyType = builder.proxyType;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.readonlyInstanceSQLDelayedTime = builder.readonlyInstanceSQLDelayedTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityIPList = builder.securityIPList;
            this.securityIPMode = builder.securityIPMode;
            this.serverlessConfig = builder.serverlessConfig;
            this.slaveZones = builder.slaveZones;
            this.superPermissionMode = builder.superPermissionMode;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.tempUpgradeTimeEnd = builder.tempUpgradeTimeEnd;
            this.tempUpgradeTimeStart = builder.tempUpgradeTimeStart;
            this.timeZone = builder.timeZone;
            this.tips = builder.tips;
            this.tipsLevel = builder.tipsLevel;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
            this.kindCode = builder.kindCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return accountMaxQuantity
         */
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        /**
         * @return advancedFeatures
         */
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        /**
         * @return autoUpgradeMinorVersion
         */
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        /**
         * @return availabilityValue
         */
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        /**
         * @return babelfishConfig
         */
        public BabelfishConfig getBabelfishConfig() {
            return this.babelfishConfig;
        }

        /**
         * @return bpeEnabled
         */
        public String getBpeEnabled() {
            return this.bpeEnabled;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return canTempUpgrade
         */
        public Boolean getCanTempUpgrade() {
            return this.canTempUpgrade;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return coldDataEnabled
         */
        public Boolean getColdDataEnabled() {
            return this.coldDataEnabled;
        }

        /**
         * @return collation
         */
        public String getCollation() {
            return this.collation;
        }

        /**
         * @return connectionMode
         */
        public String getConnectionMode() {
            return this.connectionMode;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return consoleVersion
         */
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        /**
         * @return DBClusterNodes
         */
        public DBClusterNodes getDBClusterNodes() {
            return this.DBClusterNodes;
        }

        /**
         * @return DBInstanceCPU
         */
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceClassType
         */
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceDiskUsed
         */
        public String getDBInstanceDiskUsed() {
            return this.DBInstanceDiskUsed;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceMemory
         */
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStorage
         */
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return DBMaxQuantity
         */
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        /**
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extra
         */
        public Extra getExtra() {
            return this.extra;
        }

        /**
         * @return generalGroupName
         */
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        /**
         * @return guardDBInstanceId
         */
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        /**
         * @return IPType
         */
        public String getIPType() {
            return this.IPType;
        }

        /**
         * @return incrementSourceDBInstanceId
         */
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return instructionSetArch
         */
        public String getInstructionSetArch() {
            return this.instructionSetArch;
        }

        /**
         * @return ioAccelerationEnabled
         */
        public String getIoAccelerationEnabled() {
            return this.ioAccelerationEnabled;
        }

        /**
         * @return latestKernelVersion
         */
        public String getLatestKernelVersion() {
            return this.latestKernelVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        /**
         * @return masterZone
         */
        public String getMasterZone() {
            return this.masterZone;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOMBPS
         */
        public Integer getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return PGBouncerEnabled
         */
        public String getPGBouncerEnabled() {
            return this.PGBouncerEnabled;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return proxyType
         */
        public Integer getProxyType() {
            return this.proxyType;
        }

        /**
         * @return readOnlyDBInstanceIds
         */
        public ReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        /**
         * @return readonlyInstanceSQLDelayedTime
         */
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
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
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPMode
         */
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        /**
         * @return serverlessConfig
         */
        public ServerlessConfig getServerlessConfig() {
            return this.serverlessConfig;
        }

        /**
         * @return slaveZones
         */
        public SlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        /**
         * @return superPermissionMode
         */
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        /**
         * @return tempDBInstanceId
         */
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        /**
         * @return tempUpgradeTimeEnd
         */
        public String getTempUpgradeTimeEnd() {
            return this.tempUpgradeTimeEnd;
        }

        /**
         * @return tempUpgradeTimeStart
         */
        public String getTempUpgradeTimeStart() {
            return this.tempUpgradeTimeStart;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return tipsLevel
         */
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return kindCode
         */
        public String getKindCode() {
            return this.kindCode;
        }

        public static final class Builder {
            private Integer accountMaxQuantity; 
            private String advancedFeatures; 
            private String autoUpgradeMinorVersion; 
            private String availabilityValue; 
            private BabelfishConfig babelfishConfig; 
            private String bpeEnabled; 
            private Boolean burstingEnabled; 
            private Boolean canTempUpgrade; 
            private String category; 
            private Boolean coldDataEnabled; 
            private String collation; 
            private String connectionMode; 
            private String connectionString; 
            private String consoleVersion; 
            private String creationTime; 
            private String currentKernelVersion; 
            private DBClusterNodes DBClusterNodes; 
            private String DBInstanceCPU; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private String DBInstanceDescription; 
            private String DBInstanceDiskUsed; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private Integer DBInstanceStorage; 
            private String DBInstanceStorageType; 
            private String DBInstanceType; 
            private Integer DBMaxQuantity; 
            private String dedicatedHostGroupId; 
            private Boolean deletionProtection; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private Extra extra; 
            private String generalGroupName; 
            private String guardDBInstanceId; 
            private String IPType; 
            private String incrementSourceDBInstanceId; 
            private String instanceNetworkType; 
            private String instructionSetArch; 
            private String ioAccelerationEnabled; 
            private String latestKernelVersion; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String masterInstanceId; 
            private String masterZone; 
            private Integer maxConnections; 
            private Integer maxIOMBPS; 
            private Integer maxIOPS; 
            private String PGBouncerEnabled; 
            private String payType; 
            private String port; 
            private Integer proxyType; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String readonlyInstanceSQLDelayedTime; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityIPList; 
            private String securityIPMode; 
            private ServerlessConfig serverlessConfig; 
            private SlaveZones slaveZones; 
            private String superPermissionMode; 
            private String tempDBInstanceId; 
            private String tempUpgradeTimeEnd; 
            private String tempUpgradeTimeStart; 
            private String timeZone; 
            private String tips; 
            private Integer tipsLevel; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 
            private String kindCode; 

            /**
             * The maximum number of accounts that can be created on the instance.
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * The advanced features that are enabled for the instance. If multiple advanced features are enabled, the advanced features are separated by commas (,). This parameter is available only to instances that run **SQL Server**. Valid values:
             * <p>
             * 
             * *   **LinkedServer**
             * *   **DistributeTransaction**
             */
            public Builder advancedFeatures(String advancedFeatures) {
                this.advancedFeatures = advancedFeatures;
                return this;
            }

            /**
             * The method that is used to update the minor engine version of the instance. Valid values:
             * <p>
             * 
             * *   **Auto**: automatic update.
             * *   **Manual**: manual update. The minor engine version of the instance is forcefully updated only when the in-use minor engine version is phased out.
             */
            public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
                this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
                return this;
            }

            /**
             * The availability status of the instance in percentage.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * The configuration of the Babelfish feature for the ApsaraDB RDS for PostgreSQL instance.
             * <p>
             * 
             * >  This parameter applies only to ApsaraDB RDS for PostgreSQL instances for which Babelfish is enabled. For more information, see [Introduction to Babelfish](~~428613~~).
             */
            public Builder babelfishConfig(BabelfishConfig babelfishConfig) {
                this.babelfishConfig = babelfishConfig;
                return this;
            }

            /**
             * A deprecated parameter. You do not need to specify this parameter.
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * An invalid parameter. You do not need to specify this parameter.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * CanTempUpgrade.
             */
            public Builder canTempUpgrade(Boolean canTempUpgrade) {
                this.canTempUpgrade = canTempUpgrade;
                return this;
            }

            /**
             * The RDS edition. Valid values:
             * <p>
             * 
             * *   **Basic**: RDS Basic Edition
             * *   **HighAvailability**: RDS High-availability Edition
             * *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL
             * *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server
             * *   **Finance**: RDS Enterprise Edition
             * *   **Serverless_basic**: RDS Basic Edition for serverless instances
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * A reserved parameter. You do not need to specify this parameter.
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * The character set collation of the instance.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * The connection mode of the instance. Valid values:
             * <p>
             * 
             * *   **Standard**: standard mode
             * *   **Safe**: database proxy mode
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * The internal endpoint.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The type of the proxy that is used by the instance. Valid values:
             * <p>
             * 
             * *   **1**: shared database proxy
             * *   **2**: dedicated database proxy
             * 
             * >  We recommend that you use the **ProxyType** parameter instead of this parameter.
             */
            public Builder consoleVersion(String consoleVersion) {
                this.consoleVersion = consoleVersion;
                return this;
            }

            /**
             * The creation time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The minor engine version.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * The information about the node in the cluster.
             */
            public Builder DBClusterNodes(DBClusterNodes DBClusterNodes) {
                this.DBClusterNodes = DBClusterNodes;
                return this;
            }

            /**
             * The number of CPU cores.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * The instance family. Valid values:
             * <p>
             * 
             * *   **s**: shared instance family
             * *   **x**: general-purpose instance family
             * *   **d**: dedicated instance family
             * *   **h**: dedicated host instance family
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * The instance description.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The disk usage of the instance. Unit: MB.
             */
            public Builder DBInstanceDiskUsed(String DBInstanceDiskUsed) {
                this.DBInstanceDiskUsed = DBInstanceDiskUsed;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The memory capacity of the instance. Unit: MB.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * The type of the network over which the instance is connected. Valid values:
             * <p>
             * 
             * *   **Internet**
             * *   **Intranet**
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * The instance status. For more information, see [Instance statuses](~~26315~~).
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage capacity of the instance. Unit: GB.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The storage type of the instance. Valid values:
             * <p>
             * 
             * *   **local_ssd** or **ephemeral_ssd**: local SSD
             * *   **cloud_ssd**: standard SSD
             * *   **cloud_essd**: Enterprise SSD (ESSD)
             * *   **general_essd**: general ESSD
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * The instance type. Valid values:
             * <p>
             * 
             * *   **Primary**: primary instance
             * *   **Readonly**: read-only instance
             * *   **Guard**: disaster recovery instance
             * *   **Temp**: temporary instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The maximum number of databases that can be created on the instance.
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * The ID of the dedicated cluster to which the instances belong.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * Indicates whether the release protection feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The database engine of the instance. Valid values:
             * <p>
             * 
             * *   **MySQL**
             * *   **PostgreSQL**
             * *   **SQLServer**
             * *   **MariaDB**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The expiration time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  Pay-as-you-go instances never expire.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The extended information of the instance.
             */
            public Builder extra(Extra extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * The ID of the disaster recovery instance that is attached to the primary instance.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * The IP address type. Only **IPv4 addresses** are supported.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * The ID of the instance from which incremental data comes. The incremental data of a disaster recovery instance comes from its primary instance. The incremental data of a read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **Classic**
             * *   **VPC**
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * The architecture type of the instance. Valid values:
             * <p>
             * 
             * *   **x86**
             * *   **arm**
             */
            public Builder instructionSetArch(String instructionSetArch) {
                this.instructionSetArch = instructionSetArch;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * The latest minor engine version that is supported by the instance.
             */
            public Builder latestKernelVersion(String latestKernelVersion) {
                this.latestKernelVersion = latestKernelVersion;
                return this;
            }

            /**
             * The lock mode of the instance. Valid values:
             * <p>
             * 
             * *   **Unlock**: The instance is not locked.
             * *   **ManualLock**: The instance is manually locked.
             * *   **LockByExpiration**: The instance is automatically locked due to instance expiration.
             * *   **LockByRestoration**: The instance is automatically locked due to instance restoration.
             * *   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage space.
             * *   **LockReadInstanceByDiskQuota**: The instance is a read-only instance and is automatically locked due to exhausted storage.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The reason why the instance was locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The maintenance window of the instance. The time is displayed in UTC. The maintenance window displayed in the ApsaraDB RDS console is equal to the value of this parameter plus 8 hours.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The primary instance ID.
             * <p>
             * 
             * >  If this parameter is not returned, the instance is the primary instance.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * The zone ID of the primary instance.
             */
            public Builder masterZone(String masterZone) {
                this.masterZone = masterZone;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * The maximum I/O throughput. Unit: MB/s.
             */
            public Builder maxIOMBPS(Integer maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * The maximum number of I/O requests per second.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * Indicates whether PgBouncer is enabled.
             * <p>
             * 
             * >  This parameter is returned only for RDS instances that run PostgreSQL. If PgBouncer is enabled, the return value is **true**.
             */
            public Builder PGBouncerEnabled(String PGBouncerEnabled) {
                this.PGBouncerEnabled = PGBouncerEnabled;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go
             * *   **Prepaid**: subscription
             * *   **SERVERLESS**: serverless
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port that is used to connect to the instance over an internal network.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the proxy that is supported by the instance. Valid values:
             * <p>
             * 
             * *   **0**: The instance does not support database proxies.
             * *   **1**: The instance supports shared proxies, with which the instance runs in multi-tenant mode.
             * *   **2**: The instance supports dedicated proxies, with which the instance runs in single-tenant mode.
             */
            public Builder proxyType(Integer proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * The IDs of the read-only instances that are attached to the primary instance.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * The latency at which the system replicates data to read-only instances. The system replicates data from the primary instance to the read-only instances at the latency that is specified by the **ReadonlyInstanceSQLDelayedTime** parameter. Unit: seconds.
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The IP addresses in the IP address whitelist.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * The whitelist mode. Valid values:
             * <p>
             * 
             * *   **normal**: standard whitelist mode
             * *   **safety**: enhanced whitelist mode
             */
            public Builder securityIPMode(String securityIPMode) {
                this.securityIPMode = securityIPMode;
                return this;
            }

            /**
             * The settings of the serverless instance.
             */
            public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
                this.serverlessConfig = serverlessConfig;
                return this;
            }

            /**
             * The zone IDs of the secondary instances.
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * Indicates whether the instance supports superuser accounts, such as the system administrator (SA) account, Active Directory (AD) account, and host account. Valid values:
             * <p>
             * 
             * *   **Enable**
             * *   **Disabled**
             */
            public Builder superPermissionMode(String superPermissionMode) {
                this.superPermissionMode = superPermissionMode;
                return this;
            }

            /**
             * The ID of the temporary instance that is attached to the primary instance.
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * TempUpgradeTimeEnd.
             */
            public Builder tempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
                this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
                return this;
            }

            /**
             * TempUpgradeTimeStart.
             */
            public Builder tempUpgradeTimeStart(String tempUpgradeTimeStart) {
                this.tempUpgradeTimeStart = tempUpgradeTimeStart;
                return this;
            }

            /**
             * The time zone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * The severity of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:
             * <p>
             * 
             * *   **1**: The instance is normal.
             * *   **2**: The specifications of the read-only instances do not match the specifications of the primary instance. You must adjust the specifications of these instances based on your business requirements.
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the instance. This parameter is returned only when the instance resides in a VPC.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * An internal parameter. You do not need to specify this parameter.
             */
            public Builder kindCode(String kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            public DBInstanceAttribute build() {
                return new DBInstanceAttribute(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceAttribute")
        private java.util.List < DBInstanceAttribute> DBInstanceAttribute;

        private Items(Builder builder) {
            this.DBInstanceAttribute = builder.DBInstanceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstanceAttribute
         */
        public java.util.List < DBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

        public static final class Builder {
            private java.util.List < DBInstanceAttribute> DBInstanceAttribute; 

            /**
             * DBInstanceAttribute.
             */
            public Builder DBInstanceAttribute(java.util.List < DBInstanceAttribute> DBInstanceAttribute) {
                this.DBInstanceAttribute = DBInstanceAttribute;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
