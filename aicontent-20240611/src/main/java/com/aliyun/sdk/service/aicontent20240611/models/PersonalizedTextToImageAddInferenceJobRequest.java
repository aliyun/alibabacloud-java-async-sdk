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
 * {@link PersonalizedTextToImageAddInferenceJobRequest} extends {@link RequestModel}
 *
 * <p>PersonalizedTextToImageAddInferenceJobRequest</p>
 */
public class PersonalizedTextToImageAddInferenceJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageNumber")
    private Integer imageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seed")
    private Long seed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strength")
    private Double strength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trainSteps")
    private Integer trainSteps;

    private PersonalizedTextToImageAddInferenceJobRequest(Builder builder) {
        super(builder);
        this.imageNumber = builder.imageNumber;
        this.imageUrl = builder.imageUrl;
        this.prompt = builder.prompt;
        this.seed = builder.seed;
        this.strength = builder.strength;
        this.trainSteps = builder.trainSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PersonalizedTextToImageAddInferenceJobRequest create() {
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
     * @return imageUrl
     */
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
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

    /**
     * @return strength
     */
    public Double getStrength() {
        return this.strength;
    }

    /**
     * @return trainSteps
     */
    public Integer getTrainSteps() {
        return this.trainSteps;
    }

    public static final class Builder extends Request.Builder<PersonalizedTextToImageAddInferenceJobRequest, Builder> {
        private Integer imageNumber; 
        private java.util.List<String> imageUrl; 
        private String prompt; 
        private Long seed; 
        private Double strength; 
        private Integer trainSteps; 

        private Builder() {
            super();
        } 

        private Builder(PersonalizedTextToImageAddInferenceJobRequest request) {
            super(request);
            this.imageNumber = request.imageNumber;
            this.imageUrl = request.imageUrl;
            this.prompt = request.prompt;
            this.seed = request.seed;
            this.strength = request.strength;
            this.trainSteps = request.trainSteps;
        } 

        /**
         * <p>The number of images to generate. Note: The maximum is 10 images per request in the test environment. If the value exceeds 10, it is treated as 10.</p>
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
         * <p>An array containing one or more image URLs. For example, <code>[&quot;url_1&quot;, &quot;url_2&quot;, ...]</code>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder imageUrl(java.util.List<String> imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The English prompt for image generation. Use the placeholder for the subject. For example, change &quot;a man in the snow&quot; to &quot;a in the snow&quot;.</p>
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
         * <p>A random seed to ensure reproducible image generation. The value must be within <code>[-1, 2147483647]</code>. If the value is outside this range or omitted, the system automatically generates a seed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder seed(Long seed) {
            this.putBodyParameter("seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * <p>Determines the influence of the reference image.
         * Valid values: <code>0.3</code>, <code>0.4</code>, <code>0.5</code>, <code>0.6</code>, <code>0.7</code>, and <code>0.8</code>.
         * A lower value decreases the influence of the reference image and increases the influence of the text prompt.
         * The default is <code>0.5</code>, and you typically do not need to change this value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder strength(Double strength) {
            this.putBodyParameter("strength", strength);
            this.strength = strength;
            return this;
        }

        /**
         * <p>The number of training steps for the model.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder trainSteps(Integer trainSteps) {
            this.putBodyParameter("trainSteps", trainSteps);
            this.trainSteps = trainSteps;
            return this;
        }

        @Override
        public PersonalizedTextToImageAddInferenceJobRequest build() {
            return new PersonalizedTextToImageAddInferenceJobRequest(this);
        } 

    } 

}
