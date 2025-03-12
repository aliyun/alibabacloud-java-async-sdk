// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information of the OceanBase cluster.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of OceanBase clusters queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class DataDiskAutoScaleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Boolean autoScale;

        @com.aliyun.core.annotation.NameInMap("MaxDiskSize")
        private Long maxDiskSize;

        @com.aliyun.core.annotation.NameInMap("ScaleStepInMerge")
        private Double scaleStepInMerge;

        @com.aliyun.core.annotation.NameInMap("ScaleStepInNormal")
        private Double scaleStepInNormal;

        @com.aliyun.core.annotation.NameInMap("UpperMergeThreshold")
        private Double upperMergeThreshold;

        @com.aliyun.core.annotation.NameInMap("UpperScaleStrategy")
        private String upperScaleStrategy;

        @com.aliyun.core.annotation.NameInMap("UpperThreshold")
        private Double upperThreshold;

        @com.aliyun.core.annotation.NameInMap("Upperbound")
        private Double upperbound;

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
        public Double getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        /**
         * @return scaleStepInNormal
         */
        public Double getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        /**
         * @return upperMergeThreshold
         */
        public Double getUpperMergeThreshold() {
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
        public Double getUpperThreshold() {
            return this.upperThreshold;
        }

        /**
         * @return upperbound
         */
        public Double getUpperbound() {
            return this.upperbound;
        }

        public static final class Builder {
            private Boolean autoScale; 
            private Long maxDiskSize; 
            private Double scaleStepInMerge; 
            private Double scaleStepInNormal; 
            private Double upperMergeThreshold; 
            private String upperScaleStrategy; 
            private Double upperThreshold; 
            private Double upperbound; 

            /**
             * <p>Specifies whether to enable the automatic scaling of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * <p>The maximum size of the disk, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>80000</p>
             */
            public Builder maxDiskSize(Long maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * <p>The size of scaling step during a major compaction.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scaleStepInMerge(Double scaleStepInMerge) {
                this.scaleStepInMerge = scaleStepInMerge;
                return this;
            }

            /**
             * <p>The size of scaling step during daily use.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder scaleStepInNormal(Double scaleStepInNormal) {
                this.scaleStepInNormal = scaleStepInNormal;
                return this;
            }

            /**
             * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for major compactions.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder upperMergeThreshold(Double upperMergeThreshold) {
                this.upperMergeThreshold = upperMergeThreshold;
                return this;
            }

            /**
             * <p>The scale-out strategy. Valid values: RAW and PERCENTAGE.</p>
             * 
             * <strong>example:</strong>
             * <p>RAW</p>
             */
            public Builder upperScaleStrategy(String upperScaleStrategy) {
                this.upperScaleStrategy = upperScaleStrategy;
                return this;
            }

            /**
             * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for daily use.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder upperThreshold(Double upperThreshold) {
                this.upperThreshold = upperThreshold;
                return this;
            }

            /**
             * <p>The maximum space, in GB, to which the data disk can be scaled.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder upperbound(Double upperbound) {
                this.upperbound = upperbound;
                return this;
            }

            public DataDiskAutoScaleConfig build() {
                return new DataDiskAutoScaleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class CapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("UsedCapacityUnit")
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
             * <p>The maximum number of capacity units.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maxCapacityUnit(Integer maxCapacityUnit) {
                this.maxCapacityUnit = maxCapacityUnit;
                return this;
            }

            /**
             * <p>The minimum number of capacity units.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minCapacityUnit(Integer minCapacityUnit) {
                this.minCapacityUnit = minCapacityUnit;
                return this;
            }

            /**
             * <p>The number of used capacity units.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Cpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalCpu")
        private Double originalTotalCpu;

        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Double totalCpu;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Double unitCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Double usedCpu;

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
        public Double getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        /**
         * @return totalCpu
         */
        public Double getTotalCpu() {
            return this.totalCpu;
        }

        /**
         * @return unitCpu
         */
        public Double getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return usedCpu
         */
        public Double getUsedCpu() {
            return this.usedCpu;
        }

        public static final class Builder {
            private Double originalTotalCpu; 
            private Double totalCpu; 
            private Double unitCpu; 
            private Double usedCpu; 

            /**
             * <p>The number of original CPU cores in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder originalTotalCpu(Double originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * <p>The total number of CPU cores of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder totalCpu(Double totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores of each replica node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitCpu(Double unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores used in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedCpu(Double usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class DiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalDiskSize")
        private Double originalTotalDiskSize;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Double totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UnitDiskSize")
        private Double unitDiskSize;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
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
        public Double getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        /**
         * @return totalDiskSize
         */
        public Double getTotalDiskSize() {
            return this.totalDiskSize;
        }

        /**
         * @return unitDiskSize
         */
        public Double getUnitDiskSize() {
            return this.unitDiskSize;
        }

        /**
         * @return usedDiskSize
         */
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public static final class Builder {
            private Double originalTotalDiskSize; 
            private Double totalDiskSize; 
            private Double unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * <p>The original size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder originalTotalDiskSize(Double originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * <p>The total storage space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder totalDiskSize(Double totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The storage space of each replica node in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder unitDiskSize(Double unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            /**
             * <p>The size of used storage space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalMemory")
        private Double originalTotalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Double totalMemory;

        @com.aliyun.core.annotation.NameInMap("UnitMemory")
        private Long unitMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
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
        public Double getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        /**
         * @return totalMemory
         */
        public Double getTotalMemory() {
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
            private Double originalTotalMemory; 
            private Double totalMemory; 
            private Long unitMemory; 
            private Long usedMemory; 

            /**
             * <p>The original memory size of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder originalTotalMemory(Double originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * <p>The total memory size of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder totalMemory(Double totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The memory size of each replica node in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * <p>The size of used memory in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Cpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private DiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("UnitCount")
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
             * <p>The information about capacity units.</p>
             */
            public Builder capacityUnit(CapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * <p>The information about the CPU resources of the cluster.</p>
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The information about the storage resources of the cluster.</p>
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The information about the memory resources of the cluster.</p>
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of resource units in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZones")
        private java.util.List<String> availableZones;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataDiskAutoScaleConfig")
        private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Long diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EnableReadOnlyReplicaManagement")
        private Boolean enableReadOnlyReplicaManagement;

        @com.aliyun.core.annotation.NameInMap("EnableUpgradeNodes")
        private Boolean enableUpgradeNodes;

        @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
        private Integer expireSeconds;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InTempCapacityStatus")
        private Boolean inTempCapacityStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceRole")
        private String instanceRole;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Long mem;

        @com.aliyun.core.annotation.NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ReplicaMode")
        private String replicaMode;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
            this.obRpmVersion = builder.obRpmVersion;
            this.payType = builder.payType;
            this.replicaMode = builder.replicaMode;
            this.resource = builder.resource;
            this.resourceGroupId = builder.resourceGroupId;
            this.series = builder.series;
            this.specType = builder.specType;
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
        public java.util.List<String> getAvailableZones() {
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
        public Long getDiskSize() {
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
         * @return replicaMode
         */
        public String getReplicaMode() {
            return this.replicaMode;
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
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
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
            private java.util.List<String> availableZones; 
            private String commodityCode; 
            private Integer cpu; 
            private String cpuArchitecture; 
            private String createTime; 
            private DataDiskAutoScaleConfig dataDiskAutoScaleConfig; 
            private String deployMode; 
            private String deployType; 
            private Long diskSize; 
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
            private String obRpmVersion; 
            private String payType; 
            private String replicaMode; 
            private Resource resource; 
            private String resourceGroupId; 
            private String series; 
            private String specType; 
            private String state; 
            private Long usedDiskSize; 
            private String version; 
            private String vpcId; 

            /**
             * <p>The information about the zone in which the cluster is deployed.</p>
             */
            public Builder availableZones(java.util.List<String> availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * <p>The product code of the OceanBase cluster.   </p>
             * <ul>
             * <li>oceanbase_oceanbasepre_public_cn: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in a China site.  </li>
             * <li>oceanbase_oceanbasepost_public_cn: indicates an OceanBase cluster that is billed based on the pay-as-you-go plan and that is deployed in a China site.  </li>
             * <li>oceanbase_obpre_public_intl: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in an international site.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oceanbase_oceanbasepost_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The number of CPU cores of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The CPU architecture of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>X86_64, AARCH64</p>
             */
            public Builder cpuArchitecture(String cpuArchitecture) {
                this.cpuArchitecture = cpuArchitecture;
                return this;
            }

            /**
             * <p>The time in UTC when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-19T07:13:41Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies parameters for the automatic scaling of the data disk.</p>
             */
            public Builder dataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
                this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
                return this;
            }

            /**
             * <p>The data replica distribution mode of the cluster. The value is in the n-n-n format, where n is the number of OBServer nodes in each IDC.</p>
             * 
             * <strong>example:</strong>
             * <p>1-1-1</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The deployment type of the cluster. Valid values:   </p>
             * <ul>
             * <li>multiple: multi-IDC deployment  </li>
             * <li>single: single-IDC deployment  </li>
             * <li>dual: dual-IDC deployment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>multiple</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The size of the storage space, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder diskSize(Long diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The type of the storage disk where the cluster is deployed.<br>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd_pl1</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>Indicates whether the cluster supports read-only replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder enableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
                this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
                return this;
            }

            /**
             * <p>Indicates whether new nodes can be added.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableUpgradeNodes(Boolean enableUpgradeNodes) {
                this.enableUpgradeNodes = enableUpgradeNodes;
                return this;
            }

            /**
             * <p>The time elapsed since the expiration of the cluster, in seconds. </p>
             * <blockquote>
             * <p>In subscription mode, if the cluster has not expired, this parameter indicates the remaining validity period of the cluster. If the cluster has expired, this parameter indicates the time elapsed since the expiration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2606682</p>
             */
            public Builder expireSeconds(Integer expireSeconds) {
                this.expireSeconds = expireSeconds;
                return this;
            }

            /**
             * <p>The time in UTC when the cluster expires. </p>
             * <blockquote>
             * <p>This parameter is valid only for subscription instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-10-17T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Specifies whether to indicate the temporary status of the capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inTempCapacityStatus(Boolean inTempCapacityStatus) {
                this.inTempCapacityStatus = inTempCapacityStatus;
                return this;
            }

            /**
             * <p>The specifications of the cluster.  You can specify one of the following four plans:  </p>
             * <ul>
             * <li>8C32G: indicates 8 CPU cores and 32 GB of memory.  </li>
             * <li>14C70G: indicates 14 CPU cores and 70 GB of memory.  </li>
             * <li>30C180G: indicates 30 CPU cores and 180 GB of memory.  </li>
             * <li>62C400G: indicates 62 CPU cores and 400 GB of memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>14C70G</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob4test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The role of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * <ul>
             * <li>cluster: indicates a cluster instance.</li>
             * <li>mtenant: indicates a tenant instance in MySQL mode.</li>
             * <li>mtenant_serverless: indicates a serverless instance in MySQL mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLUSTER</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The time period in UTC for the daily routine maintenance of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-19T07:13:41Z</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The memory size of the instance, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The version of the OceanBase Database RedHat Package Managerment (RPM) package.</p>
             * 
             * <strong>example:</strong>
             * <p>4.2.1.7-107030032024062709</p>
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * <p>The billing method for the OceanBase cluster. Valid values:  </p>
             * <ul>
             * <li>PREPAY: the subscription billing method.  </li>
             * <li>POSTPAY: the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ReplicaMode.
             */
            public Builder replicaMode(String replicaMode) {
                this.replicaMode = replicaMode;
                return this;
            }

            /**
             * <p>The information about cluster resources.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The series of the OceanBase cluster. Valid values:   </p>
             * <ul>
             * <li>NORMAL: the high availability edition.   </li>
             * <li>BASIC: the basic edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The specification type.</p>
             * 
             * <strong>example:</strong>
             * <p>dedicatedspec</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:   </p>
             * <ul>
             * <li>ONLINE: The cluster is running.  </li>
             * <li>PENDING_CREATE: The cluster is being created.  </li>
             * <li>ARREARS_CLOSED(&quot;arrears_closed&quot;): The cluster is suspended due to insufficient balance.</li>
             * <li>PREPAID_EXPIRE_CLOSED(&quot;prepaid_expire_closed&quot;): The cluster is suspended because the subscription has expired.</li>
             * <li>WHITE_LIST_MODIFYING(&quot;white_list_modifying&quot;): The allowlist of the cluster is being modified.</li>
             * <li>SSL_MODIFYING(&quot;ssl_modifying&quot;): The Secure Sockets Layer (SSL) settings of the cluster are being modified.</li>
             * <li>PARAMETER_MODIFYING(&quot;parameter_modifying&quot;): Parameters of the cluster are being modified.</li>
             * <li>TENANT_CREATING(&quot;tenant_creating&quot;): A tenant is being created in the cluster.</li>
             * <li>TENANT_SPEC_MODIFYING(&quot;tenant_spec_modifying&quot;): The specifications of a tenant in the cluster are being modified.</li>
             * <li>EXPANDING(&quot;expanding&quot;): Nodes are being added to the cluster.</li>
             * <li>REDUCING(&quot;reducing&quot;): Nodes are being removed from the cluster.</li>
             * <li>ZONE_CHANGING(&quot;zone_changing&quot;): Zones of the cluster are being modified.</li>
             * <li>SPEC_UPGRADING: The service plan is being upgraded.</li>
             * <li>SPEC_DOWNGRADING(&quot;spec_downgrading&quot;): The plan specification is being downgraded.</li>
             * <li>DISK_UPGRADING: The storage space is being expanded.</li>
             * <li>UPGRADING(&quot;upgrading&quot;): The version of the cluster is being upgraded.</li>
             * <li>PENDING_DELETE(&quot;pending_delete&quot;): The cluster is being deleted.</li>
             * <li>DELETED(&quot;deleted&quot;): The cluster has been deleted.</li>
             * <li>ABNORMAL(&quot;abnormal&quot;): The cluster is abnormal.</li>
             * <li>OFFLINE(&quot;offline&quot;): The cluster is offline.</li>
             * <li>STANDBY_CREATING(&quot;standby_creating&quot;): A standby cluster is being created for the cluster.</li>
             * <li>STANDBY_DELETING(&quot;standby_deleting&quot;): A standby cluster of the cluster is being deleted.</li>
             * <li>SWITCHOVER_SWITCHING(&quot;switchover_switching&quot;): The cluster is undergoing a primary/standby switchover.</li>
             * <li>STANDBY_DISCONNECTING(&quot;standby_disconnecting&quot;): The cluster is being decoupled from its standby cluster.</li>
             * <li>LOG_DISK_UPGRADING(&quot;log_disk_upgrading&quot;): The log disk of the cluster is being scaled out.</li>
             * <li>ISOLATION_OPTIMIZATION_MODIFYING(&quot;isolation_optimization_modifying&quot;): The isolation optimization settings of the cluster are being modified.</li>
             * <li>DISKTYPE_MODIFYING(&quot;disktype_modifying&quot;): The data disk type of the cluster is being modified.</li>
             * <li>PROXY_SERVICE_CREATING(&quot;proxy_service_creating&quot;): The proxy service is being enabled for the cluster.</li>
             * <li>PROXY_SERVICE_DELETING(&quot;proxy_service_deleting&quot;): The proxy service is being disabled for the cluster.</li>
             * <li>PROXY_SERVICE_SPEC_MODIFYING(&quot;proxy_service_spec_modifying&quot;): The proxy service specification is being modified for the cluster.</li>
             * <li>READONLY_ADD_NODE(&quot;readonly_add_node&quot;): A read-only node is being added to the cluster.</li>
             * <li>READONLY_REDUCE_NODE(&quot;readonly_reduce_node&quot;): A read-only node is being removed from the cluster.</li>
             * <li>READONLY_REDUCE_ZONE(&quot;readonly_reduce_zone&quot;): A read-only zone is being removed from the cluster.</li>
             * <li>READONLY_ADD_ZONE(&quot;readonly_add_zone&quot;): A read-only zone is being added to the cluster.</li>
             * <li>READONLY_UPGRADE_SPEC(&quot;readonly_upgrade_spec&quot;): The specification of read-only replicas is being upgraded.</li>
             * <li>READONLY_UPGRADE_DISK(&quot;readonly_upgrade_disk&quot;): The disk space of read-only replicas is being scaled out.</li>
             * <li>READONLY_DOWNGRADE_SPEC(&quot;readonly_downgrade_spec&quot;): The specification of read-only replicas is being downgraded.</li>
             * <li>READONLY_DOWNGRADE_DISK(&quot;readonly_downgrade_disk&quot;): The disk space of read-only replicas is being scaled in.</li>
             * <li>CREATING_TENANT_READONLY_REPLICA(&quot;creating_tenant_readonly_replica&quot;): A read-only replica is being created for a tenant in the cluster.</li>
             * <li>DELETING_TENANT_READONLY_REPLICA(&quot;deleting_tenant_readonly_replica&quot;): A read-only replica is being deleted for a tenant in the cluster.</li>
             * <li>DISK_DOWNGRADING(&quot;disk_downgrading&quot;): The disk space of the cluster is being scaled in.</li>
             * <li>DEPLOY_MODE_MODIFYING(&quot;deploy_mode_modifying&quot;): The deployment mode of the cluster is being modified.<blockquote>
             * <p>Generally, the cluster is in the ONLINE state.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The size of used storage space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * <p>The OBServer version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.77</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>vpcId</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vb8qjrixzovjpy******</p>
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
