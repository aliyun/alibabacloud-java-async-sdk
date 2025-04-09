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
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FlashSmsExtras.
         */
        public Builder flashSmsExtras(String flashSmsExtras) {
            this.putQueryParameter("FlashSmsExtras", flashSmsExtras);
            this.flashSmsExtras = flashSmsExtras;
            return this;
        }

        /**
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
         * JobGroupStatus.
         */
        public Builder jobGroupStatus(String jobGroupStatus) {
            this.putQueryParameter("JobGroupStatus", jobGroupStatus);
            this.jobGroupStatus = jobGroupStatus;
            return this;
        }

        /**
         * MinConcurrency.
         */
        public Builder minConcurrency(Long minConcurrency) {
            this.putQueryParameter("MinConcurrency", minConcurrency);
            this.minConcurrency = minConcurrency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RecallCallingNumber.
         */
        public Builder recallCallingNumber(java.util.List<String> recallCallingNumber) {
            this.putQueryParameter("RecallCallingNumber", recallCallingNumber);
            this.recallCallingNumber = recallCallingNumber;
            return this;
        }

        /**
         * RecallStrategyJson.
         */
        public Builder recallStrategyJson(String recallStrategyJson) {
            this.putQueryParameter("RecallStrategyJson", recallStrategyJson);
            this.recallStrategyJson = recallStrategyJson;
            return this;
        }

        /**
         * RingingDuration.
         */
        public Builder ringingDuration(Long ringingDuration) {
            this.putQueryParameter("RingingDuration", ringingDuration);
            this.ringingDuration = ringingDuration;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * StrategyJson.
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
