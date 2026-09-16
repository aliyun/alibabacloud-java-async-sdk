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
 * {@link AiPrepSearchTransformParameters} extends {@link TeaModel}
 *
 * <p>AiPrepSearchTransformParameters</p>
 */
public class AiPrepSearchTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("MaxChunkSize")
    private Integer maxChunkSize;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    private AiPrepSearchTransformParameters(Builder builder) {
        this.inputField = builder.inputField;
        this.maxChunkSize = builder.maxChunkSize;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiPrepSearchTransformParameters create() {
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
     * @return maxChunkSize
     */
    public Integer getMaxChunkSize() {
        return this.maxChunkSize;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder {
        private AiTransformField inputField; 
        private Integer maxChunkSize; 
        private String stepName; 

        private Builder() {
        } 

        private Builder(AiPrepSearchTransformParameters model) {
            this.inputField = model.inputField;
            this.maxChunkSize = model.maxChunkSize;
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
         * <p>The maximum number of chunks. Valid values: 1 to 1000. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxChunkSize(Integer maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }

        /**
         * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>chunks</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        public AiPrepSearchTransformParameters build() {
            return new AiPrepSearchTransformParameters(this);
        } 

    } 

}
