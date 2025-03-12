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
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information of the OceanBase cluster.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class DataDiskAutoScaleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Boolean autoScale;

        @com.aliyun.core.annotation.NameInMap("MaxDiskSize")
        private Long maxDiskSize;

        @com.aliyun.core.annotation.NameInMap("ScaleStepInMerge")
        private Long scaleStepInMerge;

        @com.aliyun.core.annotation.NameInMap("ScaleStepInNormal")
        private Long scaleStepInNormal;

        @com.aliyun.core.annotation.NameInMap("UpperMergeThreshold")
        private Long upperMergeThreshold;

        @com.aliyun.core.annotation.NameInMap("UpperScaleStep")
        private String upperScaleStep;

        @com.aliyun.core.annotation.NameInMap("UpperScaleStrategy")
        private String upperScaleStrategy;

        @com.aliyun.core.annotation.NameInMap("UpperThreshold")
        private Long upperThreshold;

        @com.aliyun.core.annotation.NameInMap("Upperbound")
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
            public Builder scaleStepInMerge(Long scaleStepInMerge) {
                this.scaleStepInMerge = scaleStepInMerge;
                return this;
            }

            /**
             * <p>The size of scaling step during daily use.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder scaleStepInNormal(Long scaleStepInNormal) {
                this.scaleStepInNormal = scaleStepInNormal;
                return this;
            }

            /**
             * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for major compactions.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder upperMergeThreshold(Long upperMergeThreshold) {
                this.upperMergeThreshold = upperMergeThreshold;
                return this;
            }

            /**
             * <p>The step size of the scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder upperScaleStep(String upperScaleStep) {
                this.upperScaleStep = upperScaleStep;
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
            public Builder upperThreshold(Long upperThreshold) {
                this.upperThreshold = upperThreshold;
                return this;
            }

            /**
             * <p>The maximum space, in GB, to which the data disk can be scaled.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class CapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("UsedCapacityUnit")
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
            public Builder usedCapacityUnit(String usedCapacityUnit) {
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
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Cpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalCpu")
        private Long originalTotalCpu;

        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Long totalCpu;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Long unitCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
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
             * <p>The number of original CPU cores in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * <p>The total number of CPU cores of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores of each replica node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores used by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class DiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUsedSize")
        private Double dataUsedSize;

        @com.aliyun.core.annotation.NameInMap("MaxDiskSize")
        private Double maxDiskSize;

        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedObServer")
        private java.util.List<String> maxDiskUsedObServer;

        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @com.aliyun.core.annotation.NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
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
        public java.util.List<String> getMaxDiskUsedObServer() {
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
            private java.util.List<String> maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * <p>The size of the data disk, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * <p>The maximum disk size that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>80000</p>
             */
            public Builder maxDiskSize(Double maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * <p>The maximum disk usage of the OBServer node.</p>
             */
            public Builder maxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * <p>The maximum disk usage, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.14</p>
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

            /**
             * <p>The original size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * <p>The total storage space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The storage space of each replica node in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder unitDiskSize(Long unitDiskSize) {
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
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class LogDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogAssignedSize")
        private String logAssignedSize;

        @com.aliyun.core.annotation.NameInMap("MaxLogAssignedObServer")
        private java.util.List<String> maxLogAssignedObServer;

        @com.aliyun.core.annotation.NameInMap("MaxLogAssignedPercent")
        private String maxLogAssignedPercent;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UnitDiskSize")
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
        public java.util.List<String> getMaxLogAssignedObServer() {
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
            private java.util.List<String> maxLogAssignedObServer; 
            private String maxLogAssignedPercent; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * <p>The allocated disk space for log storage, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder logAssignedSize(String logAssignedSize) {
                this.logAssignedSize = logAssignedSize;
                return this;
            }

            /**
             * <p>The maximum storage space allocated for.</p>
             */
            public Builder maxLogAssignedObServer(java.util.List<String> maxLogAssignedObServer) {
                this.maxLogAssignedObServer = maxLogAssignedObServer;
                return this;
            }

            /**
             * <p>The maximum percentage of space allocated for log storage.</p>
             * 
             * <strong>example:</strong>
             * <p>6.68</p>
             */
            public Builder maxLogAssignedPercent(String maxLogAssignedPercent) {
                this.maxLogAssignedPercent = maxLogAssignedPercent;
                return this;
            }

            /**
             * <p>The information about the log disk space of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The log disk space of each replica node in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalMemory")
        private Long originalTotalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

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
             * <p>The original memory size of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * <p>The total memory size of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder totalMemory(Long totalMemory) {
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
             * <p>The size of memory used by the cluster, in GB.</p>
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
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ReadOnlyResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private CapacityUnit capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Cpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private DiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("LogDiskSize")
        private LogDiskSize logDiskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("UnitCount")
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
             * <p>The information about the log disk space of the cluster.</p>
             */
            public Builder logDiskSize(LogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
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

            public ReadOnlyResource build() {
                return new ReadOnlyResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ResourceCapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnit")
        private Integer maxCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnit")
        private Integer minCapacityUnit;

        @com.aliyun.core.annotation.NameInMap("UsedCapacityUnit")
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
            public Builder usedCapacityUnit(String usedCapacityUnit) {
                this.usedCapacityUnit = usedCapacityUnit;
                return this;
            }

            public ResourceCapacityUnit build() {
                return new ResourceCapacityUnit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ResourceCpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalCpu")
        private Long originalTotalCpu;

        @com.aliyun.core.annotation.NameInMap("TotalCpu")
        private Long totalCpu;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Long unitCpu;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
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
             * <p>The number of original CPU cores in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder originalTotalCpu(Long originalTotalCpu) {
                this.originalTotalCpu = originalTotalCpu;
                return this;
            }

            /**
             * <p>The total number of CPU cores of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder totalCpu(Long totalCpu) {
                this.totalCpu = totalCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores of each replica node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitCpu(Long unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores used in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ResourceDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUsedSize")
        private Double dataUsedSize;

        @com.aliyun.core.annotation.NameInMap("MaxDiskSize")
        private Double maxDiskSize;

        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedObServer")
        private java.util.List<String> maxDiskUsedObServer;

        @com.aliyun.core.annotation.NameInMap("MaxDiskUsedPercent")
        private Double maxDiskUsedPercent;

        @com.aliyun.core.annotation.NameInMap("OriginalTotalDiskSize")
        private Long originalTotalDiskSize;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UnitDiskSize")
        private Long unitDiskSize;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
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
        public java.util.List<String> getMaxDiskUsedObServer() {
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
            private java.util.List<String> maxDiskUsedObServer; 
            private Double maxDiskUsedPercent; 
            private Long originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 
            private Long usedDiskSize; 

            /**
             * <p>The size of the data disk, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder dataUsedSize(Double dataUsedSize) {
                this.dataUsedSize = dataUsedSize;
                return this;
            }

            /**
             * <p>The maximum disk size that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>80000</p>
             */
            public Builder maxDiskSize(Double maxDiskSize) {
                this.maxDiskSize = maxDiskSize;
                return this;
            }

            /**
             * <p>The maximum disk usage of the OBServer node.</p>
             */
            public Builder maxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
                this.maxDiskUsedObServer = maxDiskUsedObServer;
                return this;
            }

            /**
             * <p>The maximum disk usage, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.14</p>
             */
            public Builder maxDiskUsedPercent(Double maxDiskUsedPercent) {
                this.maxDiskUsedPercent = maxDiskUsedPercent;
                return this;
            }

            /**
             * <p>The original size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder originalTotalDiskSize(Long originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * <p>The total storage space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The storage space of each replica node in the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder unitDiskSize(Long unitDiskSize) {
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

            public ResourceDiskSize build() {
                return new ResourceDiskSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ResourceLogDiskSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogAssignedSize")
        private String logAssignedSize;

        @com.aliyun.core.annotation.NameInMap("MaxLogAssignedObServer")
        private java.util.List<String> maxLogAssignedObServer;

        @com.aliyun.core.annotation.NameInMap("MaxLogAssignedPercent")
        private String maxLogAssignedPercent;

        @com.aliyun.core.annotation.NameInMap("OriginalTotalDiskSize")
        private Integer originalTotalDiskSize;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Long totalDiskSize;

        @com.aliyun.core.annotation.NameInMap("UnitDiskSize")
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
        public java.util.List<String> getMaxLogAssignedObServer() {
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
            private java.util.List<String> maxLogAssignedObServer; 
            private String maxLogAssignedPercent; 
            private Integer originalTotalDiskSize; 
            private Long totalDiskSize; 
            private Long unitDiskSize; 

            /**
             * <p>The allocated disk space for log storage, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder logAssignedSize(String logAssignedSize) {
                this.logAssignedSize = logAssignedSize;
                return this;
            }

            /**
             * <p>The maximum storage space allocated for.</p>
             */
            public Builder maxLogAssignedObServer(java.util.List<String> maxLogAssignedObServer) {
                this.maxLogAssignedObServer = maxLogAssignedObServer;
                return this;
            }

            /**
             * <p>The maximum percentage of space allocated for log storage.</p>
             * 
             * <strong>example:</strong>
             * <p>6.68</p>
             */
            public Builder maxLogAssignedPercent(String maxLogAssignedPercent) {
                this.maxLogAssignedPercent = maxLogAssignedPercent;
                return this;
            }

            /**
             * <p>The original size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder originalTotalDiskSize(Integer originalTotalDiskSize) {
                this.originalTotalDiskSize = originalTotalDiskSize;
                return this;
            }

            /**
             * <p>The total log disk space of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder totalDiskSize(Long totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            /**
             * <p>The log disk space of each replica node in the cluster. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class ResourceMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalTotalMemory")
        private Long originalTotalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        @com.aliyun.core.annotation.NameInMap("UnitMemory")
        private Long unitMemory;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
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
             * <p>The original memory size of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder originalTotalMemory(Long originalTotalMemory) {
                this.originalTotalMemory = originalTotalMemory;
                return this;
            }

            /**
             * <p>The total memory size of the cluster, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder totalMemory(Long totalMemory) {
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

            public ResourceMemory build() {
                return new ResourceMemory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private ResourceCapacityUnit capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private ResourceCpu cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private ResourceDiskSize diskSize;

        @com.aliyun.core.annotation.NameInMap("LogDiskSize")
        private ResourceLogDiskSize logDiskSize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private ResourceMemory memory;

        @com.aliyun.core.annotation.NameInMap("UnitCount")
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
             * <p>The information about capacity units.</p>
             */
            public Builder capacityUnit(ResourceCapacityUnit capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * <p>The information about the CPU resources of the cluster.</p>
             */
            public Builder cpu(ResourceCpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The information about the storage resources of the cluster.</p>
             */
            public Builder diskSize(ResourceDiskSize diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The information about the log disk space of the cluster.</p>
             */
            public Builder logDiskSize(ResourceLogDiskSize logDiskSize) {
                this.logDiskSize = logDiskSize;
                return this;
            }

            /**
             * <p>The information about the memory resources of the cluster.</p>
             */
            public Builder memory(ResourceMemory memory) {
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
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class TenantCreatable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableCreateTenantReason")
        private String disableCreateTenantReason;

        @com.aliyun.core.annotation.NameInMap("EnableCreateTenant")
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
             * <p>The reason why you cannot create a tenant in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU_NOT_ENOUGH,  MEMORY_NOT_ENOUGH, TENANT_COUNT_EXCEEDS_LIMIT</p>
             */
            public Builder disableCreateTenantReason(String disableCreateTenantReason) {
                this.disableCreateTenantReason = disableCreateTenantReason;
                return this;
            }

            /**
             * <p>Specifies whether a tenant can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCreateProxySqlFirewallRule")
        private Boolean allowCreateProxySqlFirewallRule;

        @com.aliyun.core.annotation.NameInMap("AllowModifyInternetAddressConnectionLimit")
        private Boolean allowModifyInternetAddressConnectionLimit;

        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("AutoUpgradeObVersion")
        private Boolean autoUpgradeObVersion;

        @com.aliyun.core.annotation.NameInMap("AvailableZones")
        private java.util.List<String> availableZones;

        @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataDiskAutoScale")
        private Boolean dataDiskAutoScale;

        @com.aliyun.core.annotation.NameInMap("DataDiskAutoScaleConfig")
        private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        @com.aliyun.core.annotation.NameInMap("DataMergeTime")
        private String dataMergeTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EnableIsolationOptimization")
        private Boolean enableIsolationOptimization;

        @com.aliyun.core.annotation.NameInMap("EnableProxyService")
        private Boolean enableProxyService;

        @com.aliyun.core.annotation.NameInMap("EnableReadOnlyReplica")
        private Boolean enableReadOnlyReplica;

        @com.aliyun.core.annotation.NameInMap("EnableReadOnlyReplicaManagement")
        private Boolean enableReadOnlyReplicaManagement;

        @com.aliyun.core.annotation.NameInMap("EnableUpgradeLogDisk")
        private Boolean enableUpgradeLogDisk;

        @com.aliyun.core.annotation.NameInMap("ExclusiveUnitNumLimit")
        private Integer exclusiveUnitNumLimit;

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

        @com.aliyun.core.annotation.NameInMap("IsLatestObVersion")
        private Boolean isLatestObVersion;

        @com.aliyun.core.annotation.NameInMap("IsTrustEcs")
        private Boolean isTrustEcs;

        @com.aliyun.core.annotation.NameInMap("IsolationOptimization")
        private Boolean isolationOptimization;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private String nodeNum;

        @com.aliyun.core.annotation.NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PrimaryInstance")
        private String primaryInstance;

        @com.aliyun.core.annotation.NameInMap("PrimaryRegion")
        private String primaryRegion;

        @com.aliyun.core.annotation.NameInMap("ProxyClusterId")
        private String proxyClusterId;

        @com.aliyun.core.annotation.NameInMap("ProxyServiceStatus")
        private String proxyServiceStatus;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyResource")
        private ReadOnlyResource readOnlyResource;

        @com.aliyun.core.annotation.NameInMap("ReplicaMode")
        private String replicaMode;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("SharedUnitNumLimit")
        private Integer sharedUnitNumLimit;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantCreatable")
        private TenantCreatable tenantCreatable;

        @com.aliyun.core.annotation.NameInMap("UnitSpec")
        private String unitSpec;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private Instance(Builder builder) {
            this.allowCreateProxySqlFirewallRule = builder.allowCreateProxySqlFirewallRule;
            this.allowModifyInternetAddressConnectionLimit = builder.allowModifyInternetAddressConnectionLimit;
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
            this.primaryInstance = builder.primaryInstance;
            this.primaryRegion = builder.primaryRegion;
            this.proxyClusterId = builder.proxyClusterId;
            this.proxyServiceStatus = builder.proxyServiceStatus;
            this.readOnlyResource = builder.readOnlyResource;
            this.replicaMode = builder.replicaMode;
            this.resource = builder.resource;
            this.series = builder.series;
            this.sharedUnitNumLimit = builder.sharedUnitNumLimit;
            this.specType = builder.specType;
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
         * @return allowCreateProxySqlFirewallRule
         */
        public Boolean getAllowCreateProxySqlFirewallRule() {
            return this.allowCreateProxySqlFirewallRule;
        }

        /**
         * @return allowModifyInternetAddressConnectionLimit
         */
        public Boolean getAllowModifyInternetAddressConnectionLimit() {
            return this.allowModifyInternetAddressConnectionLimit;
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
        public java.util.List<String> getAvailableZones() {
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
         * @return primaryInstance
         */
        public String getPrimaryInstance() {
            return this.primaryInstance;
        }

        /**
         * @return primaryRegion
         */
        public String getPrimaryRegion() {
            return this.primaryRegion;
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
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
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
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private Boolean allowCreateProxySqlFirewallRule; 
            private Boolean allowModifyInternetAddressConnectionLimit; 
            private Boolean autoRenewal; 
            private Boolean autoUpgradeObVersion; 
            private java.util.List<String> availableZones; 
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
            private String primaryInstance; 
            private String primaryRegion; 
            private String proxyClusterId; 
            private String proxyServiceStatus; 
            private ReadOnlyResource readOnlyResource; 
            private String replicaMode; 
            private Resource resource; 
            private String series; 
            private Integer sharedUnitNumLimit; 
            private String specType; 
            private String status; 
            private TenantCreatable tenantCreatable; 
            private String unitSpec; 
            private String version; 
            private java.util.List<String> zones; 

            /**
             * <p>Indicates whether the OceanBase Database Proxy (ODP) SQL firewall is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowCreateProxySqlFirewallRule(Boolean allowCreateProxySqlFirewallRule) {
                this.allowCreateProxySqlFirewallRule = allowCreateProxySqlFirewallRule;
                return this;
            }

            /**
             * <p>Indicates whether the maximum number of public connections can be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowModifyInternetAddressConnectionLimit(Boolean allowModifyInternetAddressConnectionLimit) {
                this.allowModifyInternetAddressConnectionLimit = allowModifyInternetAddressConnectionLimit;
                return this;
            }

            /**
             * <p>Indicates whether automatic renewal is enabled. </p>
             * <p>This parameter is valid only for clusters whose billing methods are set to PREPAY.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>Indicates whether automatic upgrade of the OBServer version is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgradeObVersion(Boolean autoUpgradeObVersion) {
                this.autoUpgradeObVersion = autoUpgradeObVersion;
                return this;
            }

            /**
             * <p>The list of zones.</p>
             */
            public Builder availableZones(java.util.List<String> availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * <p>The CPU architecture of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>X86</p>
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
             * <p>Specifies whether to enable automatic scaling of the data disk.</p>
             * <blockquote>
             * <p><br>This parameter is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder dataDiskAutoScale(Boolean dataDiskAutoScale) {
                this.dataDiskAutoScale = dataDiskAutoScale;
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
             * <p>The time when the major compaction of cluster data is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00</p>
             */
            public Builder dataMergeTime(String dataMergeTime) {
                this.dataMergeTime = dataMergeTime;
                return this;
            }

            /**
             * <p>The data replica distribution mode of the cluster. Valid values: </p>
             * <ul>
             * <li>n: indicates the single-IDC mode. </li>
             * <li>n-n: indicates the dual-IDC mode. </li>
             * <li>n-n-n: indicates the multi-IDC mode.</li>
             * </ul>
             * <blockquote>
             * <p><br>The integer n represents the number of OBServer nodes in each IDC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1-1-1</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The deployment type of the cluster. Valid values:  </p>
             * <ul>
             * <li>multiple: multi-IDC deployment   </li>
             * <li>single: single-IDC deployment   </li>
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
             * <p>The type of the storage disk where the cluster is deployed. </p>
             * <p>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd_pl1</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>Specifies whether to enable isolation optimization.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIsolationOptimization(Boolean enableIsolationOptimization) {
                this.enableIsolationOptimization = enableIsolationOptimization;
                return this;
            }

            /**
             * <p>Specifies whether to enable the proxy service.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableProxyService(Boolean enableProxyService) {
                this.enableProxyService = enableProxyService;
                return this;
            }

            /**
             * <p>Indicates whether read-only replicas are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableReadOnlyReplica(Boolean enableReadOnlyReplica) {
                this.enableReadOnlyReplica = enableReadOnlyReplica;
                return this;
            }

            /**
             * <p>Indicates whether read-only replicas can be purchased for the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
                this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
                return this;
            }

            /**
             * <p>Indicates whether the log disk specifications can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
                this.enableUpgradeLogDisk = enableUpgradeLogDisk;
                return this;
            }

            /**
             * <p>The maximum number of units of the proxy service in exclusive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder exclusiveUnitNumLimit(Integer exclusiveUnitNumLimit) {
                this.exclusiveUnitNumLimit = exclusiveUnitNumLimit;
                return this;
            }

            /**
             * <p>The time in UTC when the cluster expires.</p>
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
             * <p>The specifications of the cluster.  You can specify one of the following four plans:    </p>
             * <ul>
             * <li>8C32G: indicates 8 CPU cores and 32 GB of memory. </li>
             * <li>14C70G: indicates 14 CPU cores and 70 GB of memory. </li>
             * <li>30C180G: indicates 30 CPU cores and 180 GB of memory. </li>
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
             * <p>Indicates whether the OBServer version is the latest.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLatestObVersion(Boolean isLatestObVersion) {
                this.isLatestObVersion = isLatestObVersion;
                return this;
            }

            /**
             * <p>Indicates whether trusted ECS instances are used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTrustEcs(Boolean isTrustEcs) {
                this.isTrustEcs = isTrustEcs;
                return this;
            }

            /**
             * <p>Specifies whether to enable the control group feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isolationOptimization(Boolean isolationOptimization) {
                this.isolationOptimization = isolationOptimization;
                return this;
            }

            /**
             * <p>The period in UTC for the daily routine maintenance of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>19:00Z-20:00Z</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The number of nodes in the cluster. If the cluster is deployed in n-n-n mode, the number of nodes in the cluster equals n × 3.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder nodeNum(String nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The detailed information of the OBServer version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.77-20210526202046</p>
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * <p>The billing method of the OceanBase cluster. Valid values: </p>
             * <ul>
             * <li>PREPAY: the subscription billing method. </li>
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
             * <p>The ID of the primary cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob3h8ytroxxxxx</p>
             */
            public Builder primaryInstance(String primaryInstance) {
                this.primaryInstance = primaryInstance;
                return this;
            }

            /**
             * <p>The region of the primary cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * <p>The ID of the proxy cluster.</p>
             * <blockquote>
             * <p>This parameter returns a value only if you set the <strong>EnableProxyService</strong> parameter to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>proxy-56****a6tg2o</p>
             */
            public Builder proxyClusterId(String proxyClusterId) {
                this.proxyClusterId = proxyClusterId;
                return this;
            }

            /**
             * <p>The status of the proxy service.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder proxyServiceStatus(String proxyServiceStatus) {
                this.proxyServiceStatus = proxyServiceStatus;
                return this;
            }

            /**
             * <p>The information about cluster resources.</p>
             */
            public Builder readOnlyResource(ReadOnlyResource readOnlyResource) {
                this.readOnlyResource = readOnlyResource;
                return this;
            }

            /**
             * <p>The number of full-featured replicas. Return value: 3 or 2.</p>
             * <ul>
             * <li>3: three full-featured replicas.</li>
             * <li>2: two full-featured replicas.</li>
             * </ul>
             * <p>An OceanBase cluster deployed in three-zone mode supports only three full-featured replicas. An OceanBase cluster deployed in two-zone mode supports only two full-featured replicas. An OceanBase cluster deployed in one single zone supports two or three full-featured replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2F1A</p>
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
             * <p>The series of the instance. Valid values:</p>
             * <ul>
             * <li><p>normal: Standard Cluster Edition (Cloud Disk). This is the default value.</p>
             * </li>
             * <li><p>normal_ssd: Standard Cluster Edition (Local Disk)</p>
             * </li>
             * <li><p>history: History Database Cluster Edition</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The maximum number of units of the proxy service in shared mode.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sharedUnitNumLimit(Integer sharedUnitNumLimit) {
                this.sharedUnitNumLimit = sharedUnitNumLimit;
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
             * <p>The status of the cluster. Valid values: </p>
             * <ul>
             * <li>PENDING_CREATE: The cluster is being created. </li>
             * <li>ONLINE: The cluster is running. </li>
             * <li>TENANT_CREATING: The tenant is being created. </li>
             * <li>TENANT_SPEC_MODIFYING: The tenant specifications are being modified. </li>
             * <li>EXPANDING: Nodes are being added to the cluster to increase its capacity. </li>
             * <li>REDUCING: Nodes are being removed from the cluster to reduce its capacity. </li>
             * <li>SPEC_UPGRADING: The service plan is being upgraded. </li>
             * <li>DISK_UPGRADING: The storage space is being expanded. </li>
             * <li>WHITE_LIST_MODIFYING: The whitelist is being modified. </li>
             * <li>PARAMETER_MODIFYING: Parameters are being modified. </li>
             * <li>SSL_MODIFYING: The SSL certificate is being changed. </li>
             * <li>PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY. </li>
             * <li>ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY. </li>
             * <li>PENDING_DELETE: The cluster is being deleted.<br>Generally, the cluster is in the ONLINE state.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether a tenant can be created.</p>
             */
            public Builder tenantCreatable(TenantCreatable tenantCreatable) {
                this.tenantCreatable = tenantCreatable;
                return this;
            }

            /**
             * <p>The unit specification of the proxy service.</p>
             * 
             * <strong>example:</strong>
             * <p>2C4G</p>
             */
            public Builder unitSpec(String unitSpec) {
                this.unitSpec = unitSpec;
                return this;
            }

            /**
             * <p>The version of OceanBase Database.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.77</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the zone to which the instance belongs.
             * &lt;props=&quot;intl&quot;&gt;For more information about how to obtain the list of zones, see <a href="https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describezones">DescribeZones</a>.</p>
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
