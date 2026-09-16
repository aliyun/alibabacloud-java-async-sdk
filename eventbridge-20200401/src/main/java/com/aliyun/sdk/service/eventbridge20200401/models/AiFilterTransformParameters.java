// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AiFilterTransformParameters} extends {@link TeaModel}
 *
 * <p>AiFilterTransformParameters</p>
 */
public class AiFilterTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("OnMismatch")
    private String onMismatch;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiFilterTransformParameters(Builder builder) {
        this.condition = builder.condition;
        this.inputField = builder.inputField;
        this.onMismatch = builder.onMismatch;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiFilterTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return onMismatch
     */
    public String getOnMismatch() {
        return this.onMismatch;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private String condition; 
        private AiTransformField inputField; 
        private String onMismatch; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiFilterTransformParameters model) {
            this.condition = model.condition;
            this.inputField = model.inputField;
            this.onMismatch = model.onMismatch;
            this.stepName = model.stepName;
        } 

        /**
         * <p>The retention condition described in natural language. The model uses this condition to determine whether an event matches.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only content related to user complaints or refunds</p>
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * <p>The input text field.</p>
         */
        public Builder inputField(AiTransformField inputField) {
            this.inputField = inputField;
            return this;
        }

        /**
         * <p>The behavior when a mismatch occurs. Valid values: discard (default): discards the event. forward: forwards the event as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>discard</p>
         */
        public Builder onMismatch(String onMismatch) {
            this.onMismatch = onMismatch;
            return this;
        }

        /**
         * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>filter_result</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiFilterTransformParameters build() {
            return new AiFilterTransformParameters(this);
        } 

    } 

}
