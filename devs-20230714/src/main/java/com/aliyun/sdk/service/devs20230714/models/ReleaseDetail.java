// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseDetail} extends {@link TeaModel}
 *
 * <p>ReleaseDetail</p>
 */
public class ReleaseDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizStatus")
    private String bizStatus;

    @com.aliyun.core.annotation.NameInMap("envName")
    private String envName;

    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("gitEventSnapshot")
    private GitEventSnapshot gitEventSnapshot;

    @com.aliyun.core.annotation.NameInMap("latestTaskExecError")
    private TaskExecError latestTaskExecError;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("pipelineTriggerEventName")
    private String pipelineTriggerEventName;

    @com.aliyun.core.annotation.NameInMap("releaseOutputs")
    private java.util.Map < String, ? > releaseOutputs;

    @com.aliyun.core.annotation.NameInMap("repositorySnapshot")
    private RepositorySpec repositorySnapshot;

    @com.aliyun.core.annotation.NameInMap("templateConfigSnapshot")
    private TemplateConfig templateConfigSnapshot;

    private ReleaseDetail(Builder builder) {
        this.bizStatus = builder.bizStatus;
        this.envName = builder.envName;
        this.finishedTime = builder.finishedTime;
        this.gitEventSnapshot = builder.gitEventSnapshot;
        this.latestTaskExecError = builder.latestTaskExecError;
        this.message = builder.message;
        this.pipelineName = builder.pipelineName;
        this.pipelineTriggerEventName = builder.pipelineTriggerEventName;
        this.releaseOutputs = builder.releaseOutputs;
        this.repositorySnapshot = builder.repositorySnapshot;
        this.templateConfigSnapshot = builder.templateConfigSnapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseDetail create() {
        return builder().build();
    }

    /**
     * @return bizStatus
     */
    public String getBizStatus() {
        return this.bizStatus;
    }

    /**
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
    }

    /**
     * @return finishedTime
     */
    public String getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return gitEventSnapshot
     */
    public GitEventSnapshot getGitEventSnapshot() {
        return this.gitEventSnapshot;
    }

    /**
     * @return latestTaskExecError
     */
    public TaskExecError getLatestTaskExecError() {
        return this.latestTaskExecError;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return pipelineTriggerEventName
     */
    public String getPipelineTriggerEventName() {
        return this.pipelineTriggerEventName;
    }

    /**
     * @return releaseOutputs
     */
    public java.util.Map < String, ? > getReleaseOutputs() {
        return this.releaseOutputs;
    }

    /**
     * @return repositorySnapshot
     */
    public RepositorySpec getRepositorySnapshot() {
        return this.repositorySnapshot;
    }

    /**
     * @return templateConfigSnapshot
     */
    public TemplateConfig getTemplateConfigSnapshot() {
        return this.templateConfigSnapshot;
    }

    public static final class Builder {
        private String bizStatus; 
        private String envName; 
        private String finishedTime; 
        private GitEventSnapshot gitEventSnapshot; 
        private TaskExecError latestTaskExecError; 
        private String message; 
        private String pipelineName; 
        private String pipelineTriggerEventName; 
        private java.util.Map < String, ? > releaseOutputs; 
        private RepositorySpec repositorySnapshot; 
        private TemplateConfig templateConfigSnapshot; 

        /**
         * bizStatus.
         */
        public Builder bizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }

        /**
         * envName.
         */
        public Builder envName(String envName) {
            this.envName = envName;
            return this;
        }

        /**
         * finishedTime.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * gitEventSnapshot.
         */
        public Builder gitEventSnapshot(GitEventSnapshot gitEventSnapshot) {
            this.gitEventSnapshot = gitEventSnapshot;
            return this;
        }

        /**
         * latestTaskExecError.
         */
        public Builder latestTaskExecError(TaskExecError latestTaskExecError) {
            this.latestTaskExecError = latestTaskExecError;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * pipelineTriggerEventName.
         */
        public Builder pipelineTriggerEventName(String pipelineTriggerEventName) {
            this.pipelineTriggerEventName = pipelineTriggerEventName;
            return this;
        }

        /**
         * releaseOutputs.
         */
        public Builder releaseOutputs(java.util.Map < String, ? > releaseOutputs) {
            this.releaseOutputs = releaseOutputs;
            return this;
        }

        /**
         * repositorySnapshot.
         */
        public Builder repositorySnapshot(RepositorySpec repositorySnapshot) {
            this.repositorySnapshot = repositorySnapshot;
            return this;
        }

        /**
         * templateConfigSnapshot.
         */
        public Builder templateConfigSnapshot(TemplateConfig templateConfigSnapshot) {
            this.templateConfigSnapshot = templateConfigSnapshot;
            return this;
        }

        public ReleaseDetail build() {
            return new ReleaseDetail(this);
        } 

    } 

}
