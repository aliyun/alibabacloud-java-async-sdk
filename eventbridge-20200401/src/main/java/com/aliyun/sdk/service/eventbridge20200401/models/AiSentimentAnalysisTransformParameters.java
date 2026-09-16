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
 * {@link AiSentimentAnalysisTransformParameters} extends {@link TeaModel}
 *
 * <p>AiSentimentAnalysisTransformParameters</p>
 */
public class AiSentimentAnalysisTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aspects")
    private java.util.List<String> aspects;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiSentimentAnalysisTransformParameters(Builder builder) {
        this.aspects = builder.aspects;
        this.inputField = builder.inputField;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiSentimentAnalysisTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aspects
     */
    public java.util.List<String> getAspects() {
        return this.aspects;
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private java.util.List<String> aspects; 
        private AiTransformField inputField; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiSentimentAnalysisTransformParameters model) {
            this.aspects = model.aspects;
            this.inputField = model.inputField;
            this.stepName = model.stepName;
        } 

        /**
         * <p>Performs emotion analysis on each specified aspect separately. If left empty, performs overall emotion analysis on the entire text.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;price&quot;,&quot;logistics&quot;,&quot;customer service&quot;]</p>
         */
        public Builder aspects(java.util.List<String> aspects) {
            this.aspects = aspects;
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
         * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>sentiment</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiSentimentAnalysisTransformParameters build() {
            return new AiSentimentAnalysisTransformParameters(this);
        } 

    } 

}
