// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudUnassignedMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudUnassignedMachinesResponseBody</p>
 */
public class DescribeHybridCloudUnassignedMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UnassignedMachines")
    private java.util.List < UnassignedMachines> unassignedMachines;

    private DescribeHybridCloudUnassignedMachinesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.unassignedMachines = builder.unassignedMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudUnassignedMachinesResponseBody create() {
        return builder().build();
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return unassignedMachines
     */
    public java.util.List < UnassignedMachines> getUnassignedMachines() {
        return this.unassignedMachines;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < UnassignedMachines> unassignedMachines; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The servers that are not assigned to the hybrid cloud cluster.
         */
        public Builder unassignedMachines(java.util.List < UnassignedMachines> unassignedMachines) {
            this.unassignedMachines = unassignedMachines;
            return this;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBody build() {
            return new DescribeHybridCloudUnassignedMachinesResponseBody(this);
        } 

    } 

    public static class UnassignedMachines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("CustomName")
        private String customName;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("Mid")
        private String mid;

        private UnassignedMachines(Builder builder) {
            this.cpu = builder.cpu;
            this.customName = builder.customName;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.mac = builder.mac;
            this.memory = builder.memory;
            this.mid = builder.mid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnassignedMachines create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return customName
         */
        public String getCustomName() {
            return this.customName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return mid
         */
        public String getMid() {
            return this.mid;
        }

        public static final class Builder {
            private Long cpu; 
            private String customName; 
            private String hostName; 
            private String ip; 
            private String mac; 
            private Long memory; 
            private String mid; 

            /**
             * The number of CPU cores.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder customName(String customName) {
                this.customName = customName;
                return this;
            }

            /**
             * The host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The media access control (MAC) address of the device.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * The memory size. Unit: KB. A conversion factor of 1,000 is used.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder mid(String mid) {
                this.mid = mid;
                return this;
            }

            public UnassignedMachines build() {
                return new UnassignedMachines(this);
            } 

        } 

    }
}
