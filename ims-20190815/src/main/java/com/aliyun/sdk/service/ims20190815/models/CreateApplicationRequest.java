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
    @com.aliyun.core.annotation.NameInMap("AssignmentType")
    private String assignmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMultiTenant")
    private Boolean isMultiTenant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedPrincipalConsent")
    private Boolean needPrincipalConsent;

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
        this.assignmentType = builder.assignmentType;
        this.displayName = builder.displayName;
        this.isMultiTenant = builder.isMultiTenant;
        this.needPrincipalConsent = builder.needPrincipalConsent;
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
     * @return assignmentType
     */
    public String getAssignmentType() {
        return this.assignmentType;
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
     * @return needPrincipalConsent
     */
    public Boolean getNeedPrincipalConsent() {
        return this.needPrincipalConsent;
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
        private String assignmentType; 
        private String displayName; 
        private Boolean isMultiTenant; 
        private Boolean needPrincipalConsent; 
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
            this.assignmentType = request.assignmentType;
            this.displayName = request.displayName;
            this.isMultiTenant = request.isMultiTenant;
            this.needPrincipalConsent = request.needPrincipalConsent;
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
         * <p>The maximum length is 64 characters. Only letters, digits, periods (.), underscores (_), and hyphens (-) are allowed.</p>
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
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>WebApp: web applications that interact with users through browsers. </li>
         * <li>NativeApp: native applications that run in operating systems, primarily on desktop or shift operating systems. </li>
         * <li>ServerApp: applications that directly access Alibaba Cloud services without requiring user logons. Currently, only user synchronization applications based on the System for Cross-domain Identity Management protocol are supported.</li>
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
         * <p>The application assignment type. Valid values:</p>
         * <ul>
         * <li>AllowAll: assigns the application to all RAM users and roles in the account, allowing them to use the application.</li>
         * <li>OnDemand: assigns the application only to specified RAM users and roles in the account, allowing only them to use the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllowAll</p>
         */
        public Builder assignmentType(String assignmentType) {
            this.putQueryParameter("AssignmentType", assignmentType);
            this.assignmentType = assignmentType;
            return this;
        }

        /**
         * <p>The display name of the application.</p>
         * <p>Maximum length: 24 characters.</p>
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
         * <p>Specifies whether the application can be installed by other accounts. Valid values:</p>
         * <ul>
         * <li>true: For NativeApp and ServerApp applications, if this value is empty, the default value is true.</li>
         * <li>false: For WebApp applications, if this value is empty, the default value is false.</li>
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
         * <p>Specifies whether user authorization is required. Valid values:</p>
         * <ul>
         * <li>true: In addition to the authorization required during application installation, users must also authorize the application <strong>each time</strong> they use it for OAuth logon.</li>
         * <li>false: Authorization is required only during application installation. Users do not need additional authorization when they use the application for OAuth logon later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needPrincipalConsent(Boolean needPrincipalConsent) {
            this.putQueryParameter("NeedPrincipalConsent", needPrincipalConsent);
            this.needPrincipalConsent = needPrincipalConsent;
            return this;
        }

        /**
         * <p>The scopes of the application.</p>
         * <p>For the valid values and descriptions of application scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the scopes supported by different application types.</p>
         * <p>Separate multiple scopes with semicolons (;).</p>
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
         * <li>2.0: OAuth 2.0 protocol.</li>
         * <li>2.1: OAuth 2.1 protocol.</li>
         * </ul>
         * <p>Default value: 2.0.</p>
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
         * <p>The redirect URIs.</p>
         * <p>Separate multiple URIs with semicolons (;).</p>
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
         * <li>For NativeApp and ServerApp applications, if this value is empty, the default value is 2592000 seconds (30 days).</li>
         * <li>For WebApp applications, if this value is empty, the default value is 7776000 seconds (90 days).</li>
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
         * <p>The required scopes of the application.</p>
         * <p>You can set one or more scopes in RequiredScopes as required. After a scope is set as required, it is selected by default and cannot be deselected when a user authorizes the application.</p>
         * <p>Separate multiple scopes with semicolons (;).</p>
         * <blockquote>
         * <p>If a scope that you specify in RequiredScopes is not included in PredefinedScopes, the required scope does not take effect.</p>
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
         * <p>Specifies whether an application secret is required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>For WebApp and ServerApp applications, this value is forcibly set to true and cannot be modified.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>For NativeApp applications, you can set this value to true or false. If you do not specify this value, the default value is false. Because such applications often run in untrusted environments and cannot effectively protect application secrets, do not set this value to true unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud from a native application</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
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
