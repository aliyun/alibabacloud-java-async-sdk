// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskDetailResponseBody</p>
 */
public class GetAiOutboundTaskDetailResponseBody extends TeaModel {
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

    private GetAiOutboundTaskDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskDetailResponseBody create() {
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
         * 任务详情
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
         * 请求ID
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

        public GetAiOutboundTaskDetailResponseBody build() {
            return new GetAiOutboundTaskDetailResponseBody(this);
        } 

    } 

    public static class RecallRule extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Interval")
        private Integer interval;

        private RecallRule(Builder builder) {
            this.count = builder.count;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallRule create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private Integer count; 
            private Integer interval; 

            /**
             * 重呼次数
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * 重呼间隔时间（分钟）
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            public RecallRule build() {
                return new RecallRule(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConcurrentRate")
        private Integer concurrentRate;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExecutionTime")
        private String executionTime;

        @NameInMap("ForecastCallRate")
        private Float forecastCallRate;

        @NameInMap("HandlerId")
        private Long handlerId;

        @NameInMap("HandlerName")
        private String handlerName;

        @NameInMap("Name")
        private String name;

        @NameInMap("NumRepeated")
        private Integer numRepeated;

        @NameInMap("OutboundNums")
        private java.util.List < String > outboundNums;

        @NameInMap("RecallRule")
        private RecallRule recallRule;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.concurrentRate = builder.concurrentRate;
            this.description = builder.description;
            this.executionTime = builder.executionTime;
            this.forecastCallRate = builder.forecastCallRate;
            this.handlerId = builder.handlerId;
            this.handlerName = builder.handlerName;
            this.name = builder.name;
            this.numRepeated = builder.numRepeated;
            this.outboundNums = builder.outboundNums;
            this.recallRule = builder.recallRule;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return concurrentRate
         */
        public Integer getConcurrentRate() {
            return this.concurrentRate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executionTime
         */
        public String getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return forecastCallRate
         */
        public Float getForecastCallRate() {
            return this.forecastCallRate;
        }

        /**
         * @return handlerId
         */
        public Long getHandlerId() {
            return this.handlerId;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numRepeated
         */
        public Integer getNumRepeated() {
            return this.numRepeated;
        }

        /**
         * @return outboundNums
         */
        public java.util.List < String > getOutboundNums() {
            return this.outboundNums;
        }

        /**
         * @return recallRule
         */
        public RecallRule getRecallRule() {
            return this.recallRule;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer concurrentRate; 
            private String description; 
            private String executionTime; 
            private Float forecastCallRate; 
            private Long handlerId; 
            private String handlerName; 
            private String name; 
            private Integer numRepeated; 
            private java.util.List < String > outboundNums; 
            private RecallRule recallRule; 
            private Integer status; 
            private String statusDesc; 
            private Long taskId; 
            private Integer type; 

            /**
             * 自动外呼的并发
             */
            public Builder concurrentRate(Integer concurrentRate) {
                this.concurrentRate = concurrentRate;
                return this;
            }

            /**
             * 任务描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 任务执行时间
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * 预测式外呼固定外呼比例
             */
            public Builder forecastCallRate(Float forecastCallRate) {
                this.forecastCallRate = forecastCallRate;
                return this;
            }

            /**
             * 技能组id（预测式外呼）或者ivr id（自动外呼）
             */
            public Builder handlerId(Long handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * 技能组名称或ivr名称
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * 任务名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 被叫号码重复策略（0去重，1不去重）
             */
            public Builder numRepeated(Integer numRepeated) {
                this.numRepeated = numRepeated;
                return this;
            }

            /**
             * 外呼主叫号码
             */
            public Builder outboundNums(java.util.List < String > outboundNums) {
                this.outboundNums = outboundNums;
                return this;
            }

            /**
             * 失败重呼策略
             */
            public Builder recallRule(RecallRule recallRule) {
                this.recallRule = recallRule;
                return this;
            }

            /**
             * 任务状态（0:未开始,1:进行中,2:系统暂停,3:手动暂停,4:已完成,5:已终止）
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 任务状态描述
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
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
             * 任务类型(2:预测式外呼，3:自动外呼)
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
