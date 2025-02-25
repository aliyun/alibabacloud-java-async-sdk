// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartFileSharesRequest} extends {@link RequestModel}
 *
 * <p>RestartFileSharesRequest</p>
 */
public class RestartFileSharesRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ShareProtocol")
    @Validation(required = true)
    private String shareProtocol;

    private RestartFileSharesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.shareProtocol = builder.shareProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartFileSharesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return shareProtocol
     */
    public String getShareProtocol() {
        return this.shareProtocol;
    }

    public static final class Builder extends Request.Builder<RestartFileSharesRequest, Builder> {
        private String gatewayId; 
        private String securityToken; 
        private String shareProtocol; 

        private Builder() {
            super();
        } 

        private Builder(RestartFileSharesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.shareProtocol = request.shareProtocol;
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
         * ShareProtocol.
         */
        public Builder shareProtocol(String shareProtocol) {
            this.putQueryParameter("ShareProtocol", shareProtocol);
            this.shareProtocol = shareProtocol;
            return this;
        }

        @Override
        public RestartFileSharesRequest build() {
            return new RestartFileSharesRequest(this);
        } 

    } 

}
