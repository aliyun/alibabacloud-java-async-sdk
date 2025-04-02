// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CodeSource")
    private CodeSource codeSource;

    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("ElasticSpec")
    private JobElasticSpec elasticSpec;

    @com.aliyun.core.annotation.NameInMap("EnabledDebugger")
    private Boolean enabledDebugger;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFailedTime")
    private String gmtFailedTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @com.aliyun.core.annotation.NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSuccessedTime")
    private String gmtSuccessedTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobSpecs")
    private java.util.List<JobSpec> jobSpecs;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Pods")
    private java.util.List<Pods> pods;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceLevel")
    private String resourceLevel;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("RestartTimes")
    private String restartTimes;

    @com.aliyun.core.annotation.NameInMap("Settings")
    private JobSettings settings;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusHistory")
    private java.util.List<StatusTransitionItem> statusHistory;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibs")
    private java.util.List<String> thirdpartyLibs;

    @com.aliyun.core.annotation.NameInMap("UserCommand")
    private String userCommand;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private GetJobResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.clusterId = builder.clusterId;
        this.codeSource = builder.codeSource;
        this.credentialConfig = builder.credentialConfig;
        this.dataSources = builder.dataSources;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.elasticSpec = builder.elasticSpec;
        this.enabledDebugger = builder.enabledDebugger;
        this.envs = builder.envs;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFailedTime = builder.gmtFailedTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtRunningTime = builder.gmtRunningTime;
        this.gmtStoppedTime = builder.gmtStoppedTime;
        this.gmtSubmittedTime = builder.gmtSubmittedTime;
        this.gmtSuccessedTime = builder.gmtSuccessedTime;
        this.jobId = builder.jobId;
        this.jobSpecs = builder.jobSpecs;
        this.jobType = builder.jobType;
        this.pods = builder.pods;
        this.priority = builder.priority;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceLevel = builder.resourceLevel;
        this.resourceType = builder.resourceType;
        this.restartTimes = builder.restartTimes;
        this.settings = builder.settings;
        this.status = builder.status;
        this.statusHistory = builder.statusHistory;
        this.subStatus = builder.subStatus;
        this.tenantId = builder.tenantId;
        this.thirdpartyLibDir = builder.thirdpartyLibDir;
        this.thirdpartyLibs = builder.thirdpartyLibs;
        this.userCommand = builder.userCommand;
        this.userId = builder.userId;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return codeSource
     */
    public CodeSource getCodeSource() {
        return this.codeSource;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return elasticSpec
     */
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    /**
     * @return enabledDebugger
     */
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    /**
     * @return envs
     */
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFailedTime
     */
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtRunningTime
     */
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    /**
     * @return gmtStoppedTime
     */
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    /**
     * @return gmtSubmittedTime
     */
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    /**
     * @return gmtSuccessedTime
     */
    public String getGmtSuccessedTime() {
        return this.gmtSuccessedTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobSpecs
     */
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return pods
     */
    public java.util.List<Pods> getPods() {
        return this.pods;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceLevel
     */
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return restartTimes
     */
    public String getRestartTimes() {
        return this.restartTimes;
    }

    /**
     * @return settings
     */
    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusHistory
     */
    public java.util.List<StatusTransitionItem> getStatusHistory() {
        return this.statusHistory;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return thirdpartyLibDir
     */
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    /**
     * @return thirdpartyLibs
     */
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    /**
     * @return userCommand
     */
    public String getUserCommand() {
        return this.userCommand;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String accessibility; 
        private String clusterId; 
        private CodeSource codeSource; 
        private CredentialConfig credentialConfig; 
        private java.util.List<DataSources> dataSources; 
        private String displayName; 
        private Long duration; 
        private JobElasticSpec elasticSpec; 
        private Boolean enabledDebugger; 
        private java.util.Map<String, String> envs; 
        private String gmtCreateTime; 
        private String gmtFailedTime; 
        private String gmtFinishTime; 
        private String gmtRunningTime; 
        private String gmtStoppedTime; 
        private String gmtSubmittedTime; 
        private String gmtSuccessedTime; 
        private String jobId; 
        private java.util.List<JobSpec> jobSpecs; 
        private String jobType; 
        private java.util.List<Pods> pods; 
        private Integer priority; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String resourceId; 
        private String resourceLevel; 
        private String resourceType; 
        private String restartTimes; 
        private JobSettings settings; 
        private String status; 
        private java.util.List<StatusTransitionItem> statusHistory; 
        private String subStatus; 
        private String tenantId; 
        private String thirdpartyLibDir; 
        private java.util.List<String> thirdpartyLibs; 
        private String userCommand; 
        private String userId; 
        private UserVpc userVpc; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.accessibility = model.accessibility;
            this.clusterId = model.clusterId;
            this.codeSource = model.codeSource;
            this.credentialConfig = model.credentialConfig;
            this.dataSources = model.dataSources;
            this.displayName = model.displayName;
            this.duration = model.duration;
            this.elasticSpec = model.elasticSpec;
            this.enabledDebugger = model.enabledDebugger;
            this.envs = model.envs;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFailedTime = model.gmtFailedTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtRunningTime = model.gmtRunningTime;
            this.gmtStoppedTime = model.gmtStoppedTime;
            this.gmtSubmittedTime = model.gmtSubmittedTime;
            this.gmtSuccessedTime = model.gmtSuccessedTime;
            this.jobId = model.jobId;
            this.jobSpecs = model.jobSpecs;
            this.jobType = model.jobType;
            this.pods = model.pods;
            this.priority = model.priority;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceLevel = model.resourceLevel;
            this.resourceType = model.resourceType;
            this.restartTimes = model.restartTimes;
            this.settings = model.settings;
            this.status = model.status;
            this.statusHistory = model.statusHistory;
            this.subStatus = model.subStatus;
            this.tenantId = model.tenantId;
            this.thirdpartyLibDir = model.thirdpartyLibDir;
            this.thirdpartyLibs = model.thirdpartyLibs;
            this.userCommand = model.userCommand;
            this.userId = model.userId;
            this.userVpc = model.userVpc;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The visibility of the job. Valid values:</p>
         * <ul>
         * <li>PUBLIC: The code is public in the workspace.</li>
         * <li>PRIVATE: The workspace is visible only to you and the administrator of the workspace. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a*****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The code source.</p>
         */
        public Builder codeSource(CodeSource codeSource) {
            this.codeSource = codeSource;
            return this;
        }

        /**
         * <p>The access credential configurations.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The data sources.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-mnist-test</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The duration of the job (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>3602</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The elastic job parameters.</p>
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * <p>Specifies whether to enable the debugger job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabledDebugger(Boolean enabledDebugger) {
            this.enabledDebugger = enabledDebugger;
            return this;
        }

        /**
         * <p>The configurations of environment variables.</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The time when the job was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:35:01Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time of the job failed (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:08Z</p>
         */
        public Builder gmtFailedTime(String gmtFailedTime) {
            this.gmtFailedTime = gmtFailedTime;
            return this;
        }

        /**
         * <p>The time when the job ended (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:08Z</p>
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * <p>The start time of the job (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:21Z</p>
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * <p>The time when the job stopped (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:08Z</p>
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * <p>The time when the job was submitted to the cluster (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtSubmittedTime(String gmtSubmittedTime) {
            this.gmtSubmittedTime = gmtSubmittedTime;
            return this;
        }

        /**
         * <p>The time when the job succeeded (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:08Z</p>
         */
        public Builder gmtSuccessedTime(String gmtSuccessedTime) {
            this.gmtSuccessedTime = gmtSuccessedTime;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc*******</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The node configurations of the job, which is <strong>JobSpecs</strong> in the CreateJob operation.</p>
         */
        public Builder jobSpecs(java.util.List<JobSpec> jobSpecs) {
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * <p>The job type. Specified by the JobType parameter of the <a href="https://help.aliyun.com/document_detail/459672.html">CreateJob</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TFJob</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>All running nodes of the job.</p>
         */
        public Builder pods(java.util.List<Pods> pods) {
            this.pods = pods;
            return this;
        }

        /**
         * <p>The priority of the job. Valid values: 1 to 9.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The status detail code, which is a sub-status under the current status.</p>
         * 
         * <strong>example:</strong>
         * <p>JobStoppedByUser</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * <p>The description of the status detail code.</p>
         * 
         * <strong>example:</strong>
         * <p>Job is stopped by user.</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The request ID, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the job belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>r******</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource level that the job uses.</p>
         * 
         * <strong>example:</strong>
         * <p>L0</p>
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        /**
         * <p>The resource type. Valid values: ECS, Lingjun, and ACS.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The number of retries and the maximum number of retries used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>0/10</p>
         */
        public Builder restartTimes(String restartTimes) {
            this.restartTimes = restartTimes;
            return this;
        }

        /**
         * <p>The settings of the additional parameters of the job.</p>
         */
        public Builder settings(JobSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Queuing</li>
         * <li>Bidding (Only for Lingjun preemptible jobs)</li>
         * <li>EnvPreparing</li>
         * <li>SanityChecking</li>
         * <li>Running</li>
         * <li>Restarting</li>
         * <li>Stopping</li>
         * <li>SucceededReserving</li>
         * <li>FailedReserving</li>
         * <li>Succeeded</li>
         * <li>Failed</li>
         * <li>Stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The status history.</p>
         */
        public Builder statusHistory(java.util.List<StatusTransitionItem> statusHistory) {
            this.statusHistory = statusHistory;
            return this;
        }

        /**
         * <p>The sub-status of the job, such as its preemption status.</p>
         * 
         * <strong>example:</strong>
         * <p>Restarting</p>
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GAR***W134</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The directory that contains requirements.txt.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/code/</p>
         */
        public Builder thirdpartyLibDir(String thirdpartyLibDir) {
            this.thirdpartyLibDir = thirdpartyLibDir;
            return this;
        }

        /**
         * <p>The third-party Python libraries to be installed.</p>
         */
        public Builder thirdpartyLibs(java.util.List<String> thirdpartyLibs) {
            this.thirdpartyLibs = thirdpartyLibs;
            return this;
        }

        /**
         * <p>The command that is run to start each node.</p>
         * 
         * <strong>example:</strong>
         * <p>python /root/code/mnist.py</p>
         */
        public Builder userCommand(String userCommand) {
            this.userCommand = userCommand;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account who submitted the job.</p>
         * 
         * <strong>example:</strong>
         * <p>12*********</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The VPC of the user.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the job belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>268</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the workspace to which the job belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
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
    public static class CodeSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("CodeSourceId")
        private String codeSourceId;

        @com.aliyun.core.annotation.NameInMap("Commit")
        private String commit;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private CodeSource(Builder builder) {
            this.branch = builder.branch;
            this.codeSourceId = builder.codeSourceId;
            this.commit = builder.commit;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeSource create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return codeSourceId
         */
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        /**
         * @return commit
         */
        public String getCommit() {
            return this.commit;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String branch; 
            private String codeSourceId; 
            private String commit; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(CodeSource model) {
                this.branch = model.branch;
                this.codeSourceId = model.codeSourceId;
                this.commit = model.commit;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The code branch.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * <p>The code source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>code******</p>
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * <p>The code commit ID</p>
             * 
             * <strong>example:</strong>
             * <p>44da109b59f8596152987eaa8f3b2487xxxxxx</p>
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * <p>The local mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public CodeSource build() {
                return new CodeSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.mountPath = builder.mountPath;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String mountPath; 
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.dataSourceId = model.dataSourceId;
                this.mountPath = model.mountPath;
                this.uri = model.uri;
            } 

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d*******</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The local mount path. This parameter is optional. The default value is empty, which specifies that the mount path in the data source is used.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The data source URL.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class HistoryPods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("PodId")
        private String podId;

        @com.aliyun.core.annotation.NameInMap("PodUid")
        private String podUid;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HistoryPods(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.ip = builder.ip;
            this.podId = builder.podId;
            this.podUid = builder.podUid;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryPods create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        /**
         * @return podUid
         */
        public String getPodUid() {
            return this.podUid;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtStartTime; 
            private String ip; 
            private String podId; 
            private String podUid; 
            private String resourceType; 
            private String status; 
            private String subStatus; 
            private String type; 

            private Builder() {
            } 

            private Builder(HistoryPods model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtFinishTime = model.gmtFinishTime;
                this.gmtStartTime = model.gmtStartTime;
                this.ip = model.ip;
                this.podId = model.podId;
                this.podUid = model.podUid;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.subStatus = model.subStatus;
                this.type = model.type;
            } 

            /**
             * <p>The time when the node was created (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The end time of the node (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * <p>The start time of the node (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.3</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            /**
             * <p>The UID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
             */
            public Builder podUid(String podUid) {
                this.podUid = podUid;
                return this;
            }

            /**
             * <p>The resource type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The status of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-status of the node, such as its preemption status. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Evicted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HistoryPods build() {
                return new HistoryPods(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Pods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("HistoryPods")
        private java.util.List<HistoryPods> historyPods;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("PodId")
        private String podId;

        @com.aliyun.core.annotation.NameInMap("PodUid")
        private String podUid;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Pods(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.historyPods = builder.historyPods;
            this.ip = builder.ip;
            this.podId = builder.podId;
            this.podUid = builder.podUid;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pods create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return historyPods
         */
        public java.util.List<HistoryPods> getHistoryPods() {
            return this.historyPods;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        /**
         * @return podUid
         */
        public String getPodUid() {
            return this.podUid;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtStartTime; 
            private java.util.List<HistoryPods> historyPods; 
            private String ip; 
            private String podId; 
            private String podUid; 
            private String resourceType; 
            private String status; 
            private String subStatus; 
            private String type; 

            private Builder() {
            } 

            private Builder(Pods model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtFinishTime = model.gmtFinishTime;
                this.gmtStartTime = model.gmtStartTime;
                this.historyPods = model.historyPods;
                this.ip = model.ip;
                this.podId = model.podId;
                this.podUid = model.podUid;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.subStatus = model.subStatus;
                this.type = model.type;
            } 

            /**
             * <p>The time when the node was created (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The end time of the node (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T15:36:05Z</p>
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * <p>The start time of the node (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>The historical nodes.</p>
             */
            public Builder historyPods(java.util.List<HistoryPods> historyPods) {
                this.historyPods = historyPods;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.2</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The node ID. It can be used in the GetPodLogs and GetPodEvents operations to obtain the detailed logs and events of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            /**
             * <p>The UID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
             */
            public Builder podUid(String podUid) {
                this.podUid = podUid;
                return this;
            }

            /**
             * <p>The resource type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Running</li>
             * <li>Succeeded</li>
             * <li>Failed</li>
             * <li>Unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-status of the node, such as its preemption status. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Evicted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The node type, which corresponds to a specific JobSpec in JobSpecs of the CreateJob operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Pods build() {
                return new Pods(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCidrs")
        private java.util.List<String> extendedCidrs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCidrs = builder.extendedCidrs;
            this.securityGroupId = builder.securityGroupId;
            this.switchId = builder.switchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCidrs
         */
        public java.util.List<String> getExtendedCidrs() {
            return this.extendedCidrs;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String defaultRoute; 
            private java.util.List<String> extendedCidrs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.defaultRoute = model.defaultRoute;
                this.extendedCidrs = model.extendedCidrs;
                this.securityGroupId = model.securityGroupId;
                this.switchId = model.switchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The default router. This parameter is valid only for general-purpose computing resources. Valid values:</p>
             * <p>eth0: The default network interface is used to access the Internet through the public gateway. eth1: The user&quot;s Elastic Network Interface is used to access the Internet through the private gateway.</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>The extended CIDR block. Example: 192.168.0.1/24.</p>
             */
            public Builder extendedCidrs(java.util.List<String> extendedCidrs) {
                this.extendedCidrs = extendedCidrs;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-abcdef****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vs-abcdef****</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-abcdef****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
