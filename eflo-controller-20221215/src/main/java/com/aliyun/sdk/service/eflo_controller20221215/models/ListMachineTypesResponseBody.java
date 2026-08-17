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
         * <p>The instance types.</p>
         */
        public Builder machineTypes(java.util.List<MachineTypes> machineTypes) {
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>The token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>a3f2224a5ec7224116c4f5246120abe4</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
    public static class CpuInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuArch")
        private String cpuArch;

        @com.aliyun.core.annotation.NameInMap("CpuSockets")
        private Integer cpuSockets;

        @com.aliyun.core.annotation.NameInMap("VCpuCores")
        private Integer vCpuCores;

        private CpuInfoDetail(Builder builder) {
            this.cpuArch = builder.cpuArch;
            this.cpuSockets = builder.cpuSockets;
            this.vCpuCores = builder.vCpuCores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuInfoDetail create() {
            return builder().build();
        }

        /**
         * @return cpuArch
         */
        public String getCpuArch() {
            return this.cpuArch;
        }

        /**
         * @return cpuSockets
         */
        public Integer getCpuSockets() {
            return this.cpuSockets;
        }

        /**
         * @return vCpuCores
         */
        public Integer getVCpuCores() {
            return this.vCpuCores;
        }

        public static final class Builder {
            private String cpuArch; 
            private Integer cpuSockets; 
            private Integer vCpuCores; 

            private Builder() {
            } 

            private Builder(CpuInfoDetail model) {
                this.cpuArch = model.cpuArch;
                this.cpuSockets = model.cpuSockets;
                this.vCpuCores = model.vCpuCores;
            } 

            /**
             * CpuArch.
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * CpuSockets.
             */
            public Builder cpuSockets(Integer cpuSockets) {
                this.cpuSockets = cpuSockets;
                return this;
            }

            /**
             * VCpuCores.
             */
            public Builder vCpuCores(Integer vCpuCores) {
                this.vCpuCores = vCpuCores;
                return this;
            }

            public CpuInfoDetail build() {
                return new CpuInfoDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class DiskInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalDiskCount")
        private Integer localDiskCount;

        @com.aliyun.core.annotation.NameInMap("LocalDiskSizeInTB")
        private Float localDiskSizeInTB;

        @com.aliyun.core.annotation.NameInMap("LocalDiskType")
        private String localDiskType;

        private DiskInfoDetail(Builder builder) {
            this.localDiskCount = builder.localDiskCount;
            this.localDiskSizeInTB = builder.localDiskSizeInTB;
            this.localDiskType = builder.localDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskInfoDetail create() {
            return builder().build();
        }

        /**
         * @return localDiskCount
         */
        public Integer getLocalDiskCount() {
            return this.localDiskCount;
        }

        /**
         * @return localDiskSizeInTB
         */
        public Float getLocalDiskSizeInTB() {
            return this.localDiskSizeInTB;
        }

        /**
         * @return localDiskType
         */
        public String getLocalDiskType() {
            return this.localDiskType;
        }

        public static final class Builder {
            private Integer localDiskCount; 
            private Float localDiskSizeInTB; 
            private String localDiskType; 

            private Builder() {
            } 

            private Builder(DiskInfoDetail model) {
                this.localDiskCount = model.localDiskCount;
                this.localDiskSizeInTB = model.localDiskSizeInTB;
                this.localDiskType = model.localDiskType;
            } 

            /**
             * LocalDiskCount.
             */
            public Builder localDiskCount(Integer localDiskCount) {
                this.localDiskCount = localDiskCount;
                return this;
            }

            /**
             * LocalDiskSizeInTB.
             */
            public Builder localDiskSizeInTB(Float localDiskSizeInTB) {
                this.localDiskSizeInTB = localDiskSizeInTB;
                return this;
            }

            /**
             * LocalDiskType.
             */
            public Builder localDiskType(String localDiskType) {
                this.localDiskType = localDiskType;
                return this;
            }

            public DiskInfoDetail build() {
                return new DiskInfoDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class FrontendNetworkDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrontendNetworkType")
        private String frontendNetworkType;

        @com.aliyun.core.annotation.NameInMap("JumboFrameSupported")
        private Boolean jumboFrameSupported;

        private FrontendNetworkDetail(Builder builder) {
            this.frontendNetworkType = builder.frontendNetworkType;
            this.jumboFrameSupported = builder.jumboFrameSupported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrontendNetworkDetail create() {
            return builder().build();
        }

        /**
         * @return frontendNetworkType
         */
        public String getFrontendNetworkType() {
            return this.frontendNetworkType;
        }

        /**
         * @return jumboFrameSupported
         */
        public Boolean getJumboFrameSupported() {
            return this.jumboFrameSupported;
        }

        public static final class Builder {
            private String frontendNetworkType; 
            private Boolean jumboFrameSupported; 

            private Builder() {
            } 

            private Builder(FrontendNetworkDetail model) {
                this.frontendNetworkType = model.frontendNetworkType;
                this.jumboFrameSupported = model.jumboFrameSupported;
            } 

            /**
             * FrontendNetworkType.
             */
            public Builder frontendNetworkType(String frontendNetworkType) {
                this.frontendNetworkType = frontendNetworkType;
                return this;
            }

            /**
             * JumboFrameSupported.
             */
            public Builder jumboFrameSupported(Boolean jumboFrameSupported) {
                this.jumboFrameSupported = jumboFrameSupported;
                return this;
            }

            public FrontendNetworkDetail build() {
                return new FrontendNetworkDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class GpuInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Integer gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuMemoryInGB")
        private Integer gpuMemoryInGB;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuVendor")
        private String gpuVendor;

        @com.aliyun.core.annotation.NameInMap("TotalGpuMemoryInGB")
        private Integer totalGpuMemoryInGB;

        private GpuInfoDetail(Builder builder) {
            this.gpuCount = builder.gpuCount;
            this.gpuMemoryInGB = builder.gpuMemoryInGB;
            this.gpuName = builder.gpuName;
            this.gpuVendor = builder.gpuVendor;
            this.totalGpuMemoryInGB = builder.totalGpuMemoryInGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuInfoDetail create() {
            return builder().build();
        }

        /**
         * @return gpuCount
         */
        public Integer getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuMemoryInGB
         */
        public Integer getGpuMemoryInGB() {
            return this.gpuMemoryInGB;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuVendor
         */
        public String getGpuVendor() {
            return this.gpuVendor;
        }

        /**
         * @return totalGpuMemoryInGB
         */
        public Integer getTotalGpuMemoryInGB() {
            return this.totalGpuMemoryInGB;
        }

        public static final class Builder {
            private Integer gpuCount; 
            private Integer gpuMemoryInGB; 
            private String gpuName; 
            private String gpuVendor; 
            private Integer totalGpuMemoryInGB; 

            private Builder() {
            } 

            private Builder(GpuInfoDetail model) {
                this.gpuCount = model.gpuCount;
                this.gpuMemoryInGB = model.gpuMemoryInGB;
                this.gpuName = model.gpuName;
                this.gpuVendor = model.gpuVendor;
                this.totalGpuMemoryInGB = model.totalGpuMemoryInGB;
            } 

            /**
             * GpuCount.
             */
            public Builder gpuCount(Integer gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuMemoryInGB.
             */
            public Builder gpuMemoryInGB(Integer gpuMemoryInGB) {
                this.gpuMemoryInGB = gpuMemoryInGB;
                return this;
            }

            /**
             * GpuName.
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * GpuVendor.
             */
            public Builder gpuVendor(String gpuVendor) {
                this.gpuVendor = gpuVendor;
                return this;
            }

            /**
             * TotalGpuMemoryInGB.
             */
            public Builder totalGpuMemoryInGB(Integer totalGpuMemoryInGB) {
                this.totalGpuMemoryInGB = totalGpuMemoryInGB;
                return this;
            }

            public GpuInfoDetail build() {
                return new GpuInfoDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class MemoryInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemorySizeInGB")
        private Integer memorySizeInGB;

        private MemoryInfoDetail(Builder builder) {
            this.memorySizeInGB = builder.memorySizeInGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryInfoDetail create() {
            return builder().build();
        }

        /**
         * @return memorySizeInGB
         */
        public Integer getMemorySizeInGB() {
            return this.memorySizeInGB;
        }

        public static final class Builder {
            private Integer memorySizeInGB; 

            private Builder() {
            } 

            private Builder(MemoryInfoDetail model) {
                this.memorySizeInGB = model.memorySizeInGB;
            } 

            /**
             * MemorySizeInGB.
             */
            public Builder memorySizeInGB(Integer memorySizeInGB) {
                this.memorySizeInGB = memorySizeInGB;
                return this;
            }

            public MemoryInfoDetail build() {
                return new MemoryInfoDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMachineTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineTypesResponseBody</p>
     */
    public static class RdmaInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendRdmaNicBwInGbps")
        private Integer backendRdmaNicBwInGbps;

        @com.aliyun.core.annotation.NameInMap("BackendRdmaNicCount")
        private Integer backendRdmaNicCount;

        private RdmaInfoDetail(Builder builder) {
            this.backendRdmaNicBwInGbps = builder.backendRdmaNicBwInGbps;
            this.backendRdmaNicCount = builder.backendRdmaNicCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdmaInfoDetail create() {
            return builder().build();
        }

        /**
         * @return backendRdmaNicBwInGbps
         */
        public Integer getBackendRdmaNicBwInGbps() {
            return this.backendRdmaNicBwInGbps;
        }

        /**
         * @return backendRdmaNicCount
         */
        public Integer getBackendRdmaNicCount() {
            return this.backendRdmaNicCount;
        }

        public static final class Builder {
            private Integer backendRdmaNicBwInGbps; 
            private Integer backendRdmaNicCount; 

            private Builder() {
            } 

            private Builder(RdmaInfoDetail model) {
                this.backendRdmaNicBwInGbps = model.backendRdmaNicBwInGbps;
                this.backendRdmaNicCount = model.backendRdmaNicCount;
            } 

            /**
             * BackendRdmaNicBwInGbps.
             */
            public Builder backendRdmaNicBwInGbps(Integer backendRdmaNicBwInGbps) {
                this.backendRdmaNicBwInGbps = backendRdmaNicBwInGbps;
                return this;
            }

            /**
             * BackendRdmaNicCount.
             */
            public Builder backendRdmaNicCount(Integer backendRdmaNicCount) {
                this.backendRdmaNicCount = backendRdmaNicCount;
                return this;
            }

            public RdmaInfoDetail build() {
                return new RdmaInfoDetail(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("CpuInfoDetail")
        private CpuInfoDetail cpuInfoDetail;

        @com.aliyun.core.annotation.NameInMap("DiskInfo")
        private String diskInfo;

        @com.aliyun.core.annotation.NameInMap("DiskInfoDetail")
        private DiskInfoDetail diskInfoDetail;

        @com.aliyun.core.annotation.NameInMap("FrontendNetworkDetail")
        private FrontendNetworkDetail frontendNetworkDetail;

        @com.aliyun.core.annotation.NameInMap("GpuInfo")
        private String gpuInfo;

        @com.aliyun.core.annotation.NameInMap("GpuInfoDetail")
        private GpuInfoDetail gpuInfoDetail;

        @com.aliyun.core.annotation.NameInMap("MemoryInfo")
        private String memoryInfo;

        @com.aliyun.core.annotation.NameInMap("MemoryInfoDetail")
        private MemoryInfoDetail memoryInfoDetail;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkInfo")
        private String networkInfo;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private String nodeCount;

        @com.aliyun.core.annotation.NameInMap("RdmaInfoDetail")
        private RdmaInfoDetail rdmaInfoDetail;

        @com.aliyun.core.annotation.NameInMap("TotalCpuCore")
        private Integer totalCpuCore;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MachineTypes(Builder builder) {
            this.bondNum = builder.bondNum;
            this.cpuInfo = builder.cpuInfo;
            this.cpuInfoDetail = builder.cpuInfoDetail;
            this.diskInfo = builder.diskInfo;
            this.diskInfoDetail = builder.diskInfoDetail;
            this.frontendNetworkDetail = builder.frontendNetworkDetail;
            this.gpuInfo = builder.gpuInfo;
            this.gpuInfoDetail = builder.gpuInfoDetail;
            this.memoryInfo = builder.memoryInfo;
            this.memoryInfoDetail = builder.memoryInfoDetail;
            this.name = builder.name;
            this.networkInfo = builder.networkInfo;
            this.nodeCount = builder.nodeCount;
            this.rdmaInfoDetail = builder.rdmaInfoDetail;
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
         * @return cpuInfoDetail
         */
        public CpuInfoDetail getCpuInfoDetail() {
            return this.cpuInfoDetail;
        }

        /**
         * @return diskInfo
         */
        public String getDiskInfo() {
            return this.diskInfo;
        }

        /**
         * @return diskInfoDetail
         */
        public DiskInfoDetail getDiskInfoDetail() {
            return this.diskInfoDetail;
        }

        /**
         * @return frontendNetworkDetail
         */
        public FrontendNetworkDetail getFrontendNetworkDetail() {
            return this.frontendNetworkDetail;
        }

        /**
         * @return gpuInfo
         */
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        /**
         * @return gpuInfoDetail
         */
        public GpuInfoDetail getGpuInfoDetail() {
            return this.gpuInfoDetail;
        }

        /**
         * @return memoryInfo
         */
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        /**
         * @return memoryInfoDetail
         */
        public MemoryInfoDetail getMemoryInfoDetail() {
            return this.memoryInfoDetail;
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
         * @return rdmaInfoDetail
         */
        public RdmaInfoDetail getRdmaInfoDetail() {
            return this.rdmaInfoDetail;
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
            private CpuInfoDetail cpuInfoDetail; 
            private String diskInfo; 
            private DiskInfoDetail diskInfoDetail; 
            private FrontendNetworkDetail frontendNetworkDetail; 
            private String gpuInfo; 
            private GpuInfoDetail gpuInfoDetail; 
            private String memoryInfo; 
            private MemoryInfoDetail memoryInfoDetail; 
            private String name; 
            private String networkInfo; 
            private String nodeCount; 
            private RdmaInfoDetail rdmaInfoDetail; 
            private Integer totalCpuCore; 
            private String type; 

            private Builder() {
            } 

            private Builder(MachineTypes model) {
                this.bondNum = model.bondNum;
                this.cpuInfo = model.cpuInfo;
                this.cpuInfoDetail = model.cpuInfoDetail;
                this.diskInfo = model.diskInfo;
                this.diskInfoDetail = model.diskInfoDetail;
                this.frontendNetworkDetail = model.frontendNetworkDetail;
                this.gpuInfo = model.gpuInfo;
                this.gpuInfoDetail = model.gpuInfoDetail;
                this.memoryInfo = model.memoryInfo;
                this.memoryInfoDetail = model.memoryInfoDetail;
                this.name = model.name;
                this.networkInfo = model.networkInfo;
                this.nodeCount = model.nodeCount;
                this.rdmaInfoDetail = model.rdmaInfoDetail;
                this.totalCpuCore = model.totalCpuCore;
                this.type = model.type;
            } 

            /**
             * <p>The number of bonds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bondNum(Integer bondNum) {
                this.bondNum = bondNum;
                return this;
            }

            /**
             * <p>The CPU information.</p>
             * 
             * <strong>example:</strong>
             * <p>2x Intel Icelake 8369B 32C CPU</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * CpuInfoDetail.
             */
            public Builder cpuInfoDetail(CpuInfoDetail cpuInfoDetail) {
                this.cpuInfoDetail = cpuInfoDetail;
                return this;
            }

            /**
             * <p>The disk information.</p>
             * 
             * <strong>example:</strong>
             * <p>2x 480GB SATA SSD</p>
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * DiskInfoDetail.
             */
            public Builder diskInfoDetail(DiskInfoDetail diskInfoDetail) {
                this.diskInfoDetail = diskInfoDetail;
                return this;
            }

            /**
             * FrontendNetworkDetail.
             */
            public Builder frontendNetworkDetail(FrontendNetworkDetail frontendNetworkDetail) {
                this.frontendNetworkDetail = frontendNetworkDetail;
                return this;
            }

            /**
             * <p>The GPU information.</p>
             * 
             * <strong>example:</strong>
             * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * GpuInfoDetail.
             */
            public Builder gpuInfoDetail(GpuInfoDetail gpuInfoDetail) {
                this.gpuInfoDetail = gpuInfoDetail;
                return this;
            }

            /**
             * <p>The storage information.</p>
             * 
             * <strong>example:</strong>
             * <p>32x 64GB DDR4 3200 Memory</p>
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * MemoryInfoDetail.
             */
            public Builder memoryInfoDetail(MemoryInfoDetail memoryInfoDetail) {
                this.memoryInfoDetail = memoryInfoDetail;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network information.</p>
             * 
             * <strong>example:</strong>
             * <p>2x 100Gbps DP NIC</p>
             */
            public Builder networkInfo(String networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nodeCount(String nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * RdmaInfoDetail.
             */
            public Builder rdmaInfoDetail(RdmaInfoDetail rdmaInfoDetail) {
                this.rdmaInfoDetail = rdmaInfoDetail;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder totalCpuCore(Integer totalCpuCore) {
                this.totalCpuCore = totalCpuCore;
                return this;
            }

            /**
             * <p>The access type.</p>
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
