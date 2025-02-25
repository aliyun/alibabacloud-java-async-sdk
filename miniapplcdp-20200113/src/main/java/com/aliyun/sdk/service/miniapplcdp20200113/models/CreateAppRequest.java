// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("Asynchronous")
    private Boolean asynchronous;

    @Query
    @NameInMap("CategoryId")
    private String categoryId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Icon")
    private String icon;

    @Query
    @NameInMap("PlatformVersion")
    private String platformVersion;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceCommitId")
    private String sourceCommitId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("Templated")
    private Boolean templated;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.asynchronous = builder.asynchronous;
        this.categoryId = builder.categoryId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.icon = builder.icon;
        this.platformVersion = builder.platformVersion;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.sourceCommitId = builder.sourceCommitId;
        this.templateId = builder.templateId;
        this.templated = builder.templated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return asynchronous
     */
    public Boolean getAsynchronous() {
        return this.asynchronous;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return platformVersion
     */
    public String getPlatformVersion() {
        return this.platformVersion;
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
     * @return sourceCommitId
     */
    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templated
     */
    public Boolean getTemplated() {
        return this.templated;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private String appType; 
        private Boolean asynchronous; 
        private String categoryId; 
        private String clientToken; 
        private String description; 
        private String icon; 
        private String platformVersion; 
        private String schemaVersion; 
        private String source; 
        private String sourceCommitId; 
        private String templateId; 
        private Boolean templated; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.appType = request.appType;
            this.asynchronous = request.asynchronous;
            this.categoryId = request.categoryId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.icon = request.icon;
            this.platformVersion = request.platformVersion;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.sourceCommitId = request.sourceCommitId;
            this.templateId = request.templateId;
            this.templated = request.templated;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * Asynchronous.
         */
        public Builder asynchronous(Boolean asynchronous) {
            this.putQueryParameter("Asynchronous", asynchronous);
            this.asynchronous = asynchronous;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * PlatformVersion.
         */
        public Builder platformVersion(String platformVersion) {
            this.putQueryParameter("PlatformVersion", platformVersion);
            this.platformVersion = platformVersion;
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
         * SourceCommitId.
         */
        public Builder sourceCommitId(String sourceCommitId) {
            this.putQueryParameter("SourceCommitId", sourceCommitId);
            this.sourceCommitId = sourceCommitId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Templated.
         */
        public Builder templated(Boolean templated) {
            this.putQueryParameter("Templated", templated);
            this.templated = templated;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
