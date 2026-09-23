// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
    @com.aliyun.core.annotation.NameInMap("ProtocolVersion")
    private String protocolVersion;

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
        this.protocolVersion = builder.protocolVersion;
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
     * @return protocolVersion
     */
    public String getProtocolVersion() {
        return this.protocolVersion;
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
        private String protocolVersion; 
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
            this.protocolVersion = request.protocolVersion;
            this.redirectUris = request.redirectUris;
            this.refreshTokenValidity = request.refreshTokenValidity;
            this.requiredScopes = request.requiredScopes;
            this.secretRequired = request.secretRequired;
        } 

        /**
         * <p>The validity period of the access token.</p>
         * <p>Valid values: 900 to 10800. Unit: seconds.</p>
         * <p>Default value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder accessTokenValidity(Integer accessTokenValidity) {
            this.putQueryParameter("AccessTokenValidity", accessTokenValidity);
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>It can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li><p>WebApp: a web application that is based on browser interaction.</p>
         * </li>
         * <li><p>NativeApp: a native application that runs on an operating system, such as a desktop or mobile operating system.</p>
         * </li>
         * <li><p>ServerApp: an application that directly accesses Alibaba Cloud services without user logon. Currently, only applications that use the System for Cross-domain Identity Management (SCIM) protocol for user synchronization are supported.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WebApp</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The display name of the application.</p>
         * <p>It can be up to 24 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether the application can be installed by other Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li><p>true: If not specified, the default value is true for NativeApp and ServerApp applications.</p>
         * </li>
         * <li><p>false: If not specified, the default value is false for WebApp applications.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isMultiTenant(Boolean isMultiTenant) {
            this.putQueryParameter("IsMultiTenant", isMultiTenant);
            this.isMultiTenant = isMultiTenant;
            return this;
        }

        /**
         * <p>The scope of application permissions.</p>
         * <p>For more information about the application permission scope, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth overview</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the scopes that are supported by different application types.</p>
         * <p>To specify multiple permissions, separate them with semicolons (;).</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid;profile</p>
         */
        public Builder predefinedScopes(String predefinedScopes) {
            this.putQueryParameter("PredefinedScopes", predefinedScopes);
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * <p>The OAuth protocol version of the application. Valid values:</p>
         * <ul>
         * <li><p><code>2.0</code>: OAuth 2.0</p>
         * </li>
         * <li><p><code>2.1</code>: OAuth 2.1</p>
         * </li>
         * </ul>
         * <p>Default value: <code>2.0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder protocolVersion(String protocolVersion) {
            this.putQueryParameter("ProtocolVersion", protocolVersion);
            this.protocolVersion = protocolVersion;
            return this;
        }

        /**
         * <p>The redirect URL of the application.</p>
         * <p>To specify multiple URLs, separate them with semicolons (;).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        public Builder redirectUris(String redirectUris) {
            this.putQueryParameter("RedirectUris", redirectUris);
            this.redirectUris = redirectUris;
            return this;
        }

        /**
         * <p>The validity period of the refresh token.</p>
         * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If not specified, the default value is 2,592,000 seconds (30 days) for NativeApp and ServerApp applications.</p>
         * </li>
         * <li><p>If not specified, the default value is 7,776,000 seconds (90 days) for WebApp applications.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2592000</p>
         */
        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            this.putQueryParameter("RefreshTokenValidity", refreshTokenValidity);
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * <p>The required permission.</p>
         * <p>You can specify one or more permissions for the <code>RequiredScopes</code> parameter. When a user grants permissions to the application, the scopes specified in this parameter are pre-selected and cannot be deselected.</p>
         * <p>To enter multiple scopes, separate them with semicolons (;).</p>
         * <blockquote>
         * <p>Any scope specified here must also be included in <code>PredefinedScopes</code>. Otherwise, the scope will not be set as required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliuid</p>
         */
        public Builder requiredScopes(String requiredScopes) {
            this.putQueryParameter("RequiredScopes", requiredScopes);
            this.requiredScopes = requiredScopes;
            return this;
        }

        /**
         * <p>Specifies whether a secret is required. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For applications of the WebApp and ServerApp types, this parameter is required and is always set to true.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For applications of the NativeApp type, you can set this parameter to true or false. If not specified, the default value is false. Since native applications are public clients and cannot reliably protect secrets, we recommend keeping this false unless a secret is strictly required. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Access Alibaba Cloud APIs from a native application</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
