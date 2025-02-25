// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataItemsModelDataValue} extends {@link TeaModel}
 *
 * <p>DataItemsModelDataValue</p>
 */
public class DataItemsModelDataValue extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("ModelId")
    private String modelId;

    @NameInMap("ModelName")
    private String modelName;

    @NameInMap("ModelStatus")
    private String modelStatus;

    @NameInMap("ModelType")
    private String modelType;

    @NameInMap("SubType")
    private String subType;

    @NameInMap("ModuleId")
    private String moduleId;

    @NameInMap("Content")
    private String content;

    @NameInMap("AppId")
    private String appId;

    @NameInMap("Linked")
    private Boolean linked;

    @NameInMap("LinkModuleId")
    private String linkModuleId;

    @NameInMap("LinkModelId")
    private String linkModelId;

    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @NameInMap("Description")
    private String description;

    @NameInMap("Props")
    private String props;

    @NameInMap("Visibility")
    private String visibility;

    @NameInMap("ModelDigest")
    private String modelDigest;

    private DataItemsModelDataValue(Builder builder) {
        this.id = builder.id;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelStatus = builder.modelStatus;
        this.modelType = builder.modelType;
        this.subType = builder.subType;
        this.moduleId = builder.moduleId;
        this.content = builder.content;
        this.appId = builder.appId;
        this.linked = builder.linked;
        this.linkModuleId = builder.linkModuleId;
        this.linkModelId = builder.linkModelId;
        this.schemaVersion = builder.schemaVersion;
        this.description = builder.description;
        this.props = builder.props;
        this.visibility = builder.visibility;
        this.modelDigest = builder.modelDigest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataItemsModelDataValue create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return modelStatus
     */
    public String getModelStatus() {
        return this.modelStatus;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return linked
     */
    public Boolean getLinked() {
        return this.linked;
    }

    /**
     * @return linkModuleId
     */
    public String getLinkModuleId() {
        return this.linkModuleId;
    }

    /**
     * @return linkModelId
     */
    public String getLinkModelId() {
        return this.linkModelId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return props
     */
    public String getProps() {
        return this.props;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return modelDigest
     */
    public String getModelDigest() {
        return this.modelDigest;
    }

    public static final class Builder {
        private String id; 
        private String modelId; 
        private String modelName; 
        private String modelStatus; 
        private String modelType; 
        private String subType; 
        private String moduleId; 
        private String content; 
        private String appId; 
        private Boolean linked; 
        private String linkModuleId; 
        private String linkModelId; 
        private String schemaVersion; 
        private String description; 
        private String props; 
        private String visibility; 
        private String modelDigest; 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelStatus.
         */
        public Builder modelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Linked.
         */
        public Builder linked(Boolean linked) {
            this.linked = linked;
            return this;
        }

        /**
         * LinkModuleId.
         */
        public Builder linkModuleId(String linkModuleId) {
            this.linkModuleId = linkModuleId;
            return this;
        }

        /**
         * LinkModelId.
         */
        public Builder linkModelId(String linkModelId) {
            this.linkModelId = linkModelId;
            return this;
        }

        /**
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Props.
         */
        public Builder props(String props) {
            this.props = props;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * ModelDigest.
         */
        public Builder modelDigest(String modelDigest) {
            this.modelDigest = modelDigest;
            return this;
        }

        public DataItemsModelDataValue build() {
            return new DataItemsModelDataValue(this);
        } 

    } 

}
