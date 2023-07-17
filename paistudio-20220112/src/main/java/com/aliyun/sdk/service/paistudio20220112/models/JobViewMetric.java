// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobViewMetric} extends {@link TeaModel}
 *
 * <p>JobViewMetric</p>
 */
public class JobViewMetric extends TeaModel {
    @NameInMap("CPUUsageRate")
    private String CPUUsageRate;

    @NameInMap("DiskReadRate")
    private String diskReadRate;

    @NameInMap("DiskWriteRate")
    private String diskWriteRate;

    @NameInMap("GPUUsageRate")
    private String GPUUsageRate;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("MemoryUsageRate")
    private String memoryUsageRate;

    @NameInMap("NetworkInputRate")
    private String networkInputRate;

    @NameInMap("NetworkOutputRate")
    private String networkOutputRate;

    @NameInMap("NodeNames")
    private java.util.List < String > nodeNames;

    @NameInMap("RequestCPU")
    private Integer requestCPU;

    @NameInMap("RequestGPU")
    private Integer requestGPU;

    @NameInMap("RequestMemory")
    private Long requestMemory;

    @NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @NameInMap("TotalCPU")
    private Integer totalCPU;

    @NameInMap("TotalGPU")
    private Integer totalGPU;

    @NameInMap("TotalMemory")
    private Long totalMemory;

    @NameInMap("UserId")
    private String userId;

    private JobViewMetric(Builder builder) {
        this.CPUUsageRate = builder.CPUUsageRate;
        this.diskReadRate = builder.diskReadRate;
        this.diskWriteRate = builder.diskWriteRate;
        this.GPUUsageRate = builder.GPUUsageRate;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.memoryUsageRate = builder.memoryUsageRate;
        this.networkInputRate = builder.networkInputRate;
        this.networkOutputRate = builder.networkOutputRate;
        this.nodeNames = builder.nodeNames;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.resourceGroupID = builder.resourceGroupID;
        this.totalCPU = builder.totalCPU;
        this.totalGPU = builder.totalGPU;
        this.totalMemory = builder.totalMemory;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobViewMetric create() {
        return builder().build();
    }

    /**
     * @return CPUUsageRate
     */
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
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
     * @return GPUUsageRate
     */
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
    public java.util.List < String > getNodeNames() {
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
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
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
        private String CPUUsageRate; 
        private String diskReadRate; 
        private String diskWriteRate; 
        private String GPUUsageRate; 
        private String jobId; 
        private String jobType; 
        private String memoryUsageRate; 
        private String networkInputRate; 
        private String networkOutputRate; 
        private java.util.List < String > nodeNames; 
        private Integer requestCPU; 
        private Integer requestGPU; 
        private Long requestMemory; 
        private String resourceGroupID; 
        private Integer totalCPU; 
        private Integer totalGPU; 
        private Long totalMemory; 
        private String userId; 

        /**
         * CPUUsageRate.
         */
        public Builder CPUUsageRate(String CPUUsageRate) {
            this.CPUUsageRate = CPUUsageRate;
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
         * GPUUsageRate.
         */
        public Builder GPUUsageRate(String GPUUsageRate) {
            this.GPUUsageRate = GPUUsageRate;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
        public Builder nodeNames(java.util.List < String > nodeNames) {
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
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
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

        public JobViewMetric build() {
            return new JobViewMetric(this);
        } 

    } 

}
