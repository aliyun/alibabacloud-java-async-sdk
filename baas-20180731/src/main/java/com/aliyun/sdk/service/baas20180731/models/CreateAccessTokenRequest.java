// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessTokenRequest</p>
 */
public class CreateAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessTokenLifetime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessTokenLifetime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefreshTokenLifetime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refreshTokenLifetime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    private CreateAccessTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessTokenLifetime = builder.accessTokenLifetime;
        this.organizationId = builder.organizationId;
        this.refreshTokenLifetime = builder.refreshTokenLifetime;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accessTokenLifetime
     */
    public String getAccessTokenLifetime() {
        return this.accessTokenLifetime;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return refreshTokenLifetime
     */
    public String getRefreshTokenLifetime() {
        return this.refreshTokenLifetime;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<CreateAccessTokenRequest, Builder> {
        private String regionId; 
        private String accessTokenLifetime; 
        private String organizationId; 
        private String refreshTokenLifetime; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessTokenLifetime = request.accessTokenLifetime;
            this.organizationId = request.organizationId;
            this.refreshTokenLifetime = request.refreshTokenLifetime;
            this.scope = request.scope;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AccessTokenLifetime.
         */
        public Builder accessTokenLifetime(String accessTokenLifetime) {
            this.putBodyParameter("AccessTokenLifetime", accessTokenLifetime);
            this.accessTokenLifetime = accessTokenLifetime;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * RefreshTokenLifetime.
         */
        public Builder refreshTokenLifetime(String refreshTokenLifetime) {
            this.putBodyParameter("RefreshTokenLifetime", refreshTokenLifetime);
            this.refreshTokenLifetime = refreshTokenLifetime;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public CreateAccessTokenRequest build() {
            return new CreateAccessTokenRequest(this);
        } 

    } 

}
