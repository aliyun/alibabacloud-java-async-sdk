// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSslVpnServerRequest} extends {@link RequestModel}
 *
 * <p>CreateSslVpnServerRequest</p>
 */
public class CreateSslVpnServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cipher")
    private String cipher;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIpPool")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientIpPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Compress")
    private Boolean compress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMultiFactorAuth")
    private Boolean enableMultiFactorAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IDaaSApplicationId")
    private String iDaaSApplicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IDaaSInstanceId")
    private String iDaaSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IDaaSRegionId")
    private String iDaaSRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localSubnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proto")
    private String proto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnGatewayId;

    private CreateSslVpnServerRequest(Builder builder) {
        super(builder);
        this.cipher = builder.cipher;
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.compress = builder.compress;
        this.enableMultiFactorAuth = builder.enableMultiFactorAuth;
        this.iDaaSApplicationId = builder.iDaaSApplicationId;
        this.iDaaSInstanceId = builder.iDaaSInstanceId;
        this.iDaaSRegionId = builder.iDaaSRegionId;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.proto = builder.proto;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSslVpnServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cipher
     */
    public String getCipher() {
        return this.cipher;
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
     * @return compress
     */
    public Boolean getCompress() {
        return this.compress;
    }

    /**
     * @return enableMultiFactorAuth
     */
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    /**
     * @return iDaaSApplicationId
     */
    public String getIDaaSApplicationId() {
        return this.iDaaSApplicationId;
    }

    /**
     * @return iDaaSInstanceId
     */
    public String getIDaaSInstanceId() {
        return this.iDaaSInstanceId;
    }

    /**
     * @return iDaaSRegionId
     */
    public String getIDaaSRegionId() {
        return this.iDaaSRegionId;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<CreateSslVpnServerRequest, Builder> {
        private String cipher; 
        private String clientIpPool; 
        private String clientToken; 
        private Boolean compress; 
        private Boolean enableMultiFactorAuth; 
        private String iDaaSApplicationId; 
        private String iDaaSInstanceId; 
        private String iDaaSRegionId; 
        private String localSubnet; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer port; 
        private String proto; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSslVpnServerRequest request) {
            super(request);
            this.cipher = request.cipher;
            this.clientIpPool = request.clientIpPool;
            this.clientToken = request.clientToken;
            this.compress = request.compress;
            this.enableMultiFactorAuth = request.enableMultiFactorAuth;
            this.iDaaSApplicationId = request.iDaaSApplicationId;
            this.iDaaSInstanceId = request.iDaaSInstanceId;
            this.iDaaSRegionId = request.iDaaSRegionId;
            this.localSubnet = request.localSubnet;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.proto = request.proto;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The encryption algorithm that is used by the SSL-VPN connection.</p>
         * <ul>
         * <li><p>If the client uses Tunnelblick or OpenVPN 2.4.0 or later, the SSL server dynamically negotiates with the client about the encryption algorithm and uses the most secure encryption algorithm that is supported by the SSL server and the client. The encryption algorithm that you specify for the SSL server does not take effect.</p>
         * </li>
         * <li><p>If the client uses OpenVPN of a version that is earlier than 2.4.0, the SSL server and the client use the encryption algorithm that you specify for the SSL server. You can specify one of the following encryption algorithms for the SSL server:</p>
         * <ul>
         * <li><strong>AES-128-CBC</strong> (default)</li>
         * <li><strong>AES-192-CBC</strong></li>
         * <li><strong>AES-256-CBC</strong></li>
         * <li><strong>none</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES-128-CBC</p>
         */
        public Builder cipher(String cipher) {
            this.putQueryParameter("Cipher", cipher);
            this.cipher = cipher;
            return this;
        }

        /**
         * <p>The client CIDR block.</p>
         * <p>It is the CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client. It is not the private CIDR block of the client.</p>
         * <p>If the client accesses the SSL server over an SSL-VPN connection, the VPN gateway assigns an IP address from the specified client CIDR block to the client. The client uses the assigned IP address to access cloud resources.</p>
         * <p>Make sure that the number of IP addresses in the client CIDR block is at least four times the maximum number of SSL-VPN connections supported by the VPN gateway.</p>
         * <details>
         * <summary>Click to view the reason.</summary>
         * 
         * <p>For example, if you specify 192.168.0.0/24 as the client CIDR block, the system first divides a subnet CIDR block with a subnet mask of 30 from 192.168.0.0/24, such as 192.168.0.4/30. This subnet provides up to four IP addresses. Then, the system allocates an IP address from 192.168.0.4/30 to the client and uses the other three IP addresses to ensure network communication. In this case, one client consumes four IP addresses. Therefore, to ensure that an IP address is assigned to your client, you must make sure that the number of IP addresses in the client CIDR block is at least four times the maximum number of SSL-VPN connections supported by the VPN gateway with which the SSL server is associated.</p>
         * </details>
         * 
         * <details>
         * <summary>Click to view the CIDR blocks that are not supported.</summary>
         * 
         * <ul>
         * <li>100.64.0.0~100.127.255.255</li>
         * <li>127.0.0.0~127.255.255.255</li>
         * <li>169.254.0.0~169.254.255.255</li>
         * <li>224.0.0.0~239.255.255.255</li>
         * <li>255.0.0.0~255.255.255.255</details></li>
         * </ul>
         * <details>
         * <summary>Click to view the recommended client CIDR blocks for different numbers of SSL-VPN connections.</summary>
         * 
         * <ul>
         * <li>If the number of SSL-VPN connections is 5, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 27 bits in length. Examples: 10.0.0.0/27 and 10.0.0.0/26.</li>
         * <li>If the number of SSL-VPN connections is 10, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 26 bits in length. Examples: 10.0.0.0/26 and 10.0.0.0/25.</li>
         * <li>If the number of SSL-VPN connections is 20, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 25 bits in length. Examples: 10.0.0.0/25 and 10.0.0.0/24.</li>
         * <li>If the number of SSL-VPN connections is 50, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 24 bits in length. Examples: 10.0.0.0/24 and 10.0.0.0/23.</li>
         * <li>If the number of SSL-VPN connections is 100, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 23 bits in length. Examples: 10.0.0.0/23 and 10.0.0.0/22.</li>
         * <li>If the number of SSL-VPN connections is 200, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 22 bits in length. Examples: 10.0.0.0/22 and 10.0.0.0/21.</li>
         * <li>If the number of SSL-VPN connections is 500, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 21 bits in length. Examples: 10.0.0.0/21 and 10.0.0.0/20.</li>
         * <li>If the number of SSL-VPN connections is 1,000, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 20 bits in length. Examples: 10.0.0.0/20 and 10.0.0.0/19.</details></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The subnet mask of the client CIDR block must be 16 to 29 bits in length.</li>
         * <li>Make sure that the local CIDR block and the client CIDR block do not overlap with each other.</li>
         * <li>We recommend that you use 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16, or one of their subnets as the client CIDR block. If you want to specify a public CIDR block as the client CIDR block, you must specify the public CIDR block as the user CIDR block of the virtual private cloud (VPC). This way, the VPC can access the public CIDR block. For more information, see <a href="https://help.aliyun.com/document_detail/185311.html">VPC FAQ</a>.</li>
         * <li>After you create an SSL server, the system automatically adds routes that point to the client CIDR block to the VPC route table, which is not displayed in the console by default. Do not add routes that point to the client CIDR block to the VPC route table again. Otherwise, SSL-VPN connections cannot work as expected.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
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
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable data compression. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder compress(Boolean compress) {
            this.putQueryParameter("Compress", compress);
            this.compress = compress;
            return this;
        }

        /**
         * <p>Specifies whether to enable two-factor authentication. To enable two-factor authentication, you need to specify <code>IDaaSInstanceId</code>, <code>IDaaSRegionId</code>, and <code>IDaaSApplicationId</code>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you use two-factor authentication for the first time, you need to complete <a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22%3A%5B%7B%22Service%22%3A%22VPN%22%2C%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunVpnAccessingIdaasRole%22%2C%22TemplateId%22%3A%22IdaasRole%22%7D%5D%7D%5D%2C%22ReturnUrl%22%3A%22https%3A%2F%2Fvpc.console.aliyun.com%2Fsslvpn%2Fcn-shanghai%2Fvpn-servers%22%7D">authorization</a> before you create an SSL server.</p>
         * </li>
         * <li><p>IDaaS EIAM 1.0 instances are no longer available for purchase. If your Alibaba Cloud account has IDaaS EIAM 1.0 instances, IDaaS EIAM 1.0 instances can be associated after two-factor authentication is enabled. If your Alibaba Cloud account does not have IDaaS EIAM 1.0 instances, only IDaaS EIAM 2.0 instances can be associated after two-factor authentication is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.putQueryParameter("EnableMultiFactorAuth", enableMultiFactorAuth);
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }

        /**
         * <p>The ID of the IDaaS application.</p>
         * <ul>
         * <li>If an IDaaS EIAM 2.0 instance is associated, you need to specify an IDaaS application ID.</li>
         * <li>If an IDaaS EIAM 1.0 instance is associated, you do not need to specify an IDaaS application ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app_my6g4qmvnwxzj2f****</p>
         */
        public Builder iDaaSApplicationId(String iDaaSApplicationId) {
            this.putQueryParameter("IDaaSApplicationId", iDaaSApplicationId);
            this.iDaaSApplicationId = iDaaSApplicationId;
            return this;
        }

        /**
         * <p>The ID of the IDaaS EIAM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-cn-hangzhou-p****</p>
         */
        public Builder iDaaSInstanceId(String iDaaSInstanceId) {
            this.putQueryParameter("IDaaSInstanceId", iDaaSInstanceId);
            this.iDaaSInstanceId = iDaaSInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the IDaaS EIAM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder iDaaSRegionId(String iDaaSRegionId) {
            this.putQueryParameter("IDaaSRegionId", iDaaSRegionId);
            this.iDaaSRegionId = iDaaSRegionId;
            return this;
        }

        /**
         * <p>The local CIDR block.</p>
         * <p>It is the CIDR block that your client needs to access by using the SSL-VPN connection.</p>
         * <p>This value can be the CIDR block of a VPC, a vSwitch, a data center that is connected to a VPC by using an Express Connect circuit, or an Alibaba Cloud service such as Object Storage Service (OSS).</p>
         * <p>The subnet mask of the specified local CIDR block must be 8 to 32 bits in length. You cannot specify the following CIDR blocks as the local CIDR blocks:</p>
         * <ul>
         * <li>100.64.0.0~100.127.255.255</li>
         * <li>127.0.0.0~127.255.255.255</li>
         * <li>169.254.0.0~169.254.255.255</li>
         * <li>224.0.0.0~239.255.255.255</li>
         * <li>255.0.0.0~255.255.255.255</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The SSL server name.</p>
         * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sslvpnname</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The port that is used by the SSL server. Valid values of port numbers: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>1194</strong>.</p>
         * <p>The following ports are not supported: <strong>22</strong>, <strong>2222</strong>, <strong>22222</strong>, <strong>9000</strong>, <strong>9001</strong>, <strong>9002</strong>, <strong>7505</strong>, <strong>80</strong>, <strong>443</strong>, <strong>53</strong>, <strong>68</strong>, <strong>123</strong>, <strong>4510</strong>, <strong>4560</strong>, <strong>500</strong>, and <strong>4500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1194</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The protocol that is used by the SSL server. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong> (default)</li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway.</p>
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

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1hgim8by0kc9nga****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public CreateSslVpnServerRequest build() {
            return new CreateSslVpnServerRequest(this);
        } 

    } 

}
