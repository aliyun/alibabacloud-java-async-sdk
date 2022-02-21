// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @Query
    @NameInMap("AccessTokenValidity")
    private Integer accessTokenValidity;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("IsMultiTenant")
    private Boolean isMultiTenant;

    @Query
    @NameInMap("PredefinedScopes")
    private String predefinedScopes;

    @Query
    @NameInMap("RedirectUris")
    private String redirectUris;

    @Query
    @NameInMap("RefreshTokenValidity")
    private Integer refreshTokenValidity;

    @Query
    @NameInMap("SecretRequired")
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
        private Boolean secretRequired; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest response) {
            super(response);
            this.accessTokenValidity = response.accessTokenValidity;
            this.appName = response.appName;
            this.appType = response.appType;
            this.displayName = response.displayName;
            this.isMultiTenant = response.isMultiTenant;
            this.predefinedScopes = response.predefinedScopes;
            this.redirectUris = response.redirectUris;
            this.refreshTokenValidity = response.refreshTokenValidity;
            this.secretRequired = response.secretRequired;
        } 

        /**
         * AccessTokenValidity.
         */
        public Builder accessTokenValidity(Integer accessTokenValidity) {
            this.putQueryParameter("AccessTokenValidity", accessTokenValidity);
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * IsMultiTenant.
         */
        public Builder isMultiTenant(Boolean isMultiTenant) {
            this.putQueryParameter("IsMultiTenant", isMultiTenant);
            this.isMultiTenant = isMultiTenant;
            return this;
        }

        /**
         * PredefinedScopes.
         */
        public Builder predefinedScopes(String predefinedScopes) {
            this.putQueryParameter("PredefinedScopes", predefinedScopes);
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * RedirectUris.
         */
        public Builder redirectUris(String redirectUris) {
            this.putQueryParameter("RedirectUris", redirectUris);
            this.redirectUris = redirectUris;
            return this;
        }

        /**
         * RefreshTokenValidity.
         */
        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            this.putQueryParameter("RefreshTokenValidity", refreshTokenValidity);
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * SecretRequired.
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
