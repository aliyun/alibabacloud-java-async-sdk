// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachineTypesResponseBody</p>
 */
public class ListMachineTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private java.util.List<MachineTypes> machineTypes;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMachineTypesResponseBody(Builder builder) {
        this.machineTypes = builder.machineTypes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public java.util.List<MachineTypes> getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MachineTypes> machineTypes; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMachineTypesResponseBody model) {
            this.machineTypes = model.machineTypes;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the machine types</p>
         */
        public Builder machineTypes(java.util.List<MachineTypes> machineTypes) {
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>NextToken for the next page, include this value when requesting the next page</p>
         * 
         * <strong>example:</strong>
         * <p>a3f2224a5ec7224116c4f5246120abe4</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F16BA4D8-FF50-53B6-A026-F443FE31006C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMachineTypesResponseBody build() {
            return new ListMachineTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class MachineTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondNum")
        private Integer bondNum;

        @com.aliyun.core.annotation.NameInMap("CpuInfo")
        private String cpuInfo;

        @com.aliyun.core.annotation.NameInMap("DiskInfo")
        private String diskInfo;

        @com.aliyun.core.annotation.NameInMap("GpuInfo")
        private String gpuInfo;

        @com.aliyun.core.annotation.NameInMap("MemoryInfo")
        private String memoryInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkInfo")
        private String networkInfo;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private String nodeCount;

        @com.aliyun.core.annotation.NameInMap("TotalCpuCore")
        private Integer totalCpuCore;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MachineTypes(Builder builder) {
            this.bondNum = builder.bondNum;
            this.cpuInfo = builder.cpuInfo;
            this.diskInfo = builder.diskInfo;
            this.gpuInfo = builder.gpuInfo;
            this.memoryInfo = builder.memoryInfo;
            this.name = builder.name;
            this.networkInfo = builder.networkInfo;
            this.nodeCount = builder.nodeCount;
            this.totalCpuCore = builder.totalCpuCore;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineTypes create() {
            return builder().build();
        }

        /**
         * @return bondNum
         */
        public Integer getBondNum() {
            return this.bondNum;
        }

        /**
         * @return cpuInfo
         */
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        /**
         * @return diskInfo
         */
        public String getDiskInfo() {
            return this.diskInfo;
        }

        /**
         * @return gpuInfo
         */
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        /**
         * @return memoryInfo
         */
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkInfo
         */
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        /**
         * @return nodeCount
         */
        public String getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return totalCpuCore
         */
        public Integer getTotalCpuCore() {
            return this.totalCpuCore;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bondNum; 
            private String cpuInfo; 
            private String diskInfo; 
            private String gpuInfo; 
            private String memoryInfo; 
            private String name; 
            private String networkInfo; 
            private String nodeCount; 
            private Integer totalCpuCore; 
            private String type; 

            private Builder() {
            } 

            private Builder(MachineTypes model) {
                this.bondNum = model.bondNum;
                this.cpuInfo = model.cpuInfo;
                this.diskInfo = model.diskInfo;
                this.gpuInfo = model.gpuInfo;
                this.memoryInfo = model.memoryInfo;
                this.name = model.name;
                this.networkInfo = model.networkInfo;
                this.nodeCount = model.nodeCount;
                this.totalCpuCore = model.totalCpuCore;
                this.type = model.type;
            } 

            /**
             * <p>Number of bonds</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bondNum(Integer bondNum) {
                this.bondNum = bondNum;
                return this;
            }

            /**
             * <p>CPU information</p>
             * 
             * <strong>example:</strong>
             * <p>2x Intel Icelake 8369B 32C CPU</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>Disk information</p>
             * 
             * <strong>example:</strong>
             * <p>2x 480GB SATA SSD</p>
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * <p>GPU information</p>
             * 
             * <strong>example:</strong>
             * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * <p>Memory information</p>
             * 
             * <strong>example:</strong>
             * <p>32x 64GB DDR4 3200 Memory</p>
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * <p>Machine name</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Network information</p>
             * 
             * <strong>example:</strong>
             * <p>2x 100Gbps DP NIC</p>
             */
            public Builder networkInfo(String networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nodeCount(String nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Number of CPU cores</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder totalCpuCore(Integer totalCpuCore) {
                this.totalCpuCore = totalCpuCore;
                return this;
            }

            /**
             * <p>Type of machine</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MachineTypes build() {
                return new MachineTypes(this);
            } 

        } 

    }
}
