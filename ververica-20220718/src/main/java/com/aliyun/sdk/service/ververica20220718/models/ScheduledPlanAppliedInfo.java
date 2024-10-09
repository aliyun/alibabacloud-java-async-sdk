// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScheduledPlanAppliedInfo} extends {@link TeaModel}
 *
 * <p>ScheduledPlanAppliedInfo</p>
 */
public class ScheduledPlanAppliedInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("expectedState")
    private String expectedState;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private String modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("scheduledPlanId")
    private String scheduledPlanId;

    @com.aliyun.core.annotation.NameInMap("scheduledPlanName")
    private String scheduledPlanName;

    @com.aliyun.core.annotation.NameInMap("statusState")
    private String statusState;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ScheduledPlanAppliedInfo(Builder builder) {
        this.deploymentId = builder.deploymentId;
        this.expectedState = builder.expectedState;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.namespace = builder.namespace;
        this.scheduledPlanId = builder.scheduledPlanId;
        this.scheduledPlanName = builder.scheduledPlanName;
        this.statusState = builder.statusState;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledPlanAppliedInfo create() {
        return builder().build();
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return expectedState
     */
    public String getExpectedState() {
        return this.expectedState;
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
     * @return scheduledPlanId
     */
    public String getScheduledPlanId() {
        return this.scheduledPlanId;
    }

    /**
     * @return scheduledPlanName
     */
    public String getScheduledPlanName() {
        return this.scheduledPlanName;
    }

    /**
     * @return statusState
     */
    public String getStatusState() {
        return this.statusState;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String deploymentId; 
        private String expectedState; 
        private String modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String namespace; 
        private String scheduledPlanId; 
        private String scheduledPlanName; 
        private String statusState; 
        private String workspace; 

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * expectedState.
         */
        public Builder expectedState(String expectedState) {
            this.expectedState = expectedState;
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
         * scheduledPlanId.
         */
        public Builder scheduledPlanId(String scheduledPlanId) {
            this.scheduledPlanId = scheduledPlanId;
            return this;
        }

        /**
         * scheduledPlanName.
         */
        public Builder scheduledPlanName(String scheduledPlanName) {
            this.scheduledPlanName = scheduledPlanName;
            return this;
        }

        /**
         * statusState.
         */
        public Builder statusState(String statusState) {
            this.statusState = statusState;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public ScheduledPlanAppliedInfo build() {
            return new ScheduledPlanAppliedInfo(this);
        } 

    } 

}
