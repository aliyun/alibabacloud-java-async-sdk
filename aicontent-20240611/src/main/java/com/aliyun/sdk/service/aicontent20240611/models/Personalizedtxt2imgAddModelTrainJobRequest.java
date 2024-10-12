// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgAddModelTrainJobRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgAddModelTrainJobRequest</p>
 */
public class Personalizedtxt2imgAddModelTrainJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trainSteps")
    private Integer trainSteps;

    private Personalizedtxt2imgAddModelTrainJobRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.trainSteps = builder.trainSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgAddModelTrainJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public java.util.List < String > getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return trainSteps
     */
    public Integer getTrainSteps() {
        return this.trainSteps;
    }

    public static final class Builder extends Request.Builder<Personalizedtxt2imgAddModelTrainJobRequest, Builder> {
        private java.util.List < String > imageUrl; 
        private String name; 
        private String objectType; 
        private Integer trainSteps; 

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgAddModelTrainJobRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.name = request.name;
            this.objectType = request.objectType;
            this.trainSteps = request.trainSteps;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageUrl(java.util.List < String > imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>熊猫图片生成</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dog</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("objectType", objectType);
            this.objectType = objectType;
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
        public Personalizedtxt2imgAddModelTrainJobRequest build() {
            return new Personalizedtxt2imgAddModelTrainJobRequest(this);
        } 

    } 

}
