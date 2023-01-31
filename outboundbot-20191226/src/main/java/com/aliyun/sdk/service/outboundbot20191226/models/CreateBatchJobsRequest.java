// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchJobsRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchJobsRequest</p>
 */
public class CreateBatchJobsRequest extends Request {
    @Query
    @NameInMap("BatchJobDescription")
    private String batchJobDescription;

    @Query
    @NameInMap("BatchJobName")
    @Validation(required = true)
    private String batchJobName;

    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobFilePath")
    private String jobFilePath;

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

    private CreateBatchJobsRequest(Builder builder) {
        super(builder);
        this.batchJobDescription = builder.batchJobDescription;
        this.batchJobName = builder.batchJobName;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobFilePath = builder.jobFilePath;
        this.scenarioId = builder.scenarioId;
        this.scriptId = builder.scriptId;
        this.strategyJson = builder.strategyJson;
        this.submitted = builder.submitted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchJobDescription
     */
    public String getBatchJobDescription() {
        return this.batchJobDescription;
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

    public static final class Builder extends Request.Builder<CreateBatchJobsRequest, Builder> {
        private String batchJobDescription; 
        private String batchJobName; 
        private java.util.List < String > callingNumber; 
        private String instanceId; 
        private String jobFilePath; 
        private String scenarioId; 
        private String scriptId; 
        private String strategyJson; 
        private Boolean submitted; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchJobsRequest request) {
            super(request);
            this.batchJobDescription = request.batchJobDescription;
            this.batchJobName = request.batchJobName;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.jobFilePath = request.jobFilePath;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.strategyJson = request.strategyJson;
            this.submitted = request.submitted;
        } 

        /**
         * BatchJobDescription.
         */
        public Builder batchJobDescription(String batchJobDescription) {
            this.putQueryParameter("BatchJobDescription", batchJobDescription);
            this.batchJobDescription = batchJobDescription;
            return this;
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
        public CreateBatchJobsRequest build() {
            return new CreateBatchJobsRequest(this);
        } 

    } 

}
