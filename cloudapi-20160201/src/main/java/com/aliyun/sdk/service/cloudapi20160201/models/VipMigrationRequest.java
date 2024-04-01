// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VipMigrationRequest} extends {@link RequestModel}
 *
 * <p>VipMigrationRequest</p>
 */
public class VipMigrationRequest extends Request {
    @Query
    @NameInMap("NewVip")
    @Validation(required = true)
    private String newVip;

    @Query
    @NameInMap("OriginalVip")
    @Validation(required = true)
    private String originalVip;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private VipMigrationRequest(Builder builder) {
        super(builder);
        this.newVip = builder.newVip;
        this.originalVip = builder.originalVip;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VipMigrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newVip
     */
    public String getNewVip() {
        return this.newVip;
    }

    /**
     * @return originalVip
     */
    public String getOriginalVip() {
        return this.originalVip;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<VipMigrationRequest, Builder> {
        private String newVip; 
        private String originalVip; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(VipMigrationRequest request) {
            super(request);
            this.newVip = request.newVip;
            this.originalVip = request.originalVip;
            this.securityToken = request.securityToken;
        } 

        /**
         * NewVip.
         */
        public Builder newVip(String newVip) {
            this.putQueryParameter("NewVip", newVip);
            this.newVip = newVip;
            return this;
        }

        /**
         * OriginalVip.
         */
        public Builder originalVip(String originalVip) {
            this.putQueryParameter("OriginalVip", originalVip);
            this.originalVip = originalVip;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public VipMigrationRequest build() {
            return new VipMigrationRequest(this);
        } 

    } 

}
