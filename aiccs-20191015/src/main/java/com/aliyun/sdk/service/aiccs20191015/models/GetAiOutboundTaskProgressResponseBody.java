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
 * {@link GetAiOutboundTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskProgressResponseBody</p>
 */
public class GetAiOutboundTaskProgressResponseBody extends TeaModel {
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

    private GetAiOutboundTaskProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskProgressResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAiOutboundTaskProgressResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        public GetAiOutboundTaskProgressResponseBody build() {
            return new GetAiOutboundTaskProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiOutboundTaskProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskProgressResponseBody</p>
     */
    public static class CalloutProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallLossCount")
        private Integer callLossCount;

        @com.aliyun.core.annotation.NameInMap("CallLossRate")
        private Float callLossRate;

        @com.aliyun.core.annotation.NameInMap("CallOutConnectCount")
        private Integer callOutConnectCount;

        @com.aliyun.core.annotation.NameInMap("CallOutConnectRate")
        private Float callOutConnectRate;

        @com.aliyun.core.annotation.NameInMap("CallOutCount")
        private Integer callOutCount;

        @com.aliyun.core.annotation.NameInMap("CallOutServicerPickupCount")
        private Integer callOutServicerPickupCount;

        @com.aliyun.core.annotation.NameInMap("CallOutServicerPickupRate")
        private Float callOutServicerPickupRate;

        @com.aliyun.core.annotation.NameInMap("CallOutUserPickupCount")
        private Integer callOutUserPickupCount;

        @com.aliyun.core.annotation.NameInMap("CallOutUserPickupRate")
        private Float callOutUserPickupRate;

        private CalloutProgress(Builder builder) {
            this.callLossCount = builder.callLossCount;
            this.callLossRate = builder.callLossRate;
            this.callOutConnectCount = builder.callOutConnectCount;
            this.callOutConnectRate = builder.callOutConnectRate;
            this.callOutCount = builder.callOutCount;
            this.callOutServicerPickupCount = builder.callOutServicerPickupCount;
            this.callOutServicerPickupRate = builder.callOutServicerPickupRate;
            this.callOutUserPickupCount = builder.callOutUserPickupCount;
            this.callOutUserPickupRate = builder.callOutUserPickupRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalloutProgress create() {
            return builder().build();
        }

        /**
         * @return callLossCount
         */
        public Integer getCallLossCount() {
            return this.callLossCount;
        }

        /**
         * @return callLossRate
         */
        public Float getCallLossRate() {
            return this.callLossRate;
        }

        /**
         * @return callOutConnectCount
         */
        public Integer getCallOutConnectCount() {
            return this.callOutConnectCount;
        }

        /**
         * @return callOutConnectRate
         */
        public Float getCallOutConnectRate() {
            return this.callOutConnectRate;
        }

        /**
         * @return callOutCount
         */
        public Integer getCallOutCount() {
            return this.callOutCount;
        }

        /**
         * @return callOutServicerPickupCount
         */
        public Integer getCallOutServicerPickupCount() {
            return this.callOutServicerPickupCount;
        }

        /**
         * @return callOutServicerPickupRate
         */
        public Float getCallOutServicerPickupRate() {
            return this.callOutServicerPickupRate;
        }

        /**
         * @return callOutUserPickupCount
         */
        public Integer getCallOutUserPickupCount() {
            return this.callOutUserPickupCount;
        }

        /**
         * @return callOutUserPickupRate
         */
        public Float getCallOutUserPickupRate() {
            return this.callOutUserPickupRate;
        }

        public static final class Builder {
            private Integer callLossCount; 
            private Float callLossRate; 
            private Integer callOutConnectCount; 
            private Float callOutConnectRate; 
            private Integer callOutCount; 
            private Integer callOutServicerPickupCount; 
            private Float callOutServicerPickupRate; 
            private Integer callOutUserPickupCount; 
            private Float callOutUserPickupRate; 

            private Builder() {
            } 

            private Builder(CalloutProgress model) {
                this.callLossCount = model.callLossCount;
                this.callLossRate = model.callLossRate;
                this.callOutConnectCount = model.callOutConnectCount;
                this.callOutConnectRate = model.callOutConnectRate;
                this.callOutCount = model.callOutCount;
                this.callOutServicerPickupCount = model.callOutServicerPickupCount;
                this.callOutServicerPickupRate = model.callOutServicerPickupRate;
                this.callOutUserPickupCount = model.callOutUserPickupCount;
                this.callOutUserPickupRate = model.callOutUserPickupRate;
            } 

            /**
             * CallLossCount.
             */
            public Builder callLossCount(Integer callLossCount) {
                this.callLossCount = callLossCount;
                return this;
            }

            /**
             * CallLossRate.
             */
            public Builder callLossRate(Float callLossRate) {
                this.callLossRate = callLossRate;
                return this;
            }

            /**
             * CallOutConnectCount.
             */
            public Builder callOutConnectCount(Integer callOutConnectCount) {
                this.callOutConnectCount = callOutConnectCount;
                return this;
            }

            /**
             * CallOutConnectRate.
             */
            public Builder callOutConnectRate(Float callOutConnectRate) {
                this.callOutConnectRate = callOutConnectRate;
                return this;
            }

            /**
             * CallOutCount.
             */
            public Builder callOutCount(Integer callOutCount) {
                this.callOutCount = callOutCount;
                return this;
            }

            /**
             * CallOutServicerPickupCount.
             */
            public Builder callOutServicerPickupCount(Integer callOutServicerPickupCount) {
                this.callOutServicerPickupCount = callOutServicerPickupCount;
                return this;
            }

            /**
             * CallOutServicerPickupRate.
             */
            public Builder callOutServicerPickupRate(Float callOutServicerPickupRate) {
                this.callOutServicerPickupRate = callOutServicerPickupRate;
                return this;
            }

            /**
             * CallOutUserPickupCount.
             */
            public Builder callOutUserPickupCount(Integer callOutUserPickupCount) {
                this.callOutUserPickupCount = callOutUserPickupCount;
                return this;
            }

            /**
             * CallOutUserPickupRate.
             */
            public Builder callOutUserPickupRate(Float callOutUserPickupRate) {
                this.callOutUserPickupRate = callOutUserPickupRate;
                return this;
            }

            public CalloutProgress build() {
                return new CalloutProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiOutboundTaskProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskProgressResponseBody</p>
     */
    public static class TaskProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingCount")
        private Integer callingCount;

        @com.aliyun.core.annotation.NameInMap("ConnectCount")
        private Integer connectCount;

        @com.aliyun.core.annotation.NameInMap("ConnectRate")
        private Float connectRate;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Integer finishCount;

        @com.aliyun.core.annotation.NameInMap("FinishRate")
        private Float finishRate;

        @com.aliyun.core.annotation.NameInMap("ServicerPickupCount")
        private Integer servicerPickupCount;

        @com.aliyun.core.annotation.NameInMap("ServicerPickupRate")
        private Float servicerPickupRate;

        @com.aliyun.core.annotation.NameInMap("TerminateCount")
        private Integer terminateCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UserPickupCount")
        private Integer userPickupCount;

        @com.aliyun.core.annotation.NameInMap("UserPickupRate")
        private Float userPickupRate;

        @com.aliyun.core.annotation.NameInMap("WaitingCallCount")
        private Integer waitingCallCount;

        @com.aliyun.core.annotation.NameInMap("WaitingRecallCount")
        private Integer waitingRecallCount;

        private TaskProgress(Builder builder) {
            this.callingCount = builder.callingCount;
            this.connectCount = builder.connectCount;
            this.connectRate = builder.connectRate;
            this.finishCount = builder.finishCount;
            this.finishRate = builder.finishRate;
            this.servicerPickupCount = builder.servicerPickupCount;
            this.servicerPickupRate = builder.servicerPickupRate;
            this.terminateCount = builder.terminateCount;
            this.totalCount = builder.totalCount;
            this.userPickupCount = builder.userPickupCount;
            this.userPickupRate = builder.userPickupRate;
            this.waitingCallCount = builder.waitingCallCount;
            this.waitingRecallCount = builder.waitingRecallCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskProgress create() {
            return builder().build();
        }

        /**
         * @return callingCount
         */
        public Integer getCallingCount() {
            return this.callingCount;
        }

        /**
         * @return connectCount
         */
        public Integer getConnectCount() {
            return this.connectCount;
        }

        /**
         * @return connectRate
         */
        public Float getConnectRate() {
            return this.connectRate;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return finishRate
         */
        public Float getFinishRate() {
            return this.finishRate;
        }

        /**
         * @return servicerPickupCount
         */
        public Integer getServicerPickupCount() {
            return this.servicerPickupCount;
        }

        /**
         * @return servicerPickupRate
         */
        public Float getServicerPickupRate() {
            return this.servicerPickupRate;
        }

        /**
         * @return terminateCount
         */
        public Integer getTerminateCount() {
            return this.terminateCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userPickupCount
         */
        public Integer getUserPickupCount() {
            return this.userPickupCount;
        }

        /**
         * @return userPickupRate
         */
        public Float getUserPickupRate() {
            return this.userPickupRate;
        }

        /**
         * @return waitingCallCount
         */
        public Integer getWaitingCallCount() {
            return this.waitingCallCount;
        }

        /**
         * @return waitingRecallCount
         */
        public Integer getWaitingRecallCount() {
            return this.waitingRecallCount;
        }

        public static final class Builder {
            private Integer callingCount; 
            private Integer connectCount; 
            private Float connectRate; 
            private Integer finishCount; 
            private Float finishRate; 
            private Integer servicerPickupCount; 
            private Float servicerPickupRate; 
            private Integer terminateCount; 
            private Integer totalCount; 
            private Integer userPickupCount; 
            private Float userPickupRate; 
            private Integer waitingCallCount; 
            private Integer waitingRecallCount; 

            private Builder() {
            } 

            private Builder(TaskProgress model) {
                this.callingCount = model.callingCount;
                this.connectCount = model.connectCount;
                this.connectRate = model.connectRate;
                this.finishCount = model.finishCount;
                this.finishRate = model.finishRate;
                this.servicerPickupCount = model.servicerPickupCount;
                this.servicerPickupRate = model.servicerPickupRate;
                this.terminateCount = model.terminateCount;
                this.totalCount = model.totalCount;
                this.userPickupCount = model.userPickupCount;
                this.userPickupRate = model.userPickupRate;
                this.waitingCallCount = model.waitingCallCount;
                this.waitingRecallCount = model.waitingRecallCount;
            } 

            /**
             * CallingCount.
             */
            public Builder callingCount(Integer callingCount) {
                this.callingCount = callingCount;
                return this;
            }

            /**
             * ConnectCount.
             */
            public Builder connectCount(Integer connectCount) {
                this.connectCount = connectCount;
                return this;
            }

            /**
             * ConnectRate.
             */
            public Builder connectRate(Float connectRate) {
                this.connectRate = connectRate;
                return this;
            }

            /**
             * FinishCount.
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * FinishRate.
             */
            public Builder finishRate(Float finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * ServicerPickupCount.
             */
            public Builder servicerPickupCount(Integer servicerPickupCount) {
                this.servicerPickupCount = servicerPickupCount;
                return this;
            }

            /**
             * ServicerPickupRate.
             */
            public Builder servicerPickupRate(Float servicerPickupRate) {
                this.servicerPickupRate = servicerPickupRate;
                return this;
            }

            /**
             * TerminateCount.
             */
            public Builder terminateCount(Integer terminateCount) {
                this.terminateCount = terminateCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserPickupCount.
             */
            public Builder userPickupCount(Integer userPickupCount) {
                this.userPickupCount = userPickupCount;
                return this;
            }

            /**
             * UserPickupRate.
             */
            public Builder userPickupRate(Float userPickupRate) {
                this.userPickupRate = userPickupRate;
                return this;
            }

            /**
             * WaitingCallCount.
             */
            public Builder waitingCallCount(Integer waitingCallCount) {
                this.waitingCallCount = waitingCallCount;
                return this;
            }

            /**
             * WaitingRecallCount.
             */
            public Builder waitingRecallCount(Integer waitingRecallCount) {
                this.waitingRecallCount = waitingRecallCount;
                return this;
            }

            public TaskProgress build() {
                return new TaskProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiOutboundTaskProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalloutProgress")
        private CalloutProgress calloutProgress;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskProgress")
        private TaskProgress taskProgress;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.calloutProgress = builder.calloutProgress;
            this.taskId = builder.taskId;
            this.taskProgress = builder.taskProgress;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calloutProgress
         */
        public CalloutProgress getCalloutProgress() {
            return this.calloutProgress;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskProgress
         */
        public TaskProgress getTaskProgress() {
            return this.taskProgress;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private CalloutProgress calloutProgress; 
            private Long taskId; 
            private TaskProgress taskProgress; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.calloutProgress = model.calloutProgress;
                this.taskId = model.taskId;
                this.taskProgress = model.taskProgress;
                this.type = model.type;
            } 

            /**
             * CalloutProgress.
             */
            public Builder calloutProgress(CalloutProgress calloutProgress) {
                this.calloutProgress = calloutProgress;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskProgress.
             */
            public Builder taskProgress(TaskProgress taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
