// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * Activated.
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * Azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * CharacterType.
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
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
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * PhyInstanceName.
             */
            public Builder phyInstanceName(String phyInstanceName) {
                this.phyInstanceName = phyInstanceName;
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
             * Role.
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

            /**
             * Azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * Role.
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

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(Integer DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * Port.
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
        private java.util.List < AzoneRoleList> azoneRoleList;

        @com.aliyun.core.annotation.NameInMap("CharacterType")
        private String characterType;

        @com.aliyun.core.annotation.NameInMap("ConnectionIp")
        private java.util.List < ConnectionIp> connectionIp;

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
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.maxConnections = builder.maxConnections;
            this.maxIops = builder.maxIops;
            this.nodeClass = builder.nodeClass;
            this.phyInstanceName = builder.phyInstanceName;
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
        public java.util.List < AzoneRoleList> getAzoneRoleList() {
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
        public java.util.List < ConnectionIp> getConnectionIp() {
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
            private java.util.List < AzoneRoleList> azoneRoleList; 
            private String characterType; 
            private java.util.List < ConnectionIp> connectionIp; 
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
            private Integer lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer maxConnections; 
            private Integer maxIops; 
            private String nodeClass; 
            private String phyInstanceName; 
            private String region; 
            private String role; 
            private String status; 
            private String storageUsed; 
            private String version; 

            /**
             * Activated.
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * Azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * AzoneRoleList.
             */
            public Builder azoneRoleList(java.util.List < AzoneRoleList> azoneRoleList) {
                this.azoneRoleList = azoneRoleList;
                return this;
            }

            /**
             * CharacterType.
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * ConnectionIp.
             */
            public Builder connectionIp(java.util.List < ConnectionIp> connectionIp) {
                this.connectionIp = connectionIp;
                return this;
            }

            /**
             * DBInstanceConnType.
             */
            public Builder DBInstanceConnType(Integer DBInstanceConnType) {
                this.DBInstanceConnType = DBInstanceConnType;
                return this;
            }

            /**
             * DBInstanceCreateTime.
             */
            public Builder DBInstanceCreateTime(String DBInstanceCreateTime) {
                this.DBInstanceCreateTime = DBInstanceCreateTime;
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStatusDescription.
             */
            public Builder DBInstanceStatusDescription(String DBInstanceStatusDescription) {
                this.DBInstanceStatusDescription = DBInstanceStatusDescription;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Long diskSize) {
                this.diskSize = diskSize;
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
             * LockMode.
             */
            public Builder lockMode(Integer lockMode) {
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
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
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
             * MaxIops.
             */
            public Builder maxIops(Integer maxIops) {
                this.maxIops = maxIops;
                return this;
            }

            /**
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * PhyInstanceName.
             */
            public Builder phyInstanceName(String phyInstanceName) {
                this.phyInstanceName = phyInstanceName;
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
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageUsed.
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * Version.
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
        private java.util.List < HistoryItems> historyItems;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

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
        public java.util.List < HistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
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
            private java.util.List < HistoryItems> historyItems; 
            private java.util.List < Items> items; 
            private Integer lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 

            /**
             * DBInstanceConnType.
             */
            public Builder DBInstanceConnType(String DBInstanceConnType) {
                this.DBInstanceConnType = DBInstanceConnType;
                return this;
            }

            /**
             * DBInstanceCreateTime.
             */
            public Builder DBInstanceCreateTime(String DBInstanceCreateTime) {
                this.DBInstanceCreateTime = DBInstanceCreateTime;
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStatusDescription.
             */
            public Builder DBInstanceStatusDescription(String DBInstanceStatusDescription) {
                this.DBInstanceStatusDescription = DBInstanceStatusDescription;
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
             * HistoryItems.
             */
            public Builder historyItems(java.util.List < HistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(Integer lockMode) {
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
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
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

            /**
             * LogicInstanceTopology.
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
