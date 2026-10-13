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
 * {@link ModifyBatchJobsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBatchJobsRequest</p>
 */
public class ModifyBatchJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFilePath")
    private String jobFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Submitted")
    @com.aliyun.core.annotation.Validation(required = true)
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
        private java.util.List<String> callingNumber; 
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
         * <p>The job name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>催收作业组</p>
         */
        public Builder batchJobName(String batchJobName) {
            this.putQueryParameter("BatchJobName", batchJobName);
            this.batchJobName = batchJobName;
            return this;
        }

        /**
         * <p>The calling numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;95187&quot;]</p>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The description of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>这是催收作业组-01</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <p>The download URL of the Excel file for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
         */
        public Builder jobFilePath(String jobFilePath) {
            this.putQueryParameter("JobFilePath", jobFilePath);
            this.jobFilePath = jobFilePath;
            return this;
        }

        /**
         * <p>The job group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
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
         * <p>7d820242-f4f0-4d2e-ae35-b424c41cbc5b</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The policy in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxAttemptsPerDay&quot;:2,&quot;name&quot;:&quot;策略名字&quot;,&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;13:00:00&quot;,&quot;endTime&quot;:&quot;18:30:00&quot;}],&quot;minAttemptInterval&quot;:60}</p>
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        /**
         * <p>Specifies whether to submit the job. \<code>false\\</code> submits the job. \<code>true\\</code> saves the job as a draft.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
