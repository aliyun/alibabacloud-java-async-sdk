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
         * Cipher.
         */
        public Builder cipher(String cipher) {
            this.putQueryParameter("Cipher", cipher);
            this.cipher = cipher;
            return this;
        }

        /**
         * ClientIpPool.
         */
        public Builder clientIpPool(String clientIpPool) {
            this.putQueryParameter("ClientIpPool", clientIpPool);
            this.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Compress.
         */
        public Builder compress(Boolean compress) {
            this.putQueryParameter("Compress", compress);
            this.compress = compress;
            return this;
        }

        /**
         * EnableMultiFactorAuth.
         */
        public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.putQueryParameter("EnableMultiFactorAuth", enableMultiFactorAuth);
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }

        /**
         * IDaaSInstanceId.
         */
        public Builder iDaaSInstanceId(String iDaaSInstanceId) {
            this.putQueryParameter("IDaaSInstanceId", iDaaSInstanceId);
            this.iDaaSInstanceId = iDaaSInstanceId;
            return this;
        }

        /**
         * IDaaSRegionId.
         */
        public Builder iDaaSRegionId(String iDaaSRegionId) {
            this.putQueryParameter("IDaaSRegionId", iDaaSRegionId);
            this.iDaaSRegionId = iDaaSRegionId;
            return this;
        }

        /**
         * LocalSubnet.
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * Name.
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
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * Proto.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * RegionId.
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
         * VpnGatewayId.
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
