// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserResourcePackageRequest</p>
 */
public class DescribeCdnUserResourcePackageRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeCdnUserResourcePackageRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserResourcePackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserResourcePackageRequest, Builder> {
        private Long ownerId; 
        private String securityToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserResourcePackageRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.status = response.status;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCdnUserResourcePackageRequest build() {
            return new DescribeCdnUserResourcePackageRequest(this);
        } 

    } 

}
