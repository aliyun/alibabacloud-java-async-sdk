// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateJobGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateJobGroupRequest</p>
 */
public class CreateJobGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsExtras")
    private String flashSmsExtras;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupDescription")
    private String jobGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinConcurrency")
    private Long minConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallCallingNumber")
    private java.util.List<String> recallCallingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallStrategyJson")
    private String recallStrategyJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RingingDuration")
    private Long ringingDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    private CreateJobGroupRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.flashSmsExtras = builder.flashSmsExtras;
        this.instanceId = builder.instanceId;
        this.jobGroupDescription = builder.jobGroupDescription;
        this.jobGroupName = builder.jobGroupName;
        this.minConcurrency = builder.minConcurrency;
        this.priority = builder.priority;
        this.recallCallingNumber = builder.recallCallingNumber;
        this.recallStrategyJson = builder.recallStrategyJson;
        this.ringingDuration = builder.ringingDuration;
        this.scenarioId = builder.scenarioId;
        this.scriptId = builder.scriptId;
        this.strategyJson = builder.strategyJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return flashSmsExtras
     */
    public String getFlashSmsExtras() {
        return this.flashSmsExtras;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupDescription
     */
    public String getJobGroupDescription() {
        return this.jobGroupDescription;
    }

    /**
     * @return jobGroupName
     */
    public String getJobGroupName() {
        return this.jobGroupName;
    }

    /**
     * @return minConcurrency
     */
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return recallCallingNumber
     */
    public java.util.List<String> getRecallCallingNumber() {
        return this.recallCallingNumber;
    }

    /**
     * @return recallStrategyJson
     */
    public String getRecallStrategyJson() {
        return this.recallStrategyJson;
    }

    /**
     * @return ringingDuration
     */
    public Long getRingingDuration() {
        return this.ringingDuration;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return strategyJson
     */
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public static final class Builder extends Request.Builder<CreateJobGroupRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String flashSmsExtras; 
        private String instanceId; 
        private String jobGroupDescription; 
        private String jobGroupName; 
        private Long minConcurrency; 
        private String priority; 
        private java.util.List<String> recallCallingNumber; 
        private String recallStrategyJson; 
        private Long ringingDuration; 
        private String scenarioId; 
        private String scriptId; 
        private String strategyJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobGroupRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.flashSmsExtras = request.flashSmsExtras;
            this.instanceId = request.instanceId;
            this.jobGroupDescription = request.jobGroupDescription;
            this.jobGroupName = request.jobGroupName;
            this.minConcurrency = request.minConcurrency;
            this.priority = request.priority;
            this.recallCallingNumber = request.recallCallingNumber;
            this.recallStrategyJson = request.recallStrategyJson;
            this.ringingDuration = request.ringingDuration;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * <p>The list of caller numbers. If not specified, all numbers bound to the instance are selected by default.</p>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The configuration parameters for flash SMS push in JSON format, including the configuration information of third-party flash SMS.  </p>
         * <ul>
         * <li>templateId: the flash SMS template ID.  </li>
         * <li>configId: the flash SMS configuration ID.</li>
         * <li>templateContent: the flash SMS content.</li>
         * </ul>
         * <blockquote>
         * <p>The value of templateContent must be obtained from the corresponding flash SMS capability partner.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;templateId&quot;:&quot;104xx&quot;,&quot;configId&quot;:&quot;8037f524-6fxxxxx&quot;, &quot;templateContent&quot;: &quot;[Outbound Robot] is calling you. Please answer!&quot;}</p>
         */
        public Builder flashSmsExtras(String flashSmsExtras) {
            this.putQueryParameter("FlashSmsExtras", flashSmsExtras);
            this.flashSmsExtras = flashSmsExtras;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Job description</p>
         */
        public Builder jobGroupDescription(String jobGroupDescription) {
            this.putQueryParameter("JobGroupDescription", jobGroupDescription);
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>First job</p>
         */
        public Builder jobGroupName(String jobGroupName) {
            this.putQueryParameter("JobGroupName", jobGroupName);
            this.jobGroupName = jobGroupName;
            return this;
        }

        /**
         * <p>The guaranteed concurrency.  </p>
         * <ul>
         * <li>When the job starts, a minimum of N concurrent calls are guaranteed.</li>
         * <li>The sum of guaranteed concurrency for jobs of the same priority cannot exceed the instance concurrency.  </li>
         * <li>If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minConcurrency(Long minConcurrency) {
            this.putQueryParameter("MinConcurrency", minConcurrency);
            this.minConcurrency = minConcurrency;
            return this;
        }

        /**
         * <p>The priority of the job group. Valid values:</p>
         * <ul>
         * <li><strong>Urgent</strong>: urgent job.</li>
         * <li><strong>Daily</strong>: daily job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The list of caller numbers for redialing.</p>
         */
        public Builder recallCallingNumber(java.util.List<String> recallCallingNumber) {
            this.putQueryParameter("RecallCallingNumber", recallCallingNumber);
            this.recallCallingNumber = recallCallingNumber;
            return this;
        }

        /**
         * <p>The redial strategy in JSON format. The default value of the parameters in the JSON object is false.</p>
         * <ul>
         * <li><strong>emptyNumberIgnore</strong>: specifies whether to skip nonexistent numbers.</li>
         * <li><strong>inArrearsIgnore</strong>: specifies whether to skip numbers with overdue payments.</li>
         * <li><strong>outOfServiceIgnore</strong>: specifies whether to skip suspended numbers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;emptyNumberIgnore&quot;:true,&quot;inArrearsIgnore&quot;:true,&quot;outOfServiceIgnore&quot;:true}</p>
         */
        public Builder recallStrategyJson(String recallStrategyJson) {
            this.putQueryParameter("RecallStrategyJson", recallStrategyJson);
            this.recallStrategyJson = recallStrategyJson;
            return this;
        }

        /**
         * <p>The optimal ringing duration. Default value: 25.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder ringingDuration(Long ringingDuration) {
            this.putQueryParameter("RingingDuration", ringingDuration);
            this.ringingDuration = ringingDuration;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The execution strategy of the job.  </p>
         * <ul>
         * <li>repeatBy: the repetition type. Valid values: Once (no repetition), Week (weekly repetition), and Month (monthly repetition).  </li>
         * <li>startTime: the start time of the time-based strategy.</li>
         * <li>endTime: the end time of the time-based strategy.  <blockquote>
         * <p>Execution methods:</p>
         * <ul>
         * <li>If the start and end times of the strategy are not specified, the execution method is immediate execution.</li>
         * <li>If the strategy time is specified, the job is executed based on the time, and the repetition type repeatBy must be selected.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>workingTime: the time period during which outbound calls can be made.</li>
         * <li>maxAttemptsPerDay: the maximum number of call attempts per day for numbers under this job.</li>
         * <li>minAttemptInterval: the retry interval for numbers, in minutes.</li>
         * <li>routingStrategy: the number strategy. Valid values: None (not specified), LocalFirst (local numbers first), and LocalProvinceFirst (local province numbers first).</li>
         * <li>repeatDays: the execution days corresponding to the repetition type. If the repetition type RepeatBy is Week, 0 represents Sunday, and 1 to 6 represent Monday to Saturday. If the repetition cycle RepeatBy is Month, 1 to 31 represent the 1st to the 31st day. Months without the specified date are not executed. For example, if the 30th is selected, the job is not executed in February.</li>
         * <li>repeatable: specifies whether to enable cyclic jobs. Valid values: true and false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public CreateJobGroupRequest build() {
            return new CreateJobGroupRequest(this);
        } 

    } 

}
