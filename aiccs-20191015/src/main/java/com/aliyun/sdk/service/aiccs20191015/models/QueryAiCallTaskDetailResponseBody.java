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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("CallDays")
        private java.util.List<String> callDays;

        @com.aliyun.core.annotation.NameInMap("CallTimes")
        private java.util.List<CallTimes> callTimes;

        @com.aliyun.core.annotation.NameInMap("CallerNumber")
        private String callerNumber;

        @com.aliyun.core.annotation.NameInMap("ConcurrentCount")
        private Long concurrentCount;

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
            this.callDays = builder.callDays;
            this.callTimes = builder.callTimes;
            this.callerNumber = builder.callerNumber;
            this.concurrentCount = builder.concurrentCount;
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
         * @return callDays
         */
        public java.util.List<String> getCallDays() {
            return this.callDays;
        }

        /**
         * @return callTimes
         */
        public java.util.List<CallTimes> getCallTimes() {
            return this.callTimes;
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
            private java.util.List<String> callDays; 
            private java.util.List<CallTimes> callTimes; 
            private String callerNumber; 
            private Long concurrentCount; 
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
                this.callDays = model.callDays;
                this.callTimes = model.callTimes;
                this.callerNumber = model.callerNumber;
                this.concurrentCount = model.concurrentCount;
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
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * CallDays.
             */
            public Builder callDays(java.util.List<String> callDays) {
                this.callDays = callDays;
                return this;
            }

            /**
             * CallTimes.
             */
            public Builder callTimes(java.util.List<CallTimes> callTimes) {
                this.callTimes = callTimes;
                return this;
            }

            /**
             * CallerNumber.
             */
            public Builder callerNumber(String callerNumber) {
                this.callerNumber = callerNumber;
                return this;
            }

            /**
             * ConcurrentCount.
             */
            public Builder concurrentCount(Long concurrentCount) {
                this.concurrentCount = concurrentCount;
                return this;
            }

            /**
             * RealStartTime.
             */
            public Builder realStartTime(Long realStartTime) {
                this.realStartTime = realStartTime;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * RetryEnable.
             */
            public Builder retryEnable(Boolean retryEnable) {
                this.retryEnable = retryEnable;
                return this;
            }

            /**
             * RetryInterval.
             */
            public Builder retryInterval(Long retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * RetryReasons.
             */
            public Builder retryReasons(java.util.List<String> retryReasons) {
                this.retryReasons = retryReasons;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartType.
             */
            public Builder startType(String startType) {
                this.startType = startType;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
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
