// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySslVpnServerRequest} extends {@link RequestModel}
 *
 * <p>ModifySslVpnServerRequest</p>
 */
public class ModifySslVpnServerRequest extends Request {
    @Query
    @NameInMap("Cipher")
    private String cipher;

    @Query
    @NameInMap("ClientIpPool")
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
    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    private String sslVpnServerId;

    private ModifySslVpnServerRequest(Builder builder) {
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
        this.sslVpnServerId = builder.sslVpnServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySslVpnServerRequest create() {
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
     * @return sslVpnServerId
     */
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public static final class Builder extends Request.Builder<ModifySslVpnServerRequest, Builder> {
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
        private String sslVpnServerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySslVpnServerRequest request) {
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
            this.sslVpnServerId = request.sslVpnServerId;
        } 

        /**
         * The encryption algorithm that is used in the SSL-VPN connection. Valid values:
         * <p>
         * 
         * *   **AES-128-CBC** (default)
         * *   **AES-192-CBC**
         * *   **AES-256-CBC**
         * *   **none**
         */
        public Builder cipher(String cipher) {
            this.putQueryParameter("Cipher", cipher);
            this.cipher = cipher;
            return this;
        }

        /**
         * The client IP address pool.
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** is different for each request.
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
         * *   **true** (default)
         * *   **false**
         */
        public Builder compress(Boolean compress) {
            this.putQueryParameter("Compress", compress);
            this.compress = compress;
            return this;
        }

        /**
         * Specifies whether to enable two-factor authentication. If you enable two-factor authentication, you must also specify an IDaaS instance ID. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > *   Two-factor authentication supports only IDaaS instances of earlier versions. If you do not have and cannot create IDaaS instances of earlier versions, you cannot enable two-factor authentication.
         * > *   For existing SSL servers, if two-factor authentication is already enabled, you can continue to use two-factor authentication.
         */
        public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.putQueryParameter("EnableMultiFactorAuth", enableMultiFactorAuth);
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }

        /**
         * The ID of the Identity as a Service (IDaaS) instance.
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
         * The CIDR block of the client.
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
         * The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.
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
         * The port that is used by the SSL server. Valid values of port numbers: **1** to **65535**. Default value: **1194**.
         * <p>
         * 
         * The following ports are not supported: **22**, **2222**, **22222**, **9000**, **9001**, **9002**, **7505**, **80**, **443**, **53**, **68**, **123**, **4510**, **4560**, **500**, and **4500**.
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
         * *   **TCP** (default)
         * *   **UDP**
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * The region ID of the VPN gateway.
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
         * The ID of the SSL server.
         */
        public Builder sslVpnServerId(String sslVpnServerId) {
            this.putQueryParameter("SslVpnServerId", sslVpnServerId);
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }

        @Override
        public ModifySslVpnServerRequest build() {
            return new ModifySslVpnServerRequest(this);
        } 

    } 

}
