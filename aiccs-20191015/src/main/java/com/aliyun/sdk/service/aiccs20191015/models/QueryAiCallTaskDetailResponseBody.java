// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiCallTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiCallTaskDetailResponseBody</p>
 */
public class QueryAiCallTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiCallTaskDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiCallTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiCallTaskDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial. This parameter is returned only when the RAM permission verification fails.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid parameter</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23822ECB-8CAA-5C52-9C9E-807FD82A5A7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiCallTaskDetailResponseBody build() {
            return new QueryAiCallTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiCallTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallTaskDetailResponseBody</p>
     */
    public static class CallTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CallTimes(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallTimes create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CallTimes model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in the format of HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in the format of HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CallTimes build() {
                return new CallTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiCallTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallTaskDetailResponseBody</p>
     */
    public static class CallableTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CallableTimes(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallableTimes create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CallableTimes model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in the format of HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in the format of HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CallableTimes build() {
                return new CallableTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiCallTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ApplicationCode")
        private String applicationCode;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CallDays")
        private java.util.List<String> callDays;

        @com.aliyun.core.annotation.NameInMap("CallExpireDate")
        private String callExpireDate;

        @com.aliyun.core.annotation.NameInMap("CallExpireMinutes")
        private Long callExpireMinutes;

        @com.aliyun.core.annotation.NameInMap("CallExpireType")
        private Long callExpireType;

        @com.aliyun.core.annotation.NameInMap("CallTimes")
        private java.util.List<CallTimes> callTimes;

        @com.aliyun.core.annotation.NameInMap("CallableTimes")
        private java.util.List<CallableTimes> callableTimes;

        @com.aliyun.core.annotation.NameInMap("CallerNumber")
        private String callerNumber;

        @com.aliyun.core.annotation.NameInMap("ConcurrentCount")
        private Long concurrentCount;

        @com.aliyun.core.annotation.NameInMap("LineEncoding")
        private String lineEncoding;

        @com.aliyun.core.annotation.NameInMap("LinePhoneNum")
        private String linePhoneNum;

        @com.aliyun.core.annotation.NameInMap("PhoneType")
        private Long phoneType;

        @com.aliyun.core.annotation.NameInMap("RealStartTime")
        private Long realStartTime;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Long retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryEnable")
        private Boolean retryEnable;

        @com.aliyun.core.annotation.NameInMap("RetryInterval")
        private Long retryInterval;

        @com.aliyun.core.annotation.NameInMap("RetryReasons")
        private java.util.List<String> retryReasons;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StartType")
        private String startType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.applicationCode = builder.applicationCode;
            this.applicationName = builder.applicationName;
            this.callDays = builder.callDays;
            this.callExpireDate = builder.callExpireDate;
            this.callExpireMinutes = builder.callExpireMinutes;
            this.callExpireType = builder.callExpireType;
            this.callTimes = builder.callTimes;
            this.callableTimes = builder.callableTimes;
            this.callerNumber = builder.callerNumber;
            this.concurrentCount = builder.concurrentCount;
            this.lineEncoding = builder.lineEncoding;
            this.linePhoneNum = builder.linePhoneNum;
            this.phoneType = builder.phoneType;
            this.realStartTime = builder.realStartTime;
            this.retryCount = builder.retryCount;
            this.retryEnable = builder.retryEnable;
            this.retryInterval = builder.retryInterval;
            this.retryReasons = builder.retryReasons;
            this.startTime = builder.startTime;
            this.startType = builder.startType;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return applicationCode
         */
        public String getApplicationCode() {
            return this.applicationCode;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return callDays
         */
        public java.util.List<String> getCallDays() {
            return this.callDays;
        }

        /**
         * @return callExpireDate
         */
        public String getCallExpireDate() {
            return this.callExpireDate;
        }

        /**
         * @return callExpireMinutes
         */
        public Long getCallExpireMinutes() {
            return this.callExpireMinutes;
        }

        /**
         * @return callExpireType
         */
        public Long getCallExpireType() {
            return this.callExpireType;
        }

        /**
         * @return callTimes
         */
        public java.util.List<CallTimes> getCallTimes() {
            return this.callTimes;
        }

        /**
         * @return callableTimes
         */
        public java.util.List<CallableTimes> getCallableTimes() {
            return this.callableTimes;
        }

        /**
         * @return callerNumber
         */
        public String getCallerNumber() {
            return this.callerNumber;
        }

        /**
         * @return concurrentCount
         */
        public Long getConcurrentCount() {
            return this.concurrentCount;
        }

        /**
         * @return lineEncoding
         */
        public String getLineEncoding() {
            return this.lineEncoding;
        }

        /**
         * @return linePhoneNum
         */
        public String getLinePhoneNum() {
            return this.linePhoneNum;
        }

        /**
         * @return phoneType
         */
        public Long getPhoneType() {
            return this.phoneType;
        }

        /**
         * @return realStartTime
         */
        public Long getRealStartTime() {
            return this.realStartTime;
        }

        /**
         * @return retryCount
         */
        public Long getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryEnable
         */
        public Boolean getRetryEnable() {
            return this.retryEnable;
        }

        /**
         * @return retryInterval
         */
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return retryReasons
         */
        public java.util.List<String> getRetryReasons() {
            return this.retryReasons;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return startType
         */
        public String getStartType() {
            return this.startType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String applicationCode; 
            private String applicationName; 
            private java.util.List<String> callDays; 
            private String callExpireDate; 
            private Long callExpireMinutes; 
            private Long callExpireType; 
            private java.util.List<CallTimes> callTimes; 
            private java.util.List<CallableTimes> callableTimes; 
            private String callerNumber; 
            private Long concurrentCount; 
            private String lineEncoding; 
            private String linePhoneNum; 
            private Long phoneType; 
            private Long realStartTime; 
            private Long retryCount; 
            private Boolean retryEnable; 
            private Long retryInterval; 
            private java.util.List<String> retryReasons; 
            private Long startTime; 
            private String startType; 
            private String taskId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.applicationCode = model.applicationCode;
                this.applicationName = model.applicationName;
                this.callDays = model.callDays;
                this.callExpireDate = model.callExpireDate;
                this.callExpireMinutes = model.callExpireMinutes;
                this.callExpireType = model.callExpireType;
                this.callTimes = model.callTimes;
                this.callableTimes = model.callableTimes;
                this.callerNumber = model.callerNumber;
                this.concurrentCount = model.concurrentCount;
                this.lineEncoding = model.lineEncoding;
                this.linePhoneNum = model.linePhoneNum;
                this.phoneType = model.phoneType;
                this.realStartTime = model.realStartTime;
                this.retryCount = model.retryCount;
                this.retryEnable = model.retryEnable;
                this.retryInterval = model.retryInterval;
                this.retryReasons = model.retryReasons;
                this.startTime = model.startTime;
                this.startType = model.startType;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The code of the published agent.</p>
             * 
             * <strong>example:</strong>
             * <p>1180**************</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The application code.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The list of callable days.</p>
             */
            public Builder callDays(java.util.List<String> callDays) {
                this.callDays = callDays;
                return this;
            }

            /**
             * <p>The expiration date of outbound call details (specific deadline) in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-30 20:00:20</p>
             */
            public Builder callExpireDate(String callExpireDate) {
                this.callExpireDate = callExpireDate;
                return this;
            }

            /**
             * <p>The expiration duration of outbound call details. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder callExpireMinutes(Long callExpireMinutes) {
                this.callExpireMinutes = callExpireMinutes;
                return this;
            }

            /**
             * <p>The expiration type of outbound calls. Valid values:</p>
             * <p>0: permanently valid.
             * 1: valid for a period of time after import.
             * 2: valid until a specified time.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callExpireType(Long callExpireType) {
                this.callExpireType = callExpireType;
                return this;
            }

            /**
             * <p>The allowed call time periods.</p>
             */
            public Builder callTimes(java.util.List<CallTimes> callTimes) {
                this.callTimes = callTimes;
                return this;
            }

            /**
             * <p>The callable time periods of the current outbound call instance.</p>
             */
            public Builder callableTimes(java.util.List<CallableTimes> callableTimes) {
                this.callableTimes = callableTimes;
                return this;
            }

            /**
             * <p>The caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>05370124****</p>
             */
            public Builder callerNumber(String callerNumber) {
                this.callerNumber = callerNumber;
                return this;
            }

            /**
             * <p>The task concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrentCount(Long concurrentCount) {
                this.concurrentCount = concurrentCount;
                return this;
            }

            /**
             * <p>The line encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder lineEncoding(String lineEncoding) {
                this.lineEncoding = lineEncoding;
                return this;
            }

            /**
             * <p>The phone number of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder linePhoneNum(String linePhoneNum) {
                this.linePhoneNum = linePhoneNum;
                return this;
            }

            /**
             * <p>The phone number type. Valid values: 0 indicates an Alibaba Cloud number. 1 indicates a custom line provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder phoneType(Long phoneType) {
                this.phoneType = phoneType;
                return this;
            }

            /**
             * <p>The actual start time of the task. This value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748932499000</p>
             */
            public Builder realStartTime(Long realStartTime) {
                this.realStartTime = realStartTime;
                return this;
            }

            /**
             * <p>The number of retry attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>Indicates whether call retry is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder retryEnable(Boolean retryEnable) {
                this.retryEnable = retryEnable;
                return this;
            }

            /**
             * <p>The retry interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryInterval(Long retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * <p>The list of failure reasons that allow retry.</p>
             */
            public Builder retryReasons(java.util.List<String> retryReasons) {
                this.retryReasons = retryReasons;
                return this;
            }

            /**
             * <p>The scheduled start time of the task. This value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748932499000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The start mode. Valid values:</p>
             * <ul>
             * <li><p>IMMEDIATE: Start immediately.</p>
             * </li>
             * <li><p>SCHEDULE: Start at a scheduled time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMMEDIATE</p>
             */
            public Builder startType(String startType) {
                this.startType = startType;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1187**************</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test task</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
