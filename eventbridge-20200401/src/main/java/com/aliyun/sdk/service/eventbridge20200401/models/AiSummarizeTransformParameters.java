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
 * {@link AiSummarizeTransformParameters} extends {@link TeaModel}
 *
 * <p>AiSummarizeTransformParameters</p>
 */
public class AiSummarizeTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Integer maxLength;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiSummarizeTransformParameters(Builder builder) {
        this.inputField = builder.inputField;
        this.maxLength = builder.maxLength;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiSummarizeTransformParameters create() {
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
     * @return maxLength
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private AiTransformField inputField; 
        private Integer maxLength; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiSummarizeTransformParameters model) {
            this.inputField = model.inputField;
            this.maxLength = model.maxLength;
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
         * <p>The maximum summary length. The value must be a positive integer. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiSummarizeTransformParameters build() {
            return new AiSummarizeTransformParameters(this);
        } 

    } 

}
