// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTopologyResponseBody</p>
 */
public class DescribeDBInstanceTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceTopologyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTopologyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceTopologyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceTopologyResponseBody build() {
            return new DescribeDBInstanceTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class HistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activated")
        private Boolean activated;

        @com.aliyun.core.annotation.NameInMap("Azone")
        private String azone;

        @com.aliyun.core.annotation.NameInMap("CharacterType")
        private String characterType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("PhyInstanceName")
        private String phyInstanceName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private HistoryItems(Builder builder) {
            this.activated = builder.activated;
            this.azone = builder.azone;
            this.characterType = builder.characterType;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceName = builder.DBInstanceName;
            this.phyInstanceName = builder.phyInstanceName;
            this.region = builder.region;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryItems create() {
            return builder().build();
        }

        /**
         * @return activated
         */
        public Boolean getActivated() {
            return this.activated;
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return characterType
         */
        public String getCharacterType() {
            return this.characterType;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return phyInstanceName
         */
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private Boolean activated; 
            private String azone; 
            private String characterType; 
            private String DBInstanceId; 
            private String DBInstanceName; 
            private String phyInstanceName; 
            private String region; 
            private String role; 

            private Builder() {
            } 

            private Builder(HistoryItems model) {
                this.activated = model.activated;
                this.azone = model.azone;
                this.characterType = model.characterType;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceName = model.DBInstanceName;
                this.phyInstanceName = model.phyInstanceName;
                this.region = model.region;
                this.role = model.role;
            } 

            /**
             * <p>Indicates whether the node is enabled. In the compute layer, only the nodes in the primary zone are enabled. After a primary/secondary switchover is performed on the instance, the secondary nodes in the compute layer are switched to primary nodes. All nodes in the storage layer are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * <p>The zone to which the node belongs. If the node is an ApsaraDB RDS node, the zones of multiple child nodes are separated by semicolons (;).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * <p>The node attribute. Valid values:</p>
             * <ul>
             * <li><strong>polarx_cn</strong>: Compute node.</li>
             * <li><strong>polarx_store</strong>: Data node.</li>
             * <li><strong>polarx_gms</strong>: GMS node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Node role</p>
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>304726049</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sprcym7g7w****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The name of the physical instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-unrbk8oyz**********</p>
             */
            public Builder phyInstanceName(String phyInstanceName) {
                this.phyInstanceName = phyInstanceName;
                return this;
            }

            /**
             * <p>The region to which the node belongs. If the node is an ApsaraDB RDS node, the regions of multiple child nodes are separated by semicolons (;).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The node role. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: Primary node.</li>
             * <li><strong>standby</strong>: Secondary node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public HistoryItems build() {
                return new HistoryItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class AzoneRoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Azone")
        private String azone;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private AzoneRoleList(Builder builder) {
            this.azone = builder.azone;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AzoneRoleList create() {
            return builder().build();
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String azone; 
            private String role; 

            private Builder() {
            } 

            private Builder(AzoneRoleList model) {
                this.azone = model.azone;
                this.role = model.role;
            } 

            /**
             * <p>The zone to which a specific node in the three-node ApsaraDB RDS deployment belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * <p>The role of a specific node in the three-node ApsaraDB RDS deployment. Valid values:</p>
             * <ul>
             * <li><strong>leader</strong>: Primary node.</li>
             * <li><strong>follower</strong>: Secondary node.</li>
             * <li><strong>logger</strong>: Logger node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>leader</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public AzoneRoleList build() {
                return new AzoneRoleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class ConnectionIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private Integer DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private ConnectionIp(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionIp create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return DBInstanceNetType
         */
        public Integer getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private Integer DBInstanceNetType; 
            private String port; 

            private Builder() {
            } 

            private Builder(ConnectionIp model) {
                this.connectionString = model.connectionString;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.port = model.port;
            } 

            /**
             * <p>The connection information.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xdb-m-pxcdym7g7w********.mysql.singapore.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The internal connection type. The value is fixed to 1, which indicates the classic network.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceNetType(Integer DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public ConnectionIp build() {
                return new ConnectionIp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activated")
        private Boolean activated;

        @com.aliyun.core.annotation.NameInMap("Azone")
        private String azone;

        @com.aliyun.core.annotation.NameInMap("AzoneRoleList")
        private java.util.List<AzoneRoleList> azoneRoleList;

        @com.aliyun.core.annotation.NameInMap("CharacterType")
        private String characterType;

        @com.aliyun.core.annotation.NameInMap("ConnectionIp")
        private java.util.List<ConnectionIp> connectionIp;

        @com.aliyun.core.annotation.NameInMap("DBInstanceConnType")
        private Integer DBInstanceConnType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCreateTime")
        private String DBInstanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatusDescription")
        private String DBInstanceStatusDescription;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Long diskSize;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterName")
        private String instanceClusterName;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private Integer lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIops")
        private Integer maxIops;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("PhyInstanceName")
        private String phyInstanceName;

        @com.aliyun.core.annotation.NameInMap("ReadType")
        private String readType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private String storageUsed;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Items(Builder builder) {
            this.activated = builder.activated;
            this.azone = builder.azone;
            this.azoneRoleList = builder.azoneRoleList;
            this.characterType = builder.characterType;
            this.connectionIp = builder.connectionIp;
            this.DBInstanceConnType = builder.DBInstanceConnType;
            this.DBInstanceCreateTime = builder.DBInstanceCreateTime;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStatusDescription = builder.DBInstanceStatusDescription;
            this.diskSize = builder.diskSize;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceClusterName = builder.instanceClusterName;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.maxConnections = builder.maxConnections;
            this.maxIops = builder.maxIops;
            this.nodeClass = builder.nodeClass;
            this.phyInstanceName = builder.phyInstanceName;
            this.readType = builder.readType;
            this.region = builder.region;
            this.role = builder.role;
            this.status = builder.status;
            this.storageUsed = builder.storageUsed;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return activated
         */
        public Boolean getActivated() {
            return this.activated;
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return azoneRoleList
         */
        public java.util.List<AzoneRoleList> getAzoneRoleList() {
            return this.azoneRoleList;
        }

        /**
         * @return characterType
         */
        public String getCharacterType() {
            return this.characterType;
        }

        /**
         * @return connectionIp
         */
        public java.util.List<ConnectionIp> getConnectionIp() {
            return this.connectionIp;
        }

        /**
         * @return DBInstanceConnType
         */
        public Integer getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        /**
         * @return DBInstanceCreateTime
         */
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBInstanceStatus
         */
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStatusDescription
         */
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        /**
         * @return diskSize
         */
        public Long getDiskSize() {
            return this.diskSize;
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
         * @return instanceClusterName
         */
        public String getInstanceClusterName() {
            return this.instanceClusterName;
        }

        /**
         * @return lockMode
         */
        public Integer getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIops
         */
        public Integer getMaxIops() {
            return this.maxIops;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return phyInstanceName
         */
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        /**
         * @return readType
         */
        public String getReadType() {
            return this.readType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageUsed
         */
        public String getStorageUsed() {
            return this.storageUsed;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean activated; 
            private String azone; 
            private java.util.List<AzoneRoleList> azoneRoleList; 
            private String characterType; 
            private java.util.List<ConnectionIp> connectionIp; 
            private Integer DBInstanceConnType; 
            private String DBInstanceCreateTime; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceName; 
            private Integer DBInstanceStatus; 
            private String DBInstanceStatusDescription; 
            private Long diskSize; 
            private String engine; 
            private String engineVersion; 
            private String instanceClusterName; 
            private Integer lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer maxConnections; 
            private Integer maxIops; 
            private String nodeClass; 
            private String phyInstanceName; 
            private String readType; 
            private String region; 
            private String role; 
            private String status; 
            private String storageUsed; 
            private String version; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.activated = model.activated;
                this.azone = model.azone;
                this.azoneRoleList = model.azoneRoleList;
                this.characterType = model.characterType;
                this.connectionIp = model.connectionIp;
                this.DBInstanceConnType = model.DBInstanceConnType;
                this.DBInstanceCreateTime = model.DBInstanceCreateTime;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceName = model.DBInstanceName;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStatusDescription = model.DBInstanceStatusDescription;
                this.diskSize = model.diskSize;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.instanceClusterName = model.instanceClusterName;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.maxConnections = model.maxConnections;
                this.maxIops = model.maxIops;
                this.nodeClass = model.nodeClass;
                this.phyInstanceName = model.phyInstanceName;
                this.readType = model.readType;
                this.region = model.region;
                this.role = model.role;
                this.status = model.status;
                this.storageUsed = model.storageUsed;
                this.version = model.version;
            } 

            /**
             * <p>Indicates whether the node is enabled. In the compute layer, only the nodes in the primary zone are enabled. After a primary/secondary switchover is performed on the instance, the secondary nodes in the compute layer are switched to primary nodes. All nodes in the storage layer are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * <p>The zone to which the node belongs. If the node is an ApsaraDB RDS node, the zones of multiple child nodes are separated by semicolons (;).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * <p>The list of data information for the three-node ApsaraDB RDS deployment.</p>
             */
            public Builder azoneRoleList(java.util.List<AzoneRoleList> azoneRoleList) {
                this.azoneRoleList = azoneRoleList;
                return this;
            }

            /**
             * <p>The node attribute. Valid values:</p>
             * <ul>
             * <li><strong>polarx_cn</strong>: Compute node.</li>
             * <li><strong>polarx_store</strong>: Data node.</li>
             * <li><strong>polarx_gms</strong>: GMS node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Node role</p>
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * <p>The data structure.</p>
             */
            public Builder connectionIp(java.util.List<ConnectionIp> connectionIp) {
                this.connectionIp = connectionIp;
                return this;
            }

            /**
             * <p>The connection type.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder DBInstanceConnType(Integer DBInstanceConnType) {
                this.DBInstanceConnType = DBInstanceConnType;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-21T10:30:45Z</p>
             */
            public Builder DBInstanceCreateTime(String DBInstanceCreateTime) {
                this.DBInstanceCreateTime = DBInstanceCreateTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>304726049</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-i-tk6t4z****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The instance status description.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder DBInstanceStatusDescription(String DBInstanceStatusDescription) {
                this.DBInstanceStatusDescription = DBInstanceStatusDescription;
                return this;
            }

            /**
             * <p>The disk size.</p>
             * 
             * <strong>example:</strong>
             * <p>3145728</p>
             */
            public Builder diskSize(Long diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The DPI engine version. Valid values:</p>
             * <ul>
             * <li><strong>mysql</strong></li>
             * <li><strong>polarx_cdc</strong></li>
             * <li><strong>polarx_dn</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The DPI engine version. Default value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The name of the CN cluster for the instance, such as default.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder instanceClusterName(String instanceClusterName) {
                this.instanceClusterName = instanceClusterName;
                return this;
            }

            /**
             * <p>The lock status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Unlocked.</li>
             * <li><strong>1</strong>: Locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockMode(Integer lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The lock reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The end time of the O&amp;M window.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the O&amp;M window.</p>
             * 
             * <strong>example:</strong>
             * <p>Not displayed</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>7000</p>
             */
            public Builder maxIops(Integer maxIops) {
                this.maxIops = maxIops;
                return this;
            }

            /**
             * <p>The node specifications. Valid values:</p>
             * <ul>
             * <li><strong>polarx.x4.medium.2e</strong>: 2 vCPUs and 8 GB of memory.</li>
             * <li><strong>polarx.x4.large.2e</strong>: 4 vCPUs and 16 GB of memory.</li>
             * <li><strong>polarx.x8.large.2e</strong>: 4 vCPUs and 32 GB of memory.</li>
             * <li><strong>polarx.x4.xlarge.2e</strong>: 8 vCPUs and 32 GB of memory.</li>
             * <li><strong>polarx.x8.xlarge.2e</strong>: 8 vCPUs and 64 GB of memory.</li>
             * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 vCPUs and 64 GB of memory.</li>
             * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 vCPUs and 128 GB of memory.</li>
             * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 vCPUs and 128 GB of memory.</li>
             * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 vCPUs and 256 GB of memory.</li>
             * <li><strong>polarx.st.8xlarge.2e</strong>: 60 vCPUs and 470 GB of memory.</li>
             * <li><strong>polarx.st.12xlarge.2e</strong>: 90 vCPUs and 720 GB of memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.large.2e</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The name of the physical instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-unrbk8oyz**********</p>
             */
            public Builder phyInstanceName(String phyInstanceName) {
                this.phyInstanceName = phyInstanceName;
                return this;
            }

            /**
             * <p>The read/write type, such as ReadWrite.</p>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder readType(String readType) {
                this.readType = readType;
                return this;
            }

            /**
             * <p>The region to which the node belongs. If the node is an ApsaraDB RDS node, the regions of multiple child nodes are separated by semicolons (;).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The node role. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: Primary node.</li>
             * <li><strong>standby</strong>: Secondary node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Running.</li>
             * <li><strong>1</strong>: Creating.</li>
             * <li><strong>2</strong>: Abnormal.</li>
             * <li><strong>3</strong>: Expired.</li>
             * <li><strong>4</strong>: Releasing.</li>
             * <li><strong>5</strong>: Released.</li>
             * <li><strong>6</strong>: Locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The amount of used storage space. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>16681</p>
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>The version of the logger node.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-cdc-kernel-2.0.0-3985896</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class LogicInstanceTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceConnType")
        private String DBInstanceConnType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCreateTime")
        private String DBInstanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatusDescription")
        private String DBInstanceStatusDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List<HistoryItems> historyItems;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private Integer lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        private LogicInstanceTopology(Builder builder) {
            this.DBInstanceConnType = builder.DBInstanceConnType;
            this.DBInstanceCreateTime = builder.DBInstanceCreateTime;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStatusDescription = builder.DBInstanceStatusDescription;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.historyItems = builder.historyItems;
            this.items = builder.items;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicInstanceTopology create() {
            return builder().build();
        }

        /**
         * @return DBInstanceConnType
         */
        public String getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        /**
         * @return DBInstanceCreateTime
         */
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBInstanceStatus
         */
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStatusDescription
         */
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        /**
         * @return DBInstanceStorage
         */
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
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
         * @return historyItems
         */
        public java.util.List<HistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return lockMode
         */
        public Integer getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public static final class Builder {
            private String DBInstanceConnType; 
            private String DBInstanceCreateTime; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceName; 
            private Integer DBInstanceStatus; 
            private String DBInstanceStatusDescription; 
            private Integer DBInstanceStorage; 
            private String engine; 
            private String engineVersion; 
            private java.util.List<HistoryItems> historyItems; 
            private java.util.List<Items> items; 
            private Integer lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 

            private Builder() {
            } 

            private Builder(LogicInstanceTopology model) {
                this.DBInstanceConnType = model.DBInstanceConnType;
                this.DBInstanceCreateTime = model.DBInstanceCreateTime;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceName = model.DBInstanceName;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStatusDescription = model.DBInstanceStatusDescription;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.historyItems = model.historyItems;
                this.items = model.items;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
            } 

            /**
             * <p>Indicates that LVS is used for load balancing.</p>
             * 
             * <strong>example:</strong>
             * <p>lvs</p>
             */
            public Builder DBInstanceConnType(String DBInstanceConnType) {
                this.DBInstanceConnType = DBInstanceConnType;
                return this;
            }

            /**
             * <p>The time when the instance was created. The format is yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-21T10:30:45Z 04:00:00</p>
             */
            public Builder DBInstanceCreateTime(String DBInstanceCreateTime) {
                this.DBInstanceCreateTime = DBInstanceCreateTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sprcym7******</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>304726047</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sprcym7g7w****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The instance status description.</p>
             * 
             * <strong>example:</strong>
             * <p>TDE_MODIFYING</p>
             */
            public Builder DBInstanceStatusDescription(String DBInstanceStatusDescription) {
                this.DBInstanceStatusDescription = DBInstanceStatusDescription;
                return this;
            }

            /**
             * <p>The number of storage nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The engine. Default value: polarx.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The DPI engine version. Default value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The list of historical nodes.</p>
             */
            public Builder historyItems(java.util.List<HistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            /**
             * <p>The list of nodes.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The lock status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Unlocked.</li>
             * <li><strong>1</strong>: Locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockMode(Integer lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The lock reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Overdue payment</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The end time of the O&amp;M window. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>05:00:00</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the O&amp;M window. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>04:00:00</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            public LogicInstanceTopology build() {
                return new LogicInstanceTopology(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTopologyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicInstanceTopology")
        private LogicInstanceTopology logicInstanceTopology;

        private Data(Builder builder) {
            this.logicInstanceTopology = builder.logicInstanceTopology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logicInstanceTopology
         */
        public LogicInstanceTopology getLogicInstanceTopology() {
            return this.logicInstanceTopology;
        }

        public static final class Builder {
            private LogicInstanceTopology logicInstanceTopology; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.logicInstanceTopology = model.logicInstanceTopology;
            } 

            /**
             * <p>The topology information.</p>
             */
            public Builder logicInstanceTopology(LogicInstanceTopology logicInstanceTopology) {
                this.logicInstanceTopology = logicInstanceTopology;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
