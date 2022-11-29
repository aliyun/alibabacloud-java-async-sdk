// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateStatus} extends {@link TeaModel}
 *
 * <p>TemplateStatus</p>
 */
public class TemplateStatus extends TeaModel {
    @NameInMap("message")
    private String message;

    @NameInMap("observedGeneration")
    @Validation(required = true)
    private Integer observedGeneration;

    @NameInMap("observedTime")
    private String observedTime;

    @NameInMap("outputs")
    @Validation(required = true)
    private java.util.List < OutputValue > outputs;

    @NameInMap("phase")
    private String phase;

    @NameInMap("variables")
    @Validation(required = true)
    private java.util.List < InputVariable > variables;

    private TemplateStatus(Builder builder) {
        this.message = builder.message;
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.outputs = builder.outputs;
        this.phase = builder.phase;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateStatus create() {
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
     * @return outputs
     */
    public java.util.List < OutputValue > getOutputs() {
        return this.outputs;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return variables
     */
    public java.util.List < InputVariable > getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private String message; 
        private Integer observedGeneration; 
        private String observedTime; 
        private java.util.List < OutputValue > outputs; 
        private String phase; 
        private java.util.List < InputVariable > variables; 

        /**
         * A human-readable message indicating details about why the Template is in this condition.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The most recent generation observed.
         */
        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * Time when the last update of the status is observed.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * The definition of output values of the template parsed from the template content.
         */
        public Builder outputs(java.util.List < OutputValue > outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * A simple, high-level summary of where the Template is in its lifecycle.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * The definition of input variables of the template parsed from the template content.
         */
        public Builder variables(java.util.List < InputVariable > variables) {
            this.variables = variables;
            return this;
        }

        public TemplateStatus build() {
            return new TemplateStatus(this);
        } 

    } 

}
