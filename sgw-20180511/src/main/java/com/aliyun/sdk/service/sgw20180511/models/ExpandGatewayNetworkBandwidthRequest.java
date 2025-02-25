// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpandGatewayNetworkBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ExpandGatewayNetworkBandwidthRequest</p>
 */
public class ExpandGatewayNetworkBandwidthRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("NewNetworkBandwidth")
    private Integer newNetworkBandwidth;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ExpandGatewayNetworkBandwidthRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.newNetworkBandwidth = builder.newNetworkBandwidth;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandGatewayNetworkBandwidthRequest create() {
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
     * @return newNetworkBandwidth
     */
    public Integer getNewNetworkBandwidth() {
        return this.newNetworkBandwidth;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ExpandGatewayNetworkBandwidthRequest, Builder> {
        private String gatewayId; 
        private Integer newNetworkBandwidth; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ExpandGatewayNetworkBandwidthRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.newNetworkBandwidth = request.newNetworkBandwidth;
            this.securityToken = request.securityToken;
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
         * NewNetworkBandwidth.
         */
        public Builder newNetworkBandwidth(Integer newNetworkBandwidth) {
            this.putQueryParameter("NewNetworkBandwidth", newNetworkBandwidth);
            this.newNetworkBandwidth = newNetworkBandwidth;
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
        public ExpandGatewayNetworkBandwidthRequest build() {
            return new ExpandGatewayNetworkBandwidthRequest(this);
        } 

    } 

}
