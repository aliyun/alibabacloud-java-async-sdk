// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictModelRequest} extends {@link RequestModel}
 *
 * <p>PredictModelRequest</p>
 */
public class PredictModelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modelId;

    private PredictModelRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<PredictModelRequest, Builder> {
        private String content; 
        private Long modelId; 

        private Builder() {
            super();
        } 

        private Builder(PredictModelRequest request) {
            super(request);
            this.content = request.content;
            this.modelId = request.modelId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public PredictModelRequest build() {
            return new PredictModelRequest(this);
        } 

    } 

}
