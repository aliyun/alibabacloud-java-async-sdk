// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Deployment} extends {@link TeaModel}
 *
 * <p>Deployment</p>
 */
public class Deployment extends TeaModel {
    @NameInMap("artifact")
    private Artifact artifact;

    @NameInMap("batchResourceSetting")
    private BatchResourceSetting batchResourceSetting;

    @NameInMap("creator")
    private String creator;

    @NameInMap("creatorName")
    private String creatorName;

    @NameInMap("deploymentHasChanged")
    private Boolean deploymentHasChanged;

    @NameInMap("deploymentId")
    private String deploymentId;

    @NameInMap("deploymentTarget")
    private BriefDeploymentTarget deploymentTarget;

    @NameInMap("description")
    private String description;

    @NameInMap("engineVersion")
    private String engineVersion;

    @NameInMap("executionMode")
    private String executionMode;

    @NameInMap("flinkConf")
    private java.util.Map < String, ? > flinkConf;

    @NameInMap("jobSummary")
    private JobSummary jobSummary;

    @NameInMap("logging")
    private Logging logging;

    @NameInMap("modifier")
    private String modifier;

    @NameInMap("modifierName")
    private String modifierName;

    @NameInMap("name")
    private String name;

    @NameInMap("namespace")
    private String namespace;

    @NameInMap("streamingResourceSetting")
    private StreamingResourceSetting streamingResourceSetting;

    private Deployment(Builder builder) {
        this.artifact = builder.artifact;
        this.batchResourceSetting = builder.batchResourceSetting;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentHasChanged = builder.deploymentHasChanged;
        this.deploymentId = builder.deploymentId;
        this.deploymentTarget = builder.deploymentTarget;
        this.description = builder.description;
        this.engineVersion = builder.engineVersion;
        this.executionMode = builder.executionMode;
        this.flinkConf = builder.flinkConf;
        this.jobSummary = builder.jobSummary;
        this.logging = builder.logging;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.streamingResourceSetting = builder.streamingResourceSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Deployment create() {
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
     * @return deploymentHasChanged
     */
    public Boolean getDeploymentHasChanged() {
        return this.deploymentHasChanged;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return deploymentTarget
     */
    public BriefDeploymentTarget getDeploymentTarget() {
        return this.deploymentTarget;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return jobSummary
     */
    public JobSummary getJobSummary() {
        return this.jobSummary;
    }

    /**
     * @return logging
     */
    public Logging getLogging() {
        return this.logging;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return streamingResourceSetting
     */
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

    public static final class Builder {
        private Artifact artifact; 
        private BatchResourceSetting batchResourceSetting; 
        private String creator; 
        private String creatorName; 
        private Boolean deploymentHasChanged; 
        private String deploymentId; 
        private BriefDeploymentTarget deploymentTarget; 
        private String description; 
        private String engineVersion; 
        private String executionMode; 
        private java.util.Map < String, ? > flinkConf; 
        private JobSummary jobSummary; 
        private Logging logging; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private StreamingResourceSetting streamingResourceSetting; 

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
         * deploymentHasChanged.
         */
        public Builder deploymentHasChanged(Boolean deploymentHasChanged) {
            this.deploymentHasChanged = deploymentHasChanged;
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
         * deploymentTarget.
         */
        public Builder deploymentTarget(BriefDeploymentTarget deploymentTarget) {
            this.deploymentTarget = deploymentTarget;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * jobSummary.
         */
        public Builder jobSummary(JobSummary jobSummary) {
            this.jobSummary = jobSummary;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * streamingResourceSetting.
         */
        public Builder streamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
            this.streamingResourceSetting = streamingResourceSetting;
            return this;
        }

        public Deployment build() {
            return new Deployment(this);
        } 

    } 

}
