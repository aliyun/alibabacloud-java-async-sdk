// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictMTModelByDocRequest} extends {@link RequestModel}
 *
 * <p>PredictMTModelByDocRequest</p>
 */
public class PredictMTModelByDocRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedXLIFF")
    private Boolean needXLIFF;

    private PredictMTModelByDocRequest(Builder builder) {
        super(builder);
        this.fileContent = builder.fileContent;
        this.fileType = builder.fileType;
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
        this.needXLIFF = builder.needXLIFF;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictMTModelByDocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return needXLIFF
     */
    public Boolean getNeedXLIFF() {
        return this.needXLIFF;
    }

    public static final class Builder extends Request.Builder<PredictMTModelByDocRequest, Builder> {
        private String fileContent; 
        private String fileType; 
        private Integer modelId; 
        private String modelVersion; 
        private Boolean needXLIFF; 

        private Builder() {
            super();
        } 

        private Builder(PredictMTModelByDocRequest request) {
            super(request);
            this.fileContent = request.fileContent;
            this.fileType = request.fileType;
            this.modelId = request.modelId;
            this.modelVersion = request.modelVersion;
            this.needXLIFF = request.needXLIFF;
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
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Integer modelId) {
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
         * NeedXLIFF.
         */
        public Builder needXLIFF(Boolean needXLIFF) {
            this.putQueryParameter("NeedXLIFF", needXLIFF);
            this.needXLIFF = needXLIFF;
            return this;
        }

        @Override
        public PredictMTModelByDocRequest build() {
            return new PredictMTModelByDocRequest(this);
        } 

    } 

}
