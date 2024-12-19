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
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewIsMultiTenant")
    private Boolean newIsMultiTenant;

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
        this.newDisplayName = builder.newDisplayName;
        this.newIsMultiTenant = builder.newIsMultiTenant;
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
        private String newDisplayName; 
        private Boolean newIsMultiTenant; 
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
            this.newDisplayName = request.newDisplayName;
            this.newIsMultiTenant = request.newIsMultiTenant;
            this.newPredefinedScopes = request.newPredefinedScopes;
            this.newRedirectUris = request.newRedirectUris;
            this.newRefreshTokenValidity = request.newRefreshTokenValidity;
            this.newRequiredScopes = request.newRequiredScopes;
            this.newSecretRequired = request.newSecretRequired;
        } 

        /**
         * <p>The ID of the application.</p>
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
         * <p>Specifies whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The permission that is granted on the application.</p>
         * <p>For more information about the application permission scope, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to query the permissions that are supported by different types of applications.</p>
         * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
         * <p>The new value of this parameter overwrites the original value, and the permission specified by the new value takes effect. For example, if the original value is <code>/acs/ccc</code>, and the new value is <code>/acs/alidns</code>, <code>/acs/alidns</code> takes effect. If you want to retain the original permission and the <code>/acs/alidns</code> permission, set the value to <code>/acs/ccc;/acs/alidns</code>.</p>
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
         * <p>The callback URL.</p>
         * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
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
         * <p>The required permission.</p>
         * <p>You can specify one or more permissions for the <code>RequiredScopes</code> parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.</p>
         * <p>If you also specify the <code>NewPredefinedScopes</code> parameter, the <code>NewPredefinedScopes</code> parameter specifies the permissions that can be granted on the application, and this parameter specifies the required permissions.</p>
         * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
         * <p>The new value of this parameter overwrites the original value, and the required permission specified by the new value takes effect.</p>
         * <blockquote>
         * <p> If the permission that you specify for the <code>RequiredScopes</code> parameter is not included in value of the <code>PredefinedScopes</code> parameter, the permission does not take effect.</p>
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
         * <p>Specifies whether a secret is required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</li>
         * <li>For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Use an application of the NativeApp type to log on to Alibaba Cloud</a>.</li>
         * </ul>
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
