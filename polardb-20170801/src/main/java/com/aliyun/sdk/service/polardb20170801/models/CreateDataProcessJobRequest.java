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
 * {@link CreateDataProcessJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDataProcessJobRequest</p>
 */
public class CreateDataProcessJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationConfig")
    private String destinationConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessingMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceConfig")
    private String sourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private CreateDataProcessJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationConfig = builder.destinationConfig;
        this.destinationId = builder.destinationId;
        this.destinationPath = builder.destinationPath;
        this.destinationType = builder.destinationType;
        this.modelName = builder.modelName;
        this.processingMode = builder.processingMode;
        this.regionId = builder.regionId;
        this.sourceConfig = builder.sourceConfig;
        this.sourceId = builder.sourceId;
        this.sourcePath = builder.sourcePath;
        this.sourceType = builder.sourceType;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataProcessJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationConfig
     */
    public String getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * @return destinationId
     */
    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return destinationPath
     */
    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return processingMode
     */
    public String getProcessingMode() {
        return this.processingMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceConfig
     */
    public String getSourceConfig() {
        return this.sourceConfig;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourcePath
     */
    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateDataProcessJobRequest, Builder> {
        private String description; 
        private String destinationConfig; 
        private String destinationId; 
        private String destinationPath; 
        private String destinationType; 
        private String modelName; 
        private String processingMode; 
        private String regionId; 
        private String sourceConfig; 
        private String sourceId; 
        private String sourcePath; 
        private String sourceType; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataProcessJobRequest request) {
            super(request);
            this.description = request.description;
            this.destinationConfig = request.destinationConfig;
            this.destinationId = request.destinationId;
            this.destinationPath = request.destinationPath;
            this.destinationType = request.destinationType;
            this.modelName = request.modelName;
            this.processingMode = request.processingMode;
            this.regionId = request.regionId;
            this.sourceConfig = request.sourceConfig;
            this.sourceId = request.sourceId;
            this.sourcePath = request.sourcePath;
            this.sourceType = request.sourceType;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The description of the data processing task.</p>
         * 
         * <strong>example:</strong>
         * <p>Image data processing task</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The JSON string for the destination database connection configuration, including Account and Password.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Account&quot;:&quot;example_user&quot;,&quot;Password&quot;:&quot;example_password&quot;}</p>
         */
        public Builder destinationConfig(String destinationConfig) {
            this.putQueryParameter("DestinationConfig", destinationConfig);
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>The ID of the destination PolarDB cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        public Builder destinationId(String destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
            return this;
        }

        /**
         * <p>The name of the destination database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder destinationPath(String destinationPath) {
            this.putQueryParameter("DestinationPath", destinationPath);
            this.destinationPath = destinationPath;
            return this;
        }

        /**
         * <p>The type of the destination. Only PolarDB is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDB</p>
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The name of the model used for feature extraction.</p>
         * 
         * <strong>example:</strong>
         * <p>model-v1</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The processing mode. Valid values: Full, Incremental, and Both.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        public Builder processingMode(String processingMode) {
            this.putQueryParameter("ProcessingMode", processingMode);
            this.processingMode = processingMode;
            return this;
        }

        /**
         * <p>The ID of the region where the task resides.</p>
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
         * <p>The additional configuration for the data source in JSON string format. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder sourceConfig(String sourceConfig) {
            this.putQueryParameter("SourceConfig", sourceConfig);
            this.sourceConfig = sourceConfig;
            return this;
        }

        /**
         * <p>The ID of the PolarFS instance that serves as the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-123456</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source data path in PolarFS. An empty string indicates the default path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/images</p>
         */
        public Builder sourcePath(String sourcePath) {
            this.putQueryParameter("SourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * <p>The type of the data source. Only PolarFS is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The ID of the task template used to process data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-123456</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateDataProcessJobRequest build() {
            return new CreateDataProcessJobRequest(this);
        } 

    } 

}
