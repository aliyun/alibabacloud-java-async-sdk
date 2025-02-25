// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InfraStackStatus} extends {@link TeaModel}
 *
 * <p>InfraStackStatus</p>
 */
public class InfraStackStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Integer observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("resourceState")
    private InfraStackResourceState resourceState;

    @com.aliyun.core.annotation.NameInMap("templateOutputs")
    private java.util.Map < String, ? > templateOutputs;

    @com.aliyun.core.annotation.NameInMap("templateStatus")
    private TemplateStatus templateStatus;

    private InfraStackStatus(Builder builder) {
        this.message = builder.message;
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.phase = builder.phase;
        this.resourceState = builder.resourceState;
        this.templateOutputs = builder.templateOutputs;
        this.templateStatus = builder.templateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InfraStackStatus create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return observedGeneration
     */
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return resourceState
     */
    public InfraStackResourceState getResourceState() {
        return this.resourceState;
    }

    /**
     * @return templateOutputs
     */
    public java.util.Map < String, ? > getTemplateOutputs() {
        return this.templateOutputs;
    }

    /**
     * @return templateStatus
     */
    public TemplateStatus getTemplateStatus() {
        return this.templateStatus;
    }

    public static final class Builder {
        private String message; 
        private Integer observedGeneration; 
        private String observedTime; 
        private String phase; 
        private InfraStackResourceState resourceState; 
        private java.util.Map < String, ? > templateOutputs; 
        private TemplateStatus templateStatus; 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * observedGeneration.
         */
        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * observedTime.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * resourceState.
         */
        public Builder resourceState(InfraStackResourceState resourceState) {
            this.resourceState = resourceState;
            return this;
        }

        /**
         * templateOutputs.
         */
        public Builder templateOutputs(java.util.Map < String, ? > templateOutputs) {
            this.templateOutputs = templateOutputs;
            return this;
        }

        /**
         * templateStatus.
         */
        public Builder templateStatus(TemplateStatus templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        public InfraStackStatus build() {
            return new InfraStackStatus(this);
        } 

    } 

    public static class TemplateStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("outputs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < TerraformOutputValue > outputs;

        @com.aliyun.core.annotation.NameInMap("variables")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < TerraformInputVariable > variables;

        private TemplateStatus(Builder builder) {
            this.outputs = builder.outputs;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateStatus create() {
            return builder().build();
        }

        /**
         * @return outputs
         */
        public java.util.List < TerraformOutputValue > getOutputs() {
            return this.outputs;
        }

        /**
         * @return variables
         */
        public java.util.List < TerraformInputVariable > getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List < TerraformOutputValue > outputs; 
            private java.util.List < TerraformInputVariable > variables; 

            /**
             * outputs.
             */
            public Builder outputs(java.util.List < TerraformOutputValue > outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.List < TerraformInputVariable > variables) {
                this.variables = variables;
                return this;
            }

            public TemplateStatus build() {
                return new TemplateStatus(this);
            } 

        } 

    }
}
