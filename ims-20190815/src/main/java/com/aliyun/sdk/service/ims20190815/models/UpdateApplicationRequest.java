// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("NewAccessTokenValidity")
    private Integer newAccessTokenValidity;

    @Query
    @NameInMap("NewDisplayName")
    private String newDisplayName;

    @Query
    @NameInMap("NewIsMultiTenant")
    private Boolean newIsMultiTenant;

    @Query
    @NameInMap("NewPredefinedScopes")
    private String newPredefinedScopes;

    @Query
    @NameInMap("NewRedirectUris")
    private String newRedirectUris;

    @Query
    @NameInMap("NewRefreshTokenValidity")
    private Integer newRefreshTokenValidity;

    @Query
    @NameInMap("NewRequiredScopes")
    private String newRequiredScopes;

    @Query
    @NameInMap("NewSecretRequired")
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
         * The validity period of the new access token.
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
         * The new display name of the application.
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
         * The new scope of application permissions.
         * <p>
         * 
         * For more information about the application permission scope, see [Open authorization scope](~~93693~~). You can also call the [ListPredefinedScopes](~~187206~~) operation to obtain the permission scopes supported by different types of applications.
         * 
         * Separate multiple permission scopes with semicolons (;).
         * 
         * If you specify a new permission scope, the new permission scope takes effect. For example, if the original permission scope is `/acs/ccc`, and the new permission scope is `/acs/alidns`, `/acs/alidns` takes effect. If you want to retain the original permission scope, set the new permission scope to `/acs/ccc;/acs/alidns`.
         */
        public Builder newPredefinedScopes(String newPredefinedScopes) {
            this.putQueryParameter("NewPredefinedScopes", newPredefinedScopes);
            this.newPredefinedScopes = newPredefinedScopes;
            return this;
        }

        /**
         * The new callback URL.
         * <p>
         * 
         * Separate multiple callback URLs with semicolons (;).
         */
        public Builder newRedirectUris(String newRedirectUris) {
            this.putQueryParameter("NewRedirectUris", newRedirectUris);
            this.newRedirectUris = newRedirectUris;
            return this;
        }

        /**
         * The validity period of the refreshed token.
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
         * NewRequiredScopes.
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
