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
            this.newSecretRequired = request.newSecretRequired;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * NewAccessTokenValidity.
         */
        public Builder newAccessTokenValidity(Integer newAccessTokenValidity) {
            this.putQueryParameter("NewAccessTokenValidity", newAccessTokenValidity);
            this.newAccessTokenValidity = newAccessTokenValidity;
            return this;
        }

        /**
         * NewDisplayName.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * NewIsMultiTenant.
         */
        public Builder newIsMultiTenant(Boolean newIsMultiTenant) {
            this.putQueryParameter("NewIsMultiTenant", newIsMultiTenant);
            this.newIsMultiTenant = newIsMultiTenant;
            return this;
        }

        /**
         * NewPredefinedScopes.
         */
        public Builder newPredefinedScopes(String newPredefinedScopes) {
            this.putQueryParameter("NewPredefinedScopes", newPredefinedScopes);
            this.newPredefinedScopes = newPredefinedScopes;
            return this;
        }

        /**
         * NewRedirectUris.
         */
        public Builder newRedirectUris(String newRedirectUris) {
            this.putQueryParameter("NewRedirectUris", newRedirectUris);
            this.newRedirectUris = newRedirectUris;
            return this;
        }

        /**
         * NewRefreshTokenValidity.
         */
        public Builder newRefreshTokenValidity(Integer newRefreshTokenValidity) {
            this.putQueryParameter("NewRefreshTokenValidity", newRefreshTokenValidity);
            this.newRefreshTokenValidity = newRefreshTokenValidity;
            return this;
        }

        /**
         * NewSecretRequired.
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
