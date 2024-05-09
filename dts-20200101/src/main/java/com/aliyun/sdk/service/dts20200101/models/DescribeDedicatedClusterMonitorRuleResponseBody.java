// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedClusterMonitorRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedClusterMonitorRuleResponseBody</p>
 */
public class DescribeDedicatedClusterMonitorRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuAlarmThreshold")
    private String cpuAlarmThreshold;

    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.NameInMap("DiskAlarmThreshold")
    private String diskAlarmThreshold;

    @com.aliyun.core.annotation.NameInMap("DuAlarmThreshold")
    private String duAlarmThreshold;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MemAlarmThreshold")
    private String memAlarmThreshold;

    @com.aliyun.core.annotation.NameInMap("NoticeSwitch")
    private String noticeSwitch;

    @com.aliyun.core.annotation.NameInMap("Phones")
    private String phones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeDedicatedClusterMonitorRuleResponseBody(Builder builder) {
        this.cpuAlarmThreshold = builder.cpuAlarmThreshold;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.diskAlarmThreshold = builder.diskAlarmThreshold;
        this.duAlarmThreshold = builder.duAlarmThreshold;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.memAlarmThreshold = builder.memAlarmThreshold;
        this.noticeSwitch = builder.noticeSwitch;
        this.phones = builder.phones;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedClusterMonitorRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return cpuAlarmThreshold
     */
    public String getCpuAlarmThreshold() {
        return this.cpuAlarmThreshold;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return diskAlarmThreshold
     */
    public String getDiskAlarmThreshold() {
        return this.diskAlarmThreshold;
    }

    /**
     * @return duAlarmThreshold
     */
    public String getDuAlarmThreshold() {
        return this.duAlarmThreshold;
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
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return memAlarmThreshold
     */
    public String getMemAlarmThreshold() {
        return this.memAlarmThreshold;
    }

    /**
     * @return noticeSwitch
     */
    public String getNoticeSwitch() {
        return this.noticeSwitch;
    }

    /**
     * @return phones
     */
    public String getPhones() {
        return this.phones;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String cpuAlarmThreshold; 
        private String dedicatedClusterId; 
        private String diskAlarmThreshold; 
        private String duAlarmThreshold; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String memAlarmThreshold; 
        private String noticeSwitch; 
        private String phones; 
        private String requestId; 
        private String success; 

        /**
         * CpuAlarmThreshold.
         */
        public Builder cpuAlarmThreshold(String cpuAlarmThreshold) {
            this.cpuAlarmThreshold = cpuAlarmThreshold;
            return this;
        }

        /**
         * DedicatedClusterId.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * DiskAlarmThreshold.
         */
        public Builder diskAlarmThreshold(String diskAlarmThreshold) {
            this.diskAlarmThreshold = diskAlarmThreshold;
            return this;
        }

        /**
         * DuAlarmThreshold.
         */
        public Builder duAlarmThreshold(String duAlarmThreshold) {
            this.duAlarmThreshold = duAlarmThreshold;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MemAlarmThreshold.
         */
        public Builder memAlarmThreshold(String memAlarmThreshold) {
            this.memAlarmThreshold = memAlarmThreshold;
            return this;
        }

        /**
         * NoticeSwitch.
         */
        public Builder noticeSwitch(String noticeSwitch) {
            this.noticeSwitch = noticeSwitch;
            return this;
        }

        /**
         * Phones.
         */
        public Builder phones(String phones) {
            this.phones = phones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeDedicatedClusterMonitorRuleResponseBody build() {
            return new DescribeDedicatedClusterMonitorRuleResponseBody(this);
        } 

    } 

}
