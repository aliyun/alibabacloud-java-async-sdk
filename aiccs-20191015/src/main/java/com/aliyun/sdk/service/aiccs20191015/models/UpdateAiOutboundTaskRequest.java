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
 * {@link UpdateAiOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiOutboundTaskRequest</p>
 */
public class UpdateAiOutboundTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcurrentRate")
    private Integer concurrentRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForecastCallRate")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Float forecastCallRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandlerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long handlerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 15, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumRepeated")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer numRepeated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundNums")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> outboundNums;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallRule")
    private RecallRule recallRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
        private java.util.List<String> outboundNums; 
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
         * <p>The concurrent rate for automated outbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrentRate(Integer concurrentRate) {
            this.putQueryParameter("ConcurrentRate", concurrentRate);
            this.concurrentRate = concurrentRate;
            return this;
        }

        /**
         * <p>The job description. It can contain 0 to 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>房产销售</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The job execution time.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TUESDAY&quot;:[{&quot;start&quot;:&quot;06:00&quot;,&quot;end&quot;:&quot;06:05&quot;}],&quot;MONDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;},{&quot;start&quot;:&quot;20:30&quot;,&quot;end&quot;:&quot;21:45&quot;},{&quot;start&quot;:&quot;22:30&quot;,&quot;end&quot;:&quot;22:50&quot;}],&quot;WEDNESDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;THURSDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;FRIDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SATURDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SUNDAY&quot;:[{&quot;start&quot;:&quot;17:00&quot;,&quot;end&quot;:&quot;23:45&quot;}]}</p>
         */
        public Builder executionTime(String executionTime) {
            this.putQueryParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
            return this;
        }

        /**
         * <p>Fixed dialing ratio for predictive outbound calls. Valid values: <strong>≥1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        public Builder forecastCallRate(Float forecastCallRate) {
            this.putQueryParameter("ForecastCallRate", forecastCallRate);
            this.forecastCallRate = forecastCallRate;
            return this;
        }

        /**
         * <p>The skill group ID (for predictive outbound calls) or IVR ID (for automated outbound calls).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Job name. Length: 1 to 15 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx外呼</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The policy for handling duplicate callee numbers.</p>
         * <ul>
         * <li><strong>0</strong>: Remove duplicates within the job.</li>
         * <li><strong>1</strong>: Do not remove duplicates within the job.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder numRepeated(Integer numRepeated) {
            this.putQueryParameter("NumRepeated", numRepeated);
            this.numRepeated = numRepeated;
            return this;
        }

        /**
         * <p>Outbound caller numbers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder outboundNums(java.util.List<String> outboundNums) {
            String outboundNumsShrink = shrink(outboundNums, "OutboundNums", "json");
            this.putQueryParameter("OutboundNums", outboundNumsShrink);
            this.outboundNums = outboundNums;
            return this;
        }

        /**
         * <p>Failed-call retry policy.</p>
         * <blockquote>
         * <p>If empty, no retry is performed when an outbound call fails.</p>
         * </blockquote>
         */
        public Builder recallRule(RecallRule recallRule) {
            String recallRuleShrink = shrink(recallRule, "RecallRule", "json");
            this.putQueryParameter("RecallRule", recallRuleShrink);
            this.recallRule = recallRule;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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

    /**
     * 
     * {@link UpdateAiOutboundTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateAiOutboundTaskRequest</p>
     */
    public static class RecallRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Interval")
        @com.aliyun.core.annotation.Validation(maximum = 60, minimum = 1)
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
             * <p>Number of retries after a failed call. Valid values: <strong>1 to 3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Time interval between retries after a failed call. Valid values: <strong>1 to 60</strong>, unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
