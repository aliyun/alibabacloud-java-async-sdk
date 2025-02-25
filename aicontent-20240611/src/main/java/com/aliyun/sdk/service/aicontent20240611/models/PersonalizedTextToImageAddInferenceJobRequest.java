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
         * imageNumber.
         */
        public Builder imageNumber(Integer imageNumber) {
            this.putBodyParameter("imageNumber", imageNumber);
            this.imageNumber = imageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageUrl(java.util.List<String> imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
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
         * seed.
         */
        public Builder seed(Long seed) {
            this.putBodyParameter("seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * strength.
         */
        public Builder strength(Double strength) {
            this.putBodyParameter("strength", strength);
            this.strength = strength;
            return this;
        }

        /**
         * trainSteps.
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
