// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
         * <p>The CPU utilization. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder cpuUtilization(Long cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsCluster****</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>daily_test</p>
         */
        public Builder dedicatedClusterName(String dedicatedClusterName) {
            this.dedicatedClusterName = dedicatedClusterName;
            return this;
        }

        /**
         * <p>The disk usage.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder diskUtilization(Long diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsb8r****</p>
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * <p>The number of DTS units (DUs).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder du(Long du) {
            this.du = du;
            return this;
        }

        /**
         * <p>The DU usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder duUtilization(Long duUtilization) {
            this.duUtilization = duUtilization;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1642476144000</p>
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The time when the cluster stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>1645200000000</p>
         */
        public Builder gmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The memory usage.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder memUtilization(Long memUtilization) {
            this.memUtilization = memUtilization;
            return this;
        }

        /**
         * <p>The number of nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder nodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The number of DUs that exceeds the upper limit.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder oversoldDu(Long oversoldDu) {
            this.oversoldDu = oversoldDu;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The cluster is being initialized.</li>
         * <li><strong>schedule</strong>: The cluster is pending scheduling.</li>
         * <li><strong>running</strong>: The cluster is running.</li>
         * <li><strong>upgrade</strong>: The cluster is being upgraded.</li>
         * <li><strong>downgrade</strong>: The cluster is being downgraded.</li>
         * <li><strong>locked</strong>: The cluster is locked.</li>
         * <li><strong>releasing</strong>: The cluster is being released.</li>
         * <li><strong>released</strong>: The cluster is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inti</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCpuCore(Long totalCpuCore) {
            this.totalCpuCore = totalCpuCore;
            return this;
        }

        /**
         * <p>The total disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder totalDiskGBSize(Long totalDiskGBSize) {
            this.totalDiskGBSize = totalDiskGBSize;
            return this;
        }

        /**
         * <p>The total amount of memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder totalMemGBSize(Long totalMemGBSize) {
            this.totalMemGBSize = totalMemGBSize;
            return this;
        }

        /**
         * <p>The number of used CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder usedCpuCore(Long usedCpuCore) {
            this.usedCpuCore = usedCpuCore;
            return this;
        }

        /**
         * <p>The used disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder usedDiskGBSize(Long usedDiskGBSize) {
            this.usedDiskGBSize = usedDiskGBSize;
            return this;
        }

        /**
         * <p>The number of used DUs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder usedDu(Long usedDu) {
            this.usedDu = usedDu;
            return this;
        }

        /**
         * <p>The amount of used memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
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
