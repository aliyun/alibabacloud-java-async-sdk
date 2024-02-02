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
         * The log disk space of each replica node in the cluster. Unit: GB.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * The total log disk space of the cluster, in GB.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
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

        @NameInMap("UpperScaleStep")
        private String upperScaleStep;

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
            this.upperScaleStep = builder.upperScaleStep;
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
         * @return upperScaleStep
         */
        public String getUpperScaleStep() {
            return this.upperScaleStep;
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
            private String upperScaleStep; 
            private String upperScaleStrategy; 
            private Long upperThreshold; 
            private Long upperbound; 

            /**
             * AutoScale.
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * MaxDiskSize.
             */
            public Builder maxDiskSize(Long maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * ScaleStepInMerge.
             */
            public Builder scaleStepInMerge(Long scaleStepInMerge) {
                this.scaleStepInMerge = scaleStepInMerge;
                return this;
            }

            /**
             * ScaleStepInNormal.
             */
            public Builder scaleStepInNormal(Long scaleStepInNormal) {
                this.scaleStepInNormal = scaleStepInNormal;
                return this;
            }

            /**
             * UpperMergeThreshold.
             */
            public Builder upperMergeThreshold(Long upperMergeThreshold) {
                this.upperMergeThreshold = upperMergeThreshold;
                return this;
            }

            /**
             * UpperScaleStep.
             */
            public Builder upperScaleStep(String upperScaleStep) {
                this.upperScaleStep = upperScaleStep;
                return this;
            }

            /**
             * UpperScaleStrategy.
             */
            public Builder upperScaleStrategy(String upperScaleStrategy) {
                this.upperScaleStrategy = upperScaleStrategy;
                return this;
            }

            /**
             * UpperThreshold.
             */
            public Builder upperThreshold(Long upperThreshold) {
                this.upperThreshold = upperThreshold;
                return this;
            }

            /**
             * Upperbound.
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
        private String usedCapacityUnit;

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
        public String getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private String usedCapacityUnit; 

            /**
             * MaxCapacityUnit.
             */
            public Builder maxCapacityUnit(Integer maxCapacityUnit) {
                this.maxCapacityUnit = maxCapacityUnit;
                return this;
            }

            /**
             * MinCapacityUnit.
             */
            public Builder minCapacityUnit(Integer minCapacityUnit) {
                this.minCapacityUnit = minCapacityUnit;
                return this;
            }

            /**
             * UsedCapacityUnit.
             */
            public Builder usedCapacityUnit(String usedCapacityUnit) {
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
             * OriginalTotalCpu.
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * TotalCpu.
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * UnitCpu.
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * UsedCpu.
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

        @NameInMap("MaxDiskSize")
        private Double maxDiskSize;

        @NameInMap("MaxDiskUsedObServer")
        private java.util.List < String > maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private DiskSize(Builder builder) {
            this.dataUsedSize = builder.dataUsedSize;
            this.maxDiskSize = builder.maxDiskSize;
            this.maxDiskUsedObServer = builder.maxDiskUsedObServer;
            this.maxDiskUsedPercent = builder.maxDiskUsedPercent;
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
         * @return dataUsedSize
         */
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        /**
         * @return maxDiskSize
         */
        public Double getMaxDiskSize() {
            return this.maxDiskSize;
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
            private Double dataUsedSize; 
            private Double maxDiskSize; 
            private java.util.List < String > maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * DataUsedSize.
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * MaxDiskSize.
             */
            public Builder maxDiskSize(Double maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * MaxDiskUsedObServer.
             */
            public Builder maxDiskUsedObServer(java.util.List < String > maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * MaxDiskUsedPercent.
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

            /**
             * OriginalTotalDiskSize.
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * TotalDiskSize.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * UnitDiskSize.
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            /**
             * UsedDiskSize.
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
        @NameInMap("LogAssignedSize")
        private String logAssignedSize;

        @NameInMap("MaxLogAssignedObServer")
        private java.util.List < String > maxLogAssignedObServer;

        @NameInMap("MaxLogAssignedPercent")
        private String maxLogAssignedPercent;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        private LogDiskSize(Builder builder) {
            this.logAssignedSize = builder.logAssignedSize;
            this.maxLogAssignedObServer = builder.maxLogAssignedObServer;
            this.maxLogAssignedPercent = builder.maxLogAssignedPercent;
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
         * @return logAssignedSize
         */
        public String getLogAssignedSize() {
            return this.logAssignedSize;
        }

        /**
         * @return maxLogAssignedObServer
         */
        public java.util.List < String > getMaxLogAssignedObServer() {
            return this.maxLogAssignedObServer;
        }

        /**
         * @return maxLogAssignedPercent
         */
        public String getMaxLogAssignedPercent() {
            return this.maxLogAssignedPercent;
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
            private String logAssignedSize; 
            private java.util.List < String > maxLogAssignedObServer; 
            private String maxLogAssignedPercent; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * LogAssignedSize.
             */
            public Builder logAssignedSize(String logAssignedSize) {
                this.logAssignedSize = logAssignedSize;
                return this;
            }

            /**
             * MaxLogAssignedObServer.
             */
            public Builder maxLogAssignedObServer(java.util.List < String > maxLogAssignedObServer) {
                this.maxLogAssignedObServer = maxLogAssignedObServer;
                return this;
            }

            /**
             * MaxLogAssignedPercent.
             */
            public Builder maxLogAssignedPercent(String maxLogAssignedPercent) {
                this.maxLogAssignedPercent = maxLogAssignedPercent;
                return this;
            }

            /**
             * TotalDiskSize.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * UnitDiskSize.
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
             * OriginalTotalMemory.
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * TotalMemory.
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * UnitMemory.
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * UsedMemory.
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
    public static class ReadOnlyResource extends TeaModel {
        @NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

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

        private ReadOnlyResource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.logDiskSize = builder.logDiskSize;
            this.memory = builder.memory;
            this.unitCount = builder.unitCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyResource create() {
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
            private CapacityUnit capacityUnit; 
            private Cpu cpu; 
            private DiskSize diskSize; 
            private LogDiskSize logDiskSize; 
            private Memory memory; 
            private Long unitCount; 

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(CapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(DiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * LogDiskSize.
             */
            public Builder logDiskSize(LogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * UnitCount.
             */
            public Builder unitCount(Long unitCount) {
                this.unitCount = unitCount;
                return this;
            }

            public ReadOnlyResource build() {
                return new ReadOnlyResource(this);
            } 

        } 

    }
    public static class ResourceCapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @NameInMap("UsedCapacityUnit")
        private String usedCapacityUnit;

        private ResourceCapacityUnit(Builder builder) {
            this.maxCapacityUnit = builder.maxCapacityUnit;
            this.minCapacityUnit = builder.minCapacityUnit;
            this.usedCapacityUnit = builder.usedCapacityUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCapacityUnit create() {
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
        public String getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

        public static final class Builder {
            private Integer maxCapacityUnit; 
            private Integer minCapacityUnit; 
            private String usedCapacityUnit; 

            /**
             * MaxCapacityUnit.
             */
            public Builder maxCapacityUnit(Integer maxCapacityUnit) {
                this.maxCapacityUnit = maxCapacityUnit;
                return this;
            }

            /**
             * MinCapacityUnit.
             */
            public Builder minCapacityUnit(Integer minCapacityUnit) {
                this.minCapacityUnit = minCapacityUnit;
                return this;
            }

            /**
             * UsedCapacityUnit.
             */
            public Builder usedCapacityUnit(String usedCapacityUnit) {
                this.usedCapacityUnit = usedCapacityUnit;
                return this;
            }

            public ResourceCapacityUnit build() {
                return new ResourceCapacityUnit(this);
            } 

        } 

    }
    public static class ResourceCpu extends TeaModel {
        @NameInMap("OriginalTotalCpu")
        private Long originalTotalCpu;

        @NameInMap("TotalCpu")
        private Long totalCpu;

        @NameInMap("UnitCpu")
        private Long unitCpu;

        @NameInMap("UsedCpu")
        private Long usedCpu;

        private ResourceCpu(Builder builder) {
            this.originalTotalCpu = builder.originalTotalCpu;
            this.totalCpu = builder.totalCpu;
            this.unitCpu = builder.unitCpu;
            this.usedCpu = builder.usedCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCpu create() {
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
             * OriginalTotalCpu.
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * The series of the OceanBase cluster. Valid values:   
             * <p>
             * - NORMAL: the high availability edition.   
             * - BASIC: the basic edition.
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * The type of the storage disk where the cluster is deployed. 
             * <p>
             * 
             * The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * Indicates whether automatic upgrade of the OBServer version is enabled.
             */
            public Builder usedCpu(Long usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            public ResourceCpu build() {
                return new ResourceCpu(this);
            } 

        } 

    }
    public static class ResourceDiskSize extends TeaModel {
        @NameInMap("DataUsedSize")
        private Double dataUsedSize;

        @NameInMap("MaxDiskSize")
        private Double maxDiskSize;

        @NameInMap("MaxDiskUsedObServer")
        private java.util.List < String > maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        private Long usedDiskSize;

        private ResourceDiskSize(Builder builder) {
            this.dataUsedSize = builder.dataUsedSize;
            this.maxDiskSize = builder.maxDiskSize;
            this.maxDiskUsedObServer = builder.maxDiskUsedObServer;
            this.maxDiskUsedPercent = builder.maxDiskUsedPercent;
            this.originalTotalDiskSize = builder.originalTotalDiskSize;
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
            this.usedDiskSize = builder.usedDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDiskSize create() {
            return builder().build();
        }

        /**
         * @return dataUsedSize
         */
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        /**
         * @return maxDiskSize
         */
        public Double getMaxDiskSize() {
            return this.maxDiskSize;
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
            private Double dataUsedSize; 
            private Double maxDiskSize; 
            private java.util.List < String > maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * MaxDiskSize.
             */
            public Builder maxDiskSize(Double maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * The time in UTC when the cluster expires.
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
             * OriginalTotalDiskSize.
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
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
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * The list of zones.
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
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
            public Builder usedDiskSize(Long usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            public ResourceDiskSize build() {
                return new ResourceDiskSize(this);
            } 

        } 

    }
    public static class ResourceLogDiskSize extends TeaModel {
        @NameInMap("LogAssignedSize")
        private String logAssignedSize;

        @NameInMap("MaxLogAssignedObServer")
        private java.util.List < String > maxLogAssignedObServer;

        @NameInMap("MaxLogAssignedPercent")
        private String maxLogAssignedPercent;

        @NameInMap("OriginalTotalDiskSize")
        private Integer originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        private ResourceLogDiskSize(Builder builder) {
            this.logAssignedSize = builder.logAssignedSize;
            this.maxLogAssignedObServer = builder.maxLogAssignedObServer;
            this.maxLogAssignedPercent = builder.maxLogAssignedPercent;
            this.originalTotalDiskSize = builder.originalTotalDiskSize;
            this.totalDiskSize = builder.totalDiskSize;
            this.unitDiskSize = builder.unitDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceLogDiskSize create() {
            return builder().build();
        }

        /**
         * @return logAssignedSize
         */
        public String getLogAssignedSize() {
            return this.logAssignedSize;
        }

        /**
         * @return maxLogAssignedObServer
         */
        public java.util.List < String > getMaxLogAssignedObServer() {
            return this.maxLogAssignedObServer;
        }

        /**
         * @return maxLogAssignedPercent
         */
        public String getMaxLogAssignedPercent() {
            return this.maxLogAssignedPercent;
        }

        /**
         * @return originalTotalDiskSize
         */
        public Integer getOriginalTotalDiskSize() {
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

        public static final class Builder {
            private String logAssignedSize; 
            private java.util.List < String > maxLogAssignedObServer; 
            private String maxLogAssignedPercent; 
            private Integer originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * LogAssignedSize.
             */
            public Builder logAssignedSize(String logAssignedSize) {
                this.logAssignedSize = logAssignedSize;
                return this;
            }

            /**
             * MaxLogAssignedObServer.
             */
            public Builder maxLogAssignedObServer(java.util.List < String > maxLogAssignedObServer) {
                this.maxLogAssignedObServer = maxLogAssignedObServer;
                return this;
            }

            /**
             * MaxLogAssignedPercent.
             */
            public Builder maxLogAssignedPercent(String maxLogAssignedPercent) {
                this.maxLogAssignedPercent = maxLogAssignedPercent;
                return this;
            }

            /**
             * OriginalTotalDiskSize.
             */
            public Builder originalTotalDiskSize(Integer originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder unitDiskSize(Long unitDiskSize) {
                this.unitDiskSize = unitDiskSize;
                return this;
            }

            public ResourceLogDiskSize build() {
                return new ResourceLogDiskSize(this);
            } 

        } 

    }
    public static class ResourceMemory extends TeaModel {
        @NameInMap("OriginalTotalMemory")
        private Long originalTotalMemory;

        @NameInMap("TotalMemory")
        private Long totalMemory;

        @NameInMap("UnitMemory")
        private Long unitMemory;

        @NameInMap("UsedMemory")
        private Long usedMemory;

        private ResourceMemory(Builder builder) {
            this.originalTotalMemory = builder.originalTotalMemory;
            this.totalMemory = builder.totalMemory;
            this.unitMemory = builder.unitMemory;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceMemory create() {
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
             * OriginalTotalMemory.
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * Indicates whether trusted ECS instances are used.
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The log disk space of each replica node in the cluster. Unit: GB.
             */
            public Builder unitMemory(Long unitMemory) {
                this.unitMemory = unitMemory;
                return this;
            }

            /**
             * The time in UTC when the cluster was created.
             */
            public Builder usedMemory(Long usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public ResourceMemory build() {
                return new ResourceMemory(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("CapacityUnit")
        private ResourceCapacityUnit capacityUnit;

        @NameInMap("Cpu")
        private ResourceCpu cpu;

        @NameInMap("DiskSize")
        private ResourceDiskSize diskSize;

        @NameInMap("LogDiskSize")
        private ResourceLogDiskSize logDiskSize;

        @NameInMap("Memory")
        private ResourceMemory memory;

        @NameInMap("UnitCount")
        private Long unitCount;

        private Resource(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
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
         * @return capacityUnit
         */
        public ResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return cpu
         */
        public ResourceCpu getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public ResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return logDiskSize
         */
        public ResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        /**
         * @return memory
         */
        public ResourceMemory getMemory() {
            return this.memory;
        }

        /**
         * @return unitCount
         */
        public Long getUnitCount() {
            return this.unitCount;
        }

        public static final class Builder {
            private ResourceCapacityUnit capacityUnit; 
            private ResourceCpu cpu; 
            private ResourceDiskSize diskSize; 
            private ResourceLogDiskSize logDiskSize; 
            private ResourceMemory memory; 
            private Long unitCount; 

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(ResourceCapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * The information of the OceanBase cluster.
             */
            public Builder cpu(ResourceCpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of the page to return. 
             * <p>
             * - Start value: 1  
             * - Default value: 1
             */
            public Builder diskSize(ResourceDiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The server with the highest disk usage.
             */
            public Builder logDiskSize(ResourceLogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * The name of the OceanBase cluster.
             */
            public Builder memory(ResourceMemory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The number of CPU cores used in the cluster.
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
    public static class TenantCreatable extends TeaModel {
        @NameInMap("DisableCreateTenantReason")
        private String disableCreateTenantReason;

        @NameInMap("EnableCreateTenant")
        private Boolean enableCreateTenant;

        private TenantCreatable(Builder builder) {
            this.disableCreateTenantReason = builder.disableCreateTenantReason;
            this.enableCreateTenant = builder.enableCreateTenant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantCreatable create() {
            return builder().build();
        }

        /**
         * @return disableCreateTenantReason
         */
        public String getDisableCreateTenantReason() {
            return this.disableCreateTenantReason;
        }

        /**
         * @return enableCreateTenant
         */
        public Boolean getEnableCreateTenant() {
            return this.enableCreateTenant;
        }

        public static final class Builder {
            private String disableCreateTenantReason; 
            private Boolean enableCreateTenant; 

            /**
             * DisableCreateTenantReason.
             */
            public Builder disableCreateTenantReason(String disableCreateTenantReason) {
                this.disableCreateTenantReason = disableCreateTenantReason;
                return this;
            }

            /**
             * EnableCreateTenant.
             */
            public Builder enableCreateTenant(Boolean enableCreateTenant) {
                this.enableCreateTenant = enableCreateTenant;
                return this;
            }

            public TenantCreatable build() {
                return new TenantCreatable(this);
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

        @NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataDiskAutoScale")
        private Boolean dataDiskAutoScale;

        @NameInMap("DataDiskAutoScaleConfig")
        private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        @NameInMap("DataMergeTime")
        private String dataMergeTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EnableIsolationOptimization")
        private Boolean enableIsolationOptimization;

        @NameInMap("EnableProxyService")
        private Boolean enableProxyService;

        @NameInMap("EnableReadOnlyReplica")
        private Boolean enableReadOnlyReplica;

        @NameInMap("EnableReadOnlyReplicaManagement")
        private Boolean enableReadOnlyReplicaManagement;

        @NameInMap("EnableUpgradeLogDisk")
        private Boolean enableUpgradeLogDisk;

        @NameInMap("ExclusiveUnitNumLimit")
        private Integer exclusiveUnitNumLimit;

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

        @NameInMap("IsLatestObVersion")
        private Boolean isLatestObVersion;

        @NameInMap("IsTrustEcs")
        private Boolean isTrustEcs;

        @NameInMap("IsolationOptimization")
        private Boolean isolationOptimization;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("NodeNum")
        private String nodeNum;

        @NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ProxyClusterId")
        private String proxyClusterId;

        @NameInMap("ProxyServiceStatus")
        private String proxyServiceStatus;

        @NameInMap("ReadOnlyResource")
        private ReadOnlyResource readOnlyResource;

        @NameInMap("ReplicaMode")
        private String replicaMode;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("Series")
        private String series;

        @NameInMap("SharedUnitNumLimit")
        private Integer sharedUnitNumLimit;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantCreatable")
        private TenantCreatable tenantCreatable;

        @NameInMap("UnitSpec")
        private String unitSpec;

        @NameInMap("Version")
        private String version;

        @NameInMap("Zones")
        private java.util.List < String > zones;

        private Instance(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.autoUpgradeObVersion = builder.autoUpgradeObVersion;
            this.availableZones = builder.availableZones;
            this.cpuArchitecture = builder.cpuArchitecture;
            this.createTime = builder.createTime;
            this.dataDiskAutoScale = builder.dataDiskAutoScale;
            this.dataDiskAutoScaleConfig = builder.dataDiskAutoScaleConfig;
            this.dataMergeTime = builder.dataMergeTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.diskType = builder.diskType;
            this.enableIsolationOptimization = builder.enableIsolationOptimization;
            this.enableProxyService = builder.enableProxyService;
            this.enableReadOnlyReplica = builder.enableReadOnlyReplica;
            this.enableReadOnlyReplicaManagement = builder.enableReadOnlyReplicaManagement;
            this.enableUpgradeLogDisk = builder.enableUpgradeLogDisk;
            this.exclusiveUnitNumLimit = builder.exclusiveUnitNumLimit;
            this.expireTime = builder.expireTime;
            this.inTempCapacityStatus = builder.inTempCapacityStatus;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRole = builder.instanceRole;
            this.isLatestObVersion = builder.isLatestObVersion;
            this.isTrustEcs = builder.isTrustEcs;
            this.isolationOptimization = builder.isolationOptimization;
            this.maintainTime = builder.maintainTime;
            this.nodeNum = builder.nodeNum;
            this.obRpmVersion = builder.obRpmVersion;
            this.payType = builder.payType;
            this.proxyClusterId = builder.proxyClusterId;
            this.proxyServiceStatus = builder.proxyServiceStatus;
            this.readOnlyResource = builder.readOnlyResource;
            this.replicaMode = builder.replicaMode;
            this.resource = builder.resource;
            this.series = builder.series;
            this.sharedUnitNumLimit = builder.sharedUnitNumLimit;
            this.status = builder.status;
            this.tenantCreatable = builder.tenantCreatable;
            this.unitSpec = builder.unitSpec;
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
         * @return dataDiskAutoScale
         */
        public Boolean getDataDiskAutoScale() {
            return this.dataDiskAutoScale;
        }

        /**
         * @return dataDiskAutoScaleConfig
         */
        public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
            return this.dataDiskAutoScaleConfig;
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
         * @return enableIsolationOptimization
         */
        public Boolean getEnableIsolationOptimization() {
            return this.enableIsolationOptimization;
        }

        /**
         * @return enableProxyService
         */
        public Boolean getEnableProxyService() {
            return this.enableProxyService;
        }

        /**
         * @return enableReadOnlyReplica
         */
        public Boolean getEnableReadOnlyReplica() {
            return this.enableReadOnlyReplica;
        }

        /**
         * @return enableReadOnlyReplicaManagement
         */
        public Boolean getEnableReadOnlyReplicaManagement() {
            return this.enableReadOnlyReplicaManagement;
        }

        /**
         * @return enableUpgradeLogDisk
         */
        public Boolean getEnableUpgradeLogDisk() {
            return this.enableUpgradeLogDisk;
        }

        /**
         * @return exclusiveUnitNumLimit
         */
        public Integer getExclusiveUnitNumLimit() {
            return this.exclusiveUnitNumLimit;
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
         * @return isolationOptimization
         */
        public Boolean getIsolationOptimization() {
            return this.isolationOptimization;
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
         * @return proxyClusterId
         */
        public String getProxyClusterId() {
            return this.proxyClusterId;
        }

        /**
         * @return proxyServiceStatus
         */
        public String getProxyServiceStatus() {
            return this.proxyServiceStatus;
        }

        /**
         * @return readOnlyResource
         */
        public ReadOnlyResource getReadOnlyResource() {
            return this.readOnlyResource;
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
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return sharedUnitNumLimit
         */
        public Integer getSharedUnitNumLimit() {
            return this.sharedUnitNumLimit;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantCreatable
         */
        public TenantCreatable getTenantCreatable() {
            return this.tenantCreatable;
        }

        /**
         * @return unitSpec
         */
        public String getUnitSpec() {
            return this.unitSpec;
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
            private String cpuArchitecture; 
            private String createTime; 
            private Boolean dataDiskAutoScale; 
            private DataDiskAutoScaleConfig dataDiskAutoScaleConfig; 
            private String dataMergeTime; 
            private String deployMode; 
            private String deployType; 
            private String diskType; 
            private Boolean enableIsolationOptimization; 
            private Boolean enableProxyService; 
            private Boolean enableReadOnlyReplica; 
            private Boolean enableReadOnlyReplicaManagement; 
            private Boolean enableUpgradeLogDisk; 
            private Integer exclusiveUnitNumLimit; 
            private String expireTime; 
            private Boolean inTempCapacityStatus; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRole; 
            private Boolean isLatestObVersion; 
            private Boolean isTrustEcs; 
            private Boolean isolationOptimization; 
            private String maintainTime; 
            private String nodeNum; 
            private String obRpmVersion; 
            private String payType; 
            private String proxyClusterId; 
            private String proxyServiceStatus; 
            private ReadOnlyResource readOnlyResource; 
            private String replicaMode; 
            private Resource resource; 
            private String series; 
            private Integer sharedUnitNumLimit; 
            private String status; 
            private TenantCreatable tenantCreatable; 
            private String unitSpec; 
            private String version; 
            private java.util.List < String > zones; 

            /**
             * The operation that you want to perform. <br>Set the value to **DescribeInstance**.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * Example 1
             */
            public Builder autoUpgradeObVersion(Boolean autoUpgradeObVersion) {
                this.autoUpgradeObVersion = autoUpgradeObVersion;
                return this;
            }

            /**
             * AvailableZones.
             */
            public Builder availableZones(java.util.List < String > availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * CpuArchitecture.
             */
            public Builder cpuArchitecture(String cpuArchitecture) {
                this.cpuArchitecture = cpuArchitecture;
                return this;
            }

            /**
             * Indicates whether the log disk specifications can be upgraded.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataDiskAutoScale.
             */
            public Builder dataDiskAutoScale(Boolean dataDiskAutoScale) {
                this.dataDiskAutoScale = dataDiskAutoScale;
                return this;
            }

            /**
             * DataDiskAutoScaleConfig.
             */
            public Builder dataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
                this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
                return this;
            }

            /**
             * The total number of CPU cores of the cluster.
             */
            public Builder dataMergeTime(String dataMergeTime) {
                this.dataMergeTime = dataMergeTime;
                return this;
            }

            /**
             * Alibaba Cloud CLI
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The total storage space of the cluster, in GB.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * EnableIsolationOptimization.
             */
            public Builder enableIsolationOptimization(Boolean enableIsolationOptimization) {
                this.enableIsolationOptimization = enableIsolationOptimization;
                return this;
            }

            /**
             * EnableProxyService.
             */
            public Builder enableProxyService(Boolean enableProxyService) {
                this.enableProxyService = enableProxyService;
                return this;
            }

            /**
             * EnableReadOnlyReplica.
             */
            public Builder enableReadOnlyReplica(Boolean enableReadOnlyReplica) {
                this.enableReadOnlyReplica = enableReadOnlyReplica;
                return this;
            }

            /**
             * EnableReadOnlyReplicaManagement.
             */
            public Builder enableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
                this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
                return this;
            }

            /**
             * EnableUpgradeLogDisk.
             */
            public Builder enableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
                this.enableUpgradeLogDisk = enableUpgradeLogDisk;
                return this;
            }

            /**
             * ExclusiveUnitNumLimit.
             */
            public Builder exclusiveUnitNumLimit(Integer exclusiveUnitNumLimit) {
                this.exclusiveUnitNumLimit = exclusiveUnitNumLimit;
                return this;
            }

            /**
             * The information of the OceanBase cluster.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InTempCapacityStatus.
             */
            public Builder inTempCapacityStatus(Boolean inTempCapacityStatus) {
                this.inTempCapacityStatus = inTempCapacityStatus;
                return this;
            }

            /**
             * The detailed information of the OBServer version.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The information about the log disk space of the cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether automatic upgrade of the OBServer version is enabled.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceRole.
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * IsLatestObVersion.
             */
            public Builder isLatestObVersion(Boolean isLatestObVersion) {
                this.isLatestObVersion = isLatestObVersion;
                return this;
            }

            /**
             * The information about the CPU resources of the cluster.
             */
            public Builder isTrustEcs(Boolean isTrustEcs) {
                this.isTrustEcs = isTrustEcs;
                return this;
            }

            /**
             * IsolationOptimization.
             */
            public Builder isolationOptimization(Boolean isolationOptimization) {
                this.isolationOptimization = isolationOptimization;
                return this;
            }

            /**
             * The time when the major compaction of cluster data is performed.
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
             * ObRpmVersion.
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * The list of zones.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ProxyClusterId.
             */
            public Builder proxyClusterId(String proxyClusterId) {
                this.proxyClusterId = proxyClusterId;
                return this;
            }

            /**
             * ProxyServiceStatus.
             */
            public Builder proxyServiceStatus(String proxyServiceStatus) {
                this.proxyServiceStatus = proxyServiceStatus;
                return this;
            }

            /**
             * ReadOnlyResource.
             */
            public Builder readOnlyResource(ReadOnlyResource readOnlyResource) {
                this.readOnlyResource = readOnlyResource;
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
             * The size of used memory in the cluster, in GB.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Indicates whether the OBServer version is the latest.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * SharedUnitNumLimit.
             */
            public Builder sharedUnitNumLimit(Integer sharedUnitNumLimit) {
                this.sharedUnitNumLimit = sharedUnitNumLimit;
                return this;
            }

            /**
             * The information about cluster resources.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantCreatable.
             */
            public Builder tenantCreatable(TenantCreatable tenantCreatable) {
                this.tenantCreatable = tenantCreatable;
                return this;
            }

            /**
             * UnitSpec.
             */
            public Builder unitSpec(String unitSpec) {
                this.unitSpec = unitSpec;
                return this;
            }

            /**
             * You can call this operation to query the detailed information of an OceanBase cluster.
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
