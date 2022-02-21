// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskProgressResponseBody</p>
 */
public class GetAiOutboundTaskProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 任务进展
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
         * Id of the request
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

    public static class CalloutProgress extends TeaModel {
        @NameInMap("CallLossCount")
        private Integer callLossCount;

        @NameInMap("CallLossRate")
        private Float callLossRate;

        @NameInMap("CallOutConnectCount")
        private Integer callOutConnectCount;

        @NameInMap("CallOutConnectRate")
        private Float callOutConnectRate;

        @NameInMap("CallOutCount")
        private Integer callOutCount;

        @NameInMap("CallOutServicerPickupCount")
        private Integer callOutServicerPickupCount;

        @NameInMap("CallOutServicerPickupRate")
        private Float callOutServicerPickupRate;

        @NameInMap("CallOutUserPickupCount")
        private Integer callOutUserPickupCount;

        @NameInMap("CallOutUserPickupRate")
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

            /**
             * 呼损量（预测式外呼特有）
             */
            public Builder callLossCount(Integer callLossCount) {
                this.callLossCount = callLossCount;
                return this;
            }

            /**
             * 呼损率（预测式外呼特有）
             */
            public Builder callLossRate(Float callLossRate) {
                this.callLossRate = callLossRate;
                return this;
            }

            /**
             * 外呼接通次数（自动外呼特有）
             */
            public Builder callOutConnectCount(Integer callOutConnectCount) {
                this.callOutConnectCount = callOutConnectCount;
                return this;
            }

            /**
             * 外呼接通次率（自动外呼特有）
             */
            public Builder callOutConnectRate(Float callOutConnectRate) {
                this.callOutConnectRate = callOutConnectRate;
                return this;
            }

            /**
             * 外呼次数
             */
            public Builder callOutCount(Integer callOutCount) {
                this.callOutCount = callOutCount;
                return this;
            }

            /**
             * 坐席接通量（预测式外呼特有）
             */
            public Builder callOutServicerPickupCount(Integer callOutServicerPickupCount) {
                this.callOutServicerPickupCount = callOutServicerPickupCount;
                return this;
            }

            /**
             * 坐席接通率（预测式外呼特有）
             */
            public Builder callOutServicerPickupRate(Float callOutServicerPickupRate) {
                this.callOutServicerPickupRate = callOutServicerPickupRate;
                return this;
            }

            /**
             * 客户接起量（预测式外呼特有）
             */
            public Builder callOutUserPickupCount(Integer callOutUserPickupCount) {
                this.callOutUserPickupCount = callOutUserPickupCount;
                return this;
            }

            /**
             * 客户接起率（预测式外呼特有）
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
    public static class TaskProgress extends TeaModel {
        @NameInMap("CallingCount")
        private Integer callingCount;

        @NameInMap("ConnectCount")
        private Integer connectCount;

        @NameInMap("ConnectRate")
        private Float connectRate;

        @NameInMap("FinishCount")
        private Integer finishCount;

        @NameInMap("FinishRate")
        private Float finishRate;

        @NameInMap("ServicerPickupCount")
        private Integer servicerPickupCount;

        @NameInMap("ServicerPickupRate")
        private Float servicerPickupRate;

        @NameInMap("TerminateCount")
        private Integer terminateCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UserPickupCount")
        private Integer userPickupCount;

        @NameInMap("UserPickupRate")
        private Float userPickupRate;

        @NameInMap("WaitingCallCount")
        private Integer waitingCallCount;

        @NameInMap("WaitingRecallCount")
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

            /**
             * 呼叫中任务数
             */
            public Builder callingCount(Integer callingCount) {
                this.callingCount = callingCount;
                return this;
            }

            /**
             * 任务接通量（自动外呼特有）
             */
            public Builder connectCount(Integer connectCount) {
                this.connectCount = connectCount;
                return this;
            }

            /**
             * 任务接通率（自动外呼特有）
             */
            public Builder connectRate(Float connectRate) {
                this.connectRate = connectRate;
                return this;
            }

            /**
             * 任务完成数
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * 任务完成率
             */
            public Builder finishRate(Float finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * 坐席接通数（预测式外呼特有）
             */
            public Builder servicerPickupCount(Integer servicerPickupCount) {
                this.servicerPickupCount = servicerPickupCount;
                return this;
            }

            /**
             * 坐席接通率(预测式外呼特有）
             */
            public Builder servicerPickupRate(Float servicerPickupRate) {
                this.servicerPickupRate = servicerPickupRate;
                return this;
            }

            /**
             * 已终止任务数
             */
            public Builder terminateCount(Integer terminateCount) {
                this.terminateCount = terminateCount;
                return this;
            }

            /**
             * 总任务数
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 客户接起数（预测式外呼特有）
             */
            public Builder userPickupCount(Integer userPickupCount) {
                this.userPickupCount = userPickupCount;
                return this;
            }

            /**
             * 客户接起率（预测式外呼特有）
             */
            public Builder userPickupRate(Float userPickupRate) {
                this.userPickupRate = userPickupRate;
                return this;
            }

            /**
             * 待呼叫任务数
             */
            public Builder waitingCallCount(Integer waitingCallCount) {
                this.waitingCallCount = waitingCallCount;
                return this;
            }

            /**
             * 待重呼任务数
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
    public static class Data extends TeaModel {
        @NameInMap("CalloutProgress")
        private CalloutProgress calloutProgress;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("TaskProgress")
        private TaskProgress taskProgress;

        @NameInMap("Type")
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

            /**
             * 外呼维度进展
             */
            public Builder calloutProgress(CalloutProgress calloutProgress) {
                this.calloutProgress = calloutProgress;
                return this;
            }

            /**
             * 任务id
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * 任务维度进展
             */
            public Builder taskProgress(TaskProgress taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * 任务类型（2:预测式3:自动）
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
