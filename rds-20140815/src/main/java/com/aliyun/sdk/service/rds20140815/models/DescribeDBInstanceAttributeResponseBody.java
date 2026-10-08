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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceAttributeResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BabelfishConfig model) {
                this.babelfishEnabled = model.babelfishEnabled;
                this.migrationMode = model.migrationMode;
            } 

            /**
             * BabelfishEnabled.
             */
            public Builder babelfishEnabled(String babelfishEnabled) {
                this.babelfishEnabled = babelfishEnabled;
                return this;
            }

            /**
             * MigrationMode.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBClusterNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassType")
        private String classType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryNode")
        private Boolean disasterRecoveryNode;

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
            this.disasterRecoveryNode = builder.disasterRecoveryNode;
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
         * @return disasterRecoveryNode
         */
        public Boolean getDisasterRecoveryNode() {
            return this.disasterRecoveryNode;
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
            private Boolean disasterRecoveryNode; 
            private String memory; 
            private String nodeId; 
            private String nodeRegionId; 
            private String nodeRole; 
            private String nodeZoneId; 
            private String status; 

            private Builder() {
            } 

            private Builder(DBClusterNode model) {
                this.classCode = model.classCode;
                this.classType = model.classType;
                this.cpu = model.cpu;
                this.disasterRecoveryNode = model.disasterRecoveryNode;
                this.memory = model.memory;
                this.nodeId = model.nodeId;
                this.nodeRegionId = model.nodeRegionId;
                this.nodeRole = model.nodeRole;
                this.nodeZoneId = model.nodeZoneId;
                this.status = model.status;
            } 

            /**
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * ClassType.
             */
            public Builder classType(String classType) {
                this.classType = classType;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DisasterRecoveryNode.
             */
            public Builder disasterRecoveryNode(Boolean disasterRecoveryNode) {
                this.disasterRecoveryNode = disasterRecoveryNode;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeRegionId.
             */
            public Builder nodeRegionId(String nodeRegionId) {
                this.nodeRegionId = nodeRegionId;
                return this;
            }

            /**
             * NodeRole.
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * NodeZoneId.
             */
            public Builder nodeZoneId(String nodeZoneId) {
                this.nodeZoneId = nodeZoneId;
                return this;
            }

            /**
             * Status.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBClusterNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterNode")
        private java.util.List<DBClusterNode> DBClusterNode;

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
        public java.util.List<DBClusterNode> getDBClusterNode() {
            return this.DBClusterNode;
        }

        public static final class Builder {
            private java.util.List<DBClusterNode> DBClusterNode; 

            private Builder() {
            } 

            private Builder(DBClusterNodes model) {
                this.DBClusterNode = model.DBClusterNode;
            } 

            /**
             * DBClusterNode.
             */
            public Builder DBClusterNode(java.util.List<DBClusterNode> DBClusterNode) {
                this.DBClusterNode = DBClusterNode;
                return this;
            }

            public DBClusterNodes build() {
                return new DBClusterNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DrReplicaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UnitCode")
        private String unitCode;

        private DrReplicaInfo(Builder builder) {
            this.insName = builder.insName;
            this.region = builder.region;
            this.unitCode = builder.unitCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrReplicaInfo create() {
            return builder().build();
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return unitCode
         */
        public String getUnitCode() {
            return this.unitCode;
        }

        public static final class Builder {
            private String insName; 
            private String region; 
            private String unitCode; 

            private Builder() {
            } 

            private Builder(DrReplicaInfo model) {
                this.insName = model.insName;
                this.region = model.region;
                this.unitCode = model.unitCode;
            } 

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * UnitCode.
             */
            public Builder unitCode(String unitCode) {
                this.unitCode = unitCode;
                return this;
            }

            public DrReplicaInfo build() {
                return new DrReplicaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private java.util.List<String> DBInstanceId;

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
        public java.util.List<String> getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> DBInstanceId; 

            private Builder() {
            } 

            private Builder(DBInstanceIds model) {
                this.DBInstanceId = model.DBInstanceId;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(java.util.List<String> DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountSecurityPolicy")
        private String accountSecurityPolicy;

        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("RecoveryModel")
        private String recoveryModel;

        private Extra(Builder builder) {
            this.accountSecurityPolicy = builder.accountSecurityPolicy;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.recoveryModel = builder.recoveryModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return accountSecurityPolicy
         */
        public String getAccountSecurityPolicy() {
            return this.accountSecurityPolicy;
        }

        /**
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        /**
         * @return recoveryModel
         */
        public String getRecoveryModel() {
            return this.recoveryModel;
        }

        public static final class Builder {
            private String accountSecurityPolicy; 
            private DBInstanceIds DBInstanceIds; 
            private String recoveryModel; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.accountSecurityPolicy = model.accountSecurityPolicy;
                this.DBInstanceIds = model.DBInstanceIds;
                this.recoveryModel = model.recoveryModel;
            } 

            /**
             * AccountSecurityPolicy.
             */
            public Builder accountSecurityPolicy(String accountSecurityPolicy) {
                this.accountSecurityPolicy = accountSecurityPolicy;
                return this;
            }

            /**
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * RecoveryModel.
             */
            public Builder recoveryModel(String recoveryModel) {
                this.recoveryModel = recoveryModel;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ReadOnlyDBInstanceId model) {
                this.DBInstanceId = model.DBInstanceId;
            } 

            /**
             * DBInstanceId.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId;

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
        public java.util.List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId; 

            private Builder() {
            } 

            private Builder(ReadOnlyDBInstanceIds model) {
                this.readOnlyDBInstanceId = model.readOnlyDBInstanceId;
            } 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ServerlessConfig model) {
                this.autoPause = model.autoPause;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
                this.switchForce = model.switchForce;
            } 

            /**
             * AutoPause.
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * ScaleMax.
             */
            public Builder scaleMax(Double scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * ScaleMin.
             */
            public Builder scaleMin(Double scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * SwitchForce.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SlaveZone model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * ZoneId.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class SlaveZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlaveZone")
        private java.util.List<SlaveZone> slaveZone;

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
        public java.util.List<SlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

        public static final class Builder {
            private java.util.List<SlaveZone> slaveZone; 

            private Builder() {
            } 

            private Builder(SlaveZones model) {
                this.slaveZone = model.slaveZone;
            } 

            /**
             * SlaveZone.
             */
            public Builder slaveZone(java.util.List<SlaveZone> slaveZone) {
                this.slaveZone = slaveZone;
                return this;
            }

            public SlaveZones build() {
                return new SlaveZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class WarmStandbyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UnitCode")
        private String unitCode;

        private WarmStandbyInfo(Builder builder) {
            this.insName = builder.insName;
            this.region = builder.region;
            this.unitCode = builder.unitCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmStandbyInfo create() {
            return builder().build();
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return unitCode
         */
        public String getUnitCode() {
            return this.unitCode;
        }

        public static final class Builder {
            private String insName; 
            private String region; 
            private String unitCode; 

            private Builder() {
            } 

            private Builder(WarmStandbyInfo model) {
                this.insName = model.insName;
                this.region = model.region;
                this.unitCode = model.unitCode;
            } 

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * UnitCode.
             */
            public Builder unitCode(String unitCode) {
                this.unitCode = unitCode;
                return this;
            }

            public WarmStandbyInfo build() {
                return new WarmStandbyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("BlueGreenDeploymentName")
        private String blueGreenDeploymentName;

        @com.aliyun.core.annotation.NameInMap("BlueInstanceName")
        private String blueInstanceName;

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

        @com.aliyun.core.annotation.NameInMap("CompressionMode")
        private String compressionMode;

        @com.aliyun.core.annotation.NameInMap("CompressionRatio")
        private String compressionRatio;

        @com.aliyun.core.annotation.NameInMap("ComputeBurstEnabled")
        private Boolean computeBurstEnabled;

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

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryInfo")
        private String disasterRecoveryInfo;

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryInstances")
        private String disasterRecoveryInstances;

        @com.aliyun.core.annotation.NameInMap("DrReplicaInfo")
        private DrReplicaInfo drReplicaInfo;

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

        @com.aliyun.core.annotation.NameInMap("GreenInstanceName")
        private String greenInstanceName;

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

        @com.aliyun.core.annotation.NameInMap("IsAnalyticIns")
        private Boolean isAnalyticIns;

        @com.aliyun.core.annotation.NameInMap("IsAnalyticReadOnlyIns")
        private Boolean isAnalyticReadOnlyIns;

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

        @com.aliyun.core.annotation.NameInMap("MultipleTempUpgrade")
        private Boolean multipleTempUpgrade;

        @com.aliyun.core.annotation.NameInMap("NodePerformance")
        private String nodePerformance;

        @com.aliyun.core.annotation.NameInMap("OptimizedWritesInfo")
        private String optimizedWritesInfo;

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

        @com.aliyun.core.annotation.NameInMap("ReadOnlyStatus")
        private String readOnlyStatus;

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

        @com.aliyun.core.annotation.NameInMap("SupportCompression")
        private Boolean supportCompression;

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

        @com.aliyun.core.annotation.NameInMap("VectorSupportStatus")
        private String vectorSupportStatus;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WarmStandbyInfo")
        private WarmStandbyInfo warmStandbyInfo;

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
            this.blueGreenDeploymentName = builder.blueGreenDeploymentName;
            this.blueInstanceName = builder.blueInstanceName;
            this.bpeEnabled = builder.bpeEnabled;
            this.burstingEnabled = builder.burstingEnabled;
            this.canTempUpgrade = builder.canTempUpgrade;
            this.category = builder.category;
            this.coldDataEnabled = builder.coldDataEnabled;
            this.collation = builder.collation;
            this.compressionMode = builder.compressionMode;
            this.compressionRatio = builder.compressionRatio;
            this.computeBurstEnabled = builder.computeBurstEnabled;
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
            this.disasterRecoveryInfo = builder.disasterRecoveryInfo;
            this.disasterRecoveryInstances = builder.disasterRecoveryInstances;
            this.drReplicaInfo = builder.drReplicaInfo;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.extra = builder.extra;
            this.generalGroupName = builder.generalGroupName;
            this.greenInstanceName = builder.greenInstanceName;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.IPType = builder.IPType;
            this.incrementSourceDBInstanceId = builder.incrementSourceDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instructionSetArch = builder.instructionSetArch;
            this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
            this.isAnalyticIns = builder.isAnalyticIns;
            this.isAnalyticReadOnlyIns = builder.isAnalyticReadOnlyIns;
            this.latestKernelVersion = builder.latestKernelVersion;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.masterInstanceId = builder.masterInstanceId;
            this.masterZone = builder.masterZone;
            this.maxConnections = builder.maxConnections;
            this.maxIOMBPS = builder.maxIOMBPS;
            this.maxIOPS = builder.maxIOPS;
            this.multipleTempUpgrade = builder.multipleTempUpgrade;
            this.nodePerformance = builder.nodePerformance;
            this.optimizedWritesInfo = builder.optimizedWritesInfo;
            this.PGBouncerEnabled = builder.PGBouncerEnabled;
            this.payType = builder.payType;
            this.port = builder.port;
            this.proxyType = builder.proxyType;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.readOnlyStatus = builder.readOnlyStatus;
            this.readonlyInstanceSQLDelayedTime = builder.readonlyInstanceSQLDelayedTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityIPList = builder.securityIPList;
            this.securityIPMode = builder.securityIPMode;
            this.serverlessConfig = builder.serverlessConfig;
            this.slaveZones = builder.slaveZones;
            this.superPermissionMode = builder.superPermissionMode;
            this.supportCompression = builder.supportCompression;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.tempUpgradeTimeEnd = builder.tempUpgradeTimeEnd;
            this.tempUpgradeTimeStart = builder.tempUpgradeTimeStart;
            this.timeZone = builder.timeZone;
            this.tips = builder.tips;
            this.tipsLevel = builder.tipsLevel;
            this.vSwitchId = builder.vSwitchId;
            this.vectorSupportStatus = builder.vectorSupportStatus;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.warmStandbyInfo = builder.warmStandbyInfo;
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
         * @return blueGreenDeploymentName
         */
        public String getBlueGreenDeploymentName() {
            return this.blueGreenDeploymentName;
        }

        /**
         * @return blueInstanceName
         */
        public String getBlueInstanceName() {
            return this.blueInstanceName;
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
         * @return compressionMode
         */
        public String getCompressionMode() {
            return this.compressionMode;
        }

        /**
         * @return compressionRatio
         */
        public String getCompressionRatio() {
            return this.compressionRatio;
        }

        /**
         * @return computeBurstEnabled
         */
        public Boolean getComputeBurstEnabled() {
            return this.computeBurstEnabled;
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
         * @return disasterRecoveryInfo
         */
        public String getDisasterRecoveryInfo() {
            return this.disasterRecoveryInfo;
        }

        /**
         * @return disasterRecoveryInstances
         */
        public String getDisasterRecoveryInstances() {
            return this.disasterRecoveryInstances;
        }

        /**
         * @return drReplicaInfo
         */
        public DrReplicaInfo getDrReplicaInfo() {
            return this.drReplicaInfo;
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
         * @return greenInstanceName
         */
        public String getGreenInstanceName() {
            return this.greenInstanceName;
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
         * @return isAnalyticIns
         */
        public Boolean getIsAnalyticIns() {
            return this.isAnalyticIns;
        }

        /**
         * @return isAnalyticReadOnlyIns
         */
        public Boolean getIsAnalyticReadOnlyIns() {
            return this.isAnalyticReadOnlyIns;
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
         * @return multipleTempUpgrade
         */
        public Boolean getMultipleTempUpgrade() {
            return this.multipleTempUpgrade;
        }

        /**
         * @return nodePerformance
         */
        public String getNodePerformance() {
            return this.nodePerformance;
        }

        /**
         * @return optimizedWritesInfo
         */
        public String getOptimizedWritesInfo() {
            return this.optimizedWritesInfo;
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
         * @return readOnlyStatus
         */
        public String getReadOnlyStatus() {
            return this.readOnlyStatus;
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
         * @return supportCompression
         */
        public Boolean getSupportCompression() {
            return this.supportCompression;
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
         * @return vectorSupportStatus
         */
        public String getVectorSupportStatus() {
            return this.vectorSupportStatus;
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
         * @return warmStandbyInfo
         */
        public WarmStandbyInfo getWarmStandbyInfo() {
            return this.warmStandbyInfo;
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
            private String blueGreenDeploymentName; 
            private String blueInstanceName; 
            private String bpeEnabled; 
            private Boolean burstingEnabled; 
            private Boolean canTempUpgrade; 
            private String category; 
            private Boolean coldDataEnabled; 
            private String collation; 
            private String compressionMode; 
            private String compressionRatio; 
            private Boolean computeBurstEnabled; 
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
            private String disasterRecoveryInfo; 
            private String disasterRecoveryInstances; 
            private DrReplicaInfo drReplicaInfo; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private Extra extra; 
            private String generalGroupName; 
            private String greenInstanceName; 
            private String guardDBInstanceId; 
            private String IPType; 
            private String incrementSourceDBInstanceId; 
            private String instanceNetworkType; 
            private String instructionSetArch; 
            private String ioAccelerationEnabled; 
            private Boolean isAnalyticIns; 
            private Boolean isAnalyticReadOnlyIns; 
            private String latestKernelVersion; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String masterInstanceId; 
            private String masterZone; 
            private Integer maxConnections; 
            private Integer maxIOMBPS; 
            private Integer maxIOPS; 
            private Boolean multipleTempUpgrade; 
            private String nodePerformance; 
            private String optimizedWritesInfo; 
            private String PGBouncerEnabled; 
            private String payType; 
            private String port; 
            private Integer proxyType; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String readOnlyStatus; 
            private String readonlyInstanceSQLDelayedTime; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityIPList; 
            private String securityIPMode; 
            private ServerlessConfig serverlessConfig; 
            private SlaveZones slaveZones; 
            private String superPermissionMode; 
            private Boolean supportCompression; 
            private String tempDBInstanceId; 
            private String tempUpgradeTimeEnd; 
            private String tempUpgradeTimeStart; 
            private String timeZone; 
            private String tips; 
            private Integer tipsLevel; 
            private String vSwitchId; 
            private String vectorSupportStatus; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private WarmStandbyInfo warmStandbyInfo; 
            private String zoneId; 
            private String kindCode; 

            private Builder() {
            } 

            private Builder(DBInstanceAttribute model) {
                this.accountMaxQuantity = model.accountMaxQuantity;
                this.advancedFeatures = model.advancedFeatures;
                this.autoUpgradeMinorVersion = model.autoUpgradeMinorVersion;
                this.availabilityValue = model.availabilityValue;
                this.babelfishConfig = model.babelfishConfig;
                this.blueGreenDeploymentName = model.blueGreenDeploymentName;
                this.blueInstanceName = model.blueInstanceName;
                this.bpeEnabled = model.bpeEnabled;
                this.burstingEnabled = model.burstingEnabled;
                this.canTempUpgrade = model.canTempUpgrade;
                this.category = model.category;
                this.coldDataEnabled = model.coldDataEnabled;
                this.collation = model.collation;
                this.compressionMode = model.compressionMode;
                this.compressionRatio = model.compressionRatio;
                this.computeBurstEnabled = model.computeBurstEnabled;
                this.connectionMode = model.connectionMode;
                this.connectionString = model.connectionString;
                this.consoleVersion = model.consoleVersion;
                this.creationTime = model.creationTime;
                this.currentKernelVersion = model.currentKernelVersion;
                this.DBClusterNodes = model.DBClusterNodes;
                this.DBInstanceCPU = model.DBInstanceCPU;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceClassType = model.DBInstanceClassType;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceDiskUsed = model.DBInstanceDiskUsed;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceMemory = model.DBInstanceMemory;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.DBInstanceStorageType = model.DBInstanceStorageType;
                this.DBInstanceType = model.DBInstanceType;
                this.DBMaxQuantity = model.DBMaxQuantity;
                this.dedicatedHostGroupId = model.dedicatedHostGroupId;
                this.deletionProtection = model.deletionProtection;
                this.disasterRecoveryInfo = model.disasterRecoveryInfo;
                this.disasterRecoveryInstances = model.disasterRecoveryInstances;
                this.drReplicaInfo = model.drReplicaInfo;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.extra = model.extra;
                this.generalGroupName = model.generalGroupName;
                this.greenInstanceName = model.greenInstanceName;
                this.guardDBInstanceId = model.guardDBInstanceId;
                this.IPType = model.IPType;
                this.incrementSourceDBInstanceId = model.incrementSourceDBInstanceId;
                this.instanceNetworkType = model.instanceNetworkType;
                this.instructionSetArch = model.instructionSetArch;
                this.ioAccelerationEnabled = model.ioAccelerationEnabled;
                this.isAnalyticIns = model.isAnalyticIns;
                this.isAnalyticReadOnlyIns = model.isAnalyticReadOnlyIns;
                this.latestKernelVersion = model.latestKernelVersion;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainTime = model.maintainTime;
                this.masterInstanceId = model.masterInstanceId;
                this.masterZone = model.masterZone;
                this.maxConnections = model.maxConnections;
                this.maxIOMBPS = model.maxIOMBPS;
                this.maxIOPS = model.maxIOPS;
                this.multipleTempUpgrade = model.multipleTempUpgrade;
                this.nodePerformance = model.nodePerformance;
                this.optimizedWritesInfo = model.optimizedWritesInfo;
                this.PGBouncerEnabled = model.PGBouncerEnabled;
                this.payType = model.payType;
                this.port = model.port;
                this.proxyType = model.proxyType;
                this.readOnlyDBInstanceIds = model.readOnlyDBInstanceIds;
                this.readOnlyStatus = model.readOnlyStatus;
                this.readonlyInstanceSQLDelayedTime = model.readonlyInstanceSQLDelayedTime;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityIPList = model.securityIPList;
                this.securityIPMode = model.securityIPMode;
                this.serverlessConfig = model.serverlessConfig;
                this.slaveZones = model.slaveZones;
                this.superPermissionMode = model.superPermissionMode;
                this.supportCompression = model.supportCompression;
                this.tempDBInstanceId = model.tempDBInstanceId;
                this.tempUpgradeTimeEnd = model.tempUpgradeTimeEnd;
                this.tempUpgradeTimeStart = model.tempUpgradeTimeStart;
                this.timeZone = model.timeZone;
                this.tips = model.tips;
                this.tipsLevel = model.tipsLevel;
                this.vSwitchId = model.vSwitchId;
                this.vectorSupportStatus = model.vectorSupportStatus;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
                this.vpcId = model.vpcId;
                this.warmStandbyInfo = model.warmStandbyInfo;
                this.zoneId = model.zoneId;
                this.kindCode = model.kindCode;
            } 

            /**
             * AccountMaxQuantity.
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * AdvancedFeatures.
             */
            public Builder advancedFeatures(String advancedFeatures) {
                this.advancedFeatures = advancedFeatures;
                return this;
            }

            /**
             * AutoUpgradeMinorVersion.
             */
            public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
                this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
                return this;
            }

            /**
             * AvailabilityValue.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * BabelfishConfig.
             */
            public Builder babelfishConfig(BabelfishConfig babelfishConfig) {
                this.babelfishConfig = babelfishConfig;
                return this;
            }

            /**
             * BlueGreenDeploymentName.
             */
            public Builder blueGreenDeploymentName(String blueGreenDeploymentName) {
                this.blueGreenDeploymentName = blueGreenDeploymentName;
                return this;
            }

            /**
             * BlueInstanceName.
             */
            public Builder blueInstanceName(String blueInstanceName) {
                this.blueInstanceName = blueInstanceName;
                return this;
            }

            /**
             * BpeEnabled.
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * BurstingEnabled.
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ColdDataEnabled.
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * Collation.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * CompressionMode.
             */
            public Builder compressionMode(String compressionMode) {
                this.compressionMode = compressionMode;
                return this;
            }

            /**
             * CompressionRatio.
             */
            public Builder compressionRatio(String compressionRatio) {
                this.compressionRatio = compressionRatio;
                return this;
            }

            /**
             * ComputeBurstEnabled.
             */
            public Builder computeBurstEnabled(Boolean computeBurstEnabled) {
                this.computeBurstEnabled = computeBurstEnabled;
                return this;
            }

            /**
             * ConnectionMode.
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * ConsoleVersion.
             */
            public Builder consoleVersion(String consoleVersion) {
                this.consoleVersion = consoleVersion;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * DBClusterNodes.
             */
            public Builder DBClusterNodes(DBClusterNodes DBClusterNodes) {
                this.DBClusterNodes = DBClusterNodes;
                return this;
            }

            /**
             * DBInstanceCPU.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceClassType.
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceDiskUsed.
             */
            public Builder DBInstanceDiskUsed(String DBInstanceDiskUsed) {
                this.DBInstanceDiskUsed = DBInstanceDiskUsed;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceMemory.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DBInstanceStorageType.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * DBInstanceType.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * DBMaxQuantity.
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * DedicatedHostGroupId.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * DisasterRecoveryInfo.
             */
            public Builder disasterRecoveryInfo(String disasterRecoveryInfo) {
                this.disasterRecoveryInfo = disasterRecoveryInfo;
                return this;
            }

            /**
             * DisasterRecoveryInstances.
             */
            public Builder disasterRecoveryInstances(String disasterRecoveryInstances) {
                this.disasterRecoveryInstances = disasterRecoveryInstances;
                return this;
            }

            /**
             * DrReplicaInfo.
             */
            public Builder drReplicaInfo(DrReplicaInfo drReplicaInfo) {
                this.drReplicaInfo = drReplicaInfo;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(Extra extra) {
                this.extra = extra;
                return this;
            }

            /**
             * GeneralGroupName.
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * GreenInstanceName.
             */
            public Builder greenInstanceName(String greenInstanceName) {
                this.greenInstanceName = greenInstanceName;
                return this;
            }

            /**
             * GuardDBInstanceId.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * IPType.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * IncrementSourceDBInstanceId.
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * InstructionSetArch.
             */
            public Builder instructionSetArch(String instructionSetArch) {
                this.instructionSetArch = instructionSetArch;
                return this;
            }

            /**
             * IoAccelerationEnabled.
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * IsAnalyticIns.
             */
            public Builder isAnalyticIns(Boolean isAnalyticIns) {
                this.isAnalyticIns = isAnalyticIns;
                return this;
            }

            /**
             * IsAnalyticReadOnlyIns.
             */
            public Builder isAnalyticReadOnlyIns(Boolean isAnalyticReadOnlyIns) {
                this.isAnalyticReadOnlyIns = isAnalyticReadOnlyIns;
                return this;
            }

            /**
             * LatestKernelVersion.
             */
            public Builder latestKernelVersion(String latestKernelVersion) {
                this.latestKernelVersion = latestKernelVersion;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * MaintainTime.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * MasterInstanceId.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * MasterZone.
             */
            public Builder masterZone(String masterZone) {
                this.masterZone = masterZone;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOMBPS.
             */
            public Builder maxIOMBPS(Integer maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * MultipleTempUpgrade.
             */
            public Builder multipleTempUpgrade(Boolean multipleTempUpgrade) {
                this.multipleTempUpgrade = multipleTempUpgrade;
                return this;
            }

            /**
             * NodePerformance.
             */
            public Builder nodePerformance(String nodePerformance) {
                this.nodePerformance = nodePerformance;
                return this;
            }

            /**
             * OptimizedWritesInfo.
             */
            public Builder optimizedWritesInfo(String optimizedWritesInfo) {
                this.optimizedWritesInfo = optimizedWritesInfo;
                return this;
            }

            /**
             * PGBouncerEnabled.
             */
            public Builder PGBouncerEnabled(String PGBouncerEnabled) {
                this.PGBouncerEnabled = PGBouncerEnabled;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(Integer proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * ReadOnlyDBInstanceIds.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * ReadOnlyStatus.
             */
            public Builder readOnlyStatus(String readOnlyStatus) {
                this.readOnlyStatus = readOnlyStatus;
                return this;
            }

            /**
             * ReadonlyInstanceSQLDelayedTime.
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SecurityIPMode.
             */
            public Builder securityIPMode(String securityIPMode) {
                this.securityIPMode = securityIPMode;
                return this;
            }

            /**
             * ServerlessConfig.
             */
            public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
                this.serverlessConfig = serverlessConfig;
                return this;
            }

            /**
             * SlaveZones.
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * SuperPermissionMode.
             */
            public Builder superPermissionMode(String superPermissionMode) {
                this.superPermissionMode = superPermissionMode;
                return this;
            }

            /**
             * SupportCompression.
             */
            public Builder supportCompression(Boolean supportCompression) {
                this.supportCompression = supportCompression;
                return this;
            }

            /**
             * TempDBInstanceId.
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
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * TipsLevel.
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VectorSupportStatus.
             */
            public Builder vectorSupportStatus(String vectorSupportStatus) {
                this.vectorSupportStatus = vectorSupportStatus;
                return this;
            }

            /**
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WarmStandbyInfo.
             */
            public Builder warmStandbyInfo(WarmStandbyInfo warmStandbyInfo) {
                this.warmStandbyInfo = warmStandbyInfo;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * kindCode.
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceAttribute")
        private java.util.List<DBInstanceAttribute> DBInstanceAttribute;

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
        public java.util.List<DBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

        public static final class Builder {
            private java.util.List<DBInstanceAttribute> DBInstanceAttribute; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstanceAttribute = model.DBInstanceAttribute;
            } 

            /**
             * DBInstanceAttribute.
             */
            public Builder DBInstanceAttribute(java.util.List<DBInstanceAttribute> DBInstanceAttribute) {
                this.DBInstanceAttribute = DBInstanceAttribute;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
