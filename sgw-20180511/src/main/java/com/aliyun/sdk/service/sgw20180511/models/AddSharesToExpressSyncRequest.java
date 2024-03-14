// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSharesToExpressSyncRequest} extends {@link RequestModel}
 *
 * <p>AddSharesToExpressSyncRequest</p>
 */
public class AddSharesToExpressSyncRequest extends Request {
    @Query
    @NameInMap("ExpressSyncId")
    @Validation(required = true)
    private String expressSyncId;

    @Query
    @NameInMap("GatewayShares")
    @Validation(required = true)
    private String gatewayShares;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private AddSharesToExpressSyncRequest(Builder builder) {
        super(builder);
        this.expressSyncId = builder.expressSyncId;
        this.gatewayShares = builder.gatewayShares;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSharesToExpressSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressSyncId
     */
    public String getExpressSyncId() {
        return this.expressSyncId;
    }

    /**
     * @return gatewayShares
     */
    public String getGatewayShares() {
        return this.gatewayShares;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddSharesToExpressSyncRequest, Builder> {
        private String expressSyncId; 
        private String gatewayShares; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddSharesToExpressSyncRequest request) {
            super(request);
            this.expressSyncId = request.expressSyncId;
            this.gatewayShares = request.gatewayShares;
            this.securityToken = request.securityToken;
        } 

        /**
         * ExpressSyncId.
         */
        public Builder expressSyncId(String expressSyncId) {
            this.putQueryParameter("ExpressSyncId", expressSyncId);
            this.expressSyncId = expressSyncId;
            return this;
        }

        /**
         * GatewayShares.
         */
        public Builder gatewayShares(String gatewayShares) {
            this.putQueryParameter("GatewayShares", gatewayShares);
            this.gatewayShares = gatewayShares;
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
        public AddSharesToExpressSyncRequest build() {
            return new AddSharesToExpressSyncRequest(this);
        } 

    } 

}
