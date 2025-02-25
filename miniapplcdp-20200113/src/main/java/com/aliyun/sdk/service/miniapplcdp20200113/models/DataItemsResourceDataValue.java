// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataItemsResourceDataValue} extends {@link TeaModel}
 *
 * <p>DataItemsResourceDataValue</p>
 */
public class DataItemsResourceDataValue extends TeaModel {
    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceName")
    private String resourceName;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("Description")
    private String description;

    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @NameInMap("ModuleId")
    private String moduleId;

    @NameInMap("Content")
    private java.util.Map < String, ? > content;

    @NameInMap("AppId")
    private String appId;

    @NameInMap("Visibility")
    private String visibility;

    private DataItemsResourceDataValue(Builder builder) {
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.description = builder.description;
        this.schemaVersion = builder.schemaVersion;
        this.moduleId = builder.moduleId;
        this.content = builder.content;
        this.appId = builder.appId;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataItemsResourceDataValue create() {
        return builder().build();
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
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
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String description; 
        private String schemaVersion; 
        private String moduleId; 
        private java.util.Map < String, ? > content; 
        private String appId; 
        private String visibility; 

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
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
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
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
        public Builder content(java.util.Map < String, ? > content) {
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
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public DataItemsResourceDataValue build() {
            return new DataItemsResourceDataValue(this);
        } 

    } 

}
