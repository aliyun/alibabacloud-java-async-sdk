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
 * {@link AiTranslateTransformParameters} extends {@link TeaModel}
 *
 * <p>AiTranslateTransformParameters</p>
 */
public class AiTranslateTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    private AiTranslateTransformParameters(Builder builder) {
        this.inputField = builder.inputField;
        this.sourceLanguage = builder.sourceLanguage;
        this.stepName = builder.stepName;
        this.targetLanguage = builder.targetLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTranslateTransformParameters create() {
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
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public static final class Builder {
        private AiTransformField inputField; 
        private String sourceLanguage; 
        private String stepName; 
        private String targetLanguage; 

        private Builder() {
        } 

        private Builder(AiTranslateTransformParameters model) {
            this.inputField = model.inputField;
            this.sourceLanguage = model.sourceLanguage;
            this.stepName = model.stepName;
            this.targetLanguage = model.targetLanguage;
        } 

        /**
         * <p>The input text field.</p>
         */
        public Builder inputField(AiTransformField inputField) {
            this.inputField = inputField;
            return this;
        }

        /**
         * <p>The source language. If left empty, the language is automatically detected.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The field name attached to the CloudEvent output. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>translation</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * <p>The target language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }

        public AiTranslateTransformParameters build() {
            return new AiTranslateTransformParameters(this);
        } 

    } 

}
