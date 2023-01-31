// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyJobGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyJobGroupRequest</p>
 */
public class ModifyJobGroupRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("JobGroupStatus")
    private String jobGroupStatus;

    @Query
    @NameInMap("MinConcurrency")
    private Long minConcurrency;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("RecallStrategyJson")
    private String recallStrategyJson;

    @Query
    @NameInMap("RingingDuration")
    private Long ringingDuration;

    @Query
    @NameInMap("ScenarioId")
    private String scenarioId;

    @Query
    @NameInMap("ScriptId")
    private String scriptId;

    @Query
    @NameInMap("StrategyJson")
    private String strategyJson;

    private ModifyJobGroupRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobGroupStatus = builder.jobGroupStatus;
        this.minConcurrency = builder.minConcurrency;
        this.name = builder.name;
        this.priority = builder.priority;
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
    public java.util.List < String > getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private java.util.List < String > callingNumber; 
        private String description; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobGroupStatus; 
        private Long minConcurrency; 
        private String name; 
        private String priority; 
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
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobGroupStatus = request.jobGroupStatus;
            this.minConcurrency = request.minConcurrency;
            this.name = request.name;
            this.priority = request.priority;
            this.recallStrategyJson = request.recallStrategyJson;
            this.ringingDuration = request.ringingDuration;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List < String > callingNumber) {
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
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
         * Name.
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
