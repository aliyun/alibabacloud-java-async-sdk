// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the OceanBase cluster.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of OceanBase clusters queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class DataDiskAutoScaleConfig extends TeaModel {
        @NameInMap("AutoScale")
        private Boolean autoScale;

        @NameInMap("MaxDiskSize")
        private Long maxDiskSize;

        @NameInMap("ScaleStepInMerge")
        private Long scaleStepInMerge;

        @NameInMap("ScaleStepInNormal")
        private Long scaleStepInNormal;

        @NameInMap("UpperMergeThreshold")
        private Long upperMergeThreshold;

        @NameInMap("UpperScaleStrategy")
        private String upperScaleStrategy;

        @NameInMap("UpperThreshold")
        private Long upperThreshold;

        @NameInMap("Upperbound")
        private Long upperbound;

        private DataDiskAutoScaleConfig(Builder builder) {
            this.autoScale = builder.autoScale;
            this.maxDiskSize = builder.maxDiskSize;
            this.scaleStepInMerge = builder.scaleStepInMerge;
            this.scaleStepInNormal = builder.scaleStepInNormal;
            this.upperMergeThreshold = builder.upperMergeThreshold;
            this.upperScaleStrategy = builder.upperScaleStrategy;
            this.upperThreshold = builder.upperThreshold;
            this.upperbound = builder.upperbound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskAutoScaleConfig create() {
            return builder().build();
        }

        /**
         * @return autoScale
         */
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return maxDiskSize
         */
        public Long getMaxDiskSize() {
            return this.maxDiskSize;
        }

        /**
         * @return scaleStepInMerge
         */
        public Long getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        /**
         * @return scaleStepInNormal
         */
        public Long getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        /**
         * @return upperMergeThreshold
         */
        public Long getUpperMergeThreshold() {
            return this.upperMergeThreshold;
        }

        /**
         * @return upperScaleStrategy
         */
        public String getUpperScaleStrategy() {
            return this.upperScaleStrategy;
        }

        /**
         * @return upperThreshold
         */
        public Long getUpperThreshold() {
            return this.upperThreshold;
        }

        /**
         * @return upperbound
         */
        public Long getUpperbound() {
            return this.upperbound;
        }

        public static final class Builder {
            private Boolean autoScale; 
            private Long maxDiskSize; 
            private Long scaleStepInMerge; 
            private Long scaleStepInNormal; 
            private Long upperMergeThreshold; 
            private String upperScaleStrategy; 
            private Long upperThreshold; 
            private Long upperbound; 

            /**
             * Specifies whether to enable the automatic scaling of the data disk.
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * The maximum size of the disk, in GB.
             */
            public Builder maxDiskSize(Long maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * The size of scaling step during a major compaction.
             */
            public Builder scaleStepInMerge(Long scaleStepInMerge) {
                this.scaleStepInMerge = scaleStepInMerge;
                return this;
            }

            /**
             * The size of scaling step during daily use.
             */
            public Builder scaleStepInNormal(Long scaleStepInNormal) {
                this.scaleStepInNormal = scaleStepInNormal;
                return this;
            }

            /**
             * The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for major compactions.
             */
            public Builder upperMergeThreshold(Long upperMergeThreshold) {
                this.upperMergeThreshold = upperMergeThreshold;
                return this;
            }

            /**
             * The scale-out strategy. Valid values: RAW and PERCENTAGE.
             */
            public Builder upperScaleStrategy(String upperScaleStrategy) {
                this.upperScaleStrategy = upperScaleStrategy;
                return this;
            }

            /**
             * The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for daily use.
             */
            public Builder upperThreshold(Long upperThreshold) {
                this.upperThreshold = upperThreshold;
                return this;
            }

            /**
             * The maximum space, in GB, to which the data disk can be scaled.
             */
            public Builder upperbound(Long upperbound) {
                this.upperbound = upperbound;
                return this;
            }

            public DataDiskAutoScaleConfig build() {
                return new DataDiskAutoScaleConfig(this);
            } 

        } 

    }
    public static class CapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @NameInMap("UsedCapacityUnit")
        private Integer usedCapacityUnit;

        private CapacityUnit(Builder builder) {
            this.maxCapacityUnit = builder.maxCapacityUnit;
            this.minCapacityUnit = builder.minCapacityUnit;
            this.usedCapacityUnit = builder.usedCapacityUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityUnit create() {
            return builder().build();
        }

        /**
         * @return maxCapacityUnit
         */
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        /**
         * @return minCapacityUnit
         */
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        /**
         * @return usedCapacityUnit
         */
        public Integer getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private Integer usedCapacityUnit; 

            /**
             * The maximum number of capacity units.
             */
            public Builder maxCapacityUnit(Integer maxCapacityUnit) {
                this.maxCapacityUnit = maxCapacityUnit;
                return this;
            }

            /**
             * The minimum number of capacity units.
             */
            public Builder minCapacityUnit(Integer minCapacityUnit) {
                this.minCapacityUnit = minCapacityUnit;
                return this;
            }

            /**
             * The number of used capacity units.
             */
            public Builder usedCapacityUnit(Integer usedCapacityUnit) {
                this.usedCapacityUnit = usedCapacityUnit;
                return this;
            }

            public CapacityUnit build() {
                return new CapacityUnit(this);
            } 

        } 

    }
    public static class Cpu extends TeaModel {
        @NameInMap("OriginalTotalCpu")
        private Long originalTotalCpu;

        @NameInMap("TotalCpu")
        private Long totalCpu;

        @NameInMap("UnitCpu")
        private Long unitCpu;

        @NameInMap("UsedCpu")
        private Long usedCpu;

        private Cpu(Builder builder) {
            this.originalTotalCpu = builder.originalTotalCpu;
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
         * @return originalTotalCpu
         */
        public Long getOriginalTotalCpu() {
            return this.originalTotalCpu;
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
            private Long originalTotalCpu; 
            private Long totalCpu; 
            private Long unitCpu; 
            private Long usedCpu; 

            /**
             * The number of original CPU cores in the cluster.
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

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
        @NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.originalTotalDiskSize = builder.originalTotalDiskSize;
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
         * @return originalTotalDiskSize
         */
        public Long getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
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
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * The original size of the disk.
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
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
    public static class Memory extends TeaModel {
        @NameInMap("OriginalTotalMemory")
        private Long originalTotalMemory;

        @NameInMap("TotalMemory")
        private Long totalMemory;

        @NameInMap("UnitMemory")
        private Long unitMemory;

        @NameInMap("UsedMemory")
        private Long usedMemory;

        private Memory(Builder builder) {
            this.originalTotalMemory = builder.originalTotalMemory;
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
         * @return originalTotalMemory
         */
        public Long getOriginalTotalMemory() {
            return this.originalTotalMemory;
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
            private Long originalTotalMemory; 
            private Long totalMemory; 
            private Long unitMemory; 
            private Long usedMemory; 

            /**
             * The original memory size of the cluster, in GB.
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

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
        @NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("DiskSize")
        private DiskSize diskSize;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
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
         * @return capacityUnit
         */
        public CapacityUnit getCapacityUnit() {
            return this.capacityUnit;
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
            private CapacityUnit capacityUnit; 
            private Cpu cpu; 
            private DiskSize diskSize; 
            private Memory memory; 
            private Long unitCount; 

            /**
             * The information about capacity units.
             */
            public Builder capacityUnit(CapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

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
    public static class Instances extends TeaModel {
        @NameInMap("AvailableZones")
        private java.util.List < String > availableZones;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataDiskAutoScaleConfig")
        private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskSize")
        private String diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableReadOnlyReplicaManagement")
        private Boolean enableReadOnlyReplicaManagement;

        @NameInMap("EnableUpgradeNodes")
        private Boolean enableUpgradeNodes;

        @NameInMap("ExpireSeconds")
        private Integer expireSeconds;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InTempCapacityStatus")
        private Boolean inTempCapacityStatus;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRole")
        private String instanceRole;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("Mem")
        private Long mem;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Series")
        private String series;

        @NameInMap("State")
        private String state;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        @NameInMap("Version")
        private String version;

        @NameInMap("VpcId")
        private String vpcId;

        private Instances(Builder builder) {
            this.availableZones = builder.availableZones;
            this.commodityCode = builder.commodityCode;
            this.cpu = builder.cpu;
            this.cpuArchitecture = builder.cpuArchitecture;
            this.createTime = builder.createTime;
            this.dataDiskAutoScaleConfig = builder.dataDiskAutoScaleConfig;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.enableReadOnlyReplicaManagement = builder.enableReadOnlyReplicaManagement;
            this.enableUpgradeNodes = builder.enableUpgradeNodes;
            this.expireSeconds = builder.expireSeconds;
            this.expireTime = builder.expireTime;
            this.inTempCapacityStatus = builder.inTempCapacityStatus;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRole = builder.instanceRole;
            this.instanceType = builder.instanceType;
            this.maintainTime = builder.maintainTime;
            this.mem = builder.mem;
            this.payType = builder.payType;
            this.resource = builder.resource;
            this.resourceGroupId = builder.resourceGroupId;
            this.series = builder.series;
            this.state = builder.state;
            this.usedDiskSize = builder.usedDiskSize;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return availableZones
         */
        public java.util.List < String > getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuArchitecture
         */
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataDiskAutoScaleConfig
         */
        public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
            return this.dataDiskAutoScaleConfig;
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
         * @return diskSize
         */
        public String getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enableReadOnlyReplicaManagement
         */
        public Boolean getEnableReadOnlyReplicaManagement() {
            return this.enableReadOnlyReplicaManagement;
        }

        /**
         * @return enableUpgradeNodes
         */
        public Boolean getEnableUpgradeNodes() {
            return this.enableUpgradeNodes;
        }

        /**
         * @return expireSeconds
         */
        public Integer getExpireSeconds() {
            return this.expireSeconds;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return inTempCapacityStatus
         */
        public Boolean getInTempCapacityStatus() {
            return this.inTempCapacityStatus;
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
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return mem
         */
        public Long getMem() {
            return this.mem;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > availableZones; 
            private String commodityCode; 
            private Integer cpu; 
            private String cpuArchitecture; 
            private String createTime; 
            private DataDiskAutoScaleConfig dataDiskAutoScaleConfig; 
            private String deployMode; 
            private String deployType; 
            private String diskSize; 
            private String diskType; 
            private Boolean enableReadOnlyReplicaManagement; 
            private Boolean enableUpgradeNodes; 
            private Integer expireSeconds; 
            private String expireTime; 
            private Boolean inTempCapacityStatus; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRole; 
            private String instanceType; 
            private String maintainTime; 
            private Long mem; 
            private String payType; 
            private Resource resource; 
            private String resourceGroupId; 
            private String series; 
            private String state; 
            private Long usedDiskSize; 
            private String version; 
            private String vpcId; 

            /**
             * The information about the zone in which the cluster is deployed.
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * The product code of the OceanBase cluster.   
             * <p>
             * - oceanbase_oceanbasepre_public_cn: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in a China site.  
             * - oceanbase_oceanbasepost_public_cn: indicates an OceanBase cluster that is billed based on the pay-as-you-go plan and that is deployed in a China site.  
             * - oceanbase_obpre_public_intl: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in an international site.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The number of CPU cores of the cluster.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The CPU architecture of the cluster.
             */
            public Builder cpuArchitecture(String cpuArchitecture) {
                this.cpuArchitecture = cpuArchitecture;
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
             * Specifies parameters for the automatic scaling of the data disk.
             */
            public Builder dataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
                this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
                return this;
            }

            /**
             * The data replica distribution mode of the cluster. The value is in the n-n-n format, where n is the number of OBServer nodes in each IDC.
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
             * The size of the storage space, in GB.
             */
            public Builder diskSize(String diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The type of the storage disk where the cluster is deployed.   
             * <p>
             * The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Indicates whether the cluster supports read-only replicas.
             */
            public Builder enableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
                this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
                return this;
            }

            /**
             * Indicates whether new nodes can be added.
             */
            public Builder enableUpgradeNodes(Boolean enableUpgradeNodes) {
                this.enableUpgradeNodes = enableUpgradeNodes;
                return this;
            }

            /**
             * The time elapsed since the expiration of the cluster, in seconds. 
             * <p>
             * > In subscription mode, if the cluster has not expired, this parameter indicates the remaining validity period of the cluster. If the cluster has expired, this parameter indicates the time elapsed since the expiration.
             */
            public Builder expireSeconds(Integer expireSeconds) {
                this.expireSeconds = expireSeconds;
                return this;
            }

            /**
             * The time in UTC when the cluster expires. 
             * <p>
             * > This parameter is valid only for subscription instances.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Specifies whether to indicate the temporary status of the capacity.
             */
            public Builder inTempCapacityStatus(Boolean inTempCapacityStatus) {
                this.inTempCapacityStatus = inTempCapacityStatus;
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
             * The role of the instance.
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * The instance type.
             * <p>
             * - cluster: indicates a cluster instance.
             * - mtenant: indicates a tenant instance in MySQL mode.
             * - mtenant_serverless: indicates a serverless instance in MySQL mode.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
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
             * The memory size of the instance, in GB.
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The billing method for the OceanBase cluster. Valid values:  
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
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * - ONLINE: The cluster is running.  
             * - PENDING_CREATE: The cluster is being created.  
             * - ARREARS_CLOSED("arrears_closed"): The cluster is suspended due to insufficient balance.
             * - PREPAID_EXPIRE_CLOSED("prepaid_expire_closed"): The cluster is suspended because the subscription has expired.
             * - WHITE_LIST_MODIFYING("white_list_modifying"): The allowlist of the cluster is being modified.
             * - SSL_MODIFYING("ssl_modifying"): The Secure Sockets Layer (SSL) settings of the cluster are being modified.
             * - PARAMETER_MODIFYING("parameter_modifying"): Parameters of the cluster are being modified.
             * - TENANT_CREATING("tenant_creating"): A tenant is being created in the cluster.
             * - TENANT_SPEC_MODIFYING("tenant_spec_modifying"): The specifications of a tenant in the cluster are being modified.
             * - EXPANDING("expanding"): Nodes are being added to the cluster.
             * - REDUCING("reducing"): Nodes are being removed from the cluster.
             * - ZONE_CHANGING("zone_changing"): Zones of the cluster are being modified.
             * - SPEC_UPGRADING: The service plan is being upgraded.
             * - SPEC_DOWNGRADING("spec_downgrading"): The plan specification is being downgraded.
             * - DISK_UPGRADING: The storage space is being expanded.
             * - UPGRADING("upgrading"): The version of the cluster is being upgraded.
             * - PENDING_DELETE("pending_delete"): The cluster is being deleted.
             * - DELETED("deleted"): The cluster has been deleted.
             * - ABNORMAL("abnormal"): The cluster is abnormal.
             * - OFFLINE("offline"): The cluster is offline.
             * - STANDBY_CREATING("standby_creating"): A standby cluster is being created for the cluster.
             * - STANDBY_DELETING("standby_deleting"): A standby cluster of the cluster is being deleted.
             * - SWITCHOVER_SWITCHING("switchover_switching"): The cluster is undergoing a primary/standby switchover.
             * - STANDBY_DISCONNECTING("standby_disconnecting"): The cluster is being decoupled from its standby cluster.
             * - LOG_DISK_UPGRADING("log_disk_upgrading"): The log disk of the cluster is being scaled out.
             * - ISOLATION_OPTIMIZATION_MODIFYING("isolation_optimization_modifying"): The isolation optimization settings of the cluster are being modified.
             * - DISKTYPE_MODIFYING("disktype_modifying"): The data disk type of the cluster is being modified.
             * - PROXY_SERVICE_CREATING("proxy_service_creating"): The proxy service is being enabled for the cluster.
             * - PROXY_SERVICE_DELETING("proxy_service_deleting"): The proxy service is being disabled for the cluster.
             * - PROXY_SERVICE_SPEC_MODIFYING("proxy_service_spec_modifying"): The proxy service specification is being modified for the cluster.
             * - READONLY_ADD_NODE("readonly_add_node"): A read-only node is being added to the cluster.
             * - READONLY_REDUCE_NODE("readonly_reduce_node"): A read-only node is being removed from the cluster.
             * - READONLY_REDUCE_ZONE("readonly_reduce_zone"): A read-only zone is being removed from the cluster.
             * - READONLY_ADD_ZONE("readonly_add_zone"): A read-only zone is being added to the cluster.
             * - READONLY_UPGRADE_SPEC("readonly_upgrade_spec"): The specification of read-only replicas is being upgraded.
             * - READONLY_UPGRADE_DISK("readonly_upgrade_disk"): The disk space of read-only replicas is being scaled out.
             * - READONLY_DOWNGRADE_SPEC("readonly_downgrade_spec"): The specification of read-only replicas is being downgraded.
             * - READONLY_DOWNGRADE_DISK("readonly_downgrade_disk"): The disk space of read-only replicas is being scaled in.
             * - CREATING_TENANT_READONLY_REPLICA("creating_tenant_readonly_replica"): A read-only replica is being created for a tenant in the cluster.
             * - DELETING_TENANT_READONLY_REPLICA("deleting_tenant_readonly_replica"): A read-only replica is being deleted for a tenant in the cluster.
             * - DISK_DOWNGRADING("disk_downgrading"): The disk space of the cluster is being scaled in.
             * - DEPLOY_MODE_MODIFYING("deploy_mode_modifying"): The deployment mode of the cluster is being modified.
             * > Generally, the cluster is in the ONLINE state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The size of used storage space of the cluster, in GB.
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
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
             * vpcId
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
