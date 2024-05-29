// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSourceType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String logoUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String ssoType;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationName = builder.applicationName;
        this.applicationSourceType = builder.applicationSourceType;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.logoUrl = builder.logoUrl;
        this.ssoType = builder.ssoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationSourceType
     */
    public String getApplicationSourceType() {
        return this.applicationSourceType;
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String regionId; 
        private String applicationName; 
        private String applicationSourceType; 
        private String applicationTemplateId; 
        private String description; 
        private String instanceId; 
        private String logoUrl; 
        private String ssoType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationName = request.applicationName;
            this.applicationSourceType = request.applicationSourceType;
            this.applicationTemplateId = request.applicationTemplateId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.logoUrl = request.logoUrl;
            this.ssoType = request.ssoType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The type of the application source. Valid values:
         * <p>
         * 
         * *   urn:alibaba:idaas:app:source:template: application template
         * *   urn:alibaba:idaas:app:source:standard: standard protocol
         */
        public Builder applicationSourceType(String applicationSourceType) {
            this.putQueryParameter("ApplicationSourceType", applicationSourceType);
            this.applicationSourceType = applicationSourceType;
            return this;
        }

        /**
         * The ID of the application template. This parameter is required if you set the ApplicationSourceType parameter to urn:alibaba:idaas:app:source:template.
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The URL of the application logo.
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * The SSO protocol. Valid values:
         * <p>
         * 
         * *   saml2: the SAML 2.0 protocol.
         * *   oidc: the OpenID Connect protocol.
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
