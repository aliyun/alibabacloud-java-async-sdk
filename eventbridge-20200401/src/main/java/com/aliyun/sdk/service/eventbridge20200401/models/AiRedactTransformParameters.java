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
 * {@link AiRedactTransformParameters} extends {@link TeaModel}
 *
 * <p>AiRedactTransformParameters</p>
 */
public class AiRedactTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entities")
    private java.util.List<String> entities;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("MaskChar")
    private String maskChar;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiRedactTransformParameters(Builder builder) {
        this.entities = builder.entities;
        this.inputField = builder.inputField;
        this.maskChar = builder.maskChar;
        this.mode = builder.mode;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiRedactTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entities
     */
    public java.util.List<String> getEntities() {
        return this.entities;
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return maskChar
     */
    public String getMaskChar() {
        return this.maskChar;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private java.util.List<String> entities; 
        private AiTransformField inputField; 
        private String maskChar; 
        private String mode; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiRedactTransformParameters model) {
            this.entities = model.entities;
            this.inputField = model.inputField;
            this.maskChar = model.maskChar;
            this.mode = model.mode;
            this.stepName = model.stepName;
        } 

        /**
         * <p>The entity types to identify and mask in the text, such as phone numbers, ID card numbers, and email addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;PHONE&quot;,&quot;ID_CARD&quot;,&quot;EMAIL&quot;]</p>
         */
        public Builder entities(java.util.List<String> entities) {
            this.entities = entities;
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
         * <p>The mask character used in mask mode. Default value: *.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder maskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }

        /**
         * <p>The masking mode. Valid values: mask, replace, and remove.</p>
         * 
         * <strong>example:</strong>
         * <p>mask</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The field name appended to the CloudEvent for output. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>redact_result</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiRedactTransformParameters build() {
            return new AiRedactTransformParameters(this);
        } 

    } 

}
