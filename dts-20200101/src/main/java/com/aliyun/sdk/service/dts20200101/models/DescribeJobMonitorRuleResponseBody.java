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
 * {@link DescribeJobMonitorRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMonitorRuleResponseBody</p>
 */
public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MonitorRules")
    private java.util.List<MonitorRules> monitorRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List<String> topics;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<MonitorRules> getMonitorRules() {
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
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public static final class Builder {
        private String code; 
        private String dtsJobId; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private java.util.List<MonitorRules> monitorRules; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<String> topics; 

        private Builder() {
        } 

        private Builder(DescribeJobMonitorRuleResponseBody model) {
            this.code = model.code;
            this.dtsJobId = model.dtsJobId;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.monitorRules = model.monitorRules;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topics = model.topics;
        } 

        /**
         * <p>The error code. This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>ta7w132u12h****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> If the specified <strong>DtsJobId</strong> parameter is invalid, <strong>The Value of Input Parameter %s is not valid</strong> is returned for <strong>ErrMessage</strong> and <strong>DtsJobId</strong> is returned for <strong>DynamicMessage</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
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
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The monitoring rules of the DTS task.</p>
         */
        public Builder monitorRules(java.util.List<MonitorRules> monitorRules) {
            this.monitorRules = monitorRules;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0CA14388-DD89-4A7B-8CDD-884A10CE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>:The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The topics of all subtasks in the distributed change tracking task.</p>
         */
        public Builder topics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }

        public DescribeJobMonitorRuleResponseBody build() {
            return new DescribeJobMonitorRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobMonitorRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobMonitorRuleResponseBody</p>
     */
    public static class MonitorRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayRuleTime")
        private Long delayRuleTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("NoticeValue")
        private Integer noticeValue;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(MonitorRules model) {
                this.delayRuleTime = model.delayRuleTime;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.noticeValue = model.noticeValue;
                this.period = model.period;
                this.phone = model.phone;
                this.state = model.state;
                this.times = model.times;
                this.type = model.type;
            } 

            /**
             * <p>The threshold that triggers the alert.</p>
             * <ul>
             * <li>If the request parameter <strong>Type</strong> of the <a href="https://help.aliyun.com/document_detail/212332.html">CreateJobMonitorRule</a> operation is set to <strong>delay</strong>, the unit of DelayRuleTime is seconds.</li>
             * <li>If the request parameter <strong>Type</strong> of the <a href="https://help.aliyun.com/document_detail/212332.html">CreateJobMonitorRule</a> operation is set to <strong>full_timeout</strong>, the unit of DelayRuleTime is hours.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder delayRuleTime(Long delayRuleTime) {
                this.delayRuleTime = delayRuleTime;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bi6e22ay243****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The task type of the DTS instance, with values: - <strong>normal</strong>: Migration or synchronization task. - <strong>full_check</strong>: Associated full check task. - <strong>etl_check</strong>: Associated incremental check task.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>Alarm threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder noticeValue(Integer noticeValue) {
                this.noticeValue = noticeValue;
                return this;
            }

            /**
             * <p>The statistical period for incremental validation tasks, in minutes.</p>
             * <blockquote>
             * <p>Currently supported values are 1 minute, 5 minutes, 10 minutes, and 30 minutes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The mobile phone numbers that receive alert notifications. Multiple mobile numbers are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1361234****,1371234****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring rule is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Y</strong>: The monitoring rule is enabled.</li>
             * <li><strong>N</strong>: The monitoring rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The number of cycles for the incremental validation task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            /**
             * <p>The type of the monitoring rule. Valid values:</p>
             * <ul>
             * <li><strong>delay</strong>: If the task latency reaches the threshold, an alert is triggered.</li>
             * <li><strong>error</strong>: If an exception occurs, an alert is triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
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
