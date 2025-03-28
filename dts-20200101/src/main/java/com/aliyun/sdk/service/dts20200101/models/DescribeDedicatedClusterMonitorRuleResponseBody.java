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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDedicatedClusterMonitorRuleResponseBody model) {
            this.cpuAlarmThreshold = model.cpuAlarmThreshold;
            this.dedicatedClusterId = model.dedicatedClusterId;
            this.diskAlarmThreshold = model.diskAlarmThreshold;
            this.duAlarmThreshold = model.duAlarmThreshold;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.memAlarmThreshold = model.memAlarmThreshold;
            this.noticeSwitch = model.noticeSwitch;
            this.phones = model.phones;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The alert threshold for CPU utilization. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder cpuAlarmThreshold(String cpuAlarmThreshold) {
            this.cpuAlarmThreshold = cpuAlarmThreshold;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsClustervcwn1oeyu5fx4yf</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The alert threshold for disk usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder diskAlarmThreshold(String diskAlarmThreshold) {
            this.diskAlarmThreshold = diskAlarmThreshold;
            return this;
        }

        /**
         * <p>The alert threshold for DTS Unit (DU) usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        public Builder duAlarmThreshold(String duAlarmThreshold) {
            this.duAlarmThreshold = duAlarmThreshold;
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
         * <p>The alert threshold for memory usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder memAlarmThreshold(String memAlarmThreshold) {
            this.memAlarmThreshold = memAlarmThreshold;
            return this;
        }

        /**
         * <p>Indicates whether the alert feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The alert feature is enabled.</li>
         * <li><strong>0</strong>: The alert feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder noticeSwitch(String noticeSwitch) {
            this.noticeSwitch = noticeSwitch;
            return this;
        }

        /**
         * <p>The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>186****7653</p>
         */
        public Builder phones(String phones) {
            this.phones = phones;
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
