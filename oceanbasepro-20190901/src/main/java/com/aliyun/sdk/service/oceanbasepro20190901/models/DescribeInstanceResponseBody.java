// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * The information of the OceanBase cluster.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class Cpu extends TeaModel {
        @NameInMap("TotalCpu")
        private Long totalCpu;

        @NameInMap("UnitCpu")
        private Long unitCpu;

        @NameInMap("UsedCpu")
        private Long usedCpu;

        private Cpu(Builder builder) {
            this.totalCpu = builder.totalCpu;
            this.unitCpu = builder.unitCpu;
            this.usedCpu = builder.usedCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cpu create() {
            return builder().build();
        }

        /**
         * @return totalCpu
         */
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return unitCpu
         */
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return usedCpu
         */
        public Long getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Long totalCpu; 
            private Long unitCpu; 
            private Long usedCpu; 

            /**
             * The total number of CPU cores of the cluster.
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * The number of CPU cores of each replica node in the cluster.
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * The number of CPU cores used in the cluster.
             */
            public Builder usedCpu(Long usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    public static class DiskSize extends TeaModel {
        @NameInMap("DataUsedSize")
        private Double dataUsedSize;

        @NameInMap("MaxDiskUsedObServer")
        private java.util.List < String > maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.dataUsedSize = builder.dataUsedSize;
            this.maxDiskUsedObServer = builder.maxDiskUsedObServer;
            this.maxDiskUsedPercent = builder.maxDiskUsedPercent;
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskSize create() {
            return builder().build();
        }

        /**
         * @return dataUsedSize
         */
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        /**
         * @return maxDiskUsedObServer
         */
        public java.util.List < String > getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        /**
         * @return maxDiskUsedPercent
         */
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
        }

        /**
         * @return totalDiskSize
         */
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        /**
         * @return unitDiskSize
         */
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        /**
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Double dataUsedSize; 
            private java.util.List < String > maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * The size of the data disk, in GB.
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * The server with the highest disk usage.
             */
            public Builder maxDiskUsedObServer(java.util.List < String > maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * The maximum disk usage, in percentage.
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

            /**
             * The total storage space of the cluster, in GB.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * The storage space of each replica node in the cluster, in GB.
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            /**
             * The size of used storage space of the cluster, in GB.
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public DiskSize build() {
                return new DiskSize(this);
            } 

        } 

    }
    public static class LogDiskSize extends TeaModel {
        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        private LogDiskSize(Builder builder) {
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDiskSize create() {
            return builder().build();
        }

        /**
         * @return totalDiskSize
         */
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        /**
         * @return unitDiskSize
         */
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        public static final class Builder {
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * The total log disk space of the cluster, in GB.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * The log disk space of each replica node in the cluster. Unit: GB.
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            public LogDiskSize build() {
                return new LogDiskSize(this);
            } 

        } 

    }
    public static class Memory extends TeaModel {
        @NameInMap("TotalMemory")
        private Long totalMemory;

        @NameInMap("UnitMemory")
        private Long unitMemory;

        @NameInMap("UsedMemory")
        private Long usedMemory;

        private Memory(Builder builder) {
            this.totalMemory = builder.totalMemory;
            this.unitMemory = builder.unitMemory;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return totalMemory
         */
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return unitMemory
         */
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        /**
         * @return usedMemory
         */
        public Long getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private Long totalMemory; 
            private Long unitMemory; 
            private Long usedMemory; 

            /**
             * The total memory size of the cluster, in GB.
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The memory size of each replica node in the cluster, in GB.
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * The size of used memory in the cluster, in GB.
             */
            public Builder usedMemory(Long usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("LogDiskSize")
        private LogDiskSize logDiskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.logDiskSize = builder.logDiskSize;
            this.memory = builder.memory;
            this.unitCount = builder.unitCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Cpu getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public DiskSize getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return logDiskSize
         */
        public LogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return unitCount
         */
        public Long getUnitCount() {
            return this.unitCount;
        }

        public static final class Builder {
            private Cpu cpu; 
            private DiskSize diskSize; 
            private LogDiskSize logDiskSize; 
            private Memory memory; 
            private Long unitCount; 

            /**
             * The information about the CPU resources of the cluster.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The information about the storage resources of the cluster.
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The information about the log disk space of the cluster.
             */
            public Builder logDiskSize(LogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * The information about the memory resources of the cluster.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The number of resource units in the cluster.
             */
            public Builder unitCount(Long unitCount) {
                this.unitCount = unitCount;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("AutoUpgradeObVersion")
        private Boolean autoUpgradeObVersion;

        @NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataMergeTime")
        private String dataMergeTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableUpgradeLogDisk")
        private Boolean enableUpgradeLogDisk;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRole")
        private String instanceRole;

        @NameInMap("IsLatestObVersion")
        private Boolean isLatestObVersion;

        @NameInMap("IsTrustEcs")
        private Boolean isTrustEcs;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("NodeNum")
        private String nodeNum;

        @NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("Series")
        private String series;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
        private String version;

        @NameInMap("Zones")
        private java.util.List < String > zones;

        private Instance(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.autoUpgradeObVersion = builder.autoUpgradeObVersion;
            this.availableZones = builder.availableZones;
            this.createTime = builder.createTime;
            this.dataMergeTime = builder.dataMergeTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskType = builder.diskType;
            this.enableUpgradeLogDisk = builder.enableUpgradeLogDisk;
            this.expireTime = builder.expireTime;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRole = builder.instanceRole;
            this.isLatestObVersion = builder.isLatestObVersion;
            this.isTrustEcs = builder.isTrustEcs;
            this.maintainTime = builder.maintainTime;
            this.nodeNum = builder.nodeNum;
            this.obRpmVersion = builder.obRpmVersion;
            this.payType = builder.payType;
            this.resource = builder.resource;
            this.series = builder.series;
            this.status = builder.status;
            this.version = builder.version;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return autoUpgradeObVersion
         */
        public Boolean getAutoUpgradeObVersion() {
            return this.autoUpgradeObVersion;
        }

        /**
         * @return availableZones
         */
        public java.util.List < String > getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataMergeTime
         */
        public String getDataMergeTime() {
            return this.dataMergeTime;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enableUpgradeLogDisk
         */
        public Boolean getEnableUpgradeLogDisk() {
            return this.enableUpgradeLogDisk;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRole
         */
        public String getInstanceRole() {
            return this.instanceRole;
        }

        /**
         * @return isLatestObVersion
         */
        public Boolean getIsLatestObVersion() {
            return this.isLatestObVersion;
        }

        /**
         * @return isTrustEcs
         */
        public Boolean getIsTrustEcs() {
            return this.isTrustEcs;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return nodeNum
         */
        public String getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return obRpmVersion
         */
        public String getObRpmVersion() {
            return this.obRpmVersion;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zones
         */
        public java.util.List < String > getZones() {
            return this.zones;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private Boolean autoUpgradeObVersion; 
            private java.util.List < String > availableZones; 
            private String createTime; 
            private String dataMergeTime; 
            private String deployMode; 
            private String deployType; 
            private String diskType; 
            private Boolean enableUpgradeLogDisk; 
            private String expireTime; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRole; 
            private Boolean isLatestObVersion; 
            private Boolean isTrustEcs; 
            private String maintainTime; 
            private String nodeNum; 
            private String obRpmVersion; 
            private String payType; 
            private Resource resource; 
            private String series; 
            private String status; 
            private String version; 
            private java.util.List < String > zones; 

            /**
             * Indicates whether automatic renewal is enabled. 
             * <p>
             * 
             * This parameter is valid only for clusters whose billing methods are set to PREPAY.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * Indicates whether automatic upgrade of the OBServer version is enabled.
             */
            public Builder autoUpgradeObVersion(Boolean autoUpgradeObVersion) {
                this.autoUpgradeObVersion = autoUpgradeObVersion;
                return this;
            }

            /**
             * The list of zones.
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * The time in UTC when the cluster was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the major compaction of cluster data is performed.
             */
            public Builder dataMergeTime(String dataMergeTime) {
                this.dataMergeTime = dataMergeTime;
                return this;
            }

            /**
             * The data replica distribution mode of the cluster. Valid values: 
             * <p>
             * - n: indicates the single-IDC mode. 
             * - n-n: indicates the dual-IDC mode. 
             * - n-n-n: indicates the multi-IDC mode. 
             * 
             * > <br>The integer n represents the number of OBServer nodes in each IDC.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The deployment type of the cluster. Valid values:  
             * <p>
             * - multiple: multi-IDC deployment   
             * - single: single-IDC deployment   
             * - dual: dual-IDC deployment
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The type of the storage disk where the cluster is deployed. 
             * <p>
             * 
             * The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Indicates whether the log disk specifications can be upgraded.
             */
            public Builder enableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
                this.enableUpgradeLogDisk = enableUpgradeLogDisk;
                return this;
            }

            /**
             * The time in UTC when the cluster expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The specifications of the cluster.  You can specify one of the following four plans:    
             * <p>
             * - 8C32G: indicates 8 CPU cores and 32 GB of memory. 
             * - 14C70G: indicates 14 CPU cores and 70 GB of memory. 
             * - 30C180G: indicates 30 CPU cores and 180 GB of memory. 
             * - 62C400G: indicates 62 CPU cores and 400 GB of memory.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the OceanBase cluster.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 实例角色
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * Indicates whether the OBServer version is the latest.
             */
            public Builder isLatestObVersion(Boolean isLatestObVersion) {
                this.isLatestObVersion = isLatestObVersion;
                return this;
            }

            /**
             * Indicates whether trusted ECS instances are used.
             */
            public Builder isTrustEcs(Boolean isTrustEcs) {
                this.isTrustEcs = isTrustEcs;
                return this;
            }

            /**
             * The time period in UTC for the daily routine maintenance of the cluster.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * NodeNum.
             */
            public Builder nodeNum(String nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The detailed information of the OBServer version.
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * The billing method of the OceanBase cluster. Valid values: 
             * <p>
             * - PREPAY: the subscription billing method. 
             * - POSTPAY: the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The information about cluster resources.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The series of the OceanBase cluster. Valid values:   
             * <p>
             * - NORMAL: the high availability edition.   
             * - BASIC: the basic edition.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * The status of the cluster. Valid values: 
             * <p>
             *  - PENDING_CREATE: The cluster is being created. 
             *  - ONLINE: The cluster is running. 
             *  - TENANT_CREATING: The tenant is being created. 
             * - TENANT_SPEC_MODIFYING: The tenant specifications are being modified. 
             * - EXPANDING: Nodes are being added to the cluster to increase its capacity. 
             * - REDUCING: Nodes are being removed from the cluster to reduce its capacity. 
             * - SPEC_UPGRADING: The service plan is being upgraded. 
             * - DISK_UPGRADING: The storage space is being expanded. 
             * - WHITE_LIST_MODIFYING: The whitelist is being modified. 
             * - PARAMETER_MODIFYING: Parameters are being modified. 
             * - SSL_MODIFYING: The SSL certificate is being changed. 
             * - PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY. 
             * - ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY. 
             * - PENDING_DELETE: The cluster is being deleted.    
             * Generally, the cluster is in the ONLINE state.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The OBServer version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(java.util.List < String > zones) {
                this.zones = zones;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
