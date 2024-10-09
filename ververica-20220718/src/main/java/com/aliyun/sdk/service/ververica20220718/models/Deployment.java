// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Deployment} extends {@link TeaModel}
 *
 * <p>Deployment</p>
 */
public class Deployment extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("deploymentHasChanged")
    private Boolean deploymentHasChanged;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("deploymentTarget")
    private BriefDeploymentTarget deploymentTarget;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("executionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("flinkConf")
    private java.util.Map < String, ? > flinkConf;

    @com.aliyun.core.annotation.NameInMap("jobSummary")
    private JobSummary jobSummary;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map < String, ? > labels;

    @com.aliyun.core.annotation.NameInMap("localVariables")
    private java.util.List < LocalVariable > localVariables;

    @com.aliyun.core.annotation.NameInMap("logging")
    private Logging logging;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private String modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("referencedDeploymentDraftId")
    private String referencedDeploymentDraftId;

    @com.aliyun.core.annotation.NameInMap("streamingResourceSetting")
    private StreamingResourceSetting streamingResourceSetting;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private Deployment(Builder builder) {
        this.artifact = builder.artifact;
        this.batchResourceSetting = builder.batchResourceSetting;
        this.createdAt = builder.createdAt;
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
        this.labels = builder.labels;
        this.localVariables = builder.localVariables;
        this.logging = builder.logging;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.referencedDeploymentDraftId = builder.referencedDeploymentDraftId;
        this.streamingResourceSetting = builder.streamingResourceSetting;
        this.workspace = builder.workspace;
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
     * @return labels
     */
    public java.util.Map < String, ? > getLabels() {
        return this.labels;
    }

    /**
     * @return localVariables
     */
    public java.util.List < LocalVariable > getLocalVariables() {
        return this.localVariables;
    }

    /**
     * @return logging
     */
    public Logging getLogging() {
        return this.logging;
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
     * @return referencedDeploymentDraftId
     */
    public String getReferencedDeploymentDraftId() {
        return this.referencedDeploymentDraftId;
    }

    /**
     * @return streamingResourceSetting
     */
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
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
        private Boolean deploymentHasChanged; 
        private String deploymentId; 
        private BriefDeploymentTarget deploymentTarget; 
        private String description; 
        private String engineVersion; 
        private String executionMode; 
        private java.util.Map < String, ? > flinkConf; 
        private JobSummary jobSummary; 
        private java.util.Map < String, ? > labels; 
        private java.util.List < LocalVariable > localVariables; 
        private Logging logging; 
        private String modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private String referencedDeploymentDraftId; 
        private StreamingResourceSetting streamingResourceSetting; 
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
         * labels.
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * localVariables.
         */
        public Builder localVariables(java.util.List < LocalVariable > localVariables) {
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
         * referencedDeploymentDraftId.
         */
        public Builder referencedDeploymentDraftId(String referencedDeploymentDraftId) {
            this.referencedDeploymentDraftId = referencedDeploymentDraftId;
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
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public Deployment build() {
            return new Deployment(this);
        } 

    } 

}
