// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedClusterResponseBody</p>
 */
public class DescribeDedicatedClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuUtilization")
    private Long cpuUtilization;

    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.NameInMap("DedicatedClusterName")
    private String dedicatedClusterName;

    @com.aliyun.core.annotation.NameInMap("DiskUtilization")
    private Long diskUtilization;

    @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @com.aliyun.core.annotation.NameInMap("Du")
    private Long du;

    @com.aliyun.core.annotation.NameInMap("DuUtilization")
    private Long duUtilization;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private Long gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtFinished")
    private Long gmtFinished;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MemUtilization")
    private Long memUtilization;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Long nodeCount;

    @com.aliyun.core.annotation.NameInMap("OversoldDu")
    private Long oversoldDu;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCpuCore")
    private Long totalCpuCore;

    @com.aliyun.core.annotation.NameInMap("TotalDiskGBSize")
    private Long totalDiskGBSize;

    @com.aliyun.core.annotation.NameInMap("TotalMemGBSize")
    private Long totalMemGBSize;

    @com.aliyun.core.annotation.NameInMap("UsedCpuCore")
    private Long usedCpuCore;

    @com.aliyun.core.annotation.NameInMap("UsedDiskGBSize")
    private Long usedDiskGBSize;

    @com.aliyun.core.annotation.NameInMap("UsedDu")
    private Long usedDu;

    @com.aliyun.core.annotation.NameInMap("UsedMemGBSize")
    private Long usedMemGBSize;

    private DescribeDedicatedClusterResponseBody(Builder builder) {
        this.cpuUtilization = builder.cpuUtilization;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dedicatedClusterName = builder.dedicatedClusterName;
        this.diskUtilization = builder.diskUtilization;
        this.dtsInstanceID = builder.dtsInstanceID;
        this.du = builder.du;
        this.duUtilization = builder.duUtilization;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.gmtCreated = builder.gmtCreated;
        this.gmtFinished = builder.gmtFinished;
        this.httpStatusCode = builder.httpStatusCode;
        this.memUtilization = builder.memUtilization;
        this.nodeCount = builder.nodeCount;
        this.oversoldDu = builder.oversoldDu;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.success = builder.success;
        this.totalCpuCore = builder.totalCpuCore;
        this.totalDiskGBSize = builder.totalDiskGBSize;
        this.totalMemGBSize = builder.totalMemGBSize;
        this.usedCpuCore = builder.usedCpuCore;
        this.usedDiskGBSize = builder.usedDiskGBSize;
        this.usedDu = builder.usedDu;
        this.usedMemGBSize = builder.usedMemGBSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return cpuUtilization
     */
    public Long getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return dedicatedClusterName
     */
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    /**
     * @return diskUtilization
     */
    public Long getDiskUtilization() {
        return this.diskUtilization;
    }

    /**
     * @return dtsInstanceID
     */
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    /**
     * @return du
     */
    public Long getDu() {
        return this.du;
    }

    /**
     * @return duUtilization
     */
    public Long getDuUtilization() {
        return this.duUtilization;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtFinished
     */
    public Long getGmtFinished() {
        return this.gmtFinished;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return memUtilization
     */
    public Long getMemUtilization() {
        return this.memUtilization;
    }

    /**
     * @return nodeCount
     */
    public Long getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return oversoldDu
     */
    public Long getOversoldDu() {
        return this.oversoldDu;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCpuCore
     */
    public Long getTotalCpuCore() {
        return this.totalCpuCore;
    }

    /**
     * @return totalDiskGBSize
     */
    public Long getTotalDiskGBSize() {
        return this.totalDiskGBSize;
    }

    /**
     * @return totalMemGBSize
     */
    public Long getTotalMemGBSize() {
        return this.totalMemGBSize;
    }

    /**
     * @return usedCpuCore
     */
    public Long getUsedCpuCore() {
        return this.usedCpuCore;
    }

    /**
     * @return usedDiskGBSize
     */
    public Long getUsedDiskGBSize() {
        return this.usedDiskGBSize;
    }

    /**
     * @return usedDu
     */
    public Long getUsedDu() {
        return this.usedDu;
    }

    /**
     * @return usedMemGBSize
     */
    public Long getUsedMemGBSize() {
        return this.usedMemGBSize;
    }

    public static final class Builder {
        private Long cpuUtilization; 
        private String dedicatedClusterId; 
        private String dedicatedClusterName; 
        private Long diskUtilization; 
        private String dtsInstanceID; 
        private Long du; 
        private Long duUtilization; 
        private String errCode; 
        private String errMessage; 
        private Long gmtCreated; 
        private Long gmtFinished; 
        private String httpStatusCode; 
        private Long memUtilization; 
        private Long nodeCount; 
        private Long oversoldDu; 
        private String regionId; 
        private String requestId; 
        private String state; 
        private String success; 
        private Long totalCpuCore; 
        private Long totalDiskGBSize; 
        private Long totalMemGBSize; 
        private Long usedCpuCore; 
        private Long usedDiskGBSize; 
        private Long usedDu; 
        private Long usedMemGBSize; 

        /**
         * The CPU utilization. Unit: percentage.
         */
        public Builder cpuUtilization(Long cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder dedicatedClusterName(String dedicatedClusterName) {
            this.dedicatedClusterName = dedicatedClusterName;
            return this;
        }

        /**
         * The disk usage.
         */
        public Builder diskUtilization(Long diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * The number of DTS units (DUs).
         */
        public Builder du(Long du) {
            this.du = du;
            return this;
        }

        /**
         * The DU usage. Unit: percentage.
         */
        public Builder duUtilization(Long duUtilization) {
            this.duUtilization = duUtilization;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The time when the cluster was created.
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * The time when the cluster stopped.
         */
        public Builder gmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The memory usage.
         */
        public Builder memUtilization(Long memUtilization) {
            this.memUtilization = memUtilization;
            return this;
        }

        /**
         * The number of nodes in the cluster.
         */
        public Builder nodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * The number of DUs that exceeds the upper limit.
         */
        public Builder oversoldDu(Long oversoldDu) {
            this.oversoldDu = oversoldDu;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the cluster. Valid values:
         * <p>
         * 
         * *   **init**: The cluster is being initialized.
         * *   **schedule**: The cluster is pending scheduling.
         * *   **running**: The cluster is running.
         * *   **upgrade**: The cluster is being upgraded.
         * *   **downgrade**: The cluster is being downgraded.
         * *   **locked**: The cluster is locked.
         * *   **releasing**: The cluster is being released.
         * *   **released**: The cluster is released.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of CPU cores.
         */
        public Builder totalCpuCore(Long totalCpuCore) {
            this.totalCpuCore = totalCpuCore;
            return this;
        }

        /**
         * The total disk size. Unit: GB.
         */
        public Builder totalDiskGBSize(Long totalDiskGBSize) {
            this.totalDiskGBSize = totalDiskGBSize;
            return this;
        }

        /**
         * The total amount of memory. Unit: GB.
         */
        public Builder totalMemGBSize(Long totalMemGBSize) {
            this.totalMemGBSize = totalMemGBSize;
            return this;
        }

        /**
         * The number of used CPU cores.
         */
        public Builder usedCpuCore(Long usedCpuCore) {
            this.usedCpuCore = usedCpuCore;
            return this;
        }

        /**
         * The used disk size. Unit: GB.
         */
        public Builder usedDiskGBSize(Long usedDiskGBSize) {
            this.usedDiskGBSize = usedDiskGBSize;
            return this;
        }

        /**
         * The number of used DUs.
         */
        public Builder usedDu(Long usedDu) {
            this.usedDu = usedDu;
            return this;
        }

        /**
         * The amount of used memory. Unit: GB.
         */
        public Builder usedMemGBSize(Long usedMemGBSize) {
            this.usedMemGBSize = usedMemGBSize;
            return this;
        }

        public DescribeDedicatedClusterResponseBody build() {
            return new DescribeDedicatedClusterResponseBody(this);
        } 

    } 

}
