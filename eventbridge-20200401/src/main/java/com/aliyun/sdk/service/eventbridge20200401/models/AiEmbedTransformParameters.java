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
 * {@link AiEmbedTransformParameters} extends {@link TeaModel}
 *
 * <p>AiEmbedTransformParameters</p>
 */
public class AiEmbedTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private Integer dimension;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiEmbedTransformParameters(Builder builder) {
        this.dimension = builder.dimension;
        this.inputField = builder.inputField;
        this.model = builder.model;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiEmbedTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private Integer dimension; 
        private AiTransformField inputField; 
        private String model; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiEmbedTransformParameters model) {
            this.dimension = model.dimension;
            this.inputField = model.inputField;
            this.model = model.model;
            this.stepName = model.stepName;
        } 

        /**
         * <p>The vector dimensions. Must be a dimension supported by the selected model. If not specified, the default value of the model is used (1024 for most models, 1536 for v1/v2/async).</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder dimension(Integer dimension) {
            this.dimension = dimension;
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
         * <p>The embedding model. Default value: text-embedding-v4.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>embedding</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiEmbedTransformParameters build() {
            return new AiEmbedTransformParameters(this);
        } 

    } 

}
