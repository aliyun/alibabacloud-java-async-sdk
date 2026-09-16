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
 * {@link AiExtractTransformParameters} extends {@link TeaModel}
 *
 * <p>AiExtractTransformParameters</p>
 */
public class AiExtractTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExtractSchema")
    private String extractSchema;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiExtractTransformParameters(Builder builder) {
        this.extractSchema = builder.extractSchema;
        this.inputField = builder.inputField;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiExtractTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extractSchema
     */
    public String getExtractSchema() {
        return this.extractSchema;
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
        private String extractSchema; 
        private AiTransformField inputField; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiExtractTransformParameters model) {
            this.extractSchema = model.extractSchema;
            this.inputField = model.inputField;
            this.stepName = model.stepName;
        } 

        /**
         * <p>The JSON Schema of the extraction results. Pass a serialized JSON object string or JSON Schema text.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;orderId&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;amount&quot;:{&quot;type&quot;:&quot;number&quot;}}}</p>
         */
        public Builder extractSchema(String extractSchema) {
            this.extractSchema = extractSchema;
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
         * <p>extract_result</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiExtractTransformParameters build() {
            return new AiExtractTransformParameters(this);
        } 

    } 

}
