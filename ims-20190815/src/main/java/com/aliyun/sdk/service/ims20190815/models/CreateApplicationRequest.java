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
         * <p>The name can be up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
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
         * <li>WebApp: a web application that interacts with a browser.</li>
         * <li>NativeApp: a native application that runs on an operating system, such as a desktop operating system or a mobile operating system.</li>
         * <li>ServerApp: an application that accesses Alibaba Cloud services without the need of manual user logon. User provisioning is automated based on the System for Cross-Domain Identity Management (SCIM) protocol.</li>
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
         * <p>The name can be up to 24 characters in length.</p>
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
         * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>true: If you do not set this parameter for applications of the NativeApp and ServerApp types, true is used.</li>
         * <li>false: If you do not set this parameter for applications of the WebApp type, false is used.</li>
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
         * <p>For more information about the application permission scope, see <a href="https://help.aliyun.com/document_detail/93693.html">Open authorization scope</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the permission scopes supported by different types of applications.</p>
         * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid</p>
         */
        public Builder predefinedScopes(String predefinedScopes) {
            this.putQueryParameter("PredefinedScopes", predefinedScopes);
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * <p>The callback URL.</p>
         * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
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
         * <p>The validity period of the refreshed token.</p>
         * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>For applications of the WebApp and ServerApp types, if this parameter is left empty, the value 2592000 is used. The value 2592000 indicates that the validity period of the refreshed token is 30 days.</li>
         * <li>For applications of the NativeApp type, if this parameter is left empty, the value 7776000 is used. The value 7776000 indicates that the validity period of the refreshed token is 90 days.</li>
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
         * <p>You can specify one or more permissions for the <code>RequiredScopes</code> parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.</p>
         * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
         * <blockquote>
         * <p> If the permission that you specify for the <code>RequiredScopes</code> parameter is not included in value of the <code>PredefinedScopes</code> parameter, the permission does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliuid;profile</p>
         */
        public Builder requiredScopes(String requiredScopes) {
            this.putQueryParameter("RequiredScopes", requiredScopes);
            this.requiredScopes = requiredScopes;
            return this;
        }

        /**
         * <p>Indicates whether a secret is required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</li>
         * <li>For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Use an application of the NativeApp type to log on to Alibaba Cloud</a>.</li>
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
