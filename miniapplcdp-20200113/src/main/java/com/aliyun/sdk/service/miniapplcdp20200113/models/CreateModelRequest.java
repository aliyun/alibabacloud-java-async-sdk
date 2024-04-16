// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EncodeType")
    private String encodeType;

    @Query
    @NameInMap("LinkModelId")
    private String linkModelId;

    @Query
    @NameInMap("LinkModuleId")
    private String linkModuleId;

    @Query
    @NameInMap("Linked")
    private Boolean linked;

    @Query
    @NameInMap("ModelId")
    private String modelId;

    @Query
    @NameInMap("ModelName")
    @Validation(required = true)
    private String modelName;

    @Query
    @NameInMap("ModelType")
    @Validation(required = true)
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
    @Validation(required = true)
    private String subType;

    @Query
    @NameInMap("Visibility")
    private String visibility;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.description = builder.description;
        this.encodeType = builder.encodeType;
        this.linkModelId = builder.linkModelId;
        this.linkModuleId = builder.linkModuleId;
        this.linked = builder.linked;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.moduleId = builder.moduleId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return linkModelId
     */
    public String getLinkModelId() {
        return this.linkModelId;
    }

    /**
     * @return linkModuleId
     */
    public String getLinkModuleId() {
        return this.linkModuleId;
    }

    /**
     * @return linked
     */
    public Boolean getLinked() {
        return this.linked;
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
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String content; 
        private String description; 
        private String encodeType; 
        private String linkModelId; 
        private String linkModuleId; 
        private Boolean linked; 
        private String modelId; 
        private String modelName; 
        private String modelType; 
        private String moduleId; 
        private String schemaVersion; 
        private String source; 
        private String subType; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.description = request.description;
            this.encodeType = request.encodeType;
            this.linkModelId = request.linkModelId;
            this.linkModuleId = request.linkModuleId;
            this.linked = request.linked;
            this.modelId = request.modelId;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.moduleId = request.moduleId;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.subType = request.subType;
            this.visibility = request.visibility;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * LinkModelId.
         */
        public Builder linkModelId(String linkModelId) {
            this.putQueryParameter("LinkModelId", linkModelId);
            this.linkModelId = linkModelId;
            return this;
        }

        /**
         * LinkModuleId.
         */
        public Builder linkModuleId(String linkModuleId) {
            this.putQueryParameter("LinkModuleId", linkModuleId);
            this.linkModuleId = linkModuleId;
            return this;
        }

        /**
         * Linked.
         */
        public Builder linked(Boolean linked) {
            this.putQueryParameter("Linked", linked);
            this.linked = linked;
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
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

}
