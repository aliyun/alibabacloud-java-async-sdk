// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostEcsLevelInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostEcsLevelInfoResponseBody</p>
 */
public class DescribeHostEcsLevelInfoResponseBody extends TeaModel {
    @NameInMap("HostEcsLevelInfos")
    private java.util.List < HostEcsLevelInfos> hostEcsLevelInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHostEcsLevelInfoResponseBody(Builder builder) {
        this.hostEcsLevelInfos = builder.hostEcsLevelInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostEcsLevelInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostEcsLevelInfos
     */
    public java.util.List < HostEcsLevelInfos> getHostEcsLevelInfos() {
        return this.hostEcsLevelInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HostEcsLevelInfos> hostEcsLevelInfos; 
        private String requestId; 

        /**
         * The queried host.
         */
        public Builder hostEcsLevelInfos(java.util.List < HostEcsLevelInfos> hostEcsLevelInfos) {
            this.hostEcsLevelInfos = hostEcsLevelInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHostEcsLevelInfoResponseBody build() {
            return new DescribeHostEcsLevelInfoResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CloudStorageBandwidth")
        private Float cloudStorageBandwidth;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CpuFrequency")
        private String cpuFrequency;

        @NameInMap("CpuVersion")
        private String cpuVersion;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsClass")
        private String ecsClass;

        @NameInMap("EcsClassCode")
        private String ecsClassCode;

        @NameInMap("IsCloudDisk")
        private Integer isCloudDisk;

        @NameInMap("LocalStorage")
        private String localStorage;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NetBandWidth")
        private Float netBandWidth;

        @NameInMap("NetPackage")
        private Integer netPackage;

        @NameInMap("RdsClassCode")
        private String rdsClassCode;

        @NameInMap("StorageIops")
        private Integer storageIops;

        private Items(Builder builder) {
            this.cloudStorageBandwidth = builder.cloudStorageBandwidth;
            this.cpu = builder.cpu;
            this.cpuFrequency = builder.cpuFrequency;
            this.cpuVersion = builder.cpuVersion;
            this.description = builder.description;
            this.ecsClass = builder.ecsClass;
            this.ecsClassCode = builder.ecsClassCode;
            this.isCloudDisk = builder.isCloudDisk;
            this.localStorage = builder.localStorage;
            this.memory = builder.memory;
            this.netBandWidth = builder.netBandWidth;
            this.netPackage = builder.netPackage;
            this.rdsClassCode = builder.rdsClassCode;
            this.storageIops = builder.storageIops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cloudStorageBandwidth
         */
        public Float getCloudStorageBandwidth() {
            return this.cloudStorageBandwidth;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuFrequency
         */
        public String getCpuFrequency() {
            return this.cpuFrequency;
        }

        /**
         * @return cpuVersion
         */
        public String getCpuVersion() {
            return this.cpuVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsClass
         */
        public String getEcsClass() {
            return this.ecsClass;
        }

        /**
         * @return ecsClassCode
         */
        public String getEcsClassCode() {
            return this.ecsClassCode;
        }

        /**
         * @return isCloudDisk
         */
        public Integer getIsCloudDisk() {
            return this.isCloudDisk;
        }

        /**
         * @return localStorage
         */
        public String getLocalStorage() {
            return this.localStorage;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return netBandWidth
         */
        public Float getNetBandWidth() {
            return this.netBandWidth;
        }

        /**
         * @return netPackage
         */
        public Integer getNetPackage() {
            return this.netPackage;
        }

        /**
         * @return rdsClassCode
         */
        public String getRdsClassCode() {
            return this.rdsClassCode;
        }

        /**
         * @return storageIops
         */
        public Integer getStorageIops() {
            return this.storageIops;
        }

        public static final class Builder {
            private Float cloudStorageBandwidth; 
            private Integer cpu; 
            private String cpuFrequency; 
            private String cpuVersion; 
            private String description; 
            private String ecsClass; 
            private String ecsClassCode; 
            private Integer isCloudDisk; 
            private String localStorage; 
            private Integer memory; 
            private Float netBandWidth; 
            private Integer netPackage; 
            private String rdsClassCode; 
            private Integer storageIops; 

            /**
             * The disk bandwidth. Unit: Gbit/s.
             */
            public Builder cloudStorageBandwidth(Float cloudStorageBandwidth) {
                this.cloudStorageBandwidth = cloudStorageBandwidth;
                return this;
            }

            /**
             * The number of CPU cores of the host.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The processor frequency. Unit: GHz.
             */
            public Builder cpuFrequency(String cpuFrequency) {
                this.cpuFrequency = cpuFrequency;
                return this;
            }

            /**
             * The CPU model of the host.
             */
            public Builder cpuVersion(String cpuVersion) {
                this.cpuVersion = cpuVersion;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The instance family of the host.
             */
            public Builder ecsClass(String ecsClass) {
                this.ecsClass = ecsClass;
                return this;
            }

            /**
             * The instance type of the host.
             */
            public Builder ecsClassCode(String ecsClassCode) {
                this.ecsClassCode = ecsClassCode;
                return this;
            }

            /**
             * Indicates whether the host uses cloud disks.
             */
            public Builder isCloudDisk(Integer isCloudDisk) {
                this.isCloudDisk = isCloudDisk;
                return this;
            }

            /**
             * The local storage.
             */
            public Builder localStorage(String localStorage) {
                this.localStorage = localStorage;
                return this;
            }

            /**
             * The memory size of the host. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The internal bandwidth of the host. Unit: Gbit/s.
             */
            public Builder netBandWidth(Float netBandWidth) {
                this.netBandWidth = netBandWidth;
                return this;
            }

            /**
             * The packet forwarding rate over the internal network, which is displayed after being divided by 10,000. Unit: packets per second (PPS).
             */
            public Builder netPackage(Integer netPackage) {
                this.netPackage = netPackage;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder rdsClassCode(String rdsClassCode) {
                this.rdsClassCode = rdsClassCode;
                return this;
            }

            /**
             * The storage IOPS of the host, which is displayed after being divided by 10,000.
             */
            public Builder storageIops(Integer storageIops) {
                this.storageIops = storageIops;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class HostEcsLevelInfos extends TeaModel {
        @NameInMap("CddcHostType")
        private String cddcHostType;

        @NameInMap("Items")
        private java.util.List < Items> items;

        private HostEcsLevelInfos(Builder builder) {
            this.cddcHostType = builder.cddcHostType;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostEcsLevelInfos create() {
            return builder().build();
        }

        /**
         * @return cddcHostType
         */
        public String getCddcHostType() {
            return this.cddcHostType;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String cddcHostType; 
            private java.util.List < Items> items; 

            /**
             * The category of the host. Valid values:
             * <p>
             * 
             * *   **general**: general-purpose.
             * *   **compute**: compute-optimized.
             * *   **ram**: memory-optimized.
             * *   **dragon**: ECS Bare Metal Instance.
             */
            public Builder cddcHostType(String cddcHostType) {
                this.cddcHostType = cddcHostType;
                return this;
            }

            /**
             * The queried host specifications.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public HostEcsLevelInfos build() {
                return new HostEcsLevelInfos(this);
            } 

        } 

    }
}
