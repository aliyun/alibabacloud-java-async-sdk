// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
         * <p>The queried instance.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5E6EDEB8-D73E-5F2D-B948-86C8AEB05A68</p>
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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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
        @com.aliyun.core.annotation.NameInMap("AvailabilityValue")
        private String availabilityValue;

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CoreVersion")
        private String coreVersion;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Integer cpuCores;

        @com.aliyun.core.annotation.NameInMap("CpuCoresPerNode")
        private Integer cpuCoresPerNode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCategory")
        private String DBInstanceCategory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCpuCores")
        private Integer DBInstanceCpuCores;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDiskMBPS")
        private Long DBInstanceDiskMBPS;

        @com.aliyun.core.annotation.NameInMap("DBInstanceGroupCount")
        private String DBInstanceGroupCount;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMode")
        private String DBInstanceMode;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("EncryptionKey")
        private String encryptionKey;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("HostType")
        private String hostType;

        @com.aliyun.core.annotation.NameInMap("IdleTime")
        private Integer idleTime;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("MasterCU")
        private Integer masterCU;

        @com.aliyun.core.annotation.NameInMap("MasterNodeNum")
        private Integer masterNodeNum;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MemoryPerNode")
        private Integer memoryPerNode;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Long memorySize;

        @com.aliyun.core.annotation.NameInMap("MemoryUnit")
        private String memoryUnit;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProdType")
        private String prodType;

        @com.aliyun.core.annotation.NameInMap("ReadDelayTime")
        private String readDelayTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunningTime")
        private String runningTime;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SegDiskPerformanceLevel")
        private String segDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SegNodeNum")
        private Integer segNodeNum;

        @com.aliyun.core.annotation.NameInMap("SegmentCounts")
        private Integer segmentCounts;

        @com.aliyun.core.annotation.NameInMap("ServerlessMode")
        private String serverlessMode;

        @com.aliyun.core.annotation.NameInMap("ServerlessResource")
        private Integer serverlessResource;

        @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
        private String standbyZoneId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StoragePerNode")
        private Integer storagePerNode;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUnit")
        private String storageUnit;

        @com.aliyun.core.annotation.NameInMap("SupportRestore")
        private Boolean supportRestore;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VectorConfigurationStatus")
        private String vectorConfigurationStatus;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstanceAttribute(Builder builder) {
            this.availabilityValue = builder.availabilityValue;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.coreVersion = builder.coreVersion;
            this.cpuCores = builder.cpuCores;
            this.cpuCoresPerNode = builder.cpuCoresPerNode;
            this.creationTime = builder.creationTime;
            this.DBInstanceCategory = builder.DBInstanceCategory;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceCpuCores = builder.DBInstanceCpuCores;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceDiskMBPS = builder.DBInstanceDiskMBPS;
            this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceMode = builder.DBInstanceMode;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.deployMode = builder.deployMode;
            this.encryptionKey = builder.encryptionKey;
            this.encryptionType = builder.encryptionType;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.hostType = builder.hostType;
            this.idleTime = builder.idleTime;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.masterCU = builder.masterCU;
            this.masterNodeNum = builder.masterNodeNum;
            this.maxConnections = builder.maxConnections;
            this.memoryPerNode = builder.memoryPerNode;
            this.memorySize = builder.memorySize;
            this.memoryUnit = builder.memoryUnit;
            this.minorVersion = builder.minorVersion;
            this.payType = builder.payType;
            this.port = builder.port;
            this.prodType = builder.prodType;
            this.readDelayTime = builder.readDelayTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runningTime = builder.runningTime;
            this.securityIPList = builder.securityIPList;
            this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
            this.segNodeNum = builder.segNodeNum;
            this.segmentCounts = builder.segmentCounts;
            this.serverlessMode = builder.serverlessMode;
            this.serverlessResource = builder.serverlessResource;
            this.standbyZoneId = builder.standbyZoneId;
            this.startTime = builder.startTime;
            this.storagePerNode = builder.storagePerNode;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.storageUnit = builder.storageUnit;
            this.supportRestore = builder.supportRestore;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vectorConfigurationStatus = builder.vectorConfigurationStatus;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return availabilityValue
         */
        public String getAvailabilityValue() {
            return this.availabilityValue;
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
         * @return coreVersion
         */
        public String getCoreVersion() {
            return this.coreVersion;
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cpuCoresPerNode
         */
        public Integer getCpuCoresPerNode() {
            return this.cpuCoresPerNode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBInstanceCategory
         */
        public String getDBInstanceCategory() {
            return this.DBInstanceCategory;
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
         * @return DBInstanceCpuCores
         */
        public Integer getDBInstanceCpuCores() {
            return this.DBInstanceCpuCores;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceDiskMBPS
         */
        public Long getDBInstanceDiskMBPS() {
            return this.DBInstanceDiskMBPS;
        }

        /**
         * @return DBInstanceGroupCount
         */
        public String getDBInstanceGroupCount() {
            return this.DBInstanceGroupCount;
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
         * @return DBInstanceMode
         */
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
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
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return encryptionKey
         */
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
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
         * @return hostType
         */
        public String getHostType() {
            return this.hostType;
        }

        /**
         * @return idleTime
         */
        public Integer getIdleTime() {
            return this.idleTime;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
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
         * @return masterCU
         */
        public Integer getMasterCU() {
            return this.masterCU;
        }

        /**
         * @return masterNodeNum
         */
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return memoryPerNode
         */
        public Integer getMemoryPerNode() {
            return this.memoryPerNode;
        }

        /**
         * @return memorySize
         */
        public Long getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return memoryUnit
         */
        public String getMemoryUnit() {
            return this.memoryUnit;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
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
         * @return prodType
         */
        public String getProdType() {
            return this.prodType;
        }

        /**
         * @return readDelayTime
         */
        public String getReadDelayTime() {
            return this.readDelayTime;
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
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return segDiskPerformanceLevel
         */
        public String getSegDiskPerformanceLevel() {
            return this.segDiskPerformanceLevel;
        }

        /**
         * @return segNodeNum
         */
        public Integer getSegNodeNum() {
            return this.segNodeNum;
        }

        /**
         * @return segmentCounts
         */
        public Integer getSegmentCounts() {
            return this.segmentCounts;
        }

        /**
         * @return serverlessMode
         */
        public String getServerlessMode() {
            return this.serverlessMode;
        }

        /**
         * @return serverlessResource
         */
        public Integer getServerlessResource() {
            return this.serverlessResource;
        }

        /**
         * @return standbyZoneId
         */
        public String getStandbyZoneId() {
            return this.standbyZoneId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return storagePerNode
         */
        public Integer getStoragePerNode() {
            return this.storagePerNode;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return storageUnit
         */
        public String getStorageUnit() {
            return this.storageUnit;
        }

        /**
         * @return supportRestore
         */
        public Boolean getSupportRestore() {
            return this.supportRestore;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vectorConfigurationStatus
         */
        public String getVectorConfigurationStatus() {
            return this.vectorConfigurationStatus;
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

        public static final class Builder {
            private String availabilityValue; 
            private String connectionMode; 
            private String connectionString; 
            private String coreVersion; 
            private Integer cpuCores; 
            private Integer cpuCoresPerNode; 
            private String creationTime; 
            private String DBInstanceCategory; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private Integer DBInstanceCpuCores; 
            private String DBInstanceDescription; 
            private Long DBInstanceDiskMBPS; 
            private String DBInstanceGroupCount; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceMode; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private Long DBInstanceStorage; 
            private String deployMode; 
            private String encryptionKey; 
            private String encryptionType; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String hostType; 
            private Integer idleTime; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer masterCU; 
            private Integer masterNodeNum; 
            private Integer maxConnections; 
            private Integer memoryPerNode; 
            private Long memorySize; 
            private String memoryUnit; 
            private String minorVersion; 
            private String payType; 
            private String port; 
            private String prodType; 
            private String readDelayTime; 
            private String regionId; 
            private String resourceGroupId; 
            private String runningTime; 
            private String securityIPList; 
            private String segDiskPerformanceLevel; 
            private Integer segNodeNum; 
            private Integer segmentCounts; 
            private String serverlessMode; 
            private Integer serverlessResource; 
            private String standbyZoneId; 
            private String startTime; 
            private Integer storagePerNode; 
            private Long storageSize; 
            private String storageType; 
            private String storageUnit; 
            private Boolean supportRestore; 
            private Tags tags; 
            private String vSwitchId; 
            private String vectorConfigurationStatus; 
            private String vpcId; 
            private String zoneId; 

            /**
             * <p>The service availability of the instance. Unit: %.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100.0%</p>
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * <p>The access mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Performance</strong>: standard mode.</li>
             * <li><strong>Safety</strong>: safe mode.</li>
             * <li><strong>LVS</strong>: Linux Virtual Server (LVS) mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LVS</p>
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp13ue79qk8y1****-master.gpdb.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The number of the minor version.</p>
             * 
             * <strong>example:</strong>
             * <p>mm.v6.3.10.1-202207141918</p>
             */
            public Builder coreVersion(String coreVersion) {
                this.coreVersion = coreVersion;
                return this;
            }

            /**
             * <p>The number of CPU cores per compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The number of CPU cores per node.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpuCoresPerNode(Integer cpuCoresPerNode) {
                this.cpuCoresPerNode = cpuCoresPerNode;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-11T09:16:26Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: Basic Edition.</li>
             * <li><strong>HighAvailability</strong>: High-availability Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder DBInstanceCategory(String DBInstanceCategory) {
                this.DBInstanceCategory = DBInstanceCategory;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>gpdb.group.segsdx1</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The instance family of the instance. Valid values:</p>
             * <ul>
             * <li><strong>s</strong>: shared.</li>
             * <li><strong>x</strong>: general-purpose.</li>
             * <li><strong>d</strong>: dedicated.</li>
             * <li><strong>h</strong>: dedicated host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x</p>
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBInstanceCpuCores(Integer DBInstanceCpuCores) {
                this.DBInstanceCpuCores = DBInstanceCpuCores;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp13ue79qk8y1****</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The maximum disk throughput of the compute group. Unit: Mbit/s.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder DBInstanceDiskMBPS(Long DBInstanceDiskMBPS) {
                this.DBInstanceDiskMBPS = DBInstanceDiskMBPS;
                return this;
            }

            /**
             * <p>The number of compute groups.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
                this.DBInstanceGroupCount = DBInstanceGroupCount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp13ue79qk8y1****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The memory capacity per compute node.</p>
             * <blockquote>
             * <p> The unit of this parameter is MB for instances in reserved storage mode and GB for instances in Serverless mode or elastic storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * <p>The resource type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Serverless</strong>: Serverless mode.</li>
             * <li><strong>StorageElastic</strong>: elastic storage mode.</li>
             * <li><strong>Classic</strong>: reserved storage mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StorageElastic</p>
             */
            public Builder DBInstanceMode(String DBInstanceMode) {
                this.DBInstanceMode = DBInstanceMode;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The state of the instance. For more information, see the &quot;Additional description of DBInstanceStatus&quot; section of this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The maximum storage capacity per node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The encryption key.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that have disk encryption enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0d2470df-da7b-4786-b981-************</p>
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * <p>The encryption type. Valid values:</p>
             * <ul>
             * <li><strong>CloudDisk</strong>: disk encryption.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that have disk encryption enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CloudDisk</p>
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gpdb</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The expiration time of a pay-as-you-go instance is <code>2999-09-08T16:00:00Z</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2999-09-08T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The disk type of the compute group. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: SSD.</li>
             * <li><strong>1</strong>: HDD.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * <p>The wait period for the instance that has no traffic to become idle. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in Serverless automatic scheduling mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder idleTime(Integer idleTime) {
                this.idleTime = idleTime;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong>: classic network.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * <p>The lock mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked due to instance restoration.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is a read-only instance and is automatically locked when the disk space is full.</li>
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
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The end time of the maintenance window.</p>
             * 
             * <strong>example:</strong>
             * <p>22:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The amount of coordinator node resources.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder masterCU(Integer masterCU) {
                this.masterCU = masterCU;
                return this;
            }

            /**
             * <p>The number of coordinator nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder masterNodeNum(Integer masterNodeNum) {
                this.masterNodeNum = masterNodeNum;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections to the instance.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The memory capacity per node. The unit of this parameter can be one of the valid values of <strong>MemoryUnit</strong>.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder memoryPerNode(Integer memoryPerNode) {
                this.memoryPerNode = memoryPerNode;
                return this;
            }

            /**
             * <p>The memory capacity per compute node.</p>
             * <blockquote>
             * <p> The unit of this parameter is MB for instances in reserved storage mode and GB for instances in Serverless mode or elastic storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memorySize(Long memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The unit of the memory capacity.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder memoryUnit(String memoryUnit) {
                this.memoryUnit = memoryUnit;
                return this;
            }

            /**
             * <p>The minor version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6.3.10.1-202207141918</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
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
             * <p>The port number that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ProdType.
             */
            public Builder prodType(String prodType) {
                this.prodType = prodType;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder readDelayTime(String readDelayTime) {
                this.readDelayTime = readDelayTime;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The running duration of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4 days 22:58:55</p>
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The performance level of ESSDs. Only <strong>PL1</strong> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
                this.segDiskPerformanceLevel = segDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The number of compute nodes.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in elastic storage mode or Serverless manual scheduling mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder segNodeNum(Integer segNodeNum) {
                this.segNodeNum = segNodeNum;
                return this;
            }

            /**
             * <p>The number of compute groups.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder segmentCounts(Integer segmentCounts) {
                this.segmentCounts = segmentCounts;
                return this;
            }

            /**
             * <p>The type of the Serverless mode. Valid values:</p>
             * <ul>
             * <li><strong>Manual</strong>: manual scheduling.</li>
             * <li><strong>Auto</strong>: automatic scheduling.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances in Serverless mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder serverlessMode(String serverlessMode) {
                this.serverlessMode = serverlessMode;
                return this;
            }

            /**
             * <p>The threshold of computing resources. Unit: AnalyticDB compute units (ACUs).</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in Serverless automatic scheduling mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder serverlessResource(Integer serverlessResource) {
                this.serverlessResource = serverlessResource;
                return this;
            }

            /**
             * StandbyZoneId.
             */
            public Builder standbyZoneId(String standbyZoneId) {
                this.standbyZoneId = standbyZoneId;
                return this;
            }

            /**
             * <p>The time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-11T09:26:43Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The storage capacity per node. The unit of this parameter can be one of the valid values of <strong>StorageUnit</strong>.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder storagePerNode(Integer storagePerNode) {
                this.storagePerNode = storagePerNode;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD).</li>
             * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The unit of the storage capacity. Valid values:</p>
             * <ul>
             * <li><strong>GB SSD</strong></li>
             * <li><strong>TB SSD</strong></li>
             * <li><strong>GB HDD</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances in reserved storage mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GB SSD</p>
             */
            public Builder storageUnit(String storageUnit) {
                this.storageUnit = storageUnit;
                return this;
            }

            /**
             * <p>Indicates whether the instance supports backup and restoration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportRestore(Boolean supportRestore) {
                this.supportRestore = supportRestore;
                return this;
            }

            /**
             * <p>The tags that are added to the instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1cpq8mr64paltkb****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>Indicates whether vector search engine optimization is enabled. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong></li>
             * <li><strong>disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder vectorConfigurationStatus(String vectorConfigurationStatus) {
                this.vectorConfigurationStatus = vectorConfigurationStatus;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19ame5m1r3oejns****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
