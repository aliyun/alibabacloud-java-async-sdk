// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPredictResultRequest} extends {@link RequestModel}
 *
 * <p>GetPredictResultRequest</p>
 */
public class GetPredictResultRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("DetailTag")
    private String detailTag;

    @Body
    @NameInMap("ModelId")
    @Validation(required = true)
    private Integer modelId;

    @Body
    @NameInMap("ModelVersion")
    private String modelVersion;

    @Body
    @NameInMap("TopK")
    private Integer topK;

    private GetPredictResultRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.detailTag = builder.detailTag;
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPredictResultRequest create() {
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
     * @return detailTag
     */
    public String getDetailTag() {
        return this.detailTag;
    }

    /**
     * @return modelId
     */
    public Integer getModelId() {
        return this.modelId;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<GetPredictResultRequest, Builder> {
        private String content; 
        private String detailTag; 
        private Integer modelId; 
        private String modelVersion; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(GetPredictResultRequest request) {
            super(request);
            this.content = request.content;
            this.detailTag = request.detailTag;
            this.modelId = request.modelId;
            this.modelVersion = request.modelVersion;
            this.topK = request.topK;
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
         * DetailTag.
         */
        public Builder detailTag(String detailTag) {
            this.putBodyParameter("DetailTag", detailTag);
            this.detailTag = detailTag;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Integer modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.putBodyParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public GetPredictResultRequest build() {
            return new GetPredictResultRequest(this);
        } 

    } 

}
