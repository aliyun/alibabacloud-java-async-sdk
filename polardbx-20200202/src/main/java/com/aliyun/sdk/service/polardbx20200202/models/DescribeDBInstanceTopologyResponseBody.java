// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTopologyResponseBody</p>
 */
public class DescribeDBInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

    public static class AzoneRoleList extends TeaModel {
        @NameInMap("Azone")
        private String azone;

        @NameInMap("Role")
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
    public static class ConnectionIp extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("DBInstanceNetType")
        private Integer DBInstanceNetType;

        @NameInMap("Port")
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
    public static class Items extends TeaModel {
        @NameInMap("Activated")
        private Boolean activated;

        @NameInMap("Azone")
        private String azone;

        @NameInMap("AzoneRoleList")
        private java.util.List < AzoneRoleList> azoneRoleList;

        @NameInMap("CharacterType")
        private String characterType;

        @NameInMap("ConnectionIp")
        private java.util.List < ConnectionIp> connectionIp;

        @NameInMap("DBInstanceConnType")
        private Integer DBInstanceConnType;

        @NameInMap("DBInstanceCreateTime")
        private String DBInstanceCreateTime;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @NameInMap("DBInstanceStatusDescription")
        private String DBInstanceStatusDescription;

        @NameInMap("DiskSize")
        private Long diskSize;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("LockMode")
        private Integer lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MaxIops")
        private Integer maxIops;

        @NameInMap("Region")
        private String region;

        @NameInMap("Role")
        private String role;

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
            this.region = builder.region;
            this.role = builder.role;
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class LogicInstanceTopology extends TeaModel {
        @NameInMap("DBInstanceConnType")
        private String DBInstanceConnType;

        @NameInMap("DBInstanceCreateTime")
        private String DBInstanceCreateTime;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @NameInMap("DBInstanceStatusDescription")
        private String DBInstanceStatusDescription;

        @NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("LockMode")
        private Integer lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
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
    public static class Data extends TeaModel {
        @NameInMap("LogicInstanceTopology")
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
