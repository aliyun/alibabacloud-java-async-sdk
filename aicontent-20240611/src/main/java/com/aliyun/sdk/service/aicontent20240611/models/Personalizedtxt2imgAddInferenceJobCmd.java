// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgAddInferenceJobCmd} extends {@link TeaModel}
 *
 * <p>Personalizedtxt2imgAddInferenceJobCmd</p>
 */
public class Personalizedtxt2imgAddInferenceJobCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("imageNumber")
    private Integer imageNumber;

    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("seed")
    private Integer seed;

    private Personalizedtxt2imgAddInferenceJobCmd(Builder builder) {
        this.imageNumber = builder.imageNumber;
        this.modelId = builder.modelId;
        this.prompt = builder.prompt;
        this.seed = builder.seed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgAddInferenceJobCmd create() {
        return builder().build();
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
    public Integer getSeed() {
        return this.seed;
    }

    public static final class Builder {
        private Integer imageNumber; 
        private String modelId; 
        private String prompt; 
        private Integer seed; 

        /**
         * imageNumber.
         */
        public Builder imageNumber(Integer imageNumber) {
            this.imageNumber = imageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a <special-token> in the snow</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * seed.
         */
        public Builder seed(Integer seed) {
            this.seed = seed;
            return this;
        }

        public Personalizedtxt2imgAddInferenceJobCmd build() {
            return new Personalizedtxt2imgAddInferenceJobCmd(this);
        } 

    } 

}
