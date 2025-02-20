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
 * {@link DeploymentDraft} extends {@link TeaModel}
 *
 * <p>DeploymentDraft</p>
 */
public class DeploymentDraft extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifact")
    private Artifact artifact;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("deploymentDraftId")
    private String deploymentDraftId;

    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("executionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.NameInMap("localVariables")
    private java.util.List<LocalVariable> localVariables;

    @com.aliyun.core.annotation.NameInMap("lock")
    private Lock lock;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.NameInMap("referencedDeploymentId")
    private String referencedDeploymentId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private DeploymentDraft(Builder builder) {
        this.artifact = builder.artifact;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentDraftId = builder.deploymentDraftId;
        this.engineVersion = builder.engineVersion;
        this.executionMode = builder.executionMode;
        this.labels = builder.labels;
        this.localVariables = builder.localVariables;
        this.lock = builder.lock;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentId = builder.parentId;
        this.referencedDeploymentId = builder.referencedDeploymentId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentDraft create() {
        return builder().build();
    }

    /**
     * @return artifact
     */
    public Artifact getArtifact() {
        return this.artifact;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
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
     * @return deploymentDraftId
     */
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
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
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return localVariables
     */
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    /**
     * @return lock
     */
    public Lock getLock() {
        return this.lock;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
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
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return referencedDeploymentId
     */
    public String getReferencedDeploymentId() {
        return this.referencedDeploymentId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Artifact artifact; 
        private Long createdAt; 
        private String creator; 
        private String creatorName; 
        private String deploymentDraftId; 
        private String engineVersion; 
        private String executionMode; 
        private java.util.Map<String, ?> labels; 
        private java.util.List<LocalVariable> localVariables; 
        private Lock lock; 
        private Long modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private String parentId; 
        private String referencedDeploymentId; 
        private String workspace; 

        /**
         * artifact.
         */
        public Builder artifact(Artifact artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
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
         * deploymentDraftId.
         */
        public Builder deploymentDraftId(String deploymentDraftId) {
            this.deploymentDraftId = deploymentDraftId;
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
         * labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            this.labels = labels;
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
         * lock.
         */
        public Builder lock(Lock lock) {
            this.lock = lock;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(Long modifiedAt) {
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
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * referencedDeploymentId.
         */
        public Builder referencedDeploymentId(String referencedDeploymentId) {
            this.referencedDeploymentId = referencedDeploymentId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public DeploymentDraft build() {
            return new DeploymentDraft(this);
        } 

    } 

}
