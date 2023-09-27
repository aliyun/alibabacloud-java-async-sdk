// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Job} extends {@link TeaModel}
 *
 * <p>Job</p>
 */
public class Job extends TeaModel {
    @NameInMap("artifact")
    private Artifact artifact;

    @NameInMap("batchResourceSetting")
    private BatchResourceSetting batchResourceSetting;

    @NameInMap("creator")
    private String creator;

    @NameInMap("creatorName")
    private String creatorName;

    @NameInMap("deploymentId")
    private String deploymentId;

    @NameInMap("deploymentName")
    private String deploymentName;

    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("engineVersion")
    private String engineVersion;

    @NameInMap("executionMode")
    private String executionMode;

    @NameInMap("flinkConf")
    private java.util.Map < String, ? > flinkConf;

    @NameInMap("jobId")
    private String jobId;

    @NameInMap("logging")
    private Logging logging;

    @NameInMap("metric")
    private JobMetric metric;

    @NameInMap("modifier")
    private String modifier;

    @NameInMap("modifierName")
    private String modifierName;

    @NameInMap("namespace")
    private String namespace;

    @NameInMap("restoreStrategy")
    private DeploymentRestoreStrategy restoreStrategy;

    @NameInMap("sessionClusterName")
    private String sessionClusterName;

    @NameInMap("startTime")
    private Long startTime;

    @NameInMap("status")
    private JobStatus status;

    @NameInMap("streamingResourceSetting")
    private StreamingResourceSetting streamingResourceSetting;

    @NameInMap("userFlinkConf")
    private java.util.Map < String, ? > userFlinkConf;

    private Job(Builder builder) {
        this.artifact = builder.artifact;
        this.batchResourceSetting = builder.batchResourceSetting;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentId = builder.deploymentId;
        this.deploymentName = builder.deploymentName;
        this.endTime = builder.endTime;
        this.engineVersion = builder.engineVersion;
        this.executionMode = builder.executionMode;
        this.flinkConf = builder.flinkConf;
        this.jobId = builder.jobId;
        this.logging = builder.logging;
        this.metric = builder.metric;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.namespace = builder.namespace;
        this.restoreStrategy = builder.restoreStrategy;
        this.sessionClusterName = builder.sessionClusterName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.streamingResourceSetting = builder.streamingResourceSetting;
        this.userFlinkConf = builder.userFlinkConf;
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
    public java.util.Map < String, ? > getFlinkConf() {
        return this.flinkConf;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
    public java.util.Map < String, ? > getUserFlinkConf() {
        return this.userFlinkConf;
    }

    public static final class Builder {
        private Artifact artifact; 
        private BatchResourceSetting batchResourceSetting; 
        private String creator; 
        private String creatorName; 
        private String deploymentId; 
        private String deploymentName; 
        private Long endTime; 
        private String engineVersion; 
        private String executionMode; 
        private java.util.Map < String, ? > flinkConf; 
        private String jobId; 
        private Logging logging; 
        private JobMetric metric; 
        private String modifier; 
        private String modifierName; 
        private String namespace; 
        private DeploymentRestoreStrategy restoreStrategy; 
        private String sessionClusterName; 
        private Long startTime; 
        private JobStatus status; 
        private StreamingResourceSetting streamingResourceSetting; 
        private java.util.Map < String, ? > userFlinkConf; 

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
        public Builder flinkConf(java.util.Map < String, ? > flinkConf) {
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
        public Builder userFlinkConf(java.util.Map < String, ? > userFlinkConf) {
            this.userFlinkConf = userFlinkConf;
            return this;
        }

        public Job build() {
            return new Job(this);
        } 

    } 

}
