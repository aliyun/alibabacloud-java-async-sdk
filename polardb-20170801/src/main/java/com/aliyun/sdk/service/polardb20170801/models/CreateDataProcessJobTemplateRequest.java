// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateDataProcessJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDataProcessJobTemplateRequest</p>
 */
public class CreateDataProcessJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Captioning")
    private Boolean captioning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaptioningPrompt")
    private String captioningPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Embedding")
    private Boolean embedding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
    private Integer embeddingDimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private CreateDataProcessJobTemplateRequest(Builder builder) {
        super(builder);
        this.captioning = builder.captioning;
        this.captioningPrompt = builder.captioningPrompt;
        this.embedding = builder.embedding;
        this.embeddingDimension = builder.embeddingDimension;
        this.regionId = builder.regionId;
        this.templateConfig = builder.templateConfig;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataProcessJobTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captioning
     */
    public Boolean getCaptioning() {
        return this.captioning;
    }

    /**
     * @return captioningPrompt
     */
    public String getCaptioningPrompt() {
        return this.captioningPrompt;
    }

    /**
     * @return embedding
     */
    public Boolean getEmbedding() {
        return this.embedding;
    }

    /**
     * @return embeddingDimension
     */
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateDataProcessJobTemplateRequest, Builder> {
        private Boolean captioning; 
        private String captioningPrompt; 
        private Boolean embedding; 
        private Integer embeddingDimension; 
        private String regionId; 
        private String templateConfig; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataProcessJobTemplateRequest request) {
            super(request);
            this.captioning = request.captioning;
            this.captioningPrompt = request.captioningPrompt;
            this.embedding = request.embedding;
            this.embeddingDimension = request.embeddingDimension;
            this.regionId = request.regionId;
            this.templateConfig = request.templateConfig;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * <p>Specifies whether to fetch the image summary or video synopsis. When Settings is set to true, CaptioningPrompt must be specified.</p>
         */
        public Builder captioning(Boolean captioning) {
            this.putQueryParameter("Captioning", captioning);
            this.captioning = captioning;
            return this;
        }

        /**
         * <p>The prompt used for extracting summaries. This parameter takes effect only when Captioning is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize the image content</p>
         */
        public Builder captioningPrompt(String captioningPrompt) {
            this.putQueryParameter("CaptioningPrompt", captioningPrompt);
            this.captioningPrompt = captioningPrompt;
            return this;
        }

        /**
         * <p>Specifies whether to convert the content into vectors.</p>
         */
        public Builder embedding(Boolean embedding) {
            this.putQueryParameter("Embedding", embedding);
            this.embedding = embedding;
            return this;
        }

        /**
         * <p>The output dimension of the vector. Valid values when Embedding is set to true: 512, 768, 1024, and 2048.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder embeddingDimension(Integer embeddingDimension) {
            this.putQueryParameter("EmbeddingDimension", embeddingDimension);
            this.embeddingDimension = embeddingDimension;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The JSON string for additional template configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ETL_TEMPLATE_STR&quot;:&quot;config&quot;}</p>
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The name of the task template.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The templatetype of the node. Valid values: image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateDataProcessJobTemplateRequest build() {
            return new CreateDataProcessJobTemplateRequest(this);
        } 

    } 

}
