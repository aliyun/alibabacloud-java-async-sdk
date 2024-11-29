// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIpsecServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpsecServerResponseBody</p>
 */
public class CreateIpsecServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("IpsecServerId")
    private String ipsecServerId;

    @com.aliyun.core.annotation.NameInMap("IpsecServerName")
    private String ipsecServerName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
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
         * <p>The time when the IPsec server was created.</p>
         * <p>T is used as a delimiter. Z indicates that the time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-22T03:24:28Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The IPsec server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-bp1jougp8cfsbo8y9****</p>
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * <p>The IPsec server name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipsecServerName(String ipsecServerName) {
            this.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * <p>The ID of the region where the VPN gateway is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>690A967E-D4CD-4B69-8C78-94FE828BA10B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp17lofy9fd0dnvzv****</p>
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
