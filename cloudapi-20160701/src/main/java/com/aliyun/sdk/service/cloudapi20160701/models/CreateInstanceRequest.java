// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("AccountQuantity")
    @Validation(required = true)
    private Integer accountQuantity;

    @Query
    @NameInMap("ExpiredOn")
    @Validation(required = true)
    private String expiredOn;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SkuId")
    @Validation(required = true)
    private String skuId;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.accountQuantity = builder.accountQuantity;
        this.expiredOn = builder.expiredOn;
        this.securityToken = builder.securityToken;
        this.skuId = builder.skuId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountQuantity
     */
    public Integer getAccountQuantity() {
        return this.accountQuantity;
    }

    /**
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Integer accountQuantity; 
        private String expiredOn; 
        private String securityToken; 
        private String skuId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.accountQuantity = request.accountQuantity;
            this.expiredOn = request.expiredOn;
            this.securityToken = request.securityToken;
            this.skuId = request.skuId;
            this.token = request.token;
        } 

        /**
         * AccountQuantity.
         */
        public Builder accountQuantity(Integer accountQuantity) {
            this.putQueryParameter("AccountQuantity", accountQuantity);
            this.accountQuantity = accountQuantity;
            return this;
        }

        /**
         * ExpiredOn.
         */
        public Builder expiredOn(String expiredOn) {
            this.putQueryParameter("ExpiredOn", expiredOn);
            this.expiredOn = expiredOn;
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
         * SkuId.
         */
        public Builder skuId(String skuId) {
            this.putQueryParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
