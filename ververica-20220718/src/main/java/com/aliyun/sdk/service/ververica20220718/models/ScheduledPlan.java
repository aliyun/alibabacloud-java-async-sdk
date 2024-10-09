// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScheduledPlan} extends {@link TeaModel}
 *
 * <p>ScheduledPlan</p>
 */
public class ScheduledPlan extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

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

    @com.aliyun.core.annotation.NameInMap("periodicSchedulingPolicies")
    private java.util.List < PeriodicSchedulingPolicy > periodicSchedulingPolicies;

    @com.aliyun.core.annotation.NameInMap("scheduledPlanId")
    private String scheduledPlanId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedByUser")
    private Boolean updatedByUser;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ScheduledPlan(Builder builder) {
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentId = builder.deploymentId;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.origin = builder.origin;
        this.periodicSchedulingPolicies = builder.periodicSchedulingPolicies;
        this.scheduledPlanId = builder.scheduledPlanId;
        this.status = builder.status;
        this.updatedByUser = builder.updatedByUser;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledPlan create() {
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
     * @return periodicSchedulingPolicies
     */
    public java.util.List < PeriodicSchedulingPolicy > getPeriodicSchedulingPolicies() {
        return this.periodicSchedulingPolicies;
    }

    /**
     * @return scheduledPlanId
     */
    public String getScheduledPlanId() {
        return this.scheduledPlanId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedByUser
     */
    public Boolean getUpdatedByUser() {
        return this.updatedByUser;
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
        private String modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private String origin; 
        private java.util.List < PeriodicSchedulingPolicy > periodicSchedulingPolicies; 
        private String scheduledPlanId; 
        private String status; 
        private Boolean updatedByUser; 
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
         * periodicSchedulingPolicies.
         */
        public Builder periodicSchedulingPolicies(java.util.List < PeriodicSchedulingPolicy > periodicSchedulingPolicies) {
            this.periodicSchedulingPolicies = periodicSchedulingPolicies;
            return this;
        }

        /**
         * scheduledPlanId.
         */
        public Builder scheduledPlanId(String scheduledPlanId) {
            this.scheduledPlanId = scheduledPlanId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updatedByUser.
         */
        public Builder updatedByUser(Boolean updatedByUser) {
            this.updatedByUser = updatedByUser;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public ScheduledPlan build() {
            return new ScheduledPlan(this);
        } 

    } 

}
