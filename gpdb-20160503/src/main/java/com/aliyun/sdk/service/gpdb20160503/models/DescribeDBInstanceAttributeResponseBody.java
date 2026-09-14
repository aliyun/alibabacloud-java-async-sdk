// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
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

        @com.aliyun.core.annotation.NameInMap("CacheStorageSize")
        private String cacheStorageSize;

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

        @com.aliyun.core.annotation.NameInMap("GraphEngineStatus")
        private String graphEngineStatus;

        @com.aliyun.core.annotation.NameInMap("HostType")
        private String hostType;

        @com.aliyun.core.annotation.NameInMap("IdleTime")
        private Integer idleTime;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("MasterAISpec")
        private String masterAISpec;

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

        @com.aliyun.core.annotation.NameInMap("SegmentAISpec")
        private String segmentAISpec;

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
            this.cacheStorageSize = builder.cacheStorageSize;
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
            this.graphEngineStatus = builder.graphEngineStatus;
            this.hostType = builder.hostType;
            this.idleTime = builder.idleTime;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instanceSpec = builder.instanceSpec;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.masterAISpec = builder.masterAISpec;
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
            this.segmentAISpec = builder.segmentAISpec;
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
         * @return cacheStorageSize
         */
        public String getCacheStorageSize() {
            return this.cacheStorageSize;
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
         * @return graphEngineStatus
         */
        public String getGraphEngineStatus() {
            return this.graphEngineStatus;
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
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
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
         * @return masterAISpec
         */
        public String getMasterAISpec() {
            return this.masterAISpec;
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
         * @return segmentAISpec
         */
        public String getSegmentAISpec() {
            return this.segmentAISpec;
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
            private String cacheStorageSize; 
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
            private String graphEngineStatus; 
            private String hostType; 
            private Integer idleTime; 
            private String instanceNetworkType; 
            private String instanceSpec; 
            private String lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String masterAISpec; 
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
            private String segmentAISpec; 
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

            private Builder() {
            } 

            private Builder(DBInstanceAttribute model) {
                this.availabilityValue = model.availabilityValue;
                this.cacheStorageSize = model.cacheStorageSize;
                this.connectionMode = model.connectionMode;
                this.connectionString = model.connectionString;
                this.coreVersion = model.coreVersion;
                this.cpuCores = model.cpuCores;
                this.cpuCoresPerNode = model.cpuCoresPerNode;
                this.creationTime = model.creationTime;
                this.DBInstanceCategory = model.DBInstanceCategory;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceClassType = model.DBInstanceClassType;
                this.DBInstanceCpuCores = model.DBInstanceCpuCores;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceDiskMBPS = model.DBInstanceDiskMBPS;
                this.DBInstanceGroupCount = model.DBInstanceGroupCount;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceMemory = model.DBInstanceMemory;
                this.DBInstanceMode = model.DBInstanceMode;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.deployMode = model.deployMode;
                this.encryptionKey = model.encryptionKey;
                this.encryptionType = model.encryptionType;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.graphEngineStatus = model.graphEngineStatus;
                this.hostType = model.hostType;
                this.idleTime = model.idleTime;
                this.instanceNetworkType = model.instanceNetworkType;
                this.instanceSpec = model.instanceSpec;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.masterAISpec = model.masterAISpec;
                this.masterCU = model.masterCU;
                this.masterNodeNum = model.masterNodeNum;
                this.maxConnections = model.maxConnections;
                this.memoryPerNode = model.memoryPerNode;
                this.memorySize = model.memorySize;
                this.memoryUnit = model.memoryUnit;
                this.minorVersion = model.minorVersion;
                this.payType = model.payType;
                this.port = model.port;
                this.prodType = model.prodType;
                this.readDelayTime = model.readDelayTime;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runningTime = model.runningTime;
                this.securityIPList = model.securityIPList;
                this.segDiskPerformanceLevel = model.segDiskPerformanceLevel;
                this.segNodeNum = model.segNodeNum;
                this.segmentAISpec = model.segmentAISpec;
                this.segmentCounts = model.segmentCounts;
                this.serverlessMode = model.serverlessMode;
                this.serverlessResource = model.serverlessResource;
                this.standbyZoneId = model.standbyZoneId;
                this.startTime = model.startTime;
                this.storagePerNode = model.storagePerNode;
                this.storageSize = model.storageSize;
                this.storageType = model.storageType;
                this.storageUnit = model.storageUnit;
                this.supportRestore = model.supportRestore;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vectorConfigurationStatus = model.vectorConfigurationStatus;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AvailabilityValue.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * CacheStorageSize.
             */
            public Builder cacheStorageSize(String cacheStorageSize) {
                this.cacheStorageSize = cacheStorageSize;
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
             * CoreVersion.
             */
            public Builder coreVersion(String coreVersion) {
                this.coreVersion = coreVersion;
                return this;
            }

            /**
             * CpuCores.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * CpuCoresPerNode.
             */
            public Builder cpuCoresPerNode(Integer cpuCoresPerNode) {
                this.cpuCoresPerNode = cpuCoresPerNode;
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
             * DBInstanceCategory.
             */
            public Builder DBInstanceCategory(String DBInstanceCategory) {
                this.DBInstanceCategory = DBInstanceCategory;
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
             * DBInstanceCpuCores.
             */
            public Builder DBInstanceCpuCores(Integer DBInstanceCpuCores) {
                this.DBInstanceCpuCores = DBInstanceCpuCores;
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
             * DBInstanceDiskMBPS.
             */
            public Builder DBInstanceDiskMBPS(Long DBInstanceDiskMBPS) {
                this.DBInstanceDiskMBPS = DBInstanceDiskMBPS;
                return this;
            }

            /**
             * DBInstanceGroupCount.
             */
            public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
                this.DBInstanceGroupCount = DBInstanceGroupCount;
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
             * DBInstanceMode.
             */
            public Builder DBInstanceMode(String DBInstanceMode) {
                this.DBInstanceMode = DBInstanceMode;
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
             * EncryptionKey.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
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
             * GraphEngineStatus.
             */
            public Builder graphEngineStatus(String graphEngineStatus) {
                this.graphEngineStatus = graphEngineStatus;
                return this;
            }

            /**
             * HostType.
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * IdleTime.
             */
            public Builder idleTime(Integer idleTime) {
                this.idleTime = idleTime;
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
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
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
             * MasterAISpec.
             */
            public Builder masterAISpec(String masterAISpec) {
                this.masterAISpec = masterAISpec;
                return this;
            }

            /**
             * MasterCU.
             */
            public Builder masterCU(Integer masterCU) {
                this.masterCU = masterCU;
                return this;
            }

            /**
             * MasterNodeNum.
             */
            public Builder masterNodeNum(Integer masterNodeNum) {
                this.masterNodeNum = masterNodeNum;
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
             * MemoryPerNode.
             */
            public Builder memoryPerNode(Integer memoryPerNode) {
                this.memoryPerNode = memoryPerNode;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Long memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * MemoryUnit.
             */
            public Builder memoryUnit(String memoryUnit) {
                this.memoryUnit = memoryUnit;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
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
             * ProdType.
             */
            public Builder prodType(String prodType) {
                this.prodType = prodType;
                return this;
            }

            /**
             * ReadDelayTime.
             */
            public Builder readDelayTime(String readDelayTime) {
                this.readDelayTime = readDelayTime;
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
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
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
             * SegDiskPerformanceLevel.
             */
            public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
                this.segDiskPerformanceLevel = segDiskPerformanceLevel;
                return this;
            }

            /**
             * SegNodeNum.
             */
            public Builder segNodeNum(Integer segNodeNum) {
                this.segNodeNum = segNodeNum;
                return this;
            }

            /**
             * SegmentAISpec.
             */
            public Builder segmentAISpec(String segmentAISpec) {
                this.segmentAISpec = segmentAISpec;
                return this;
            }

            /**
             * SegmentCounts.
             */
            public Builder segmentCounts(Integer segmentCounts) {
                this.segmentCounts = segmentCounts;
                return this;
            }

            /**
             * ServerlessMode.
             */
            public Builder serverlessMode(String serverlessMode) {
                this.serverlessMode = serverlessMode;
                return this;
            }

            /**
             * ServerlessResource.
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StoragePerNode.
             */
            public Builder storagePerNode(Integer storagePerNode) {
                this.storagePerNode = storagePerNode;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * StorageUnit.
             */
            public Builder storageUnit(String storageUnit) {
                this.storageUnit = storageUnit;
                return this;
            }

            /**
             * SupportRestore.
             */
            public Builder supportRestore(Boolean supportRestore) {
                this.supportRestore = supportRestore;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * VectorConfigurationStatus.
             */
            public Builder vectorConfigurationStatus(String vectorConfigurationStatus) {
                this.vectorConfigurationStatus = vectorConfigurationStatus;
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
             * ZoneId.
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
