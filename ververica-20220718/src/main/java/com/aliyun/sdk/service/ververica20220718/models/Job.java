// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Job} extends {@link TeaModel}
 *
 * <p>Job</p>
 */
public class Job extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifact")
    private Artifact artifact;

    @com.aliyun.core.annotation.NameInMap("batchResourceSetting")
    private BatchResourceSetting batchResourceSetting;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("deploymentName")
    private String deploymentName;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("executionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("flinkConf")
    private java.util.Map<String, ?> flinkConf;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("localVariables")
    private java.util.List<LocalVariable> localVariables;

    @com.aliyun.core.annotation.NameInMap("logging")
    private Logging logging;

    @com.aliyun.core.annotation.NameInMap("metric")
    private JobMetric metric;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private String modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("restoreStrategy")
    private DeploymentRestoreStrategy restoreStrategy;

    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    private String sessionClusterName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private JobStatus status;

    @com.aliyun.core.annotation.NameInMap("streamingResourceSetting")
    private StreamingResourceSetting streamingResourceSetting;

    @com.aliyun.core.annotation.NameInMap("userFlinkConf")
    private java.util.Map<String, ?> userFlinkConf;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private Job(Builder builder) {
        this.artifact = builder.artifact;
        this.batchResourceSetting = builder.batchResourceSetting;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentId = builder.deploymentId;
        this.deploymentName = builder.deploymentName;
        this.endTime = builder.endTime;
        this.engineVersion = builder.engineVersion;
        this.executionMode = builder.executionMode;
        this.flinkConf = builder.flinkConf;
        this.jobId = builder.jobId;
        this.localVariables = builder.localVariables;
        this.logging = builder.logging;
        this.metric = builder.metric;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.namespace = builder.namespace;
        this.restoreStrategy = builder.restoreStrategy;
        this.sessionClusterName = builder.sessionClusterName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.streamingResourceSetting = builder.streamingResourceSetting;
        this.userFlinkConf = builder.userFlinkConf;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Job create() {
        return builder().build();
    }

    /**
     * @return artifact
     */
    public Artifact getArtifact() {
        return this.artifact;
    }

    /**
     * @return batchResourceSetting
     */
    public BatchResourceSetting getBatchResourceSetting() {
        return this.batchResourceSetting;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return deploymentName
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return flinkConf
     */
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return localVariables
     */
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    /**
     * @return logging
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * @return metric
     */
    public JobMetric getMetric() {
        return this.metric;
    }

    /**
     * @return modifiedAt
     */
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return restoreStrategy
     */
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

    /**
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * @return streamingResourceSetting
     */
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

    /**
     * @return userFlinkConf
     */
    public java.util.Map<String, ?> getUserFlinkConf() {
        return this.userFlinkConf;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Artifact artifact; 
        private BatchResourceSetting batchResourceSetting; 
        private String createdAt; 
        private String creator; 
        private String creatorName; 
        private String deploymentId; 
        private String deploymentName; 
        private Long endTime; 
        private String engineVersion; 
        private String executionMode; 
        private java.util.Map<String, ?> flinkConf; 
        private String jobId; 
        private java.util.List<LocalVariable> localVariables; 
        private Logging logging; 
        private JobMetric metric; 
        private String modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String namespace; 
        private DeploymentRestoreStrategy restoreStrategy; 
        private String sessionClusterName; 
        private Long startTime; 
        private JobStatus status; 
        private StreamingResourceSetting streamingResourceSetting; 
        private java.util.Map<String, ?> userFlinkConf; 
        private String workspace; 

        /**
         * artifact.
         */
        public Builder artifact(Artifact artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * batchResourceSetting.
         */
        public Builder batchResourceSetting(BatchResourceSetting batchResourceSetting) {
            this.batchResourceSetting = batchResourceSetting;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * deploymentName.
         */
        public Builder deploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * engineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * executionMode.
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }

        /**
         * flinkConf.
         */
        public Builder flinkConf(java.util.Map<String, ?> flinkConf) {
            this.flinkConf = flinkConf;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * localVariables.
         */
        public Builder localVariables(java.util.List<LocalVariable> localVariables) {
            this.localVariables = localVariables;
            return this;
        }

        /**
         * logging.
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * metric.
         */
        public Builder metric(JobMetric metric) {
            this.metric = metric;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * restoreStrategy.
         */
        public Builder restoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
            this.restoreStrategy = restoreStrategy;
            return this;
        }

        /**
         * sessionClusterName.
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(JobStatus status) {
            this.status = status;
            return this;
        }

        /**
         * streamingResourceSetting.
         */
        public Builder streamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
            this.streamingResourceSetting = streamingResourceSetting;
            return this;
        }

        /**
         * userFlinkConf.
         */
        public Builder userFlinkConf(java.util.Map<String, ?> userFlinkConf) {
            this.userFlinkConf = userFlinkConf;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public Job build() {
            return new Job(this);
        } 

    } 

}
