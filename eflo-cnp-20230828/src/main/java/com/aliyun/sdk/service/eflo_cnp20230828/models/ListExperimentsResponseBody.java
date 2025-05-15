// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentsResponseBody</p>
 */
public class ListExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExperimentsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access denied information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExperimentsResponseBody build() {
            return new ListExperimentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class ResourceNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private Integer requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestGPU")
        private Integer requestGPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
        private Integer requestMemory;

        @com.aliyun.core.annotation.NameInMap("TotalCPU")
        private Integer totalCPU;

        @com.aliyun.core.annotation.NameInMap("TotalGPU")
        private Integer totalGPU;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        private ResourceNodes(Builder builder) {
            this.nodeName = builder.nodeName;
            this.requestCPU = builder.requestCPU;
            this.requestGPU = builder.requestGPU;
            this.requestMemory = builder.requestMemory;
            this.totalCPU = builder.totalCPU;
            this.totalGPU = builder.totalGPU;
            this.totalMemory = builder.totalMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceNodes create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return requestCPU
         */
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestGPU
         */
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        /**
         * @return requestMemory
         */
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        /**
         * @return totalCPU
         */
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        /**
         * @return totalGPU
         */
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        /**
         * @return totalMemory
         */
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public static final class Builder {
            private String nodeName; 
            private Integer requestCPU; 
            private Integer requestGPU; 
            private Integer requestMemory; 
            private Integer totalCPU; 
            private Integer totalGPU; 
            private Long totalMemory; 

            private Builder() {
            } 

            private Builder(ResourceNodes model) {
                this.nodeName = model.nodeName;
                this.requestCPU = model.requestCPU;
                this.requestGPU = model.requestGPU;
                this.requestMemory = model.requestMemory;
                this.totalCPU = model.totalCPU;
                this.totalGPU = model.totalGPU;
                this.totalMemory = model.totalMemory;
            } 

            /**
             * <p>Node name</p>
             * 
             * <strong>example:</strong>
             * <p>lingj1xxnjt1k4nv-mg18v52pydyuumae-0</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>Requested CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder requestCPU(Integer requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>Requested GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder requestGPU(Integer requestGPU) {
                this.requestGPU = requestGPU;
                return this;
            }

            /**
             * <p>Requested memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder requestMemory(Integer requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * <p>Total CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder totalCPU(Integer totalCPU) {
                this.totalCPU = totalCPU;
                return this;
            }

            /**
             * <p>Total GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalGPU(Integer totalGPU) {
                this.totalGPU = totalGPU;
                return this;
            }

            /**
             * <p>Total memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            public ResourceNodes build() {
                return new ResourceNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class EnvParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPerWorker")
        private Integer cpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("CudaVersion")
        private String cudaVersion;

        @com.aliyun.core.annotation.NameInMap("ExtendParam")
        private java.util.Map<String, String> extendParam;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuPerWorker")
        private Integer gpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("MemoryPerWorker")
        private Integer memoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("NCCLVersion")
        private String NCCLVersion;

        @com.aliyun.core.annotation.NameInMap("PyTorchVersion")
        private String pyTorchVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceNodes")
        private java.util.List<ResourceNodes> resourceNodes;

        @com.aliyun.core.annotation.NameInMap("ShareMemory")
        private Integer shareMemory;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
        private Integer workerNum;

        private EnvParams(Builder builder) {
            this.cpuPerWorker = builder.cpuPerWorker;
            this.cudaVersion = builder.cudaVersion;
            this.extendParam = builder.extendParam;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuPerWorker = builder.gpuPerWorker;
            this.memoryPerWorker = builder.memoryPerWorker;
            this.NCCLVersion = builder.NCCLVersion;
            this.pyTorchVersion = builder.pyTorchVersion;
            this.resourceNodes = builder.resourceNodes;
            this.shareMemory = builder.shareMemory;
            this.workerNum = builder.workerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvParams create() {
            return builder().build();
        }

        /**
         * @return cpuPerWorker
         */
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        /**
         * @return cudaVersion
         */
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        /**
         * @return extendParam
         */
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return gpuPerWorker
         */
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        /**
         * @return memoryPerWorker
         */
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        /**
         * @return NCCLVersion
         */
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        /**
         * @return pyTorchVersion
         */
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        /**
         * @return resourceNodes
         */
        public java.util.List<ResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        /**
         * @return shareMemory
         */
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        /**
         * @return workerNum
         */
        public Integer getWorkerNum() {
            return this.workerNum;
        }

        public static final class Builder {
            private Integer cpuPerWorker; 
            private String cudaVersion; 
            private java.util.Map<String, String> extendParam; 
            private String gpuDriverVersion; 
            private Integer gpuPerWorker; 
            private Integer memoryPerWorker; 
            private String NCCLVersion; 
            private String pyTorchVersion; 
            private java.util.List<ResourceNodes> resourceNodes; 
            private Integer shareMemory; 
            private Integer workerNum; 

            private Builder() {
            } 

            private Builder(EnvParams model) {
                this.cpuPerWorker = model.cpuPerWorker;
                this.cudaVersion = model.cudaVersion;
                this.extendParam = model.extendParam;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.gpuPerWorker = model.gpuPerWorker;
                this.memoryPerWorker = model.memoryPerWorker;
                this.NCCLVersion = model.NCCLVersion;
                this.pyTorchVersion = model.pyTorchVersion;
                this.resourceNodes = model.resourceNodes;
                this.shareMemory = model.shareMemory;
                this.workerNum = model.workerNum;
            } 

            /**
             * <p>Number of CPUs allocated</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuPerWorker(Integer cpuPerWorker) {
                this.cpuPerWorker = cpuPerWorker;
                return this;
            }

            /**
             * <p>CUDA version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder cudaVersion(String cudaVersion) {
                this.cudaVersion = cudaVersion;
                return this;
            }

            /**
             * <p>Additional parameters</p>
             */
            public Builder extendParam(java.util.Map<String, String> extendParam) {
                this.extendParam = extendParam;
                return this;
            }

            /**
             * <p>GPU driver version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>Number of GPUs allocated</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * <p>Amount of memory (GB) allocated</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memoryPerWorker(Integer memoryPerWorker) {
                this.memoryPerWorker = memoryPerWorker;
                return this;
            }

            /**
             * <p>NCCL version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder NCCLVersion(String NCCLVersion) {
                this.NCCLVersion = NCCLVersion;
                return this;
            }

            /**
             * <p>PyTorch version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder pyTorchVersion(String pyTorchVersion) {
                this.pyTorchVersion = pyTorchVersion;
                return this;
            }

            /**
             * <p>Specified nodes</p>
             */
            public Builder resourceNodes(java.util.List<ResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * <p>Amount of shared memory (GB) allocated</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder shareMemory(Integer shareMemory) {
                this.shareMemory = shareMemory;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder workerNum(Integer workerNum) {
                this.workerNum = workerNum;
                return this;
            }

            public EnvParams build() {
                return new EnvParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class ErrorWorker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlag")
        private Boolean errorFlag;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private Integer gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("WarningFlag")
        private Boolean warningFlag;

        @com.aliyun.core.annotation.NameInMap("WarningMsg")
        private String warningMsg;

        private ErrorWorker(Builder builder) {
            this.errorFlag = builder.errorFlag;
            this.errorMsg = builder.errorMsg;
            this.experimentId = builder.experimentId;
            this.gpuName = builder.gpuName;
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.tflops = builder.tflops;
            this.warningFlag = builder.warningFlag;
            this.warningMsg = builder.warningMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorWorker create() {
            return builder().build();
        }

        /**
         * @return errorFlag
         */
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuNum
         */
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return warningFlag
         */
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        /**
         * @return warningMsg
         */
        public String getWarningMsg() {
            return this.warningMsg;
        }

        public static final class Builder {
            private Boolean errorFlag; 
            private String errorMsg; 
            private Long experimentId; 
            private String gpuName; 
            private Integer gpuNum; 
            private String hostname; 
            private String podName; 
            private Double samplesPerSecond; 
            private Double tflops; 
            private Boolean warningFlag; 
            private String warningMsg; 

            private Builder() {
            } 

            private Builder(ErrorWorker model) {
                this.errorFlag = model.errorFlag;
                this.errorMsg = model.errorMsg;
                this.experimentId = model.experimentId;
                this.gpuName = model.gpuName;
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.samplesPerSecond = model.samplesPerSecond;
                this.tflops = model.tflops;
                this.warningFlag = model.warningFlag;
                this.warningMsg = model.warningMsg;
            } 

            /**
             * <p>Whether there is an error</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * <p>Error information</p>
             * 
             * <strong>example:</strong>
             * <p>error msg</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>176</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>GPU name</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Host IP</p>
             * 
             * <strong>example:</strong>
             * <p>etcd_cluster_c0n2</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Pod name</p>
             * 
             * <strong>example:</strong>
             * <p>fluxserv-6fc89b45cf-w8wq6</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Throughput</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>TFLOPS value</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Whether there is an alarm</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * <p>Alarm information</p>
             * 
             * <strong>example:</strong>
             * <p>warning msg</p>
             */
            public Builder warningMsg(String warningMsg) {
                this.warningMsg = warningMsg;
                return this;
            }

            public ErrorWorker build() {
                return new ErrorWorker(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class WarningWorker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlag")
        private Boolean errorFlag;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private Integer gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("WarningFlag")
        private Boolean warningFlag;

        @com.aliyun.core.annotation.NameInMap("WarningMsg")
        private String warningMsg;

        private WarningWorker(Builder builder) {
            this.errorFlag = builder.errorFlag;
            this.errorMsg = builder.errorMsg;
            this.experimentId = builder.experimentId;
            this.gpuName = builder.gpuName;
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.tflops = builder.tflops;
            this.warningFlag = builder.warningFlag;
            this.warningMsg = builder.warningMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningWorker create() {
            return builder().build();
        }

        /**
         * @return errorFlag
         */
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuNum
         */
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return warningFlag
         */
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        /**
         * @return warningMsg
         */
        public String getWarningMsg() {
            return this.warningMsg;
        }

        public static final class Builder {
            private Boolean errorFlag; 
            private String errorMsg; 
            private Long experimentId; 
            private String gpuName; 
            private Integer gpuNum; 
            private String hostname; 
            private String podName; 
            private Double samplesPerSecond; 
            private Double tflops; 
            private Boolean warningFlag; 
            private String warningMsg; 

            private Builder() {
            } 

            private Builder(WarningWorker model) {
                this.errorFlag = model.errorFlag;
                this.errorMsg = model.errorMsg;
                this.experimentId = model.experimentId;
                this.gpuName = model.gpuName;
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.samplesPerSecond = model.samplesPerSecond;
                this.tflops = model.tflops;
                this.warningFlag = model.warningFlag;
                this.warningMsg = model.warningMsg;
            } 

            /**
             * <p>Whether there is an error</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>error msg</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>113</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>GPU name</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Host IP</p>
             * 
             * <strong>example:</strong>
             * <p>101.66.165.102</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Pod name</p>
             * 
             * <strong>example:</strong>
             * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Throughput</p>
             * 
             * <strong>example:</strong>
             * <p>53</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>TFLOPS value</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Whether there is an alarm</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * <p>Alarm message</p>
             * 
             * <strong>example:</strong>
             * <p>warning msg</p>
             */
            public Builder warningMsg(String warningMsg) {
                this.warningMsg = warningMsg;
                return this;
            }

            public WarningWorker build() {
                return new WarningWorker(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("ErrorWorker")
        private java.util.List<ErrorWorker> errorWorker;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("Mfu")
        private Double mfu;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("SecondsPerIteration")
        private Double secondsPerIteration;

        @com.aliyun.core.annotation.NameInMap("WarningWorker")
        private java.util.List<WarningWorker> warningWorker;

        private Results(Builder builder) {
            this.duration = builder.duration;
            this.errorWorker = builder.errorWorker;
            this.experimentId = builder.experimentId;
            this.mfu = builder.mfu;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.secondsPerIteration = builder.secondsPerIteration;
            this.warningWorker = builder.warningWorker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return errorWorker
         */
        public java.util.List<ErrorWorker> getErrorWorker() {
            return this.errorWorker;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return mfu
         */
        public Double getMfu() {
            return this.mfu;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return secondsPerIteration
         */
        public Double getSecondsPerIteration() {
            return this.secondsPerIteration;
        }

        /**
         * @return warningWorker
         */
        public java.util.List<WarningWorker> getWarningWorker() {
            return this.warningWorker;
        }

        public static final class Builder {
            private Double duration; 
            private java.util.List<ErrorWorker> errorWorker; 
            private Long experimentId; 
            private Double mfu; 
            private Double samplesPerSecond; 
            private Double secondsPerIteration; 
            private java.util.List<WarningWorker> warningWorker; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.duration = model.duration;
                this.errorWorker = model.errorWorker;
                this.experimentId = model.experimentId;
                this.mfu = model.mfu;
                this.samplesPerSecond = model.samplesPerSecond;
                this.secondsPerIteration = model.secondsPerIteration;
                this.warningWorker = model.warningWorker;
            } 

            /**
             * <p>Duration</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Error nodes</p>
             */
            public Builder errorWorker(java.util.List<ErrorWorker> errorWorker) {
                this.errorWorker = errorWorker;
                return this;
            }

            /**
             * <p>Parameter name</p>
             * 
             * <strong>example:</strong>
             * <p>440</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>MFU</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder mfu(Double mfu) {
                this.mfu = mfu;
                return this;
            }

            /**
             * <p>Samples per second</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>Seconds per iteration</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder secondsPerIteration(Double secondsPerIteration) {
                this.secondsPerIteration = secondsPerIteration;
                return this;
            }

            /**
             * <p>Warning worker</p>
             */
            public Builder warningWorker(java.util.List<WarningWorker> warningWorker) {
                this.warningWorker = warningWorker;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EnvParams")
        private EnvParams envParams;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("ExperimentName")
        private String experimentName;

        @com.aliyun.core.annotation.NameInMap("ExperimentType")
        private String experimentType;

        @com.aliyun.core.annotation.NameInMap("GetParams")
        private java.util.Map<String, String> getParams;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        @com.aliyun.core.annotation.NameInMap("SetParams")
        private java.util.Map<String, String> setParams;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.envParams = builder.envParams;
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
            this.experimentType = builder.experimentType;
            this.getParams = builder.getParams;
            this.resourceName = builder.resourceName;
            this.results = builder.results;
            this.setParams = builder.setParams;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.workloadName = builder.workloadName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return envParams
         */
        public EnvParams getEnvParams() {
            return this.envParams;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return experimentType
         */
        public String getExperimentType() {
            return this.experimentType;
        }

        /**
         * @return getParams
         */
        public java.util.Map<String, String> getGetParams() {
            return this.getParams;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        /**
         * @return setParams
         */
        public java.util.Map<String, String> getSetParams() {
            return this.setParams;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        public static final class Builder {
            private Long createTime; 
            private String endTime; 
            private EnvParams envParams; 
            private Long experimentId; 
            private String experimentName; 
            private String experimentType; 
            private java.util.Map<String, String> getParams; 
            private String resourceName; 
            private Results results; 
            private java.util.Map<String, String> setParams; 
            private String startTime; 
            private String status; 
            private Long updateTime; 
            private String workloadName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.envParams = model.envParams;
                this.experimentId = model.experimentId;
                this.experimentName = model.experimentName;
                this.experimentType = model.experimentType;
                this.getParams = model.getParams;
                this.resourceName = model.resourceName;
                this.results = model.results;
                this.setParams = model.setParams;
                this.startTime = model.startTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.workloadName = model.workloadName;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-22 10:18:10</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Task end time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-22 10:28:10</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Environment parameters in operation</p>
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>1684537476910997506</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>Experiment name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * <p>Experiment type</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder experimentType(String experimentType) {
                this.experimentType = experimentType;
                return this;
            }

            /**
             * <p>Parsed load parameters</p>
             */
            public Builder getParams(java.util.Map<String, String> getParams) {
                this.getParams = getParams;
                return this;
            }

            /**
             * <p>Resource name</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.r8y.4xlarge</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Task results</p>
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * <p>Load parameters in operation</p>
             */
            public Builder setParams(java.util.Map<String, String> setParams) {
                this.setParams = setParams;
                return this;
            }

            /**
             * <p>Task start time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-22 10:18:10</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-22 10:18:10</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Workload name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
