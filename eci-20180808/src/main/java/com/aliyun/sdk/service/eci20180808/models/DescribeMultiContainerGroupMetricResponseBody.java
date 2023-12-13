// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiContainerGroupMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultiContainerGroupMetricResponseBody</p>
 */
public class DescribeMultiContainerGroupMetricResponseBody extends TeaModel {
    @NameInMap("MonitorDatas")
    private java.util.List < MonitorDatas> monitorDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMultiContainerGroupMetricResponseBody(Builder builder) {
        this.monitorDatas = builder.monitorDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiContainerGroupMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorDatas
     */
    public java.util.List < MonitorDatas> getMonitorDatas() {
        return this.monitorDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MonitorDatas> monitorDatas; 
        private String requestId; 

        /**
         * The monitoring data of the elastic container instances.
         */
        public Builder monitorDatas(java.util.List < MonitorDatas> monitorDatas) {
            this.monitorDatas = monitorDatas;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMultiContainerGroupMetricResponseBody build() {
            return new DescribeMultiContainerGroupMetricResponseBody(this);
        } 

    } 

    public static class CPU extends TeaModel {
        @NameInMap("Limit")
        private Long limit;

        @NameInMap("Load")
        private Long load;

        @NameInMap("UsageCoreNanoSeconds")
        private Long usageCoreNanoSeconds;

        @NameInMap("UsageNanoCores")
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
             * The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * The average load in the last 10 seconds.
             */
            public Builder load(Long load) {
                this.load = load;
                return this;
            }

            /**
             * The cumulative usage of vCPUs.
             */
            public Builder usageCoreNanoSeconds(Long usageCoreNanoSeconds) {
                this.usageCoreNanoSeconds = usageCoreNanoSeconds;
                return this;
            }

            /**
             * The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.
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
    public static class ContainersCPU extends TeaModel {
        @NameInMap("Limit")
        private Long limit;

        @NameInMap("Load")
        private Long load;

        @NameInMap("UsageCoreNanoSeconds")
        private Long usageCoreNanoSeconds;

        @NameInMap("UsageNanoCores")
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
             * The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * The average load in the last 10 seconds.
             */
            public Builder load(Long load) {
                this.load = load;
                return this;
            }

            /**
             * The cumulative usage of vCPUs.
             */
            public Builder usageCoreNanoSeconds(Long usageCoreNanoSeconds) {
                this.usageCoreNanoSeconds = usageCoreNanoSeconds;
                return this;
            }

            /**
             * The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.
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
    public static class Memory extends TeaModel {
        @NameInMap("AvailableBytes")
        private Long availableBytes;

        @NameInMap("Cache")
        private Long cache;

        @NameInMap("Rss")
        private Long rss;

        @NameInMap("UsageBytes")
        private Long usageBytes;

        @NameInMap("WorkingSet")
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
             * The size of the available memory. Unit: bytes.
             */
            public Builder availableBytes(Long availableBytes) {
                this.availableBytes = availableBytes;
                return this;
            }

            /**
             * The size of the cache. Unit: bytes.
             */
            public Builder cache(Long cache) {
                this.cache = cache;
                return this;
            }

            /**
             * The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.
             */
            public Builder rss(Long rss) {
                this.rss = rss;
                return this;
            }

            /**
             * The size of the used memory. Unit: bytes.
             */
            public Builder usageBytes(Long usageBytes) {
                this.usageBytes = usageBytes;
                return this;
            }

            /**
             * The usage of the working set. Unit: bytes.
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
    public static class Containers extends TeaModel {
        @NameInMap("CPU")
        private ContainersCPU CPU;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("Name")
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
             * The vCPU monitoring data of the container.
             */
            public Builder CPU(ContainersCPU CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * The memory monitoring data of the container.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name.
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
    public static class Disk extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("ReadBytes")
        private Long readBytes;

        @NameInMap("ReadIo")
        private Long readIo;

        @NameInMap("WriteBytes")
        private Long writeBytes;

        @NameInMap("WriteIo")
        private Long writeIo;

        private Disk(Builder builder) {
            this.device = builder.device;
            this.readBytes = builder.readBytes;
            this.readIo = builder.readIo;
            this.writeBytes = builder.writeBytes;
            this.writeIo = builder.writeIo;
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
         * @return readIo
         */
        public Long getReadIo() {
            return this.readIo;
        }

        /**
         * @return writeBytes
         */
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        /**
         * @return writeIo
         */
        public Long getWriteIo() {
            return this.writeIo;
        }

        public static final class Builder {
            private String device; 
            private Long readBytes; 
            private Long readIo; 
            private Long writeBytes; 
            private Long writeIo; 

            /**
             * The name of the disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The amount of data that was read from the disk. Unit: bytes.
             */
            public Builder readBytes(Long readBytes) {
                this.readBytes = readBytes;
                return this;
            }

            /**
             * This parameter is unavailable for public use.
             */
            public Builder readIo(Long readIo) {
                this.readIo = readIo;
                return this;
            }

            /**
             * The amount of data that was written to the disk. Unit: bytes.
             */
            public Builder writeBytes(Long writeBytes) {
                this.writeBytes = writeBytes;
                return this;
            }

            /**
             * This parameter is unavailable for public use.
             */
            public Builder writeIo(Long writeIo) {
                this.writeIo = writeIo;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    public static class Filesystem extends TeaModel {
        @NameInMap("Available")
        private Long available;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("FsName")
        private String fsName;

        @NameInMap("Usage")
        private Long usage;

        private Filesystem(Builder builder) {
            this.available = builder.available;
            this.capacity = builder.capacity;
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
            private String fsName; 
            private Long usage; 

            /**
             * The size of the available space.
             */
            public Builder available(Long available) {
                this.available = available;
                return this;
            }

            /**
             * The total file system space.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The name of the partition.
             */
            public Builder fsName(String fsName) {
                this.fsName = fsName;
                return this;
            }

            /**
             * The size of used space.
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
    public static class RecordsMemory extends TeaModel {
        @NameInMap("AvailableBytes")
        private Long availableBytes;

        @NameInMap("Cache")
        private Long cache;

        @NameInMap("Rss")
        private Long rss;

        @NameInMap("UsageBytes")
        private Long usageBytes;

        @NameInMap("WorkingSet")
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
             * The size of the available memory. Unit: bytes.
             */
            public Builder availableBytes(Long availableBytes) {
                this.availableBytes = availableBytes;
                return this;
            }

            /**
             * The size of the cache. Unit: bytes.
             */
            public Builder cache(Long cache) {
                this.cache = cache;
                return this;
            }

            /**
             * The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.
             */
            public Builder rss(Long rss) {
                this.rss = rss;
                return this;
            }

            /**
             * The size of the used memory. Unit: bytes.
             */
            public Builder usageBytes(Long usageBytes) {
                this.usageBytes = usageBytes;
                return this;
            }

            /**
             * The usage of the working set. Unit: bytes.
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
    public static class Interfaces extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("RxBytes")
        private Long rxBytes;

        @NameInMap("RxDrops")
        private Long rxDrops;

        @NameInMap("RxErrors")
        private Long rxErrors;

        @NameInMap("RxPackets")
        private Long rxPackets;

        @NameInMap("TxBytes")
        private Long txBytes;

        @NameInMap("TxDrops")
        private Long txDrops;

        @NameInMap("TxErrors")
        private Long txErrors;

        @NameInMap("TxPackets")
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
             * The name of the NIC.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The total number of bytes received.
             */
            public Builder rxBytes(Long rxBytes) {
                this.rxBytes = rxBytes;
                return this;
            }

            /**
             * The number of packets that fail to be received.
             */
            public Builder rxDrops(Long rxDrops) {
                this.rxDrops = rxDrops;
                return this;
            }

            /**
             * The number of receipt errors.
             */
            public Builder rxErrors(Long rxErrors) {
                this.rxErrors = rxErrors;
                return this;
            }

            /**
             * The total number of packets received.
             */
            public Builder rxPackets(Long rxPackets) {
                this.rxPackets = rxPackets;
                return this;
            }

            /**
             * The total number of bytes sent.
             */
            public Builder txBytes(Long txBytes) {
                this.txBytes = txBytes;
                return this;
            }

            /**
             * The number of packets that fail to arrive at their destination.
             */
            public Builder txDrops(Long txDrops) {
                this.txDrops = txDrops;
                return this;
            }

            /**
             * The total number of sending errors.
             */
            public Builder txErrors(Long txErrors) {
                this.txErrors = txErrors;
                return this;
            }

            /**
             * The total number of packets sent.
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
    public static class Network extends TeaModel {
        @NameInMap("Interfaces")
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
             * The monitoring data of network interface controllers (NICs).
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
    public static class Records extends TeaModel {
        @NameInMap("CPU")
        private CPU CPU;

        @NameInMap("Containers")
        private java.util.List < Containers> containers;

        @NameInMap("Disk")
        private java.util.List < Disk> disk;

        @NameInMap("Filesystem")
        private java.util.List < Filesystem> filesystem;

        @NameInMap("Memory")
        private RecordsMemory memory;

        @NameInMap("Network")
        private Network network;

        @NameInMap("Timestamp")
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
             * The monitoring data of vCPUs.
             */
            public Builder CPU(CPU CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * The monitoring data of containers.
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * The monitoring data of disks.
             */
            public Builder disk(java.util.List < Disk> disk) {
                this.disk = disk;
                return this;
            }

            /**
             * The monitoring data of file system partitions.
             */
            public Builder filesystem(java.util.List < Filesystem> filesystem) {
                this.filesystem = filesystem;
                return this;
            }

            /**
             * The monitoring data of the memory.
             */
            public Builder memory(RecordsMemory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The monitoring data of the network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * The time when the entry of monitoring data was collected. The time follows the RFC 3339 format.
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
    public static class MonitorDatas extends TeaModel {
        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("Records")
        private java.util.List < Records> records;

        private MonitorDatas(Builder builder) {
            this.containerGroupId = builder.containerGroupId;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorDatas create() {
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

        public static final class Builder {
            private String containerGroupId; 
            private java.util.List < Records> records; 

            /**
             * The ID of the elastic container instance.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The details about monitoring data.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public MonitorDatas build() {
                return new MonitorDatas(this);
            } 

        } 

    }
}
