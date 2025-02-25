// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCacheRequest} extends {@link RequestModel}
 *
 * <p>CreateCacheRequest</p>
 */
public class CreateCacheRequest extends Request {
    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SizeInGB")
    @Validation(required = true)
    private Long sizeInGB;

    private CreateCacheRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.sizeInGB = builder.sizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sizeInGB
     */
    public Long getSizeInGB() {
        return this.sizeInGB;
    }

    public static final class Builder extends Request.Builder<CreateCacheRequest, Builder> {
        private String category; 
        private String gatewayId; 
        private String securityToken; 
        private Long sizeInGB; 

        private Builder() {
            super();
        } 

        private Builder(CreateCacheRequest request) {
            super(request);
            this.category = request.category;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.sizeInGB = request.sizeInGB;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
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
         * SizeInGB.
         */
        public Builder sizeInGB(Long sizeInGB) {
            this.putQueryParameter("SizeInGB", sizeInGB);
            this.sizeInGB = sizeInGB;
            return this;
        }

        @Override
        public CreateCacheRequest build() {
            return new CreateCacheRequest(this);
        } 

    } 

}
