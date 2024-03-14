// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGatewayDNSRequest} extends {@link RequestModel}
 *
 * <p>SetGatewayDNSRequest</p>
 */
public class SetGatewayDNSRequest extends Request {
    @Query
    @NameInMap("DnsServer")
    @Validation(required = true)
    private String dnsServer;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetGatewayDNSRequest(Builder builder) {
        super(builder);
        this.dnsServer = builder.dnsServer;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGatewayDNSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsServer
     */
    public String getDnsServer() {
        return this.dnsServer;
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

    public static final class Builder extends Request.Builder<SetGatewayDNSRequest, Builder> {
        private String dnsServer; 
        private String gatewayId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetGatewayDNSRequest request) {
            super(request);
            this.dnsServer = request.dnsServer;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
        } 

        /**
         * DnsServer.
         */
        public Builder dnsServer(String dnsServer) {
            this.putQueryParameter("DnsServer", dnsServer);
            this.dnsServer = dnsServer;
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

        @Override
        public SetGatewayDNSRequest build() {
            return new SetGatewayDNSRequest(this);
        } 

    } 

}
