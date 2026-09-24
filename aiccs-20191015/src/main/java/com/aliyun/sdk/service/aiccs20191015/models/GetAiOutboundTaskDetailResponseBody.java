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
 * {@link GetAiOutboundTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskDetailResponseBody</p>
 */
public class GetAiOutboundTaskDetailResponseBody extends TeaModel {
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

        private Builder(GetAiOutboundTaskDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the outbound call task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAiOutboundTaskDetailResponseBody build() {
            return new GetAiOutboundTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiOutboundTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskDetailResponseBody</p>
     */
    public static class RecallRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Interval")
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

            private Builder() {
            } 

            private Builder(RecallRule model) {
                this.count = model.count;
                this.interval = model.interval;
            } 

            /**
             * <p>The number of recall attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The recall interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetAiOutboundTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentRate")
        private Integer concurrentRate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private String executionTime;

        @com.aliyun.core.annotation.NameInMap("ForecastCallRate")
        private Float forecastCallRate;

        @com.aliyun.core.annotation.NameInMap("HandlerId")
        private Long handlerId;

        @com.aliyun.core.annotation.NameInMap("HandlerName")
        private String handlerName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NumRepeated")
        private Integer numRepeated;

        @com.aliyun.core.annotation.NameInMap("OutboundNums")
        private java.util.List<String> outboundNums;

        @com.aliyun.core.annotation.NameInMap("RecallRule")
        private RecallRule recallRule;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<String> getOutboundNums() {
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
            private java.util.List<String> outboundNums; 
            private RecallRule recallRule; 
            private Integer status; 
            private String statusDesc; 
            private Long taskId; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.concurrentRate = model.concurrentRate;
                this.description = model.description;
                this.executionTime = model.executionTime;
                this.forecastCallRate = model.forecastCallRate;
                this.handlerId = model.handlerId;
                this.handlerName = model.handlerName;
                this.name = model.name;
                this.numRepeated = model.numRepeated;
                this.outboundNums = model.outboundNums;
                this.recallRule = model.recallRule;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The concurrency for automatic outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrentRate(Integer concurrentRate) {
                this.concurrentRate = concurrentRate;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Real estate sales</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The task execution time. Time periods are configured by day of the week using a JSON object. The start and end values are in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TUESDAY&quot;:[{&quot;start&quot;:&quot;06:00&quot;,&quot;end&quot;:&quot;06:05&quot;}],&quot;MONDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;},{&quot;start&quot;:&quot;20:30&quot;,&quot;end&quot;:&quot;21:45&quot;},{&quot;start&quot;:&quot;22:30&quot;,&quot;end&quot;:&quot;22:50&quot;}],&quot;WEDNESDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;THURSDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;FRIDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SATURDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SUNDAY&quot;:[{&quot;start&quot;:&quot;17:00&quot;,&quot;end&quot;:&quot;23:45&quot;}]}</p>
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The fixed call rate for predictive outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder forecastCallRate(Float forecastCallRate) {
                this.forecastCallRate = forecastCallRate;
                return this;
            }

            /**
             * <p>The skill group ID (for predictive outbound calls) or IVR ID (for automatic outbound calls).</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder handlerId(Long handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>The skill group name or IVR name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotline skill group</p>
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx outbound call</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The callee number deduplication policy.</p>
             * <ul>
             * <li><strong>0</strong>: Deduplicate.</li>
             * <li><strong>1</strong>: Do not deduplicate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder numRepeated(Integer numRepeated) {
                this.numRepeated = numRepeated;
                return this;
            }

            /**
             * <p>The outbound caller numbers.</p>
             */
            public Builder outboundNums(java.util.List<String> outboundNums) {
                this.outboundNums = outboundNums;
                return this;
            }

            /**
             * <p>The failed recall policy.</p>
             */
            public Builder recallRule(RecallRule recallRule) {
                this.recallRule = recallRule;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not started.</li>
             * <li><strong>1</strong>: In progress.</li>
             * <li><strong>2</strong>: System paused.</li>
             * <li><strong>3</strong>: Manually paused.</li>
             * <li><strong>4</strong>: Completed.</li>
             * <li><strong>5</strong>: Stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task status description.</p>
             * 
             * <strong>example:</strong>
             * <p>Not started</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: Predictive outbound call.</li>
             * <li><strong>3</strong>: Automatic outbound call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
