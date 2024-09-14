// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduledPlanExecutedInfo} extends {@link TeaModel}
 *
 * <p>ScheduledPlanExecutedInfo</p>
 */
public class ScheduledPlanExecutedInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("jobResourceUpgradingId")
    private String jobResourceUpgradingId;

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

    @com.aliyun.core.annotation.NameInMap("origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("originJobId")
    private String originJobId;

    @com.aliyun.core.annotation.NameInMap("status")
    private ScheduledPlanExecutedStatus status;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ScheduledPlanExecutedInfo(Builder builder) {
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentId = builder.deploymentId;
        this.jobResourceUpgradingId = builder.jobResourceUpgradingId;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.origin = builder.origin;
        this.originJobId = builder.originJobId;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledPlanExecutedInfo create() {
        return builder().build();
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
     * @return jobResourceUpgradingId
     */
    public String getJobResourceUpgradingId() {
        return this.jobResourceUpgradingId;
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
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return originJobId
     */
    public String getOriginJobId() {
        return this.originJobId;
    }

    /**
     * @return status
     */
    public ScheduledPlanExecutedStatus getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createdAt; 
        private String creator; 
        private String creatorName; 
        private String deploymentId; 
        private String jobResourceUpgradingId; 
        private String modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private String origin; 
        private String originJobId; 
        private ScheduledPlanExecutedStatus status; 
        private String workspace; 

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
         * jobResourceUpgradingId.
         */
        public Builder jobResourceUpgradingId(String jobResourceUpgradingId) {
            this.jobResourceUpgradingId = jobResourceUpgradingId;
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
         * origin.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * originJobId.
         */
        public Builder originJobId(String originJobId) {
            this.originJobId = originJobId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(ScheduledPlanExecutedStatus status) {
            this.status = status;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public ScheduledPlanExecutedInfo build() {
            return new ScheduledPlanExecutedInfo(this);
        } 

    } 

}
