// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIpsecServerRequest} extends {@link RequestModel}
 *
 * <p>CreateIpsecServerRequest</p>
 */
public class CreateIpsecServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIpPool")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientIpPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IkeConfig")
    private String ikeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSecServerName")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String ipSecServerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecConfig")
    private String ipsecConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localSubnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Psk")
    private String psk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PskEnabled")
    private Boolean pskEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnGatewayId;

    private CreateIpsecServerRequest(Builder builder) {
        super(builder);
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.effectImmediately = builder.effectImmediately;
        this.ikeConfig = builder.ikeConfig;
        this.ipSecServerName = builder.ipSecServerName;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.psk = builder.psk;
        this.pskEnabled = builder.pskEnabled;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsecServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpPool
     */
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return ikeConfig
     */
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipSecServerName
     */
    public String getIpSecServerName() {
        return this.ipSecServerName;
    }

    /**
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return psk
     */
    public String getPsk() {
        return this.psk;
    }

    /**
     * @return pskEnabled
     */
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<CreateIpsecServerRequest, Builder> {
        private String clientIpPool; 
        private String clientToken; 
        private String dryRun; 
        private Boolean effectImmediately; 
        private String ikeConfig; 
        private String ipSecServerName; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String psk; 
        private Boolean pskEnabled; 
        private String regionId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpsecServerRequest request) {
            super(request);
            this.clientIpPool = request.clientIpPool;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.effectImmediately = request.effectImmediately;
            this.ikeConfig = request.ikeConfig;
            this.ipSecServerName = request.ipSecServerName;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.psk = request.psk;
            this.pskEnabled = request.pskEnabled;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The client CIDR block, which is the address range used to assign IP addresses to virtual network interface controllers (NICs) of clients.</p>
         * <blockquote>
         * <p>The client CIDR block cannot conflict with the VPC-side CIDR block.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder clientIpPool(String clientIpPool) {
            this.putQueryParameter("ClientIpPool", clientIpPool);
            this.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d7d24a21-f4ba-4454-9173-b38****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without creating the IPsec server. The system checks the required parameters, request format, and service limits. If the check fails, the corresponding error message is returned. If the check succeeds, <code>DryRunOperation</code> is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends the request. After the request passes the check, the IPsec server is created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the configuration takes effect immediately. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Negotiation starts immediately after the configuration is complete.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Negotiation starts when inbound traffic is detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * <p>The parameter settings of Phase 1 negotiations. Valid values:</p>
         * <ul>
         * <li><p><strong>IkeVersion</strong>: The version of the IKE protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev2</strong>.</p>
         * </li>
         * <li><p><strong>IkeMode</strong>: The negotiation pattern of the IKE version. Default value: <strong>main</strong>.</p>
         * </li>
         * <li><p><strong>IkeEncAlg</strong>: The encryption algorithm used in Phase 1 negotiations. Default value: <strong>aes</strong>.</p>
         * </li>
         * <li><p><strong>IkeAuthAlg</strong>: The authentication algorithm used in Phase 1 negotiations. Default value: <strong>sha1</strong>.</p>
         * </li>
         * <li><p><strong>IkePfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 1 negotiations. Default value: <strong>group2</strong>.</p>
         * </li>
         * <li><p><strong>IkeLifetime</strong>: The epoch of the security association (SA) negotiated in Phase 1. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * </li>
         * <li><p><strong>LocalId</strong>: The identity of the IPsec server. The FQDN and IP address formats are supported. Default value: the public IP address of the VPN gateway.</p>
         * </li>
         * <li><p><strong>RemoteId</strong>: The identity of the peer. The FQDN and IP address formats are supported. Default value: empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IkeVersion&quot;:&quot;ikev2&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400}</p>
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * <p>The name of the IPsec server.</p>
         * <p>The name must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipSecServerName(String ipSecServerName) {
            this.putQueryParameter("IpSecServerName", ipSecServerName);
            this.ipSecServerName = ipSecServerName;
            return this;
        }

        /**
         * <p>The parameter settings of Phase 2 negotiations. Valid values:</p>
         * <ul>
         * <li><p><strong>IpsecEncAlg</strong>: The encryption algorithm used in Phase 2 negotiations. Default value: <strong>aes</strong>.</p>
         * </li>
         * <li><p><strong>IpsecAuthAlg</strong>: The authentication algorithm used in Phase 2 negotiations. Default value: <strong>sha1</strong>.</p>
         * </li>
         * <li><p><strong>IpsecPfs</strong>: Forward all protocol packets. The Diffie-Hellman key exchange algorithm used in Phase 2 negotiations. Default value: <strong>group2</strong>.</p>
         * </li>
         * <li><p><strong>IpsecLifetime</strong>: The epoch of the SA negotiated in Phase 2. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * <p>The local CIDR block, which is the VPC-side CIDR block that needs to communicate with the client CIDR block.</p>
         * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The pre-shared key.</p>
         * <p>The pre-shared key is used for identity authentication between the IPsec server and the client. The key must be 1 to 100 characters in length.</p>
         * <p>If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2794120.html">ListIpsecServers</a> operation to query the pre-shared key generated by the system.</p>
         * <blockquote>
         * <p>The pre-shared key of the IPsec server must be the same as the authentication key of the client. Otherwise, a connection cannot be established between the IPsec server and the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Cfd123****</p>
         */
        public Builder psk(String psk) {
            this.putQueryParameter("Psk", psk);
            this.psk = psk;
            return this;
        }

        /**
         * <p>Specifies whether to enable pre-shared key authentication. Valid values: <strong>true</strong>, which indicates that pre-shared key authentication is enabled.</p>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pskEnabled(Boolean pskEnabled) {
            this.putQueryParameter("PskEnabled", pskEnabled);
            this.pskEnabled = pskEnabled;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID of the VPN gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp17lofy9fd0dnvzv****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public CreateIpsecServerRequest build() {
            return new CreateIpsecServerRequest(this);
        } 

    } 

}
