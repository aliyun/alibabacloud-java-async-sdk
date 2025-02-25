// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelsRequest</p>
 */
public class ListModelsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModelId")
    private String modelId;

    @Query
    @NameInMap("ModelName")
    private String modelName;

    @Query
    @NameInMap("ModelType")
    private String modelType;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubType")
    private String subType;

    @Query
    @NameInMap("WithContent")
    private Boolean withContent;

    private ListModelsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.moduleId = builder.moduleId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
        this.withContent = builder.withContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return withContent
     */
    public Boolean getWithContent() {
        return this.withContent;
    }

    public static final class Builder extends Request.Builder<ListModelsRequest, Builder> {
        private String appId; 
        private String modelId; 
        private String modelName; 
        private String modelType; 
        private String moduleId; 
        private String schemaVersion; 
        private String source; 
        private String subType; 
        private Boolean withContent; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsRequest request) {
            super(request);
            this.appId = request.appId;
            this.modelId = request.modelId;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.moduleId = request.moduleId;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.subType = request.subType;
            this.withContent = request.withContent;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * WithContent.
         */
        public Builder withContent(Boolean withContent) {
            this.putQueryParameter("WithContent", withContent);
            this.withContent = withContent;
            return this;
        }

        @Override
        public ListModelsRequest build() {
            return new ListModelsRequest(this);
        } 

    } 

}
