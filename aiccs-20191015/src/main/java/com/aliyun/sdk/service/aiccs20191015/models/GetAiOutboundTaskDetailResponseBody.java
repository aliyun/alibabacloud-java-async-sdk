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
         * ????????????
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
         * ??????ID
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
             * ????????????
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * ??????????????????????????????
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
             * ?????????????????????
             */
            public Builder concurrentRate(Integer concurrentRate) {
                this.concurrentRate = concurrentRate;
                return this;
            }

            /**
             * ????????????
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * ?????????????????????????????????
             */
            public Builder forecastCallRate(Float forecastCallRate) {
                this.forecastCallRate = forecastCallRate;
                return this;
            }

            /**
             * ?????????id???????????????????????????ivr id??????????????????
             */
            public Builder handlerId(Long handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * ??????????????????ivr??????
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * ?????????
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ???????????????????????????0?????????1????????????
             */
            public Builder numRepeated(Integer numRepeated) {
                this.numRepeated = numRepeated;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder outboundNums(java.util.List < String > outboundNums) {
                this.outboundNums = outboundNums;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder recallRule(RecallRule recallRule) {
                this.recallRule = recallRule;
                return this;
            }

            /**
             * ???????????????0:?????????,1:?????????,2:????????????,3:????????????,4:?????????,5:????????????
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * ??????id
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * ????????????(2:??????????????????3:????????????)
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
