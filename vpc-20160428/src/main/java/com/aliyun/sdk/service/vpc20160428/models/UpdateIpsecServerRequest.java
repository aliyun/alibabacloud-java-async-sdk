// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIpsecServerRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpsecServerRequest</p>
 */
public class UpdateIpsecServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIpPool")
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
    @com.aliyun.core.annotation.NameInMap("IpsecConfig")
    private String ipsecConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipsecServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerName")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String ipsecServerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
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

    private UpdateIpsecServerRequest(Builder builder) {
        super(builder);
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.effectImmediately = builder.effectImmediately;
        this.ikeConfig = builder.ikeConfig;
        this.ipsecConfig = builder.ipsecConfig;
        this.ipsecServerId = builder.ipsecServerId;
        this.ipsecServerName = builder.ipsecServerName;
        this.localSubnet = builder.localSubnet;
        this.psk = builder.psk;
        this.pskEnabled = builder.pskEnabled;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpsecServerRequest create() {
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
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
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

    public static final class Builder extends Request.Builder<UpdateIpsecServerRequest, Builder> {
        private String clientIpPool; 
        private String clientToken; 
        private String dryRun; 
        private Boolean effectImmediately; 
        private String ikeConfig; 
        private String ipsecConfig; 
        private String ipsecServerId; 
        private String ipsecServerName; 
        private String localSubnet; 
        private String psk; 
        private Boolean pskEnabled; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpsecServerRequest request) {
            super(request);
            this.clientIpPool = request.clientIpPool;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.effectImmediately = request.effectImmediately;
            this.ikeConfig = request.ikeConfig;
            this.ipsecConfig = request.ipsecConfig;
            this.ipsecServerId = request.ipsecServerId;
            this.ipsecServerName = request.ipsecServerName;
            this.localSubnet = request.localSubnet;
            this.psk = request.psk;
            this.pskEnabled = request.pskEnabled;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client.</p>
         * <blockquote>
         * <p> The client CIDR block must not overlap with the CIDR blocks of the VPC.</p>
         * </blockquote>
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
         * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck this request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without modifying the configurations of the IPsec server. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: sends the request. This is the default value. If the request passes the precheck, the system modifies the configurations of the IPsec server.</li>
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
         * <p>Specifies whether to delete the negotiated IPsec tunnel and initiate the negotiation again. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: immediately initiates negotiations after the configuration is complete.</li>
         * <li><strong>false</strong>: initiates negotiations when inbound traffic is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * <p>The configuration of Phase 1 negotiations. Valid values:</p>
         * <ul>
         * <li><strong>IkeVersion</strong>: The IKE version. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</li>
         * <li><strong>IkeMode</strong>: The IKE negotiation mode. Default value: <strong>main</strong>.</li>
         * <li><strong>IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiation. Default value: <strong>aes</strong>.</li>
         * <li><strong>IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiation. Default value: <strong>sha1</strong>.</li>
         * <li><strong>IkePfs</strong>: The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Default value: <strong>group2</strong>.</li>
         * <li><strong>IkeLifetime</strong>: The SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
         * <li><strong>LocalId</strong>: The identifier of the IPsec server. Only FQDN and IP address formats are supported.</li>
         * <li><strong>RemoteId</strong>: the peer identifier. Only FQDN and IP address formats are supported.</li>
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
         * <p>The configuration of Phase 2 negotiation. Valid values:</p>
         * <ul>
         * <li><strong>IpsecEncAlg</strong>: the encryption algorithm that is used in Phase 2 negotiation. Default value: <strong>aes</strong>.</li>
         * <li><strong>IpsecAuthAlg</strong>: the authentication algorithm that is used in Phase 2 negotiation. Default value: <strong>sha1</strong>.</li>
         * <li><strong>IpsecPfs</strong>: forwards packets of all protocols. The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiation. Default value: <strong>group2</strong>.</li>
         * <li><strong>IpsecLifetime</strong>: the SA lifetime determined by Phase 2 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
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
         * <p>The IPsec server ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-bp1bo3xuvcxo7ixll****</p>
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * <p>The name of the IPsec server.</p>
         * <p>It must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipsecServerName(String ipsecServerName) {
            this.putQueryParameter("IpsecServerName", ipsecServerName);
            this.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * <p>The local CIDR blocks, which are the CIDR blocks of the virtual private cloud (VPC) for the client to access.</p>
         * <p>Multiple CIDR blocks are separated with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24,172.17.0.0/16</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The pre-shared key.</p>
         * <p>The pre-shared key that is used for authentication between the IPsec-VPN server and the client. It must be 1 to 100 characters in length.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2794120.html">ListIpsecServers</a> to query keys generated by the system.</p>
         * <blockquote>
         * <p> The pre-shared key of the IPsec server key must be the same as that of the client. Otherwise, the connection between the IPsec server and the client cannot be established.</p>
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
         * <p>Specifies whether to enable pre-shared key authentication. If you set the value to <strong>true</strong>, pre-shared key authentication is enabled.</p>
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
         * <p>The ID of the region where the IPsec server is created.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateIpsecServerRequest build() {
            return new UpdateIpsecServerRequest(this);
        } 

    } 

}
