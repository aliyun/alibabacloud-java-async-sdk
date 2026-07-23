// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineBuildResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineBuildResponseBody</p>
 */
public class GetRoutineBuildResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetsDirectory")
    private String assetsDirectory;

    @com.aliyun.core.annotation.NameInMap("Branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("BuildCommand")
    private String buildCommand;

    @com.aliyun.core.annotation.NameInMap("CommitId")
    private String commitId;

    @com.aliyun.core.annotation.NameInMap("CommitMessage")
    private String commitMessage;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("GitAccountId")
    private Long gitAccountId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("InstallCommand")
    private String installCommand;

    @com.aliyun.core.annotation.NameInMap("IsPrivate")
    private Boolean isPrivate;

    @com.aliyun.core.annotation.NameInMap("NodeVersion")
    private String nodeVersion;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private Long pipelineId;

    @com.aliyun.core.annotation.NameInMap("PipelineRunId")
    private Long pipelineRunId;

    @com.aliyun.core.annotation.NameInMap("ProductionBranch")
    private String productionBranch;

    @com.aliyun.core.annotation.NameInMap("Repository")
    private String repository;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private String rootDirectory;

    @com.aliyun.core.annotation.NameInMap("RoutineEntry")
    private String routineEntry;

    @com.aliyun.core.annotation.NameInMap("RoutineName")
    private String routineName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetRoutineBuildResponseBody(Builder builder) {
        this.assetsDirectory = builder.assetsDirectory;
        this.branch = builder.branch;
        this.buildCommand = builder.buildCommand;
        this.commitId = builder.commitId;
        this.commitMessage = builder.commitMessage;
        this.createTime = builder.createTime;
        this.environmentVariables = builder.environmentVariables;
        this.gitAccountId = builder.gitAccountId;
        this.id = builder.id;
        this.installCommand = builder.installCommand;
        this.isPrivate = builder.isPrivate;
        this.nodeVersion = builder.nodeVersion;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
        this.productionBranch = builder.productionBranch;
        this.repository = builder.repository;
        this.requestId = builder.requestId;
        this.rootDirectory = builder.rootDirectory;
        this.routineEntry = builder.routineEntry;
        this.routineName = builder.routineName;
        this.status = builder.status;
        this.templateName = builder.templateName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineBuildResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsDirectory
     */
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return buildCommand
     */
    public String getBuildCommand() {
        return this.buildCommand;
    }

    /**
     * @return commitId
     */
    public String getCommitId() {
        return this.commitId;
    }

    /**
     * @return commitMessage
     */
    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return gitAccountId
     */
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return installCommand
     */
    public String getInstallCommand() {
        return this.installCommand;
    }

    /**
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    /**
     * @return nodeVersion
     */
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return productionBranch
     */
    public String getProductionBranch() {
        return this.productionBranch;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return routineEntry
     */
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    /**
     * @return routineName
     */
    public String getRoutineName() {
        return this.routineName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String assetsDirectory; 
        private String branch; 
        private String buildCommand; 
        private String commitId; 
        private String commitMessage; 
        private String createTime; 
        private java.util.Map<String, String> environmentVariables; 
        private Long gitAccountId; 
        private Long id; 
        private String installCommand; 
        private Boolean isPrivate; 
        private String nodeVersion; 
        private Long pipelineId; 
        private Long pipelineRunId; 
        private String productionBranch; 
        private String repository; 
        private String requestId; 
        private String rootDirectory; 
        private String routineEntry; 
        private String routineName; 
        private String status; 
        private String templateName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetRoutineBuildResponseBody model) {
            this.assetsDirectory = model.assetsDirectory;
            this.branch = model.branch;
            this.buildCommand = model.buildCommand;
            this.commitId = model.commitId;
            this.commitMessage = model.commitMessage;
            this.createTime = model.createTime;
            this.environmentVariables = model.environmentVariables;
            this.gitAccountId = model.gitAccountId;
            this.id = model.id;
            this.installCommand = model.installCommand;
            this.isPrivate = model.isPrivate;
            this.nodeVersion = model.nodeVersion;
            this.pipelineId = model.pipelineId;
            this.pipelineRunId = model.pipelineRunId;
            this.productionBranch = model.productionBranch;
            this.repository = model.repository;
            this.requestId = model.requestId;
            this.rootDirectory = model.rootDirectory;
            this.routineEntry = model.routineEntry;
            this.routineName = model.routineName;
            this.status = model.status;
            this.templateName = model.templateName;
            this.updateTime = model.updateTime;
        } 

        /**
         * AssetsDirectory.
         */
        public Builder assetsDirectory(String assetsDirectory) {
            this.assetsDirectory = assetsDirectory;
            return this;
        }

        /**
         * Branch.
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * BuildCommand.
         */
        public Builder buildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }

        /**
         * CommitId.
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            return this;
        }

        /**
         * CommitMessage.
         */
        public Builder commitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EnvironmentVariables.
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * GitAccountId.
         */
        public Builder gitAccountId(Long gitAccountId) {
            this.gitAccountId = gitAccountId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * InstallCommand.
         */
        public Builder installCommand(String installCommand) {
            this.installCommand = installCommand;
            return this;
        }

        /**
         * IsPrivate.
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        /**
         * NodeVersion.
         */
        public Builder nodeVersion(String nodeVersion) {
            this.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * PipelineRunId.
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * ProductionBranch.
         */
        public Builder productionBranch(String productionBranch) {
            this.productionBranch = productionBranch;
            return this;
        }

        /**
         * Repository.
         */
        public Builder repository(String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootDirectory.
         */
        public Builder rootDirectory(String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * RoutineEntry.
         */
        public Builder routineEntry(String routineEntry) {
            this.routineEntry = routineEntry;
            return this;
        }

        /**
         * RoutineName.
         */
        public Builder routineName(String routineName) {
            this.routineName = routineName;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetRoutineBuildResponseBody build() {
            return new GetRoutineBuildResponseBody(this);
        } 

    } 

}
