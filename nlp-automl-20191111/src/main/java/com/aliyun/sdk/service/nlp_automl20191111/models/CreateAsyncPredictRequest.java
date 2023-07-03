// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAsyncPredictRequest} extends {@link RequestModel}
 *
 * <p>CreateAsyncPredictRequest</p>
 */
public class CreateAsyncPredictRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("DetailTag")
    private String detailTag;

    @Body
    @NameInMap("FetchContent")
    private String fetchContent;

    @Body
    @NameInMap("FileContent")
    private String fileContent;

    @Body
    @NameInMap("FileType")
    private String fileType;

    @Body
    @NameInMap("FileUrl")
    private String fileUrl;

    @Body
    @NameInMap("ModelId")
    private Integer modelId;

    @Body
    @NameInMap("ModelVersion")
    private String modelVersion;

    @Body
    @NameInMap("ServiceName")
    private String serviceName;

    @Body
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    @Body
    @NameInMap("TopK")
    private Integer topK;

    private CreateAsyncPredictRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.detailTag = builder.detailTag;
        this.fetchContent = builder.fetchContent;
        this.fileContent = builder.fileContent;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
        this.serviceName = builder.serviceName;
        this.serviceVersion = builder.serviceVersion;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAsyncPredictRequest create() {
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
     * @return fetchContent
     */
    public String getFetchContent() {
        return this.fetchContent;
    }

    /**
     * @return fileContent
     */
    public String getFileContent() {
        return this.fileContent;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
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
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<CreateAsyncPredictRequest, Builder> {
        private String content; 
        private String detailTag; 
        private String fetchContent; 
        private String fileContent; 
        private String fileType; 
        private String fileUrl; 
        private Integer modelId; 
        private String modelVersion; 
        private String serviceName; 
        private String serviceVersion; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(CreateAsyncPredictRequest request) {
            super(request);
            this.content = request.content;
            this.detailTag = request.detailTag;
            this.fetchContent = request.fetchContent;
            this.fileContent = request.fileContent;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.modelId = request.modelId;
            this.modelVersion = request.modelVersion;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
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
         * FetchContent.
         */
        public Builder fetchContent(String fetchContent) {
            this.putBodyParameter("FetchContent", fetchContent);
            this.fetchContent = fetchContent;
            return this;
        }

        /**
         * FileContent.
         */
        public Builder fileContent(String fileContent) {
            this.putBodyParameter("FileContent", fileContent);
            this.fileContent = fileContent;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putBodyParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
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
        public CreateAsyncPredictRequest build() {
            return new CreateAsyncPredictRequest(this);
        } 

    } 

}
