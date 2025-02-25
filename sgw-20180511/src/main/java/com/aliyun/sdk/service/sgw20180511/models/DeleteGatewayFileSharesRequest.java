// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayFileSharesRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayFileSharesRequest</p>
 */
public class DeleteGatewayFileSharesRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteGatewayFileSharesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayFileSharesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayFileSharesRequest, Builder> {
        private Boolean force; 
        private String gatewayId; 
        private String indexId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayFileSharesRequest request) {
            super(request);
            this.force = request.force;
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.securityToken = request.securityToken;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
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
        public DeleteGatewayFileSharesRequest build() {
            return new DeleteGatewayFileSharesRequest(this);
        } 

    } 

}
