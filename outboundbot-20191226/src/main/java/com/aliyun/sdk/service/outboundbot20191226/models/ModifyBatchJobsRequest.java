// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBatchJobsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBatchJobsRequest</p>
 */
public class ModifyBatchJobsRequest extends Request {
    @Query
    @NameInMap("BatchJobName")
    @Validation(required = true)
    private String batchJobName;

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
    @NameInMap("JobFilePath")
    private String jobFilePath;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("ScenarioId")
    private String scenarioId;

    @Query
    @NameInMap("ScriptId")
    private String scriptId;

    @Query
    @NameInMap("StrategyJson")
    private String strategyJson;

    @Query
    @NameInMap("Submitted")
    @Validation(required = true)
    private Boolean submitted;

    private ModifyBatchJobsRequest(Builder builder) {
        super(builder);
        this.batchJobName = builder.batchJobName;
        this.callingNumber = builder.callingNumber;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.jobFilePath = builder.jobFilePath;
        this.jobGroupId = builder.jobGroupId;
        this.scenarioId = builder.scenarioId;
        this.scriptId = builder.scriptId;
        this.strategyJson = builder.strategyJson;
        this.submitted = builder.submitted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBatchJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchJobName
     */
    public String getBatchJobName() {
        return this.batchJobName;
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
     * @return jobFilePath
     */
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
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

    /**
     * @return submitted
     */
    public Boolean getSubmitted() {
        return this.submitted;
    }

    public static final class Builder extends Request.Builder<ModifyBatchJobsRequest, Builder> {
        private String batchJobName; 
        private java.util.List < String > callingNumber; 
        private String description; 
        private String instanceId; 
        private String jobFilePath; 
        private String jobGroupId; 
        private String scenarioId; 
        private String scriptId; 
        private String strategyJson; 
        private Boolean submitted; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBatchJobsRequest request) {
            super(request);
            this.batchJobName = request.batchJobName;
            this.callingNumber = request.callingNumber;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.jobFilePath = request.jobFilePath;
            this.jobGroupId = request.jobGroupId;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.strategyJson = request.strategyJson;
            this.submitted = request.submitted;
        } 

        /**
         * BatchJobName.
         */
        public Builder batchJobName(String batchJobName) {
            this.putQueryParameter("BatchJobName", batchJobName);
            this.batchJobName = batchJobName;
            return this;
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
         * JobFilePath.
         */
        public Builder jobFilePath(String jobFilePath) {
            this.putQueryParameter("JobFilePath", jobFilePath);
            this.jobFilePath = jobFilePath;
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

        /**
         * Submitted.
         */
        public Builder submitted(Boolean submitted) {
            this.putQueryParameter("Submitted", submitted);
            this.submitted = submitted;
            return this;
        }

        @Override
        public ModifyBatchJobsRequest build() {
            return new ModifyBatchJobsRequest(this);
        } 

    } 

}
