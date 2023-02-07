// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiOutboundTaskRequest</p>
 */
public class UpdateAiOutboundTaskRequest extends Request {
    @Query
    @NameInMap("ConcurrentRate")
    private Integer concurrentRate;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 100)
    private String description;

    @Query
    @NameInMap("ExecutionTime")
    @Validation(required = true)
    private String executionTime;

    @Query
    @NameInMap("ForecastCallRate")
    @Validation(maximum = 100, minimum = 1)
    private Float forecastCallRate;

    @Query
    @NameInMap("HandlerId")
    @Validation(required = true)
    private Long handlerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true, maxLength = 15, minLength = 1)
    private String name;

    @Query
    @NameInMap("NumRepeated")
    @Validation(required = true)
    private Integer numRepeated;

    @Query
    @NameInMap("OutboundNums")
    @Validation(required = true)
    private java.util.List < String > outboundNums;

    @Query
    @NameInMap("RecallRule")
    private RecallRule recallRule;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private UpdateAiOutboundTaskRequest(Builder builder) {
        super(builder);
        this.concurrentRate = builder.concurrentRate;
        this.description = builder.description;
        this.executionTime = builder.executionTime;
        this.forecastCallRate = builder.forecastCallRate;
        this.handlerId = builder.handlerId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.numRepeated = builder.numRepeated;
        this.outboundNums = builder.outboundNums;
        this.recallRule = builder.recallRule;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiOutboundTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateAiOutboundTaskRequest, Builder> {
        private Integer concurrentRate; 
        private String description; 
        private String executionTime; 
        private Float forecastCallRate; 
        private Long handlerId; 
        private String instanceId; 
        private String name; 
        private Integer numRepeated; 
        private java.util.List < String > outboundNums; 
        private RecallRule recallRule; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiOutboundTaskRequest request) {
            super(request);
            this.concurrentRate = request.concurrentRate;
            this.description = request.description;
            this.executionTime = request.executionTime;
            this.forecastCallRate = request.forecastCallRate;
            this.handlerId = request.handlerId;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.numRepeated = request.numRepeated;
            this.outboundNums = request.outboundNums;
            this.recallRule = request.recallRule;
            this.taskId = request.taskId;
        } 

        /**
         * 自动外呼的并发
         */
        public Builder concurrentRate(Integer concurrentRate) {
            this.putQueryParameter("ConcurrentRate", concurrentRate);
            this.concurrentRate = concurrentRate;
            return this;
        }

        /**
         * 任务描述（0～100字符）
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 任务执行时间
         */
        public Builder executionTime(String executionTime) {
            this.putQueryParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
            return this;
        }

        /**
         * 预测式外呼固定外呼比例（>=1）
         */
        public Builder forecastCallRate(Float forecastCallRate) {
            this.putQueryParameter("ForecastCallRate", forecastCallRate);
            this.forecastCallRate = forecastCallRate;
            return this;
        }

        /**
         * 技能组id（预测式外呼）或者ivr id（自动外呼）
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 任务名（1～15字符）
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 被叫号码重复策略（0:任务内去重，1:任务内不去重）
         */
        public Builder numRepeated(Integer numRepeated) {
            this.putQueryParameter("NumRepeated", numRepeated);
            this.numRepeated = numRepeated;
            return this;
        }

        /**
         * 外呼主叫号码
         */
        public Builder outboundNums(java.util.List < String > outboundNums) {
            String outboundNumsShrink = shrink(outboundNums, "OutboundNums", "json");
            this.putQueryParameter("OutboundNums", outboundNumsShrink);
            this.outboundNums = outboundNums;
            return this;
        }

        /**
         * 失败重呼策略
         */
        public Builder recallRule(RecallRule recallRule) {
            String recallRuleShrink = shrink(recallRule, "RecallRule", "json");
            this.putQueryParameter("RecallRule", recallRuleShrink);
            this.recallRule = recallRule;
            return this;
        }

        /**
         * 任务id
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateAiOutboundTaskRequest build() {
            return new UpdateAiOutboundTaskRequest(this);
        } 

    } 

    public static class RecallRule extends TeaModel {
        @NameInMap("Count")
        @Validation(maximum = 3, minimum = 1)
        private Integer count;

        @NameInMap("Interval")
        @Validation(maximum = 60, minimum = 1)
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
             * 失败重呼次数（1～3次）
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * 失败重呼间隔时间（1～60分钟）
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
}
