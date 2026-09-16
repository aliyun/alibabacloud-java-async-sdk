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
 * {@link AiClassifyTransformParameters} extends {@link TeaModel}
 *
 * <p>AiClassifyTransformParameters</p>
 */
public class AiClassifyTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("Instruction")
    private String instruction;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<String> labels;

    @com.aliyun.core.annotation.NameInMap("OutputMode")
    private String outputMode;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiClassifyTransformParameters(Builder builder) {
        this.inputField = builder.inputField;
        this.instruction = builder.instruction;
        this.labels = builder.labels;
        this.outputMode = builder.outputMode;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiClassifyTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return instruction
     */
    public String getInstruction() {
        return this.instruction;
    }

    /**
     * @return labels
     */
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    /**
     * @return outputMode
     */
    public String getOutputMode() {
        return this.outputMode;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private AiTransformField inputField; 
        private String instruction; 
        private java.util.List<String> labels; 
        private String outputMode; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiClassifyTransformParameters model) {
            this.inputField = model.inputField;
            this.instruction = model.instruction;
            this.labels = model.labels;
            this.outputMode = model.outputMode;
            this.stepName = model.stepName;
        } 

        /**
         * <p>The input text field.</p>
         */
        public Builder inputField(AiTransformField inputField) {
            this.inputField = inputField;
            return this;
        }

        /**
         * <p>The classification constraints provided to the model, such as priority rules or how to categorize uncertain cases. If left empty, classification is performed based on Labels only.</p>
         * 
         * <strong>example:</strong>
         * <p>Classify as bug when crash or exception is mentioned, classify as other when uncertain</p>
         */
        public Builder instruction(String instruction) {
            this.instruction = instruction;
            return this;
        }

        /**
         * <p>The candidate classification labels. The classification result must fall within this list. Specify at least two labels.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;bug&quot;,&quot;feature&quot;,&quot;question&quot;,&quot;other&quot;]</p>
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The output mode. Valid values: single: single-label. multi: multi-label. Default value: single.</p>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder outputMode(String outputMode) {
            this.outputMode = outputMode;
            return this;
        }

        /**
         * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>classify_result</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiClassifyTransformParameters build() {
            return new AiClassifyTransformParameters(this);
        } 

    } 

}
