// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportGatewayUsageRequest} extends {@link RequestModel}
 *
 * <p>ReportGatewayUsageRequest</p>
 */
public class ReportGatewayUsageRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    @Validation(required = true)
    private String clientUUID;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Usage")
    private String usage;

    private ReportGatewayUsageRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportGatewayUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientUUID
     */
    public String getClientUUID() {
        return this.clientUUID;
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
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<ReportGatewayUsageRequest, Builder> {
        private String clientUUID; 
        private String gatewayId; 
        private String securityToken; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(ReportGatewayUsageRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.usage = request.usage;
        } 

        /**
         * ClientUUID.
         */
        public Builder clientUUID(String clientUUID) {
            this.putQueryParameter("ClientUUID", clientUUID);
            this.clientUUID = clientUUID;
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
         * Usage.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public ReportGatewayUsageRequest build() {
            return new ReportGatewayUsageRequest(this);
        } 

    } 

}
