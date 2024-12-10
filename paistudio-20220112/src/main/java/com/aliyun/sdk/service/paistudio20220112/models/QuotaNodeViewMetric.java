// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuotaNodeViewMetric} extends {@link TeaModel}
 *
 * <p>QuotaNodeViewMetric</p>
 */
public class QuotaNodeViewMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPUUsageRate")
    private String CPUUsageRate;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("DiskReadRate")
    private String diskReadRate;

    @com.aliyun.core.annotation.NameInMap("DiskWriteRate")
    private String diskWriteRate;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("MemoryUsageRate")
    private String memoryUsageRate;

    @com.aliyun.core.annotation.NameInMap("NetworkInputRate")
    private String networkInputRate;

    @com.aliyun.core.annotation.NameInMap("NetworkOutputRate")
    private String networkOutputRate;

    @com.aliyun.core.annotation.NameInMap("NodeID")
    private String nodeID;

    @com.aliyun.core.annotation.NameInMap("NodeStatus")
    private String nodeStatus;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private Long requestCPU;

    @com.aliyun.core.annotation.NameInMap("RequestGPU")
    private Long requestGPU;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private Long requestMemory;

    @com.aliyun.core.annotation.NameInMap("TaskIdMap")
    private java.util.Map < String, ? > taskIdMap;

    @com.aliyun.core.annotation.NameInMap("TotalCPU")
    private Long totalCPU;

    @com.aliyun.core.annotation.NameInMap("TotalGPU")
    private Long totalGPU;

    @com.aliyun.core.annotation.NameInMap("TotalMemory")
    private Long totalMemory;

    @com.aliyun.core.annotation.NameInMap("TotalTasks")
    private Long totalTasks;

    @com.aliyun.core.annotation.NameInMap("UserIDs")
    private java.util.List < String > userIDs;

    @com.aliyun.core.annotation.NameInMap("UserNumber")
    private String userNumber;

    private QuotaNodeViewMetric(Builder builder) {
        this.CPUUsageRate = builder.CPUUsageRate;
        this.createdTime = builder.createdTime;
        this.diskReadRate = builder.diskReadRate;
        this.diskWriteRate = builder.diskWriteRate;
        this.GPUType = builder.GPUType;
        this.memoryUsageRate = builder.memoryUsageRate;
        this.networkInputRate = builder.networkInputRate;
        this.networkOutputRate = builder.networkOutputRate;
        this.nodeID = builder.nodeID;
        this.nodeStatus = builder.nodeStatus;
        this.nodeType = builder.nodeType;
        this.quotaId = builder.quotaId;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.taskIdMap = builder.taskIdMap;
        this.totalCPU = builder.totalCPU;
        this.totalGPU = builder.totalGPU;
        this.totalMemory = builder.totalMemory;
        this.totalTasks = builder.totalTasks;
        this.userIDs = builder.userIDs;
        this.userNumber = builder.userNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaNodeViewMetric create() {
        return builder().build();
    }

    /**
     * @return CPUUsageRate
     */
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
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
     * @return nodeID
     */
    public String getNodeID() {
        return this.nodeID;
    }

    /**
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return requestCPU
     */
    public Long getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestGPU
     */
    public Long getRequestGPU() {
        return this.requestGPU;
    }

    /**
     * @return requestMemory
     */
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    /**
     * @return taskIdMap
     */
    public java.util.Map < String, ? > getTaskIdMap() {
        return this.taskIdMap;
    }

    /**
     * @return totalCPU
     */
    public Long getTotalCPU() {
        return this.totalCPU;
    }

    /**
     * @return totalGPU
     */
    public Long getTotalGPU() {
        return this.totalGPU;
    }

    /**
     * @return totalMemory
     */
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    /**
     * @return totalTasks
     */
    public Long getTotalTasks() {
        return this.totalTasks;
    }

    /**
     * @return userIDs
     */
    public java.util.List < String > getUserIDs() {
        return this.userIDs;
    }

    /**
     * @return userNumber
     */
    public String getUserNumber() {
        return this.userNumber;
    }

    public static final class Builder {
        private String CPUUsageRate; 
        private String createdTime; 
        private String diskReadRate; 
        private String diskWriteRate; 
        private String GPUType; 
        private String memoryUsageRate; 
        private String networkInputRate; 
        private String networkOutputRate; 
        private String nodeID; 
        private String nodeStatus; 
        private String nodeType; 
        private String quotaId; 
        private Long requestCPU; 
        private Long requestGPU; 
        private Long requestMemory; 
        private java.util.Map < String, ? > taskIdMap; 
        private Long totalCPU; 
        private Long totalGPU; 
        private Long totalMemory; 
        private Long totalTasks; 
        private java.util.List < String > userIDs; 
        private String userNumber; 

        /**
         * CPUUsageRate.
         */
        public Builder CPUUsageRate(String CPUUsageRate) {
            this.CPUUsageRate = CPUUsageRate;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
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
         * NodeID.
         */
        public Builder nodeID(String nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        /**
         * NodeStatus.
         */
        public Builder nodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * RequestCPU.
         */
        public Builder requestCPU(Long requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * RequestGPU.
         */
        public Builder requestGPU(Long requestGPU) {
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
         * TaskIdMap.
         */
        public Builder taskIdMap(java.util.Map < String, ? > taskIdMap) {
            this.taskIdMap = taskIdMap;
            return this;
        }

        /**
         * TotalCPU.
         */
        public Builder totalCPU(Long totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }

        /**
         * TotalGPU.
         */
        public Builder totalGPU(Long totalGPU) {
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
         * TotalTasks.
         */
        public Builder totalTasks(Long totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }

        /**
         * UserIDs.
         */
        public Builder userIDs(java.util.List < String > userIDs) {
            this.userIDs = userIDs;
            return this;
        }

        /**
         * UserNumber.
         */
        public Builder userNumber(String userNumber) {
            this.userNumber = userNumber;
            return this;
        }

        public QuotaNodeViewMetric build() {
            return new QuotaNodeViewMetric(this);
        } 

    } 

}
