// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpsecServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpsecServerResponseBody</p>
 */
public class CreateIpsecServerResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("IpsecServerId")
    private String ipsecServerId;

    @NameInMap("IpsecServerName")
    private String ipsecServerName;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private CreateIpsecServerResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.ipsecServerId = builder.ipsecServerId;
        this.ipsecServerName = builder.ipsecServerName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsecServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return ipsecServerId
     */
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    /**
     * @return ipsecServerName
     */
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private String creationTime; 
        private String ipsecServerId; 
        private String ipsecServerName; 
        private String regionId; 
        private String requestId; 
        private String vpnGatewayId; 

        /**
         * The time when the IPsec server was created.
         * <p>
         * 
         * T is used as a delimiter. Z indicates that the time is in UTC.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The ID of the IPsec server.
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * The name of the IPsec server.
         */
        public Builder ipsecServerName(String ipsecServerName) {
            this.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * The ID of the region where the VPN gateway is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public CreateIpsecServerResponseBody build() {
            return new CreateIpsecServerResponseBody(this);
        } 

    } 

}
