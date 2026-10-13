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
 * {@link CreateBatchJobsRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchJobsRequest</p>
 */
public class CreateBatchJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchJobDescription")
    private String batchJobDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFilePath")
    private String jobFilePath;

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
    public java.util.List<String> getCallingNumber() {
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
        private java.util.List<String> callingNumber; 
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
         * <p>The description of the batch job.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder batchJobDescription(String batchJobDescription) {
            this.putQueryParameter("BatchJobDescription", batchJobDescription);
            this.batchJobDescription = batchJobDescription;
            return this;
        }

        /**
         * <p>The name of the batch job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>First job group</p>
         */
        public Builder batchJobName(String batchJobName) {
            this.putQueryParameter("BatchJobName", batchJobName);
            this.batchJobName = batchJobName;
            return this;
        }

        /**
         * <p>The list of calling numbers.</p>
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
         * <p>The URL to download the Excel file for the batch job.</p>
         * <blockquote>
         * <p>You can obtain this parameter from the Folder response parameter of the GetJobDataUploadParams operation.</p>
         * </blockquote>
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
         * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The JSON string of the job execution strategy. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxAttemptsPerDay&quot;:2,&quot;name&quot;:&quot;Strategy name&quot;,&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;13:00:00&quot;,&quot;endTime&quot;:&quot;18:30:00&quot;}],&quot;minAttemptInterval&quot;:60}</p>
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        /**
         * <p>Specifies whether the job is submitted. Valid values:</p>
         * <ul>
         * <li>true: The job is saved as a draft.</li>
         * <li>false: The job is submitted.</li>
         * </ul>
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
        public CreateBatchJobsRequest build() {
            return new CreateBatchJobsRequest(this);
        } 

    } 

}
