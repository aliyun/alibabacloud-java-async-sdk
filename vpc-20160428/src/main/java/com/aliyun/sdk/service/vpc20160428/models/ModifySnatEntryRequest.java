// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySnatEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifySnatEntryRequest</p>
 */
public class ModifySnatEntryRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("SnatEntryId")
    @Validation(required = true)
    private String snatEntryId;

    @Query
    @NameInMap("SnatEntryName")
    private String snatEntryName;

    @Query
    @NameInMap("SnatIp")
    private String snatIp;

    @Query
    @NameInMap("SnatTableId")
    @Validation(required = true)
    private String snatTableId;

    private ModifySnatEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatTableId = builder.snatTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return snatTableId
     */
    public String getSnatTableId() {
        return this.snatTableId;
    }

    public static final class Builder extends Request.Builder<ModifySnatEntryRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private String snatTableId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySnatEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snatEntryId = request.snatEntryId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.snatTableId = request.snatTableId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The region ID of the NAT gateway.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.
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
         * The ID of the SNAT entry that you want to modify.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The name of the SNAT entry.
         * <p>
         * 
         * The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * *   The elastic IP addresses (EIPs) specified in the SNAT entry when you modify an SNAT entry of an Internet NAT gateway. Separate EIPs with commas (,).
         * <p>
         * 
         *     If you select multiple EIPs to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limit of an individual EIP.
         * 
         * *   When you modify an SNAT entry of a VPC NAT gateway, this parameter specifies the NAT IP address in the SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The ID of the SNAT table to which the SNAT entry belongs.
         */
        public Builder snatTableId(String snatTableId) {
            this.putQueryParameter("SnatTableId", snatTableId);
            this.snatTableId = snatTableId;
            return this;
        }

        @Override
        public ModifySnatEntryRequest build() {
            return new ModifySnatEntryRequest(this);
        } 

    } 

}
