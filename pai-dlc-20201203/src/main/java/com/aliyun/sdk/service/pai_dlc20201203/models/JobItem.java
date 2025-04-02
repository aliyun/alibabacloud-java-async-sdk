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
 * {@link JobItem} extends {@link TeaModel}
 *
 * <p>JobItem</p>
 */
public class JobItem extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("EnablePreemptibleJob")
    private Boolean enablePreemptibleJob;

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

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @com.aliyun.core.annotation.NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSuccessedTime")
    private String gmtSuccessedTime;

    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobMaxRunningTimeMinutes")
    private Long jobMaxRunningTimeMinutes;

    @com.aliyun.core.annotation.NameInMap("JobSpecs")
    private java.util.List<JobSpec> jobSpecs;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private String nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.NameInMap("Pods")
    private java.util.List<PodItem> pods;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private Long requestCPU;

    @com.aliyun.core.annotation.NameInMap("RequestGPU")
    private String requestGPU;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private String requestMemory;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceLevel")
    private String resourceLevel;

    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("ResourceQuotaName")
    private String resourceQuotaName;

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

    @com.aliyun.core.annotation.NameInMap("SystemEnvs")
    private java.util.Map<String, String> systemEnvs;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibs")
    private java.util.List<String> thirdpartyLibs;

    @com.aliyun.core.annotation.NameInMap("UseOversoldResource")
    private Boolean useOversoldResource;

    @com.aliyun.core.annotation.NameInMap("UserCommand")
    private String userCommand;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserScript")
    private String userScript;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private JobItem(Builder builder) {
        this.accessibility = builder.accessibility;
        this.clusterId = builder.clusterId;
        this.codeSource = builder.codeSource;
        this.credentialConfig = builder.credentialConfig;
        this.dataSources = builder.dataSources;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.elasticSpec = builder.elasticSpec;
        this.enablePreemptibleJob = builder.enablePreemptibleJob;
        this.enabledDebugger = builder.enabledDebugger;
        this.envs = builder.envs;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFailedTime = builder.gmtFailedTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtRunningTime = builder.gmtRunningTime;
        this.gmtStoppedTime = builder.gmtStoppedTime;
        this.gmtSubmittedTime = builder.gmtSubmittedTime;
        this.gmtSuccessedTime = builder.gmtSuccessedTime;
        this.isDeleted = builder.isDeleted;
        this.jobId = builder.jobId;
        this.jobMaxRunningTimeMinutes = builder.jobMaxRunningTimeMinutes;
        this.jobSpecs = builder.jobSpecs;
        this.jobType = builder.jobType;
        this.nodeCount = builder.nodeCount;
        this.nodeNames = builder.nodeNames;
        this.pods = builder.pods;
        this.priority = builder.priority;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.resourceId = builder.resourceId;
        this.resourceLevel = builder.resourceLevel;
        this.resourceName = builder.resourceName;
        this.resourceQuotaName = builder.resourceQuotaName;
        this.resourceType = builder.resourceType;
        this.restartTimes = builder.restartTimes;
        this.settings = builder.settings;
        this.status = builder.status;
        this.statusHistory = builder.statusHistory;
        this.subStatus = builder.subStatus;
        this.systemEnvs = builder.systemEnvs;
        this.tenantId = builder.tenantId;
        this.thirdpartyLibDir = builder.thirdpartyLibDir;
        this.thirdpartyLibs = builder.thirdpartyLibs;
        this.useOversoldResource = builder.useOversoldResource;
        this.userCommand = builder.userCommand;
        this.userId = builder.userId;
        this.userScript = builder.userScript;
        this.userVpc = builder.userVpc;
        this.username = builder.username;
        this.workingDir = builder.workingDir;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobItem create() {
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
     * @return enablePreemptibleJob
     */
    public Boolean getEnablePreemptibleJob() {
        return this.enablePreemptibleJob;
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
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobMaxRunningTimeMinutes
     */
    public Long getJobMaxRunningTimeMinutes() {
        return this.jobMaxRunningTimeMinutes;
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
     * @return nodeCount
     */
    public String getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return pods
     */
    public java.util.List<PodItem> getPods() {
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
     * @return requestCPU
     */
    public Long getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestGPU
     */
    public String getRequestGPU() {
        return this.requestGPU;
    }

    /**
     * @return requestMemory
     */
    public String getRequestMemory() {
        return this.requestMemory;
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceQuotaName
     */
    public String getResourceQuotaName() {
        return this.resourceQuotaName;
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
     * @return systemEnvs
     */
    public java.util.Map<String, String> getSystemEnvs() {
        return this.systemEnvs;
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
     * @return useOversoldResource
     */
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
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
     * @return userScript
     */
    public String getUserScript() {
        return this.userScript;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
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
        private Boolean enablePreemptibleJob; 
        private Boolean enabledDebugger; 
        private java.util.Map<String, String> envs; 
        private String gmtCreateTime; 
        private String gmtFailedTime; 
        private String gmtFinishTime; 
        private String gmtModifiedTime; 
        private String gmtRunningTime; 
        private String gmtStoppedTime; 
        private String gmtSubmittedTime; 
        private String gmtSuccessedTime; 
        private Boolean isDeleted; 
        private String jobId; 
        private Long jobMaxRunningTimeMinutes; 
        private java.util.List<JobSpec> jobSpecs; 
        private String jobType; 
        private String nodeCount; 
        private java.util.List<String> nodeNames; 
        private java.util.List<PodItem> pods; 
        private Integer priority; 
        private String reasonCode; 
        private String reasonMessage; 
        private Long requestCPU; 
        private String requestGPU; 
        private String requestMemory; 
        private String resourceId; 
        private String resourceLevel; 
        private String resourceName; 
        private String resourceQuotaName; 
        private String resourceType; 
        private String restartTimes; 
        private JobSettings settings; 
        private String status; 
        private java.util.List<StatusTransitionItem> statusHistory; 
        private String subStatus; 
        private java.util.Map<String, String> systemEnvs; 
        private String tenantId; 
        private String thirdpartyLibDir; 
        private java.util.List<String> thirdpartyLibs; 
        private Boolean useOversoldResource; 
        private String userCommand; 
        private String userId; 
        private String userScript; 
        private UserVpc userVpc; 
        private String username; 
        private String workingDir; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(JobItem model) {
            this.accessibility = model.accessibility;
            this.clusterId = model.clusterId;
            this.codeSource = model.codeSource;
            this.credentialConfig = model.credentialConfig;
            this.dataSources = model.dataSources;
            this.displayName = model.displayName;
            this.duration = model.duration;
            this.elasticSpec = model.elasticSpec;
            this.enablePreemptibleJob = model.enablePreemptibleJob;
            this.enabledDebugger = model.enabledDebugger;
            this.envs = model.envs;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFailedTime = model.gmtFailedTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtRunningTime = model.gmtRunningTime;
            this.gmtStoppedTime = model.gmtStoppedTime;
            this.gmtSubmittedTime = model.gmtSubmittedTime;
            this.gmtSuccessedTime = model.gmtSuccessedTime;
            this.isDeleted = model.isDeleted;
            this.jobId = model.jobId;
            this.jobMaxRunningTimeMinutes = model.jobMaxRunningTimeMinutes;
            this.jobSpecs = model.jobSpecs;
            this.jobType = model.jobType;
            this.nodeCount = model.nodeCount;
            this.nodeNames = model.nodeNames;
            this.pods = model.pods;
            this.priority = model.priority;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestCPU = model.requestCPU;
            this.requestGPU = model.requestGPU;
            this.requestMemory = model.requestMemory;
            this.resourceId = model.resourceId;
            this.resourceLevel = model.resourceLevel;
            this.resourceName = model.resourceName;
            this.resourceQuotaName = model.resourceQuotaName;
            this.resourceType = model.resourceType;
            this.restartTimes = model.restartTimes;
            this.settings = model.settings;
            this.status = model.status;
            this.statusHistory = model.statusHistory;
            this.subStatus = model.subStatus;
            this.systemEnvs = model.systemEnvs;
            this.tenantId = model.tenantId;
            this.thirdpartyLibDir = model.thirdpartyLibDir;
            this.thirdpartyLibs = model.thirdpartyLibs;
            this.useOversoldResource = model.useOversoldResource;
            this.userCommand = model.userCommand;
            this.userId = model.userId;
            this.userScript = model.userScript;
            this.userVpc = model.userVpc;
            this.username = model.username;
            this.workingDir = model.workingDir;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CodeSource.
         */
        public Builder codeSource(CodeSource codeSource) {
            this.codeSource = codeSource;
            return this;
        }

        /**
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * ElasticSpec.
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * EnablePreemptibleJob.
         */
        public Builder enablePreemptibleJob(Boolean enablePreemptibleJob) {
            this.enablePreemptibleJob = enablePreemptibleJob;
            return this;
        }

        /**
         * EnabledDebugger.
         */
        public Builder enabledDebugger(Boolean enabledDebugger) {
            this.enabledDebugger = enabledDebugger;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFailedTime.
         */
        public Builder gmtFailedTime(String gmtFailedTime) {
            this.gmtFailedTime = gmtFailedTime;
            return this;
        }

        /**
         * GmtFinishTime.
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * GmtRunningTime.
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * GmtStoppedTime.
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * GmtSubmittedTime.
         */
        public Builder gmtSubmittedTime(String gmtSubmittedTime) {
            this.gmtSubmittedTime = gmtSubmittedTime;
            return this;
        }

        /**
         * GmtSuccessedTime.
         */
        public Builder gmtSuccessedTime(String gmtSuccessedTime) {
            this.gmtSuccessedTime = gmtSuccessedTime;
            return this;
        }

        /**
         * IsDeleted.
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobMaxRunningTimeMinutes.
         */
        public Builder jobMaxRunningTimeMinutes(Long jobMaxRunningTimeMinutes) {
            this.jobMaxRunningTimeMinutes = jobMaxRunningTimeMinutes;
            return this;
        }

        /**
         * JobSpecs.
         */
        public Builder jobSpecs(java.util.List<JobSpec> jobSpecs) {
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeNames.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * Pods.
         */
        public Builder pods(java.util.List<PodItem> pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * RequestCPU.
         */
        public Builder requestCPU(Long requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * RequestGPU.
         */
        public Builder requestGPU(String requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }

        /**
         * RequestMemory.
         */
        public Builder requestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceLevel.
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceQuotaName.
         */
        public Builder resourceQuotaName(String resourceQuotaName) {
            this.resourceQuotaName = resourceQuotaName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RestartTimes.
         */
        public Builder restartTimes(String restartTimes) {
            this.restartTimes = restartTimes;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(JobSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusHistory.
         */
        public Builder statusHistory(java.util.List<StatusTransitionItem> statusHistory) {
            this.statusHistory = statusHistory;
            return this;
        }

        /**
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * SystemEnvs.
         */
        public Builder systemEnvs(java.util.Map<String, String> systemEnvs) {
            this.systemEnvs = systemEnvs;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ThirdpartyLibDir.
         */
        public Builder thirdpartyLibDir(String thirdpartyLibDir) {
            this.thirdpartyLibDir = thirdpartyLibDir;
            return this;
        }

        /**
         * ThirdpartyLibs.
         */
        public Builder thirdpartyLibs(java.util.List<String> thirdpartyLibs) {
            this.thirdpartyLibs = thirdpartyLibs;
            return this;
        }

        /**
         * UseOversoldResource.
         */
        public Builder useOversoldResource(Boolean useOversoldResource) {
            this.useOversoldResource = useOversoldResource;
            return this;
        }

        /**
         * UserCommand.
         */
        public Builder userCommand(String userCommand) {
            this.userCommand = userCommand;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * UserScript.
         */
        public Builder userScript(String userScript) {
            this.userScript = userScript;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * WorkingDir.
         */
        public Builder workingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public JobItem build() {
            return new JobItem(this);
        } 

    } 

    /**
     * 
     * {@link JobItem} extends {@link TeaModel}
     *
     * <p>JobItem</p>
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
             * Branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * CodeSourceId.
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * Commit.
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * MountPath.
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
     * {@link JobItem} extends {@link TeaModel}
     *
     * <p>JobItem</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.mountPath = builder.mountPath;
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

        public static final class Builder {
            private String dataSourceId; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.dataSourceId = model.dataSourceId;
                this.mountPath = model.mountPath;
            } 

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link JobItem} extends {@link TeaModel}
     *
     * <p>JobItem</p>
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
             * DefaultRoute.
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * ExtendedCidrs.
             */
            public Builder extendedCidrs(java.util.List<String> extendedCidrs) {
                this.extendedCidrs = extendedCidrs;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * VpcId.
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
