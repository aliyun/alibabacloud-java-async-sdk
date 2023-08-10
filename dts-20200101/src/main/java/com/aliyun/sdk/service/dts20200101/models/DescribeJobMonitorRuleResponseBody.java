// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMonitorRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMonitorRuleResponseBody</p>
 */
public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DtsJobId")
    private String dtsJobId;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MonitorRules")
    private java.util.List < MonitorRules> monitorRules;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Topics")
    private java.util.List < String > topics;

    private DescribeJobMonitorRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.dtsJobId = builder.dtsJobId;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.monitorRules = builder.monitorRules;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMonitorRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
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
     * @return monitorRules
     */
    public java.util.List < MonitorRules> getMonitorRules() {
        return this.monitorRules;
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
     * @return topics
     */
    public java.util.List < String > getTopics() {
        return this.topics;
    }

    public static final class Builder {
        private String code; 
        private String dtsJobId; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private java.util.List < MonitorRules> monitorRules; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < String > topics; 

        /**
         * The error code. This parameter will be removed in the future.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **ErrMessage** parameter.
         * <p>
         * 
         * >  If the specified **DtsJobId** parameter is invalid, **The Value of Input Parameter %s is not valid** is returned for **ErrMessage** and **DtsJobId** is returned for **DynamicMessage**.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The monitoring rules of the DTS task.
         */
        public Builder monitorRules(java.util.List < MonitorRules> monitorRules) {
            this.monitorRules = monitorRules;
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   **true**: The call was successful.
         * *   **false**:The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The topics of all subtasks in the distributed change tracking task.
         */
        public Builder topics(java.util.List < String > topics) {
            this.topics = topics;
            return this;
        }

        public DescribeJobMonitorRuleResponseBody build() {
            return new DescribeJobMonitorRuleResponseBody(this);
        } 

    } 

    public static class MonitorRules extends TeaModel {
        @NameInMap("DelayRuleTime")
        private Long delayRuleTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("NoticeValue")
        private Integer noticeValue;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("State")
        private String state;

        @NameInMap("Times")
        private Integer times;

        @NameInMap("Type")
        private String type;

        private MonitorRules(Builder builder) {
            this.delayRuleTime = builder.delayRuleTime;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.noticeValue = builder.noticeValue;
            this.period = builder.period;
            this.phone = builder.phone;
            this.state = builder.state;
            this.times = builder.times;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorRules create() {
            return builder().build();
        }

        /**
         * @return delayRuleTime
         */
        public Long getDelayRuleTime() {
            return this.delayRuleTime;
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
         * @return noticeValue
         */
        public Integer getNoticeValue() {
            return this.noticeValue;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long delayRuleTime; 
            private String jobId; 
            private String jobType; 
            private Integer noticeValue; 
            private Integer period; 
            private String phone; 
            private String state; 
            private Integer times; 
            private String type; 

            /**
             * The threshold that triggers the alert.
             * <p>
             * 
             * *   If the request parameter **Type** of the [CreateJobMonitorRule](~~212332~~) operation is set to **delay**, the unit of DelayRuleTime is seconds.
             * *   If the request parameter **Type** of the [CreateJobMonitorRule](~~212332~~) operation is set to **full_timeout**, the unit of DelayRuleTime is hours.
             */
            public Builder delayRuleTime(Long delayRuleTime) {
                this.delayRuleTime = delayRuleTime;
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
             * NoticeValue.
             */
            public Builder noticeValue(Integer noticeValue) {
                this.noticeValue = noticeValue;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The mobile phone numbers that receive alert notifications. Multiple mobile numbers are separated by commas (,).
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Indicates whether the monitoring rule is enabled. Valid values:
             * <p>
             * 
             * *   **Y**: The monitoring rule is enabled.
             * *   **N**: The monitoring rule is disabled.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            /**
             * The type of the monitoring rule. Valid values:
             * <p>
             * 
             * *   **delay**: If the task latency reaches the threshold, an alert is triggered.
             * *   **error**: If an exception occurs, an alert is triggered.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MonitorRules build() {
                return new MonitorRules(this);
            } 

        } 

    }
}
