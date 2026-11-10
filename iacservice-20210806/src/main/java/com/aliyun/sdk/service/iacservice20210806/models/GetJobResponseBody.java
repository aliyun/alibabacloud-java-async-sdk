// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The job details.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1435C78A-AED9-53D6-B7A6-E2661D29B1FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class AllParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("secret")
        private Boolean secret;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private AllParameters(Builder builder) {
            this.name = builder.name;
            this.secret = builder.secret;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secret
         */
        public Boolean getSecret() {
            return this.secret;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Boolean secret; 
            private String value; 

            private Builder() {
            } 

            private Builder(AllParameters model) {
                this.name = model.name;
                this.secret = model.secret;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the parameter is confidential. Confidential parameters are hidden in API responses and console displays, and are stored in an encrypted manner.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder secret(Boolean secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AllParameters build() {
                return new AllParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class AssertCheckDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comparison")
        private String comparison;

        @com.aliyun.core.annotation.NameInMap("expectedValue")
        private String expectedValue;

        @com.aliyun.core.annotation.NameInMap("isPass")
        private Boolean isPass;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AssertCheckDetail(Builder builder) {
            this.comparison = builder.comparison;
            this.expectedValue = builder.expectedValue;
            this.isPass = builder.isPass;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssertCheckDetail create() {
            return builder().build();
        }

        /**
         * @return comparison
         */
        public String getComparison() {
            return this.comparison;
        }

        /**
         * @return expectedValue
         */
        public String getExpectedValue() {
            return this.expectedValue;
        }

        /**
         * @return isPass
         */
        public Boolean getIsPass() {
            return this.isPass;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comparison; 
            private String expectedValue; 
            private Boolean isPass; 
            private String type; 

            private Builder() {
            } 

            private Builder(AssertCheckDetail model) {
                this.comparison = model.comparison;
                this.expectedValue = model.expectedValue;
                this.isPass = model.isPass;
                this.type = model.type;
            } 

            /**
             * <p>The comparison operator. Valid values:</p>
             * <ul>
             * <li>eq: Equal to.</li>
             * <li>n_eq: Not equal to.</li>
             * <li>ctn: Contains.</li>
             * <li>n_ctn: Does not contain.</li>
             * <li>regex: Regular expression match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder comparison(String comparison) {
                this.comparison = comparison;
                return this;
            }

            /**
             * <p>The expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>Expected value</p>
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * <p>Indicates whether the check is passed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPass(Boolean isPass) {
                this.isPass = isPass;
                return this;
            }

            /**
             * <p>The assertion type. Valid values:</p>
             * <ul>
             * <li>state: Task status.</li>
             * <li>result: Execution result.</li>
             * <li>resourceChange: Resource change.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>result</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AssertCheckDetail build() {
                return new AssertCheckDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("hasConfigProactive")
        private String hasConfigProactive;

        @com.aliyun.core.annotation.NameInMap("isDestroy")
        private Boolean isDestroy;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("resourcesChanged")
        private String resourcesChanged;

        @com.aliyun.core.annotation.NameInMap("subCommand")
        private String subCommand;

        private Config(Builder builder) {
            this.autoApply = builder.autoApply;
            this.hasConfigProactive = builder.hasConfigProactive;
            this.isDestroy = builder.isDestroy;
            this.moduleVersion = builder.moduleVersion;
            this.resourcesChanged = builder.resourcesChanged;
            this.subCommand = builder.subCommand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return autoApply
         */
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        /**
         * @return hasConfigProactive
         */
        public String getHasConfigProactive() {
            return this.hasConfigProactive;
        }

        /**
         * @return isDestroy
         */
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return resourcesChanged
         */
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

        /**
         * @return subCommand
         */
        public String getSubCommand() {
            return this.subCommand;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private String hasConfigProactive; 
            private Boolean isDestroy; 
            private String moduleVersion; 
            private String resourcesChanged; 
            private String subCommand; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.autoApply = model.autoApply;
                this.hasConfigProactive = model.hasConfigProactive;
                this.isDestroy = model.isDestroy;
                this.moduleVersion = model.moduleVersion;
                this.resourcesChanged = model.resourcesChanged;
                this.subCommand = model.subCommand;
            } 

            /**
             * <p>Specifies whether to automatically execute the task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * <p>Specifies whether this job performs a compliance pre-check.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasConfigProactive(String hasConfigProactive) {
                this.hasConfigProactive = hasConfigProactive;
                return this;
            }

            /**
             * <p>Specifies whether to destroy resources.</p>
             * 
             * <strong>example:</strong>
             * <p>fales</p>
             */
            public Builder isDestroy(Boolean isDestroy) {
                this.isDestroy = isDestroy;
                return this;
            }

            /**
             * <p>The template version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The resource changes.</p>
             * 
             * <strong>example:</strong>
             * <p>+0 ~0 -0</p>
             */
            public Builder resourcesChanged(String resourcesChanged) {
                this.resourcesChanged = resourcesChanged;
                return this;
            }

            /**
             * <p>The operation command.</p>
             * 
             * <strong>example:</strong>
             * <p>destroy</p>
             */
            public Builder subCommand(String subCommand) {
                this.subCommand = subCommand;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allParameters")
        private java.util.List<AllParameters> allParameters;

        @com.aliyun.core.annotation.NameInMap("assertCheckDetail")
        private java.util.List<AssertCheckDetail> assertCheckDetail;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private java.util.Map<String, ?> downloadUrl;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("executeType")
        private String executeType;

        @com.aliyun.core.annotation.NameInMap("isPassAssertCheck")
        private Boolean isPassAssertCheck;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("jobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("logFile")
        private java.util.Map<String, ?> logFile;

        @com.aliyun.core.annotation.NameInMap("output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("outputJsonPlan")
        private Object outputJsonPlan;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusDetail")
        private java.util.Map<String, JobStatusDetailValue> statusDetail;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        private Job(Builder builder) {
            this.allParameters = builder.allParameters;
            this.assertCheckDetail = builder.assertCheckDetail;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.downloadUrl = builder.downloadUrl;
            this.elapsedTime = builder.elapsedTime;
            this.executeType = builder.executeType;
            this.isPassAssertCheck = builder.isPassAssertCheck;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.logFile = builder.logFile;
            this.output = builder.output;
            this.outputJsonPlan = builder.outputJsonPlan;
            this.parameters = builder.parameters;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.terraformProviderVersion = builder.terraformProviderVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return allParameters
         */
        public java.util.List<AllParameters> getAllParameters() {
            return this.allParameters;
        }

        /**
         * @return assertCheckDetail
         */
        public java.util.List<AssertCheckDetail> getAssertCheckDetail() {
            return this.assertCheckDetail;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadUrl
         */
        public java.util.Map<String, ?> getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return isPassAssertCheck
         */
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return logFile
         */
        public java.util.Map<String, ?> getLogFile() {
            return this.logFile;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return outputJsonPlan
         */
        public Object getOutputJsonPlan() {
            return this.outputJsonPlan;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public java.util.Map<String, JobStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public static final class Builder {
            private java.util.List<AllParameters> allParameters; 
            private java.util.List<AssertCheckDetail> assertCheckDetail; 
            private Config config; 
            private String createTime; 
            private String description; 
            private java.util.Map<String, ?> downloadUrl; 
            private Long elapsedTime; 
            private String executeType; 
            private Boolean isPassAssertCheck; 
            private String jobId; 
            private String jobType; 
            private java.util.Map<String, ?> logFile; 
            private String output; 
            private Object outputJsonPlan; 
            private java.util.Map<String, String> parameters; 
            private String status; 
            private java.util.Map<String, JobStatusDetailValue> statusDetail; 
            private String taskId; 
            private String taskType; 
            private String terraformProviderVersion; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.allParameters = model.allParameters;
                this.assertCheckDetail = model.assertCheckDetail;
                this.config = model.config;
                this.createTime = model.createTime;
                this.description = model.description;
                this.downloadUrl = model.downloadUrl;
                this.elapsedTime = model.elapsedTime;
                this.executeType = model.executeType;
                this.isPassAssertCheck = model.isPassAssertCheck;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.logFile = model.logFile;
                this.output = model.output;
                this.outputJsonPlan = model.outputJsonPlan;
                this.parameters = model.parameters;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.terraformProviderVersion = model.terraformProviderVersion;
            } 

            /**
             * <p>The full set of job parameters, including sensitive and non-sensitive parameters.</p>
             */
            public Builder allParameters(java.util.List<AllParameters> allParameters) {
                this.allParameters = allParameters;
                return this;
            }

            /**
             * <p>The list of assertion checks, applicable to scenario-based testing tasks.</p>
             */
            public Builder assertCheckDetail(java.util.List<AssertCheckDetail> assertCheckDetail) {
                this.assertCheckDetail = assertCheckDetail;
                return this;
            }

            /**
             * <p>The job configuration.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The job creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31T03:38:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>url</p>
             */
            public Builder downloadUrl(java.util.Map<String, ?> downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>3s</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The execution type. Valid values:</p>
             * <ul>
             * <li>Manual: Manual execution (default).</li>
             * <li>Auto: Automatic execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * <p>Indicates whether the assertion check is passed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPassAssertCheck(Boolean isPassAssertCheck) {
                this.isPassAssertCheck = isPassAssertCheck;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-518855d9a058cfff0dc933e6b5767</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The runtime logs. Currently, the following log content (that is, the values of the key) can be returned:</p>
             * <ul>
             * <li>tf-init.run.error.log</li>
             * <li>tf-init.plan.log</li>
             * <li>tf-plan.run.log</li>
             * <li>tf-apply.run.log</li>
             * <li>tf-init.apply.log</li>
             * </ul>
             */
            public Builder logFile(java.util.Map<String, ?> logFile) {
                this.logFile = logFile;
                return this;
            }

            /**
             * <p>The job output.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The change details of the Plan phase.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;formatVersion&quot;: &quot;1.2&quot;,
             *     &quot;terraformVersion&quot;: &quot;1.5.7&quot;,
             *     &quot;providerVersion&quot;: &quot;1.262.1&quot;,
             *     &quot;plannedValues&quot;: {
             *         &quot;root_module&quot;: {
             *         }
             *     },
             *     &quot;resourceChanges&quot;: [
             *         {
             *             &quot;address&quot;: &quot;alicloud_instance.uuid_ae98dda8_xxxxxxx&quot;,
             *             &quot;mode&quot;: &quot;managed&quot;,
             *             &quot;type&quot;: &quot;alicloud_instance&quot;,
             *             &quot;name&quot;: &quot;uuid_ae98dda8_xxxxxx&quot;,
             *             &quot;providerName&quot;: &quot;registry.terraform.io/aliyun/alicloud&quot;,
             *             &quot;change&quot;: {
             *                 &quot;actions&quot;: [
             *                     &quot;delete&quot;
             *                 ],
             *                 &quot;before&quot;: Object{...},
             *                 &quot;after_unknown&quot;: {
             *                 },
             *                 &quot;before_sensitive&quot;: Object{...},
             *                 &quot;after_sensitive&quot;: false
             *             },
             *             &quot;cloudSpecResourceCode&quot;: &quot;ACS::ECS::Instance&quot;
             *         }
             *     ],
             *     &quot;configuration&quot;: Object{...}
             * }</p>
             */
            public Builder outputJsonPlan(Object outputJsonPlan) {
                this.outputJsonPlan = outputJsonPlan;
                return this;
            }

            /**
             * <p>The parameter collection.</p>
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Pending: The initial state after the job is created.</li>
             * <li>PlanQueued: The state where the job is queued and waiting because no workflow is available after creation.</li>
             * <li>Planning: The state where the job is in the Plan phase.</li>
             * <li>ConfigProactiveInProgress: The state where the compliance pre-check is in progress. This requires the compliance pre-check feature to be enabled for the account.</li>
             * <li>ConfigProactiveSuccess: The state where the compliance pre-check is successful. This requires the compliance pre-check feature to be enabled for the account.</li>
             * <li>Planned: The state where the job has completed the Plan phase.</li>
             * <li>PlannedAndFinished: The final state where no differences are found after the Plan phase is completed.</li>
             * <li>Confirmed: The state where the job is waiting for confirmation after the Plan phase is completed.</li>
             * <li>ApplyQueued: The state where the job is queued and waiting because no workflow is available during execution.</li>
             * <li>Applying: The state where the job is in the Apply phase.</li>
             * <li>Applied: The final state where the job has completed the Apply phase.</li>
             * <li>Errored: The final state where an error occurs during job execution.</li>
             * <li>Canceled: The final state where the job execution is canceled.</li>
             * <li>Discarded: The final state where the plan of the job is discarded.</li>
             * <li>ConfigProactiveFailure: The state where the compliance pre-check fails. This requires the compliance pre-check feature to be enabled for the account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Errored</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job status details.</p>
             */
            public Builder statusDetail(java.util.Map<String, JobStatusDetailValue> statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-3b6cb9fa4751a1b9b5f22cbcf4e</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>Task: Regular task (default).</li>
             * <li>SceneTestingTask: Scenario-based testing task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SceneTestingTask</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The Terraform provider version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.230.0</p>
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
