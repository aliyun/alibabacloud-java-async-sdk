// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgAddInferenceJobRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgAddInferenceJobRequest</p>
 */
public class Personalizedtxt2imgAddInferenceJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageNumber")
    private Integer imageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seed")
    private Long seed;

    private Personalizedtxt2imgAddInferenceJobRequest(Builder builder) {
        super(builder);
        this.imageNumber = builder.imageNumber;
        this.modelId = builder.modelId;
        this.prompt = builder.prompt;
        this.seed = builder.seed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgAddInferenceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageNumber
     */
    public Integer getImageNumber() {
        return this.imageNumber;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return seed
     */
    public Long getSeed() {
        return this.seed;
    }

    public static final class Builder extends Request.Builder<Personalizedtxt2imgAddInferenceJobRequest, Builder> {
        private Integer imageNumber; 
        private String modelId; 
        private String prompt; 
        private Long seed; 

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgAddInferenceJobRequest request) {
            super(request);
            this.imageNumber = request.imageNumber;
            this.modelId = request.modelId;
            this.prompt = request.prompt;
            this.seed = request.seed;
        } 

        /**
         * <p>The number of images to generate. Note: Due to resource limits in the test environment, a maximum of 10 images can be generated at a time. If this value is greater than 10, it is treated as 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder imageNumber(Integer imageNumber) {
            this.putBodyParameter("imageNumber", imageNumber);
            this.imageNumber = imageNumber;
            return this;
        }

        /**
         * <p>The ID of the model training task. Specifies the model to use for inference.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx</p>
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The English prompt that describes the image to be generated. Replace the character to be generated with <special-token>. For example, change &quot;a man in the snow&quot; to &quot;a <special-token> in the snow&quot; and &quot;a photo of a girl&quot; to &quot;a photo of a <special-token>&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a <special-token> in the snow</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The random seed. A fixed seed generates the same image and ensures the reproducibility of the results. Note: The input value must be in the range of [-1, 2147483647]. If the input value is out of this range or not provided, a suitable seed is automatically generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder seed(Long seed) {
            this.putBodyParameter("seed", seed);
            this.seed = seed;
            return this;
        }

        @Override
        public Personalizedtxt2imgAddInferenceJobRequest build() {
            return new Personalizedtxt2imgAddInferenceJobRequest(this);
        } 

    } 

}
