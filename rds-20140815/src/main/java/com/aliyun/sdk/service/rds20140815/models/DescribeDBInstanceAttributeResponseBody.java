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
         * <p>The details of instances.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>Indicates whether Babelfish is enabled.</p>
             * <blockquote>
             * <p> If Babelfish is enabled when you purchase an ApsaraDB RDS for PostgreSQL instance, this parameter is fixed as <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder babelfishEnabled(String babelfishEnabled) {
                this.babelfishEnabled = babelfishEnabled;
                return this;
            }

            /**
             * <p>The migration mode for Babelfish. Valid values:</p>
             * <ul>
             * <li><strong>single-db</strong></li>
             * <li><strong>multi-db</strong></li>
             * </ul>
             * <blockquote>
             * <p> For more information about migration modes for Babelfish, see <a href="https://help.aliyun.com/document_detail/428613.html">Migration modes</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>single-db</p>
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
             * <p>The node specification.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n2.medium.xc</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The node type. Default value: true. Valid values:</p>
             * <ul>
             * <li>d: dedicated node type</li>
             * <li>x: general-purpose node type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x</p>
             */
            public Builder classType(String classType) {
                this.classType = classType;
                return this;
            }

            /**
             * <p>The number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory capacity of the node. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rn-****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder nodeRegionId(String nodeRegionId) {
                this.nodeRegionId = nodeRegionId;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong></li>
             * <li><strong>secondary</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
             */
            public Builder nodeZoneId(String nodeZoneId) {
                this.nodeZoneId = nodeZoneId;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li>active</li>
             * <li>creating</li>
             * <li>deleting</li>
             * <li>classchanging</li>
             * <li>restarting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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

            /**
             * <p>The group policy of the instance account.</p>
             * <ul>
             * <li>MaximumPasswordAge: maximum use time</li>
             * <li>MinimumPasswordAge: minimum use time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MaximumPasswordAge&quot;: 42,&quot;MinimumPasswordAge&quot;: 30}</p>
             */
            public Builder accountSecurityPolicy(String accountSecurityPolicy) {
                this.accountSecurityPolicy = accountSecurityPolicy;
                return this;
            }

            /**
             * <p>The instance IDs.</p>
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * <p>The recovery model. Valid values: Simple and Full.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
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

            /**
             * <p>The read-only instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp*****</p>
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

            /**
             * <p>Indicates whether the automatic start and stop feature is enabled for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * <p>The maximum number of RCUs.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder scaleMax(Double scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum number of RDS Capacity Units (RCUs).</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder scaleMin(Double scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>Indicates whether the forced scaling feature is enabled for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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

        @com.aliyun.core.annotation.NameInMap("CompressionMode")
        private String compressionMode;

        @com.aliyun.core.annotation.NameInMap("CompressionRatio")
        private String compressionRatio;

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

        @com.aliyun.core.annotation.NameInMap("MultipleTempUpgrade")
        private Boolean multipleTempUpgrade;

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
            this.compressionMode = builder.compressionMode;
            this.compressionRatio = builder.compressionRatio;
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
            this.multipleTempUpgrade = builder.multipleTempUpgrade;
            this.optimizedWritesInfo = builder.optimizedWritesInfo;
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
            this.supportCompression = builder.supportCompression;
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
         * @return multipleTempUpgrade
         */
        public Boolean getMultipleTempUpgrade() {
            return this.multipleTempUpgrade;
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
            private String compressionMode; 
            private String compressionRatio; 
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
            private Boolean multipleTempUpgrade; 
            private String optimizedWritesInfo; 
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
            private Boolean supportCompression; 
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
             * <p>The maximum number of accounts that can be created on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * <p>The advanced features that are enabled for the instance. If multiple advanced features are enabled, the advanced features are separated by commas (,). This parameter is available only to instances that run <strong>SQL Server</strong>. Valid values:</p>
             * <ul>
             * <li><strong>LinkedServer</strong></li>
             * <li><strong>DistributeTransaction</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LinkedServer</p>
             */
            public Builder advancedFeatures(String advancedFeatures) {
                this.advancedFeatures = advancedFeatures;
                return this;
            }

            /**
             * <p>The method that is used to update the minor engine version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: automatic update.</li>
             * <li><strong>Manual</strong>: manual update. The minor engine version of the instance is forcefully updated only when the in-use minor engine version is phased out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
                this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
                return this;
            }

            /**
             * <p>The availability status of the instance in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0%</p>
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * <p>The configuration of the Babelfish feature for the ApsaraDB RDS for PostgreSQL instance.</p>
             * <blockquote>
             * <p> This parameter applies only to ApsaraDB RDS for PostgreSQL instances for which Babelfish is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/428613.html">Introduction to Babelfish</a>.</p>
             * </blockquote>
             */
            public Builder babelfishConfig(BabelfishConfig babelfishConfig) {
                this.babelfishConfig = babelfishConfig;
                return this;
            }

            /**
             * <p>A deprecated parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * <p>An invalid parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the conditions for a temporary upgrade are met.</p>
             * <blockquote>
             * <p> Pay-as-you-go instances do not support temporary upgrades.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canTempUpgrade(Boolean canTempUpgrade) {
                this.canTempUpgrade = canTempUpgrade;
                return this;
            }

            /**
             * <p>The RDS edition. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL</li>
             * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
             * <li><strong>Serverless_basic</strong>: RDS Basic Edition for serverless instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * <p>The character set collation of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Chinese_PRC_CI_AS</p>
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
             * <p>The connection mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: standard mode</li>
             * <li><strong>Safe</strong>: database proxy mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The type of the proxy that is used by the instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: shared database proxy</li>
             * <li><strong>2</strong>: dedicated database proxy</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you use the <strong>ProxyType</strong> parameter instead of this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder consoleVersion(String consoleVersion) {
                this.consoleVersion = consoleVersion;
                return this;
            }

            /**
             * <p>The creation time. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30T12:11:04Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_20181010</p>
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * <p>The information about the node in the cluster.</p>
             */
            public Builder DBClusterNodes(DBClusterNodes DBClusterNodes) {
                this.DBClusterNodes = DBClusterNodes;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mys2.small</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The instance family. Valid values:</p>
             * <ul>
             * <li><strong>s</strong>: shared instance family</li>
             * <li><strong>x</strong>: general-purpose instance family</li>
             * <li><strong>d</strong>: dedicated instance family</li>
             * <li><strong>h</strong>: dedicated host instance family</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>s</p>
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>The number of cores that are configured for the instance.</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The disk usage of the instance. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder DBInstanceDiskUsed(String DBInstanceDiskUsed) {
                this.DBInstanceDiskUsed = DBInstanceDiskUsed;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The memory capacity of the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * <p>The type of the network over which the instance is connected. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong></li>
             * <li><strong>Intranet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance statuses</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd</strong> or <strong>ephemeral_ssd</strong>: local SSD</li>
             * <li><strong>cloud_ssd</strong>: standard SSD</li>
             * <li><strong>cloud_essd</strong>: Enterprise SSD (ESSD).</li>
             * <li><strong>general_essd</strong>: general ESSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong>: primary instance</li>
             * <li><strong>Readonly</strong>: read-only instance</li>
             * <li><strong>Guard</strong>: disaster recovery instance</li>
             * <li><strong>Temp</strong>: temporary instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The maximum number of databases that can be created on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * <p>The ID of the dedicated cluster to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dhg-7a9*****</p>
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the release protection feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>Disaster Recovery Instance Information</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;replicatorAccount&quot;: &quot;<strong><strong><strong>&quot;,&quot;sourcePort&quot;:</strong></strong></strong>,&quot;sourceAddress&quot;: &quot;pgm-2ze******&quot;,&quot;sourceCategory&quot;: &quot;aliyunRDS&quot;,&quot;sourceInstanceRegionId&quot;: &quot;cn-<strong><strong><strong>&quot;,&quot;replicatorPassword&quot;: &quot;</strong></strong></strong>&quot;,&quot;sourceInstanceName&quot;: &quot;pgm-2ze******&quot;}</p>
             */
            public Builder disasterRecoveryInfo(String disasterRecoveryInfo) {
                this.disasterRecoveryInfo = disasterRecoveryInfo;
                return this;
            }

            /**
             * <p>All disaster recovery instances of the current instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;regionId&quot;:&quot;cn-<strong><strong><strong>&quot;,&quot;insName&quot;:&quot;pgm-2ze</strong></strong></strong>&quot;},{&quot;regionId&quot;:&quot;cn-<strong><strong><strong>&quot;,&quot;insName&quot;:&quot;pgm-2ze</strong></strong></strong>&quot;}]</p>
             */
            public Builder disasterRecoveryInstances(String disasterRecoveryInstances) {
                this.disasterRecoveryInstances = disasterRecoveryInstances;
                return this;
            }

            /**
             * <p>The database engine of the instance. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * <li><strong>MariaDB</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.5</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> Pay-as-you-go instances never expire.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-03-27T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The extended information about the instance.</p>
             */
            public Builder extra(Extra extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroup</p>
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * <p>The ID of the disaster recovery instance that is attached to the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsu*****</p>
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * <p>The IP address type. Only <strong>IPv4 addresses</strong> are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * <p>The ID of the instance from which incremental data comes. The incremental data of a disaster recovery instance comes from its primary instance. The incremental data of a read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****</p>
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Classic</p>
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * <p>The architecture type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>x86</strong></li>
             * <li><strong>arm</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86</p>
             */
            public Builder instructionSetArch(String instructionSetArch) {
                this.instructionSetArch = instructionSetArch;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * <p>The latest minor engine version that is supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_20201031</p>
             */
            public Builder latestKernelVersion(String latestKernelVersion) {
                this.latestKernelVersion = latestKernelVersion;
                return this;
            }

            /**
             * <p>The lock mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked due to instance restoration.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked due to exhausted storage space.</li>
             * <li><strong>LockReadInstanceByDiskQuota</strong>: The instance is a read-only instance and is automatically locked due to exhausted storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the instance was locked.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_expired</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The maintenance window of the instance. The time is displayed in UTC. The maintenance window displayed in the ApsaraDB RDS console is equal to the value of this parameter plus 8 hours.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00Z-02:00Z</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The primary instance ID.</p>
             * <blockquote>
             * <p> If this parameter is not returned, the instance is the primary instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>The zone ID of the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5454284</p>
             */
            public Builder masterZone(String masterZone) {
                this.masterZone = masterZone;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O throughput. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0MB/s</p>
             */
            public Builder maxIOMBPS(Integer maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * <p>The maximum number of I/O requests per second.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>Indicates whether auto scaling is being performed on the instance. If the value <strong>true</strong> is returned, auto scaling is being performed on the instance. If no value is returned, auto scaling is not being performed on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multipleTempUpgrade(Boolean multipleTempUpgrade) {
                this.multipleTempUpgrade = multipleTempUpgrade;
                return this;
            }

            /**
             * <p>OptimizedWritesInfo contains two fields:</p>
             * <ul>
             * <li><p>optimized_writes: Whether write optimization is enabled for the current instance.</p>
             * </li>
             * <li><p>init_optimized_writes: Whether write optimization can be enabled for the instance. Some instances do not display the write optimization switch in the console because init_optimized_writes is false.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;optimized_writes&quot;:true,&quot;init_optimized_writes&quot;:true}</p>
             */
            public Builder optimizedWritesInfo(String optimizedWritesInfo) {
                this.optimizedWritesInfo = optimizedWritesInfo;
                return this;
            }

            /**
             * <p>Indicates whether PgBouncer is enabled.</p>
             * <blockquote>
             * <p> This parameter is returned only for RDS instances that run PostgreSQL. If PgBouncer is enabled, the return value is <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder PGBouncerEnabled(String PGBouncerEnabled) {
                this.PGBouncerEnabled = PGBouncerEnabled;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * <li><strong>Prepaid</strong>: subscription</li>
             * <li><strong>SERVERLESS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port that is used to connect to the instance over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the proxy that is supported by the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The instance does not support database proxies.</li>
             * <li><strong>1</strong>: The instance supports shared proxies, with which the instance runs in multi-tenant mode.</li>
             * <li><strong>2</strong>: The instance supports dedicated proxies, with which the instance runs in single-tenant mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder proxyType(Integer proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * <p>The IDs of the read-only instances that are attached to the primary instance.</p>
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * <p>The latency at which the system replicates data to read-only instances. The system replicates data from the primary instance to the read-only instances at the latency that is specified by the <strong>ReadonlyInstanceSQLDelayedTime</strong> parameter. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
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
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The IP addresses in the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The whitelist mode. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: standard whitelist mode</li>
             * <li><strong>safety</strong>: enhanced whitelist mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder securityIPMode(String securityIPMode) {
                this.securityIPMode = securityIPMode;
                return this;
            }

            /**
             * <p>The settings of the serverless instance.</p>
             */
            public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
                this.serverlessConfig = serverlessConfig;
                return this;
            }

            /**
             * <p>The zone IDs of the secondary instances.</p>
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * <p>Indicates whether the instance supports superuser accounts, such as the system administrator (SA) account, Active Directory (AD) account, and host account. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
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
             * <p>The ID of the temporary instance that is attached to the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsu*****</p>
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * <p>The end time of the temporary upgrade of the instance.</p>
             * <blockquote>
             * <p> This parameter is unavailable for pay-as-you-go instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-05-30 00:00:00</p>
             */
            public Builder tempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
                this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
                return this;
            }

            /**
             * <p>The start time of the temporary upgrade of the instance.</p>
             * <blockquote>
             * <p> This parameter is unavailable for pay-as-you-go instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-05-29 00:00:00</p>
             */
            public Builder tempUpgradeTimeStart(String tempUpgradeTimeStart) {
                this.tempUpgradeTimeStart = tempUpgradeTimeStart;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Central Standard Time</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * <p>The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>The IP addresses in the IP address whitelist.</p>
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * <p>The severity of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The instance is normal.</li>
             * <li><strong>2</strong>: The specifications of the read-only instances do not match the specifications of the primary instance. You must adjust the specifications of these instances based on your business requirements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-*****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC. This parameter is returned only when the instance resides in a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-23rsxdf*****</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-*****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>An internal parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The architecture type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>x86</strong></li>
             * <li><strong>arm</strong></li>
             * </ul>
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
