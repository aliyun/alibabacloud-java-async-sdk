// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSslVpnServerRequest} extends {@link RequestModel}
 *
 * <p>CreateSslVpnServerRequest</p>
 */
public class CreateSslVpnServerRequest extends Request {
    @Query
    @NameInMap("Cipher")
    private String cipher;

    @Query
    @NameInMap("ClientIpPool")
    @Validation(required = true)
    private String clientIpPool;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Compress")
    private Boolean compress;

    @Query
    @NameInMap("EnableMultiFactorAuth")
    private Boolean enableMultiFactorAuth;

    @Query
    @NameInMap("IDaaSInstanceId")
    private String iDaaSInstanceId;

    @Query
    @NameInMap("IDaaSRegionId")
    private String iDaaSRegionId;

    @Query
    @NameInMap("LocalSubnet")
    @Validation(required = true)
    private String localSubnet;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Port")
    private Integer port;

    @Query
    @NameInMap("Proto")
    private String proto;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    private CreateSslVpnServerRequest(Builder builder) {
        super(builder);
        this.cipher = builder.cipher;
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.compress = builder.compress;
        this.enableMultiFactorAuth = builder.enableMultiFactorAuth;
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
         * The encryption algorithm that is used in the SSL-VPN connection. Valid values:
         * <p>
         * 
         * *   **AES-128-CBC** (default): AES-128-CBC
         * *   **AES-192-CBC**: AES-192-CBC
         * *   **AES-256-CBC**: AES-256-CBC
         * *   **none**: does not use an encryption algorithm.
         */
        public Builder cipher(String cipher) {
            this.putQueryParameter("Cipher", cipher);
            this.cipher = cipher;
            return this;
        }

        /**
         * The client CIDR block.
         * <p>
         * 
         * The CIDR block that is allocated to the virtual network interface of the client. It is not the CIDR block where the client resides.
         * 
         * When the client accesses the destination network through an SSL-VPN connection, the VPN gateway allocates an IP address from the client CIDR block to the client.
         * 
         * >  This CIDR block cannot conflict with the CIDR block specified by **LocalSubnet**.
         */
        public Builder clientIpPool(String clientIpPool) {
            this.putQueryParameter("ClientIpPool", clientIpPool);
            this.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable data compression. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false** (default): no
         */
        public Builder compress(Boolean compress) {
            this.putQueryParameter("Compress", compress);
            this.compress = compress;
            return this;
        }

        /**
         * Specifies whether to enable two-factor authentication. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false** (default): no
         * 
         * >  To enable two-factor authentication, make sure that the VPN gateway was created after 00:00:00 (UTC+8), March 5, 2020. Otherwise, two-factor authentication is not supported.
         */
        public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.putQueryParameter("EnableMultiFactorAuth", enableMultiFactorAuth);
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }

        /**
         * The ID of the IDaaS instance.
         */
        public Builder iDaaSInstanceId(String iDaaSInstanceId) {
            this.putQueryParameter("IDaaSInstanceId", iDaaSInstanceId);
            this.iDaaSInstanceId = iDaaSInstanceId;
            return this;
        }

        /**
         * The ID of the region where the IDaaS instance is created.
         */
        public Builder iDaaSRegionId(String iDaaSRegionId) {
            this.putQueryParameter("IDaaSRegionId", iDaaSRegionId);
            this.iDaaSRegionId = iDaaSRegionId;
            return this;
        }

        /**
         * The local CIDR block.
         * <p>
         * 
         * The CIDR block to be accessed by the client through the SSL-VPN connection.
         * 
         * This value can be the CIDR block of a virtual private cloud (VPC), a vSwitch, a data center that is connected to a VPC through an Express Connect circuit, or Object Storage Service (OSS).
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * The name of the SSL server.
         * <p>
         * 
         * The name must be 1 to 100 characters in length, and cannot start with `http://` or `https://`.
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
         * The port used by the SSL server. Default value: **1194**. The following ports cannot be used:
         * <p>
         * 
         * **22, 2222, 22222, 9000, 9001, 9002, 7505, 80, 443, 53, 68, 123, 4510, 4560, 500, and 4500**.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The protocol that is used by the SSL server. Valid values:
         * <p>
         * 
         * *   **TCP**: TCP
         * *   **UDP** (default): UDP
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * The ID of the region where the VPN gateway is created.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The ID of the VPN gateway.
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
