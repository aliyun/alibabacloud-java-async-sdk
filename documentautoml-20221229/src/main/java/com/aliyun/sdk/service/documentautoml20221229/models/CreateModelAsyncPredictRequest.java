// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelAsyncPredictRequest} extends {@link RequestModel}
 *
 * <p>CreateModelAsyncPredictRequest</p>
 */
public class CreateModelAsyncPredictRequest extends Request {
    @Query
    @NameInMap("BinaryToText")
    private Boolean binaryToText;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("ModelId")
    @Validation(maximum = 9999999999999D, minimum = 1)
    private Long modelId;

    @Query
    @NameInMap("ModelVersion")
    private String modelVersion;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    @Body
    @NameInMap("body")
    private String body;

    private CreateModelAsyncPredictRequest(Builder builder) {
        super(builder);
        this.binaryToText = builder.binaryToText;
        this.content = builder.content;
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
        this.serviceName = builder.serviceName;
        this.serviceVersion = builder.serviceVersion;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelAsyncPredictRequest create() {
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

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateModelAsyncPredictRequest, Builder> {
        private Boolean binaryToText; 
        private String content; 
        private Long modelId; 
        private String modelVersion; 
        private String serviceName; 
        private String serviceVersion; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelAsyncPredictRequest request) {
            super(request);
            this.binaryToText = request.binaryToText;
            this.content = request.content;
            this.modelId = request.modelId;
            this.modelVersion = request.modelVersion;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
            this.body = request.body;
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

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateModelAsyncPredictRequest build() {
            return new CreateModelAsyncPredictRequest(this);
        } 

    } 

}
