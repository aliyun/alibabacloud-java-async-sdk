// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateJobGroupRequest</p>
 */
public class CreateJobGroupRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupDescription")
    private String jobGroupDescription;

    @Query
    @NameInMap("JobGroupName")
    @Validation(required = true)
    private String jobGroupName;

    @Query
    @NameInMap("MinConcurrency")
    private Long minConcurrency;

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

    private CreateJobGroupRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobGroupDescription = builder.jobGroupDescription;
        this.jobGroupName = builder.jobGroupName;
        this.minConcurrency = builder.minConcurrency;
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
    public java.util.List < String > getCallingNumber() {
        return this.callingNumber;
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
        private java.util.List < String > callingNumber; 
        private String instanceId; 
        private String jobGroupDescription; 
        private String jobGroupName; 
        private Long minConcurrency; 
        private String priority; 
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
            this.instanceId = request.instanceId;
            this.jobGroupDescription = request.jobGroupDescription;
            this.jobGroupName = request.jobGroupName;
            this.minConcurrency = request.minConcurrency;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupDescription.
         */
        public Builder jobGroupDescription(String jobGroupDescription) {
            this.putQueryParameter("JobGroupDescription", jobGroupDescription);
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }

        /**
         * JobGroupName.
         */
        public Builder jobGroupName(String jobGroupName) {
            this.putQueryParameter("JobGroupName", jobGroupName);
            this.jobGroupName = jobGroupName;
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
        public CreateJobGroupRequest build() {
            return new CreateJobGroupRequest(this);
        } 

    } 

}
