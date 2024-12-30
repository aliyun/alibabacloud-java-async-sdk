// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UserViewMetric} extends {@link TeaModel}
 *
 * <p>UserViewMetric</p>
 */
public class UserViewMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPUNodeNumber")
    private Integer CPUNodeNumber;

    @com.aliyun.core.annotation.NameInMap("CPUUsageRate")
    private String CPUUsageRate;

    @com.aliyun.core.annotation.NameInMap("CpuJobNames")
    private java.util.List<String> cpuJobNames;

    @com.aliyun.core.annotation.NameInMap("CpuNodeNames")
    private java.util.List<String> cpuNodeNames;

    @com.aliyun.core.annotation.NameInMap("DiskReadRate")
    private String diskReadRate;

    @com.aliyun.core.annotation.NameInMap("DiskWriteRate")
    private String diskWriteRate;

    @com.aliyun.core.annotation.NameInMap("GPUNodeNumber")
    private Integer GPUNodeNumber;

    @com.aliyun.core.annotation.NameInMap("GPUUsageRate")
    private String GPUUsageRate;

    @com.aliyun.core.annotation.NameInMap("GpuJobNames")
    private java.util.List<String> gpuJobNames;

    @com.aliyun.core.annotation.NameInMap("GpuNodeNames")
    private java.util.List<String> gpuNodeNames;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("MemoryUsageRate")
    private String memoryUsageRate;

    @com.aliyun.core.annotation.NameInMap("NetworkInputRate")
    private String networkInputRate;

    @com.aliyun.core.annotation.NameInMap("NetworkOutputRate")
    private String networkOutputRate;

    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private Integer requestCPU;

    @com.aliyun.core.annotation.NameInMap("RequestGPU")
    private Integer requestGPU;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private Long requestMemory;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("TotalCPU")
    private Integer totalCPU;

    @com.aliyun.core.annotation.NameInMap("TotalGPU")
    private Integer totalGPU;

    @com.aliyun.core.annotation.NameInMap("TotalMemory")
    private Long totalMemory;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private UserViewMetric(Builder builder) {
        this.CPUNodeNumber = builder.CPUNodeNumber;
        this.CPUUsageRate = builder.CPUUsageRate;
        this.cpuJobNames = builder.cpuJobNames;
        this.cpuNodeNames = builder.cpuNodeNames;
        this.diskReadRate = builder.diskReadRate;
        this.diskWriteRate = builder.diskWriteRate;
        this.GPUNodeNumber = builder.GPUNodeNumber;
        this.GPUUsageRate = builder.GPUUsageRate;
        this.gpuJobNames = builder.gpuJobNames;
        this.gpuNodeNames = builder.gpuNodeNames;
        this.jobType = builder.jobType;
        this.memoryUsageRate = builder.memoryUsageRate;
        this.networkInputRate = builder.networkInputRate;
        this.networkOutputRate = builder.networkOutputRate;
        this.nodeNames = builder.nodeNames;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.resourceGroupId = builder.resourceGroupId;
        this.totalCPU = builder.totalCPU;
        this.totalGPU = builder.totalGPU;
        this.totalMemory = builder.totalMemory;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserViewMetric create() {
        return builder().build();
    }

    /**
     * @return CPUNodeNumber
     */
    public Integer getCPUNodeNumber() {
        return this.CPUNodeNumber;
    }

    /**
     * @return CPUUsageRate
     */
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    /**
     * @return cpuJobNames
     */
    public java.util.List<String> getCpuJobNames() {
        return this.cpuJobNames;
    }

    /**
     * @return cpuNodeNames
     */
    public java.util.List<String> getCpuNodeNames() {
        return this.cpuNodeNames;
    }

    /**
     * @return diskReadRate
     */
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    /**
     * @return diskWriteRate
     */
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    /**
     * @return GPUNodeNumber
     */
    public Integer getGPUNodeNumber() {
        return this.GPUNodeNumber;
    }

    /**
     * @return GPUUsageRate
     */
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    /**
     * @return gpuJobNames
     */
    public java.util.List<String> getGpuJobNames() {
        return this.gpuJobNames;
    }

    /**
     * @return gpuNodeNames
     */
    public java.util.List<String> getGpuNodeNames() {
        return this.gpuNodeNames;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return memoryUsageRate
     */
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    /**
     * @return networkInputRate
     */
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    /**
     * @return networkOutputRate
     */
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
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
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Integer CPUNodeNumber; 
        private String CPUUsageRate; 
        private java.util.List<String> cpuJobNames; 
        private java.util.List<String> cpuNodeNames; 
        private String diskReadRate; 
        private String diskWriteRate; 
        private Integer GPUNodeNumber; 
        private String GPUUsageRate; 
        private java.util.List<String> gpuJobNames; 
        private java.util.List<String> gpuNodeNames; 
        private String jobType; 
        private String memoryUsageRate; 
        private String networkInputRate; 
        private String networkOutputRate; 
        private java.util.List<String> nodeNames; 
        private Integer requestCPU; 
        private Integer requestGPU; 
        private Long requestMemory; 
        private String resourceGroupId; 
        private Integer totalCPU; 
        private Integer totalGPU; 
        private Long totalMemory; 
        private String userId; 

        /**
         * CPUNodeNumber.
         */
        public Builder CPUNodeNumber(Integer CPUNodeNumber) {
            this.CPUNodeNumber = CPUNodeNumber;
            return this;
        }

        /**
         * CPUUsageRate.
         */
        public Builder CPUUsageRate(String CPUUsageRate) {
            this.CPUUsageRate = CPUUsageRate;
            return this;
        }

        /**
         * CpuJobNames.
         */
        public Builder cpuJobNames(java.util.List<String> cpuJobNames) {
            this.cpuJobNames = cpuJobNames;
            return this;
        }

        /**
         * CpuNodeNames.
         */
        public Builder cpuNodeNames(java.util.List<String> cpuNodeNames) {
            this.cpuNodeNames = cpuNodeNames;
            return this;
        }

        /**
         * DiskReadRate.
         */
        public Builder diskReadRate(String diskReadRate) {
            this.diskReadRate = diskReadRate;
            return this;
        }

        /**
         * DiskWriteRate.
         */
        public Builder diskWriteRate(String diskWriteRate) {
            this.diskWriteRate = diskWriteRate;
            return this;
        }

        /**
         * GPUNodeNumber.
         */
        public Builder GPUNodeNumber(Integer GPUNodeNumber) {
            this.GPUNodeNumber = GPUNodeNumber;
            return this;
        }

        /**
         * GPUUsageRate.
         */
        public Builder GPUUsageRate(String GPUUsageRate) {
            this.GPUUsageRate = GPUUsageRate;
            return this;
        }

        /**
         * GpuJobNames.
         */
        public Builder gpuJobNames(java.util.List<String> gpuJobNames) {
            this.gpuJobNames = gpuJobNames;
            return this;
        }

        /**
         * GpuNodeNames.
         */
        public Builder gpuNodeNames(java.util.List<String> gpuNodeNames) {
            this.gpuNodeNames = gpuNodeNames;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * MemoryUsageRate.
         */
        public Builder memoryUsageRate(String memoryUsageRate) {
            this.memoryUsageRate = memoryUsageRate;
            return this;
        }

        /**
         * NetworkInputRate.
         */
        public Builder networkInputRate(String networkInputRate) {
            this.networkInputRate = networkInputRate;
            return this;
        }

        /**
         * NetworkOutputRate.
         */
        public Builder networkOutputRate(String networkOutputRate) {
            this.networkOutputRate = networkOutputRate;
            return this;
        }

        /**
         * NodeNames.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * RequestCPU.
         */
        public Builder requestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * RequestGPU.
         */
        public Builder requestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }

        /**
         * RequestMemory.
         */
        public Builder requestMemory(Long requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TotalCPU.
         */
        public Builder totalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }

        /**
         * TotalGPU.
         */
        public Builder totalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserViewMetric build() {
            return new UserViewMetric(this);
        } 

    } 

}
