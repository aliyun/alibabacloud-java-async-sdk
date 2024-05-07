// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
    private Integer accessTokenValidity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMultiTenant")
    private Boolean isMultiTenant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredefinedScopes")
    private String predefinedScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectUris")
    private String redirectUris;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshTokenValidity")
    private Integer refreshTokenValidity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequiredScopes")
    private String requiredScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretRequired")
    private Boolean secretRequired;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.accessTokenValidity = builder.accessTokenValidity;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.displayName = builder.displayName;
        this.isMultiTenant = builder.isMultiTenant;
        this.predefinedScopes = builder.predefinedScopes;
        this.redirectUris = builder.redirectUris;
        this.refreshTokenValidity = builder.refreshTokenValidity;
        this.requiredScopes = builder.requiredScopes;
        this.secretRequired = builder.secretRequired;
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
     * @return accessTokenValidity
     */
    public Integer getAccessTokenValidity() {
        return this.accessTokenValidity;
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return isMultiTenant
     */
    public Boolean getIsMultiTenant() {
        return this.isMultiTenant;
    }

    /**
     * @return predefinedScopes
     */
    public String getPredefinedScopes() {
        return this.predefinedScopes;
    }

    /**
     * @return redirectUris
     */
    public String getRedirectUris() {
        return this.redirectUris;
    }

    /**
     * @return refreshTokenValidity
     */
    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * @return requiredScopes
     */
    public String getRequiredScopes() {
        return this.requiredScopes;
    }

    /**
     * @return secretRequired
     */
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private Integer accessTokenValidity; 
        private String appName; 
        private String appType; 
        private String displayName; 
        private Boolean isMultiTenant; 
        private String predefinedScopes; 
        private String redirectUris; 
        private Integer refreshTokenValidity; 
        private String requiredScopes; 
        private Boolean secretRequired; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.accessTokenValidity = request.accessTokenValidity;
            this.appName = request.appName;
            this.appType = request.appType;
            this.displayName = request.displayName;
            this.isMultiTenant = request.isMultiTenant;
            this.predefinedScopes = request.predefinedScopes;
            this.redirectUris = request.redirectUris;
            this.refreshTokenValidity = request.refreshTokenValidity;
            this.requiredScopes = request.requiredScopes;
            this.secretRequired = request.secretRequired;
        } 

        /**
         * The validity period of the access token.
         * <p>
         * 
         * Valid values: 900 to 10800. Unit: seconds.
         * 
         * Default value: 3600.
         */
        public Builder accessTokenValidity(Integer accessTokenValidity) {
            this.putQueryParameter("AccessTokenValidity", accessTokenValidity);
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * The application name.
         * <p>
         * 
         * The name can be up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The type of the application. Valid values:
         * <p>
         * 
         * *   WebApp: a web application that interacts with a browser.
         * *   NativeApp: a native application that runs on an operating system, such as a desktop operating system or a mobile operating system.
         * *   ServerApp: an application that accesses Alibaba Cloud services without the need of manual user logon. User provisioning is automated based on the System for Cross-Domain Identity Management (SCIM) protocol.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The display name of the application.
         * <p>
         * 
         * The name can be up to 24 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Indicates whether the application can be installed by using other Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   true: If you do not set this parameter for applications of the NativeApp and ServerApp types, true is used.
         * *   false: If you do not set this parameter for applications of the WebApp type, false is used.
         */
        public Builder isMultiTenant(Boolean isMultiTenant) {
            this.putQueryParameter("IsMultiTenant", isMultiTenant);
            this.isMultiTenant = isMultiTenant;
            return this;
        }

        /**
         * The scope of application permissions.
         * <p>
         * 
         * For more information about the application permission scope, see [Open authorization scope](~~93693~~). You can also call the [ListPredefinedScopes](~~187206~~) operation to obtain the permission scopes supported by different types of applications.
         * 
         * If you enter multiple permission scopes, separate them with semicolons (;).
         */
        public Builder predefinedScopes(String predefinedScopes) {
            this.putQueryParameter("PredefinedScopes", predefinedScopes);
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * The callback URL.
         * <p>
         * 
         * If you enter multiple callback URLs, separate them with semicolons (;).
         */
        public Builder redirectUris(String redirectUris) {
            this.putQueryParameter("RedirectUris", redirectUris);
            this.redirectUris = redirectUris;
            return this;
        }

        /**
         * The validity period of the refreshed token.
         * <p>
         * 
         * Valid values: 7200 to 31536000. Unit: seconds.
         * 
         * Default value:
         * 
         * *   For applications of the WebApp and ServerApp types, if this parameter is left empty, the value 2592000 is used. The value 2592000 indicates that the validity period of the refreshed token is 30 days.
         * *   For applications of the NativeApp type, if this parameter is left empty, the value 7776000 is used. The value 7776000 indicates that the validity period of the refreshed token is 90 days.
         */
        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            this.putQueryParameter("RefreshTokenValidity", refreshTokenValidity);
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * The required permission.
         * <p>
         * 
         * You can specify one or more permissions for the `RequiredScopes` parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.
         * 
         * If you enter multiple permissions, separate them with semicolons (;).
         * 
         * >  If the permission that you specify for the `RequiredScopes` parameter is not included in value of the `PredefinedScopes` parameter, the permission does not take effect.
         */
        public Builder requiredScopes(String requiredScopes) {
            this.putQueryParameter("RequiredScopes", requiredScopes);
            this.requiredScopes = requiredScopes;
            return this;
        }

        /**
         * Indicates whether a secret is required. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >- For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.
         * >- For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see [Use an application of the NativeApp type to log on to Alibaba Cloud](~~93697~~).
         */
        public Builder secretRequired(Boolean secretRequired) {
            this.putQueryParameter("SecretRequired", secretRequired);
            this.secretRequired = secretRequired;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
