// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictClassifierModelRequest} extends {@link RequestModel}
 *
 * <p>PredictClassifierModelRequest</p>
 */
public class PredictClassifierModelRequest extends Request {
    @Query
    @NameInMap("AutoPrediction")
    private Boolean autoPrediction;

    @Query
    @NameInMap("ClassifierId")
    @Validation(maximum = 99999999999999D, minimum = 1)
    private Long classifierId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    private PredictClassifierModelRequest(Builder builder) {
        super(builder);
        this.autoPrediction = builder.autoPrediction;
        this.classifierId = builder.classifierId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictClassifierModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPrediction
     */
    public Boolean getAutoPrediction() {
        return this.autoPrediction;
    }

    /**
     * @return classifierId
     */
    public Long getClassifierId() {
        return this.classifierId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<PredictClassifierModelRequest, Builder> {
        private Boolean autoPrediction; 
        private Long classifierId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(PredictClassifierModelRequest request) {
            super(request);
            this.autoPrediction = request.autoPrediction;
            this.classifierId = request.classifierId;
            this.content = request.content;
        } 

        /**
         * AutoPrediction.
         */
        public Builder autoPrediction(Boolean autoPrediction) {
            this.putQueryParameter("AutoPrediction", autoPrediction);
            this.autoPrediction = autoPrediction;
            return this;
        }

        /**
         * ClassifierId.
         */
        public Builder classifierId(Long classifierId) {
            this.putQueryParameter("ClassifierId", classifierId);
            this.classifierId = classifierId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public PredictClassifierModelRequest build() {
            return new PredictClassifierModelRequest(this);
        } 

    } 

}
