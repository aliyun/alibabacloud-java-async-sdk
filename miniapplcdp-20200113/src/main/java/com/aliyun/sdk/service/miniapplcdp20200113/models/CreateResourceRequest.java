// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Visibility")
    private String visibility;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.description = builder.description;
        this.moduleId = builder.moduleId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
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
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
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
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String content; 
        private String description; 
        private String moduleId; 
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String schemaVersion; 
        private String source; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.description = request.description;
            this.moduleId = request.moduleId;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
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
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

}
