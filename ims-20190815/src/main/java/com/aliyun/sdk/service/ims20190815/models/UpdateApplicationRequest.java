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
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAccessTokenValidity")
    private Integer newAccessTokenValidity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAssignmentType")
    private String newAssignmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewIsMultiTenant")
    private Boolean newIsMultiTenant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewNeedPrincipalConsent")
    private Boolean newNeedPrincipalConsent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPredefinedScopes")
    private String newPredefinedScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRedirectUris")
    private String newRedirectUris;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRefreshTokenValidity")
    private Integer newRefreshTokenValidity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRequiredScopes")
    private String newRequiredScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSecretRequired")
    private Boolean newSecretRequired;

    private UpdateApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.newAccessTokenValidity = builder.newAccessTokenValidity;
        this.newAssignmentType = builder.newAssignmentType;
        this.newDisplayName = builder.newDisplayName;
        this.newIsMultiTenant = builder.newIsMultiTenant;
        this.newNeedPrincipalConsent = builder.newNeedPrincipalConsent;
        this.newPredefinedScopes = builder.newPredefinedScopes;
        this.newRedirectUris = builder.newRedirectUris;
        this.newRefreshTokenValidity = builder.newRefreshTokenValidity;
        this.newRequiredScopes = builder.newRequiredScopes;
        this.newSecretRequired = builder.newSecretRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationRequest create() {
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
     * @return newAccessTokenValidity
     */
    public Integer getNewAccessTokenValidity() {
        return this.newAccessTokenValidity;
    }

    /**
     * @return newAssignmentType
     */
    public String getNewAssignmentType() {
        return this.newAssignmentType;
    }

    /**
     * @return newDisplayName
     */
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    /**
     * @return newIsMultiTenant
     */
    public Boolean getNewIsMultiTenant() {
        return this.newIsMultiTenant;
    }

    /**
     * @return newNeedPrincipalConsent
     */
    public Boolean getNewNeedPrincipalConsent() {
        return this.newNeedPrincipalConsent;
    }

    /**
     * @return newPredefinedScopes
     */
    public String getNewPredefinedScopes() {
        return this.newPredefinedScopes;
    }

    /**
     * @return newRedirectUris
     */
    public String getNewRedirectUris() {
        return this.newRedirectUris;
    }

    /**
     * @return newRefreshTokenValidity
     */
    public Integer getNewRefreshTokenValidity() {
        return this.newRefreshTokenValidity;
    }

    /**
     * @return newRequiredScopes
     */
    public String getNewRequiredScopes() {
        return this.newRequiredScopes;
    }

    /**
     * @return newSecretRequired
     */
    public Boolean getNewSecretRequired() {
        return this.newSecretRequired;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationRequest, Builder> {
        private String appId; 
        private Integer newAccessTokenValidity; 
        private String newAssignmentType; 
        private String newDisplayName; 
        private Boolean newIsMultiTenant; 
        private Boolean newNeedPrincipalConsent; 
        private String newPredefinedScopes; 
        private String newRedirectUris; 
        private Integer newRefreshTokenValidity; 
        private String newRequiredScopes; 
        private Boolean newSecretRequired; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.newAccessTokenValidity = request.newAccessTokenValidity;
            this.newAssignmentType = request.newAssignmentType;
            this.newDisplayName = request.newDisplayName;
            this.newIsMultiTenant = request.newIsMultiTenant;
            this.newNeedPrincipalConsent = request.newNeedPrincipalConsent;
            this.newPredefinedScopes = request.newPredefinedScopes;
            this.newRedirectUris = request.newRedirectUris;
            this.newRefreshTokenValidity = request.newRefreshTokenValidity;
            this.newRequiredScopes = request.newRequiredScopes;
            this.newSecretRequired = request.newSecretRequired;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>472457090344041****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The validity period of the access token.</p>
         * <p>Valid values: 900 to 10800. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder newAccessTokenValidity(Integer newAccessTokenValidity) {
            this.putQueryParameter("NewAccessTokenValidity", newAccessTokenValidity);
            this.newAccessTokenValidity = newAccessTokenValidity;
            return this;
        }

        /**
         * <p>The application assignment type. Valid values:</p>
         * <ul>
         * <li>AllowAll: Full assignment. All RAM users and roles under the account are allowed to use the application.</li>
         * <li>OnDemand: On-demand assignment. Only specified RAM users and roles under the account are allowed to use the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AlloAll</p>
         */
        public Builder newAssignmentType(String newAssignmentType) {
            this.putQueryParameter("NewAssignmentType", newAssignmentType);
            this.newAssignmentType = newAssignmentType;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>NewApp</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>Specifies whether the application can be installed by other accounts. Valid values:</p>
         * <ul>
         * <li><p>true: Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newIsMultiTenant(Boolean newIsMultiTenant) {
            this.putQueryParameter("NewIsMultiTenant", newIsMultiTenant);
            this.newIsMultiTenant = newIsMultiTenant;
            return this;
        }

        /**
         * <p>Specifies whether user authorization is required. Valid values:</p>
         * <ul>
         * <li>true: In addition to the authorization required during application installation, the user must also authorize the application <strong>each time</strong> they use it for OAuth logon.</li>
         * <li>false: Authorization is required only during application installation. No additional authorization is required when the user uses the application for OAuth logon later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newNeedPrincipalConsent(Boolean newNeedPrincipalConsent) {
            this.putQueryParameter("NewNeedPrincipalConsent", newNeedPrincipalConsent);
            this.newNeedPrincipalConsent = newNeedPrincipalConsent;
            return this;
        }

        /**
         * <p>The application permission scopes.</p>
         * <p>For the valid values and descriptions of application permission scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the application permission scopes supported by different application types.</p>
         * <p>Separate multiple scopes with semicolons (;).</p>
         * <p>The new scopes overwrite the original scopes. For example, if the original scope is /acs/ccc and the new scope is /acs/alidns, the effective scope is /acs/alidns. To add /acs/alidns to the original scopes, set the new scopes to /acs/ccc;/acs/alidns.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        public Builder newPredefinedScopes(String newPredefinedScopes) {
            this.putQueryParameter("NewPredefinedScopes", newPredefinedScopes);
            this.newPredefinedScopes = newPredefinedScopes;
            return this;
        }

        /**
         * <p>The callback URLs. Separate multiple URLs with semicolons (;).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        public Builder newRedirectUris(String newRedirectUris) {
            this.putQueryParameter("NewRedirectUris", newRedirectUris);
            this.newRedirectUris = newRedirectUris;
            return this;
        }

        /**
         * <p>The validity period of the refresh token.</p>
         * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7776000</p>
         */
        public Builder newRefreshTokenValidity(Integer newRefreshTokenValidity) {
            this.putQueryParameter("NewRefreshTokenValidity", newRefreshTokenValidity);
            this.newRefreshTokenValidity = newRefreshTokenValidity;
            return this;
        }

        /**
         * <p>The required application permission scopes.</p>
         * <p>You can set one or more scopes in RequiredScopes as required. After a scope is set as required, it is selected by default and cannot be deselected when a user authorizes the application.</p>
         * <p>If you also specify NewPredefinedScopes, the scope list of the application is reset by using NewPredefinedScopes first, and then this parameter is used to specify whether the scopes are required.</p>
         * <p>Separate multiple scopes with semicolons (;).</p>
         * <p>The new required scopes overwrite the original required scopes.</p>
         * <blockquote>
         * <p>If a scope specified in RequiredScopes is not included in PredefinedScopes, the required setting for this scope does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>profile;aliuid</p>
         */
        public Builder newRequiredScopes(String newRequiredScopes) {
            this.putQueryParameter("NewRequiredScopes", newRequiredScopes);
            this.newRequiredScopes = newRequiredScopes;
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
         * <li>For NativeApp applications, you can set this value to true or false. If you do not specify this parameter, the default value is false. Because such applications usually run in untrusted environments and cannot effectively protect application secrets, do not set this value to true unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud from a native application</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newSecretRequired(Boolean newSecretRequired) {
            this.putQueryParameter("NewSecretRequired", newSecretRequired);
            this.newSecretRequired = newSecretRequired;
            return this;
        }

        @Override
        public UpdateApplicationRequest build() {
            return new UpdateApplicationRequest(this);
        } 

    } 

}
