// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobItem} extends {@link TeaModel}
 *
 * <p>JobItem</p>
 */
public class JobItem extends TeaModel {
    @NameInMap("CodeSource")
    private CodeSource codeSource;

    @NameInMap("DataSources")
    private java.util.List < DataSources> dataSources;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Duration")
    private Long duration;

    @NameInMap("EnabledDebugger")
    private Boolean enabledDebugger;

    @NameInMap("Envs")
    private java.util.Map < String, String > envs;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtFailedTime")
    private String gmtFailedTime;

    @NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @NameInMap("GmtSuccessedTime")
    private String gmtSuccessedTime;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobSpecs")
    private java.util.List < JobSpec > jobSpecs;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("Priority")
    private Integer priority;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceLevel")
    private String resourceLevel;

    @NameInMap("ResourceName")
    private String resourceName;

    @NameInMap("Settings")
    private JobSettings settings;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubStatus")
    private String subStatus;

    @NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @NameInMap("ThirdpartyLibs")
    private java.util.List < String > thirdpartyLibs;

    @NameInMap("UserCommand")
    private String userCommand;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
    private String workspaceName;

    private JobItem(Builder builder) {
        this.codeSource = builder.codeSource;
        this.dataSources = builder.dataSources;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
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
        this.priority = builder.priority;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.resourceId = builder.resourceId;
        this.resourceLevel = builder.resourceLevel;
        this.resourceName = builder.resourceName;
        this.settings = builder.settings;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
        this.thirdpartyLibDir = builder.thirdpartyLibDir;
        this.thirdpartyLibs = builder.thirdpartyLibs;
        this.userCommand = builder.userCommand;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobItem create() {
        return builder().build();
    }

    /**
     * @return codeSource
     */
    public CodeSource getCodeSource() {
        return this.codeSource;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSources> getDataSources() {
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
     * @return enabledDebugger
     */
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    /**
     * @return envs
     */
    public java.util.Map < String, String > getEnvs() {
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
    public java.util.List < JobSpec > getJobSpecs() {
        return this.jobSpecs;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
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
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
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
    public java.util.List < String > getThirdpartyLibs() {
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
        private CodeSource codeSource; 
        private java.util.List < DataSources> dataSources; 
        private String displayName; 
        private Long duration; 
        private Boolean enabledDebugger; 
        private java.util.Map < String, String > envs; 
        private String gmtCreateTime; 
        private String gmtFailedTime; 
        private String gmtFinishTime; 
        private String gmtRunningTime; 
        private String gmtStoppedTime; 
        private String gmtSubmittedTime; 
        private String gmtSuccessedTime; 
        private String jobId; 
        private java.util.List < JobSpec > jobSpecs; 
        private String jobType; 
        private Integer priority; 
        private String reasonCode; 
        private String reasonMessage; 
        private String resourceId; 
        private String resourceLevel; 
        private String resourceName; 
        private JobSettings settings; 
        private String status; 
        private String subStatus; 
        private String thirdpartyLibDir; 
        private java.util.List < String > thirdpartyLibs; 
        private String userCommand; 
        private String userId; 
        private String workspaceId; 
        private String workspaceName; 

        /**
         * CodeSource.
         */
        public Builder codeSource(CodeSource codeSource) {
            this.codeSource = codeSource;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List < DataSources> dataSources) {
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
         * EnabledDebugger.
         */
        public Builder enabledDebugger(Boolean enabledDebugger) {
            this.enabledDebugger = enabledDebugger;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.Map < String, String > envs) {
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobSpecs.
         */
        public Builder jobSpecs(java.util.List < JobSpec > jobSpecs) {
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
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
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
        public Builder thirdpartyLibs(java.util.List < String > thirdpartyLibs) {
            this.thirdpartyLibs = thirdpartyLibs;
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

    public static class CodeSource extends TeaModel {
        @NameInMap("Branch")
        private String branch;

        @NameInMap("CodeSourceId")
        private String codeSourceId;

        @NameInMap("Commit")
        private String commit;

        @NameInMap("MountPath")
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
    public static class DataSources extends TeaModel {
        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("MountPath")
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
}
