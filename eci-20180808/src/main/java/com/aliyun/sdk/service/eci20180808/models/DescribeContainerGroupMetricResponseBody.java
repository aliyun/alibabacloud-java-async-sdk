// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupMetricResponseBody</p>
 */
public class DescribeContainerGroupMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    private String containerGroupId;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerGroupMetricResponseBody(Builder builder) {
        this.containerGroupId = builder.containerGroupId;
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String containerGroupId; 
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp1dqpye03ke5s6p****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The monitoring data of the elastic container instance.</p>
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D81A4A13-6DCC-4579-AC62-90A6C3EC7BBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerGroupMetricResponseBody build() {
            return new DescribeContainerGroupMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class CPU extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Long limit;

        @com.aliyun.core.annotation.NameInMap("Load")
        private Long load;

        @com.aliyun.core.annotation.NameInMap("UsageCoreNanoSeconds")
        private Long usageCoreNanoSeconds;

        @com.aliyun.core.annotation.NameInMap("UsageNanoCores")
        private Long usageNanoCores;

        private CPU(Builder builder) {
            this.limit = builder.limit;
            this.load = builder.load;
            this.usageCoreNanoSeconds = builder.usageCoreNanoSeconds;
            this.usageNanoCores = builder.usageNanoCores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CPU create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Long getLimit() {
            return this.limit;
        }

        /**
         * @return load
         */
        public Long getLoad() {
            return this.load;
        }

        /**
         * @return usageCoreNanoSeconds
         */
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        /**
         * @return usageNanoCores
         */
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public static final class Builder {
            private Long limit; 
            private Long load; 
            private Long usageCoreNanoSeconds; 
            private Long usageNanoCores; 

            /**
             * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The average load in the last 10 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder load(Long load) {
                this.load = load;
                return this;
            }

            /**
             * <p>The cumulative usage of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>70769883</p>
             */
            public Builder usageCoreNanoSeconds(Long usageCoreNanoSeconds) {
                this.usageCoreNanoSeconds = usageCoreNanoSeconds;
                return this;
            }

            /**
             * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usageNanoCores(Long usageNanoCores) {
                this.usageNanoCores = usageNanoCores;
                return this;
            }

            public CPU build() {
                return new CPU(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class ContainersCPU extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Long limit;

        @com.aliyun.core.annotation.NameInMap("Load")
        private Long load;

        @com.aliyun.core.annotation.NameInMap("UsageCoreNanoSeconds")
        private Long usageCoreNanoSeconds;

        @com.aliyun.core.annotation.NameInMap("UsageNanoCores")
        private Long usageNanoCores;

        private ContainersCPU(Builder builder) {
            this.limit = builder.limit;
            this.load = builder.load;
            this.usageCoreNanoSeconds = builder.usageCoreNanoSeconds;
            this.usageNanoCores = builder.usageNanoCores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainersCPU create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Long getLimit() {
            return this.limit;
        }

        /**
         * @return load
         */
        public Long getLoad() {
            return this.load;
        }

        /**
         * @return usageCoreNanoSeconds
         */
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        /**
         * @return usageNanoCores
         */
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public static final class Builder {
            private Long limit; 
            private Long load; 
            private Long usageCoreNanoSeconds; 
            private Long usageNanoCores; 

            /**
             * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The average load in the last 10 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder load(Long load) {
                this.load = load;
                return this;
            }

            /**
             * <p>The cumulative usage of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>40876694</p>
             */
            public Builder usageCoreNanoSeconds(Long usageCoreNanoSeconds) {
                this.usageCoreNanoSeconds = usageCoreNanoSeconds;
                return this;
            }

            /**
             * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usageNanoCores(Long usageNanoCores) {
                this.usageNanoCores = usageNanoCores;
                return this;
            }

            public ContainersCPU build() {
                return new ContainersCPU(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableBytes")
        private Long availableBytes;

        @com.aliyun.core.annotation.NameInMap("Cache")
        private Long cache;

        @com.aliyun.core.annotation.NameInMap("Rss")
        private Long rss;

        @com.aliyun.core.annotation.NameInMap("UsageBytes")
        private Long usageBytes;

        @com.aliyun.core.annotation.NameInMap("WorkingSet")
        private Long workingSet;

        private Memory(Builder builder) {
            this.availableBytes = builder.availableBytes;
            this.cache = builder.cache;
            this.rss = builder.rss;
            this.usageBytes = builder.usageBytes;
            this.workingSet = builder.workingSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return availableBytes
         */
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        /**
         * @return cache
         */
        public Long getCache() {
            return this.cache;
        }

        /**
         * @return rss
         */
        public Long getRss() {
            return this.rss;
        }

        /**
         * @return usageBytes
         */
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        /**
         * @return workingSet
         */
        public Long getWorkingSet() {
            return this.workingSet;
        }

        public static final class Builder {
            private Long availableBytes; 
            private Long cache; 
            private Long rss; 
            private Long usageBytes; 
            private Long workingSet; 

            /**
             * <p>The size of the available memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4285091840</p>
             */
            public Builder availableBytes(Long availableBytes) {
                this.availableBytes = availableBytes;
                return this;
            }

            /**
             * <p>The size of the cache. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder cache(Long cache) {
                this.cache = cache;
                return this;
            }

            /**
             * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder rss(Long rss) {
                this.rss = rss;
                return this;
            }

            /**
             * <p>The size of the used memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder usageBytes(Long usageBytes) {
                this.usageBytes = usageBytes;
                return this;
            }

            /**
             * <p>The usage of the working set. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder workingSet(Long workingSet) {
                this.workingSet = workingSet;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private ContainersCPU CPU;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Containers(Builder builder) {
            this.CPU = builder.CPU;
            this.memory = builder.memory;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public ContainersCPU getCPU() {
            return this.CPU;
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private ContainersCPU CPU; 
            private Memory memory; 
            private String name; 

            /**
             * <p>The vCPU monitoring data of the container.</p>
             */
            public Builder CPU(ContainersCPU CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The memory monitoring data of the container.</p>
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>u1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("ReadBytes")
        private Long readBytes;

        @com.aliyun.core.annotation.NameInMap("ReadIO")
        private Long readIO;

        @com.aliyun.core.annotation.NameInMap("WriteBytes")
        private Long writeBytes;

        @com.aliyun.core.annotation.NameInMap("WriteIO")
        private Long writeIO;

        private Disk(Builder builder) {
            this.device = builder.device;
            this.readBytes = builder.readBytes;
            this.readIO = builder.readIO;
            this.writeBytes = builder.writeBytes;
            this.writeIO = builder.writeIO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return readBytes
         */
        public Long getReadBytes() {
            return this.readBytes;
        }

        /**
         * @return readIO
         */
        public Long getReadIO() {
            return this.readIO;
        }

        /**
         * @return writeBytes
         */
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        /**
         * @return writeIO
         */
        public Long getWriteIO() {
            return this.writeIO;
        }

        public static final class Builder {
            private String device; 
            private Long readBytes; 
            private Long readIO; 
            private Long writeBytes; 
            private Long writeIO; 

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/vda</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The amount of data that was read from the disk. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>210714112</p>
             */
            public Builder readBytes(Long readBytes) {
                this.readBytes = readBytes;
                return this;
            }

            /**
             * <p>This parameter is unavailable for public use.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder readIO(Long readIO) {
                this.readIO = readIO;
                return this;
            }

            /**
             * <p>The amount of data that was written to the disk. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1375109120</p>
             */
            public Builder writeBytes(Long writeBytes) {
                this.writeBytes = writeBytes;
                return this;
            }

            /**
             * <p>This parameter is unavailable for public use.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder writeIO(Long writeIO) {
                this.writeIO = writeIO;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Filesystem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Long available;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("FsName")
        private String fsName;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private Filesystem(Builder builder) {
            this.available = builder.available;
            this.capacity = builder.capacity;
            this.category = builder.category;
            this.fsName = builder.fsName;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filesystem create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Long getAvailable() {
            return this.available;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return fsName
         */
        public String getFsName() {
            return this.fsName;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long available; 
            private Long capacity; 
            private String category; 
            private String fsName; 
            private Long usage; 

            /**
             * <p>The size of the available space.</p>
             * 
             * <strong>example:</strong>
             * <p>35319836672</p>
             */
            public Builder available(Long available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The total file system space.</p>
             * 
             * <strong>example:</strong>
             * <p>41610981376</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The type of the partition. Valid values:</p>
             * <ul>
             * <li>System</li>
             * <li>Volume</li>
             * <li>Other</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The name of the partition.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/root</p>
             */
            public Builder fsName(String fsName) {
                this.fsName = fsName;
                return this;
            }

            /**
             * <p>The size of used space.</p>
             * 
             * <strong>example:</strong>
             * <p>4368744448</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public Filesystem build() {
                return new Filesystem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class RecordsMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableBytes")
        private Long availableBytes;

        @com.aliyun.core.annotation.NameInMap("Cache")
        private Long cache;

        @com.aliyun.core.annotation.NameInMap("Rss")
        private Long rss;

        @com.aliyun.core.annotation.NameInMap("UsageBytes")
        private Long usageBytes;

        @com.aliyun.core.annotation.NameInMap("WorkingSet")
        private Long workingSet;

        private RecordsMemory(Builder builder) {
            this.availableBytes = builder.availableBytes;
            this.cache = builder.cache;
            this.rss = builder.rss;
            this.usageBytes = builder.usageBytes;
            this.workingSet = builder.workingSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordsMemory create() {
            return builder().build();
        }

        /**
         * @return availableBytes
         */
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        /**
         * @return cache
         */
        public Long getCache() {
            return this.cache;
        }

        /**
         * @return rss
         */
        public Long getRss() {
            return this.rss;
        }

        /**
         * @return usageBytes
         */
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        /**
         * @return workingSet
         */
        public Long getWorkingSet() {
            return this.workingSet;
        }

        public static final class Builder {
            private Long availableBytes; 
            private Long cache; 
            private Long rss; 
            private Long usageBytes; 
            private Long workingSet; 

            /**
             * <p>The size of the available memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4285091840</p>
             */
            public Builder availableBytes(Long availableBytes) {
                this.availableBytes = availableBytes;
                return this;
            }

            /**
             * <p>The size of the cache. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder cache(Long cache) {
                this.cache = cache;
                return this;
            }

            /**
             * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder rss(Long rss) {
                this.rss = rss;
                return this;
            }

            /**
             * <p>The size of the used memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder usageBytes(Long usageBytes) {
                this.usageBytes = usageBytes;
                return this;
            }

            /**
             * <p>The usage of the working set. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9289728</p>
             */
            public Builder workingSet(Long workingSet) {
                this.workingSet = workingSet;
                return this;
            }

            public RecordsMemory build() {
                return new RecordsMemory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Interfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RxBytes")
        private Long rxBytes;

        @com.aliyun.core.annotation.NameInMap("RxDrops")
        private Long rxDrops;

        @com.aliyun.core.annotation.NameInMap("RxErrors")
        private Long rxErrors;

        @com.aliyun.core.annotation.NameInMap("RxPackets")
        private Long rxPackets;

        @com.aliyun.core.annotation.NameInMap("TxBytes")
        private Long txBytes;

        @com.aliyun.core.annotation.NameInMap("TxDrops")
        private Long txDrops;

        @com.aliyun.core.annotation.NameInMap("TxErrors")
        private Long txErrors;

        @com.aliyun.core.annotation.NameInMap("TxPackets")
        private Long txPackets;

        private Interfaces(Builder builder) {
            this.name = builder.name;
            this.rxBytes = builder.rxBytes;
            this.rxDrops = builder.rxDrops;
            this.rxErrors = builder.rxErrors;
            this.rxPackets = builder.rxPackets;
            this.txBytes = builder.txBytes;
            this.txDrops = builder.txDrops;
            this.txErrors = builder.txErrors;
            this.txPackets = builder.txPackets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Interfaces create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rxBytes
         */
        public Long getRxBytes() {
            return this.rxBytes;
        }

        /**
         * @return rxDrops
         */
        public Long getRxDrops() {
            return this.rxDrops;
        }

        /**
         * @return rxErrors
         */
        public Long getRxErrors() {
            return this.rxErrors;
        }

        /**
         * @return rxPackets
         */
        public Long getRxPackets() {
            return this.rxPackets;
        }

        /**
         * @return txBytes
         */
        public Long getTxBytes() {
            return this.txBytes;
        }

        /**
         * @return txDrops
         */
        public Long getTxDrops() {
            return this.txDrops;
        }

        /**
         * @return txErrors
         */
        public Long getTxErrors() {
            return this.txErrors;
        }

        /**
         * @return txPackets
         */
        public Long getTxPackets() {
            return this.txPackets;
        }

        public static final class Builder {
            private String name; 
            private Long rxBytes; 
            private Long rxDrops; 
            private Long rxErrors; 
            private Long rxPackets; 
            private Long txBytes; 
            private Long txDrops; 
            private Long txErrors; 
            private Long txPackets; 

            /**
             * <p>The name of the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of bytes received by the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>505001954</p>
             */
            public Builder rxBytes(Long rxBytes) {
                this.rxBytes = rxBytes;
                return this;
            }

            /**
             * <p>The number of received packets dropped on the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rxDrops(Long rxDrops) {
                this.rxDrops = rxDrops;
                return this;
            }

            /**
             * <p>The number of received packet errors on the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rxErrors(Long rxErrors) {
                this.rxErrors = rxErrors;
                return this;
            }

            /**
             * <p>The number of packets received by the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>4800583</p>
             */
            public Builder rxPackets(Long rxPackets) {
                this.rxPackets = rxPackets;
                return this;
            }

            /**
             * <p>The number of bytes transmitted by the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>1381805699</p>
             */
            public Builder txBytes(Long txBytes) {
                this.txBytes = txBytes;
                return this;
            }

            /**
             * <p>The number of transmitted packets dropped on the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder txDrops(Long txDrops) {
                this.txDrops = txDrops;
                return this;
            }

            /**
             * <p>The number of transmitted packet errors on the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder txErrors(Long txErrors) {
                this.txErrors = txErrors;
                return this;
            }

            /**
             * <p>The number of packets transmitted by the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>5158427</p>
             */
            public Builder txPackets(Long txPackets) {
                this.txPackets = txPackets;
                return this;
            }

            public Interfaces build() {
                return new Interfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interfaces")
        private java.util.List < Interfaces> interfaces;

        private Network(Builder builder) {
            this.interfaces = builder.interfaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return interfaces
         */
        public java.util.List < Interfaces> getInterfaces() {
            return this.interfaces;
        }

        public static final class Builder {
            private java.util.List < Interfaces> interfaces; 

            /**
             * <p>The monitoring data of network interface controllers (NICs).</p>
             */
            public Builder interfaces(java.util.List < Interfaces> interfaces) {
                this.interfaces = interfaces;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupMetricResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private CPU CPU;

        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List < Containers> containers;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private java.util.List < Disk> disk;

        @com.aliyun.core.annotation.NameInMap("Filesystem")
        private java.util.List < Filesystem> filesystem;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private RecordsMemory memory;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Records(Builder builder) {
            this.CPU = builder.CPU;
            this.containers = builder.containers;
            this.disk = builder.disk;
            this.filesystem = builder.filesystem;
            this.memory = builder.memory;
            this.network = builder.network;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public CPU getCPU() {
            return this.CPU;
        }

        /**
         * @return containers
         */
        public java.util.List < Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return disk
         */
        public java.util.List < Disk> getDisk() {
            return this.disk;
        }

        /**
         * @return filesystem
         */
        public java.util.List < Filesystem> getFilesystem() {
            return this.filesystem;
        }

        /**
         * @return memory
         */
        public RecordsMemory getMemory() {
            return this.memory;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private CPU CPU; 
            private java.util.List < Containers> containers; 
            private java.util.List < Disk> disk; 
            private java.util.List < Filesystem> filesystem; 
            private RecordsMemory memory; 
            private Network network; 
            private String timestamp; 

            /**
             * <p>The monitoring data of vCPUs.</p>
             */
            public Builder CPU(CPU CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The monitoring data of containers.</p>
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The monitoring data of disks.</p>
             */
            public Builder disk(java.util.List < Disk> disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The monitoring data of file system partitions.</p>
             */
            public Builder filesystem(java.util.List < Filesystem> filesystem) {
                this.filesystem = filesystem;
                return this;
            }

            /**
             * <p>The monitoring data of the memory.</p>
             */
            public Builder memory(RecordsMemory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The monitoring data of the network.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The time when the monitoring data entry was collected. The time follows the RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-25T16:22:00.000+08:00</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
