// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictModelRequest} extends {@link RequestModel}
 *
 * <p>PredictModelRequest</p>
 */
public class PredictModelRequest extends Request {
    @Query
    @NameInMap("BinaryToText")
    private Boolean binaryToText;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long modelId;

    @Query
    @NameInMap("ModelVersion")
    @Validation(required = true)
    private String modelVersion;

    private PredictModelRequest(Builder builder) {
        super(builder);
        this.binaryToText = builder.binaryToText;
        this.content = builder.content;
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
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
     * @return binaryToText
     */
    public Boolean getBinaryToText() {
        return this.binaryToText;
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

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    public static final class Builder extends Request.Builder<PredictModelRequest, Builder> {
        private Boolean binaryToText; 
        private String content; 
        private Long modelId; 
        private String modelVersion; 

        private Builder() {
            super();
        } 

        private Builder(PredictModelRequest request) {
            super(request);
            this.binaryToText = request.binaryToText;
            this.content = request.content;
            this.modelId = request.modelId;
            this.modelVersion = request.modelVersion;
        } 

        /**
         * BinaryToText.
         */
        public Builder binaryToText(Boolean binaryToText) {
            this.putQueryParameter("BinaryToText", binaryToText);
            this.binaryToText = binaryToText;
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

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        @Override
        public PredictModelRequest build() {
            return new PredictModelRequest(this);
        } 

    } 

}
