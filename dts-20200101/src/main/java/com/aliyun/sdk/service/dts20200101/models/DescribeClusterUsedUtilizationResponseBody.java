// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterUsedUtilizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterUsedUtilizationResponseBody</p>
 */
public class DescribeClusterUsedUtilizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CpuTotal")
    private Float cpuTotal;

    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.NameInMap("DiskTotal")
    private Float diskTotal;

    @com.aliyun.core.annotation.NameInMap("DiskUsed")
    private Float diskUsed;

    @com.aliyun.core.annotation.NameInMap("DuTotal")
    private Integer duTotal;

    @com.aliyun.core.annotation.NameInMap("DuUsed")
    private Integer duUsed;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MemoryTotal")
    private Float memoryTotal;

    @com.aliyun.core.annotation.NameInMap("MemoryUsed")
    private Float memoryUsed;

    @com.aliyun.core.annotation.NameInMap("MemoryUsedPercentage")
    private Float memoryUsedPercentage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskRunning")
    private Integer taskRunning;

    private DescribeClusterUsedUtilizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.cpuTotal = builder.cpuTotal;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.diskTotal = builder.diskTotal;
        this.diskUsed = builder.diskUsed;
        this.duTotal = builder.duTotal;
        this.duUsed = builder.duUsed;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.memoryTotal = builder.memoryTotal;
        this.memoryUsed = builder.memoryUsed;
        this.memoryUsedPercentage = builder.memoryUsedPercentage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskRunning = builder.taskRunning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterUsedUtilizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cpuTotal
     */
    public Float getCpuTotal() {
        return this.cpuTotal;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return diskTotal
     */
    public Float getDiskTotal() {
        return this.diskTotal;
    }

    /**
     * @return diskUsed
     */
    public Float getDiskUsed() {
        return this.diskUsed;
    }

    /**
     * @return duTotal
     */
    public Integer getDuTotal() {
        return this.duTotal;
    }

    /**
     * @return duUsed
     */
    public Integer getDuUsed() {
        return this.duUsed;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return memoryTotal
     */
    public Float getMemoryTotal() {
        return this.memoryTotal;
    }

    /**
     * @return memoryUsed
     */
    public Float getMemoryUsed() {
        return this.memoryUsed;
    }

    /**
     * @return memoryUsedPercentage
     */
    public Float getMemoryUsedPercentage() {
        return this.memoryUsedPercentage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskRunning
     */
    public Integer getTaskRunning() {
        return this.taskRunning;
    }

    public static final class Builder {
        private String code; 
        private Float cpuTotal; 
        private String dedicatedClusterId; 
        private Float diskTotal; 
        private Float diskUsed; 
        private Integer duTotal; 
        private Integer duUsed; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Float memoryTotal; 
        private Float memoryUsed; 
        private Float memoryUsedPercentage; 
        private String requestId; 
        private Boolean success; 
        private Integer taskRunning; 

        /**
         * The error code returned by the backend service. The number is incremented.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The CPU utilization of the cluster. Unit: percentage.
         */
        public Builder cpuTotal(Float cpuTotal) {
            this.cpuTotal = cpuTotal;
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
         * The total disk size of the cluster. Unit: GB.
         */
        public Builder diskTotal(Float diskTotal) {
            this.diskTotal = diskTotal;
            return this;
        }

        /**
         * The disk usage of the cluster. Unit: GB.
         */
        public Builder diskUsed(Float diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }

        /**
         * The total number of DTS units (DUs).
         */
        public Builder duTotal(Integer duTotal) {
            this.duTotal = duTotal;
            return this;
        }

        /**
         * The usage of DUs.
         */
        public Builder duUsed(Integer duUsed) {
            this.duUsed = duUsed;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace %s in the ErrMessage parameter.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The total amount of memory. A value of 0 is temporarily returned.
         */
        public Builder memoryTotal(Float memoryTotal) {
            this.memoryTotal = memoryTotal;
            return this;
        }

        /**
         * The memory usage. A value of 0 is temporarily returned.
         */
        public Builder memoryUsed(Float memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }

        /**
         * The memory usage.
         */
        public Builder memoryUsedPercentage(Float memoryUsedPercentage) {
            this.memoryUsedPercentage = memoryUsedPercentage;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The number of tasks that are in progress.
         */
        public Builder taskRunning(Integer taskRunning) {
            this.taskRunning = taskRunning;
            return this;
        }

        public DescribeClusterUsedUtilizationResponseBody build() {
            return new DescribeClusterUsedUtilizationResponseBody(this);
        } 

    } 

}
