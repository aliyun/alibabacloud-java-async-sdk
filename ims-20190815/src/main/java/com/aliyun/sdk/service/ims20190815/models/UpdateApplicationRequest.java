// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The validity period of the access token.
         * <p>
         * 
         * Valid values: 900 to 10800. Unit: seconds.
         */
        public Builder newAccessTokenValidity(Integer newAccessTokenValidity) {
            this.putQueryParameter("NewAccessTokenValidity", newAccessTokenValidity);
            this.newAccessTokenValidity = newAccessTokenValidity;
            return this;
        }

        /**
         * The display name.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * Specifies whether the application can be installed by using other Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder newIsMultiTenant(Boolean newIsMultiTenant) {
            this.putQueryParameter("NewIsMultiTenant", newIsMultiTenant);
            this.newIsMultiTenant = newIsMultiTenant;
            return this;
        }

        /**
         * The permission that is granted on the application.
         * <p>
         * 
         * For more information about the application permission scope, see [OAuth scopes](~~93693~~). You can also call the [ListPredefinedScopes](~~187206~~) operation to query the permissions that are supported by different types of applications.
         * 
         * If you enter multiple permissions, separate them with semicolons (;).
         * 
         * The new value of this parameter overwrites the original value, and the permission specified by the new value takes effect. For example, if the original value is `/acs/ccc`, and the new value is `/acs/alidns`, `/acs/alidns` takes effect. If you want to retain the original permission and the `/acs/alidns` permission, set the value to `/acs/ccc;/acs/alidns`.
         */
        public Builder newPredefinedScopes(String newPredefinedScopes) {
            this.putQueryParameter("NewPredefinedScopes", newPredefinedScopes);
            this.newPredefinedScopes = newPredefinedScopes;
            return this;
        }

        /**
         * The callback URL.
         * <p>
         * 
         * If you enter multiple callback URLs, separate them with semicolons (;).
         */
        public Builder newRedirectUris(String newRedirectUris) {
            this.putQueryParameter("NewRedirectUris", newRedirectUris);
            this.newRedirectUris = newRedirectUris;
            return this;
        }

        /**
         * The validity period of the refresh token.
         * <p>
         * 
         * Valid values: 7200 to 31536000. Unit: seconds.
         */
        public Builder newRefreshTokenValidity(Integer newRefreshTokenValidity) {
            this.putQueryParameter("NewRefreshTokenValidity", newRefreshTokenValidity);
            this.newRefreshTokenValidity = newRefreshTokenValidity;
            return this;
        }

        /**
         * The required permission.
         * <p>
         * 
         * You can specify one or more permissions for the `RequiredScopes` parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.
         * 
         * If you also specify the `NewPredefinedScopes` parameter, the `NewPredefinedScopes` parameter specifies the permissions that can be granted on the application, and this parameter specifies the required permissions.
         * 
         * If you enter multiple permissions, separate them with semicolons (;).
         * 
         * The new value of this parameter overwrites the original value, and the required permission specified by the new value takes effect.
         * 
         * >  If the permission that you specify for the `RequiredScopes` parameter is not included in value of the `PredefinedScopes` parameter, the permission does not take effect.
         */
        public Builder newRequiredScopes(String newRequiredScopes) {
            this.putQueryParameter("NewRequiredScopes", newRequiredScopes);
            this.newRequiredScopes = newRequiredScopes;
            return this;
        }

        /**
         * Specifies whether a secret is required. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * > 
         * 
         * *   For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.
         * *   For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see [Use an application of the NativeApp type to log on to Alibaba Cloud](~~93697~~).
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
