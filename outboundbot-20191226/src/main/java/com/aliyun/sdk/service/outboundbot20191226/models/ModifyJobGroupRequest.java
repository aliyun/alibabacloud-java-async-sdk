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
 * {@link ModifyJobGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyJobGroupRequest</p>
 */
public class ModifyJobGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsExtras")
    private String flashSmsExtras;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupStatus")
    private String jobGroupStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinConcurrency")
    private Long minConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

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

    private ModifyJobGroupRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.description = builder.description;
        this.flashSmsExtras = builder.flashSmsExtras;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobGroupStatus = builder.jobGroupStatus;
        this.minConcurrency = builder.minConcurrency;
        this.name = builder.name;
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

    public static ModifyJobGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobGroupStatus
     */
    public String getJobGroupStatus() {
        return this.jobGroupStatus;
    }

    /**
     * @return minConcurrency
     */
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ModifyJobGroupRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String description; 
        private String flashSmsExtras; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobGroupStatus; 
        private Long minConcurrency; 
        private String name; 
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

        private Builder(ModifyJobGroupRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.description = request.description;
            this.flashSmsExtras = request.flashSmsExtras;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobGroupStatus = request.jobGroupStatus;
            this.minConcurrency = request.minConcurrency;
            this.name = request.name;
            this.priority = request.priority;
            this.recallCallingNumber = request.recallCallingNumber;
            this.recallStrategyJson = request.recallStrategyJson;
            this.ringingDuration = request.ringingDuration;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * <p>The caller number.</p>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>Modified job group</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The configuration parameters for flash message push in JSON format, including the configuration information of third-party flash messages.</p>
         * <p>templateId: the flash message template ID.<br>configId: the flash message configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;templateId&quot;:&quot;10471&quot;,&quot;configId&quot;:&quot;8037f524-6ff2-4dbe-bb28-f59234ea7a64&quot;}</p>
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
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3edc0260-6f7c-4de4-8535-09372240618b</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Draft: draft.</li>
         * <li>Paused: paused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Draft</p>
         */
        public Builder jobGroupStatus(String jobGroupStatus) {
            this.putQueryParameter("JobGroupStatus", jobGroupStatus);
            this.jobGroupStatus = jobGroupStatus;
            return this;
        }

        /**
         * <p>The guaranteed concurrency.
         * When a job starts, a minimum of N concurrent calls are guaranteed.
         * The sum of guaranteed concurrency values for jobs of the same priority cannot exceed the instance concurrency.
         * If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</p>
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
         * <p>The job name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Modified job group</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The job group priority. Valid values:</p>
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
         * <p>The list of caller numbers for recall.</p>
         */
        public Builder recallCallingNumber(java.util.List<String> recallCallingNumber) {
            this.putQueryParameter("RecallCallingNumber", recallCallingNumber);
            this.recallCallingNumber = recallCallingNumber;
            return this;
        }

        /**
         * <p>The JSON string of the recall strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;emptyNumberIgnore&quot;:false,&quot;inArrearsIgnore&quot;:false,&quot;outOfServiceIgnore&quot;:false}</p>
         */
        public Builder recallStrategyJson(String recallStrategyJson) {
            this.putQueryParameter("RecallStrategyJson", recallStrategyJson);
            this.recallStrategyJson = recallStrategyJson;
            return this;
        }

        /**
         * <p>The optimal ringing duration.</p>
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
         * <p>The scenario ID. This is a legacy parameter. Use ScriptId instead.</p>
         * <blockquote>
         * <p>This parameter is a legacy parameter. You can pass any value. Keep it consistent with the ScriptId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5a3940ce-a12f-4222-9f0f-605a9b89ea7c</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The job execution strategy.</p>
         * <ul>
         * <li>id: the job group strategy ID. You can obtain it from the StrategyId response parameter of the DescribeJobGroup operation.</li>
         * <li>repeatBy: the recurrence type. Valid values: Once (no recurrence), Day (daily), Week (weekly), and Month (monthly).</li>
         * <li>startTime: the start time of the strategy.</li>
         * <li>endTime: the end time of the strategy.</li>
         * <li>workingTime: the time period during which outbound calls are allowed.</li>
         * <li>maxAttemptsPerDay: the maximum number of call attempts per day for a phone number under this job.</li>
         * <li>minAttemptInterval: the retry interval for a phone number, in minutes.</li>
         * <li>routingStrategy: the phone number strategy. Valid values: None (not specified), LocalFirst (local numbers first), and LocalProvinceFirst (local province numbers first).</li>
         * <li>repeatDays: the execution days corresponding to the recurrence type. If RepeatBy is Week, 0 indicates Sunday, and 1 to 6 indicate Monday to Saturday. If RepeatBy is Month, 1 to 31 indicate the 1st to the 31st day of the month. If a month does not have the specified day, the job is not executed in that month. For example, if the 30th is selected, the job is not executed in February.</li>
         * <li>repeatable: specifies whether to enable recurring jobs. Valid values: true and false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},&quot;id&quot;:&quot;cdca9ed7-6470-42d0-afb3-a41e08b41383&quot;,{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public ModifyJobGroupRequest build() {
            return new ModifyJobGroupRequest(this);
        } 

    } 

}
