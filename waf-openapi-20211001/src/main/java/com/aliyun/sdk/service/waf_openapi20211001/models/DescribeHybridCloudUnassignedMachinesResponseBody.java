// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3EBCFCE9-4A3C-5E01-915D-691B****510A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The servers that are not assigned to the hybrid cloud cluster.</p>
         */
        public Builder unassignedMachines(java.util.List < UnassignedMachines> unassignedMachines) {
            this.unassignedMachines = unassignedMachines;
            return this;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBody build() {
            return new DescribeHybridCloudUnassignedMachinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudUnassignedMachinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudUnassignedMachinesResponseBody</p>
     */
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
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleName</p>
             */
            public Builder customName(String customName) {
                this.customName = customName;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>online-xagent1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.X.X.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The media access control (MAC) address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>00163e2686ac</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The memory size. Unit: KB. A conversion factor of 1,000 is used.</p>
             * 
             * <strong>example:</strong>
             * <p>31580872</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>78db009ab6cf055a9085f9f4****ae3a</p>
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
