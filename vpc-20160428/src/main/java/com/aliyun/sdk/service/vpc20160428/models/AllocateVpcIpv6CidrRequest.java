// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateVpcIpv6CidrRequest} extends {@link RequestModel}
 *
 * <p>AllocateVpcIpv6CidrRequest</p>
 */
public class AllocateVpcIpv6CidrRequest extends Request {
    @Query
    @NameInMap("AddressPoolType")
    private String addressPoolType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @Query
    @NameInMap("Ipv6Isp")
    private String ipv6Isp;

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

    private AllocateVpcIpv6CidrRequest(Builder builder) {
        super(builder);
        this.addressPoolType = builder.addressPoolType;
        this.clientToken = builder.clientToken;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.ipv6Isp = builder.ipv6Isp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateVpcIpv6CidrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressPoolType
     */
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return ipv6Isp
     */
    public String getIpv6Isp() {
        return this.ipv6Isp;
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

    public static final class Builder extends Request.Builder<AllocateVpcIpv6CidrRequest, Builder> {
        private String addressPoolType; 
        private String clientToken; 
        private String ipv6CidrBlock; 
        private String ipv6Isp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateVpcIpv6CidrRequest request) {
            super(request);
            this.addressPoolType = request.addressPoolType;
            this.clientToken = request.clientToken;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.ipv6Isp = request.ipv6Isp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The type of the IPv6 address pool. Set the value to **custom**.
         * <p>
         * 
         * >  This parameter is required.
         */
        public Builder addressPoolType(String addressPoolType) {
            this.putQueryParameter("AddressPoolType", addressPoolType);
            this.addressPoolType = addressPoolType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * <p>
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The IPv6 CIDR block that you want to reserve.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * The type of IPv6 CIDR block. Valid values:
         * <p>
         * 
         * *   **BGP** (default)
         * *   **ChinaMobile**
         * *   **ChinaUnicom**
         * *   **ChinaTelecom**
         * 
         * > 
         * 
         * *   If your Alibaba Cloud account is allowed to use single-ISP bandwidth, valid values are: **ChinaTelecom**, **ChinaUnicom**, and **ChinaMobile**.
         * 
         * *   You can reserve only one IPv6 CIDR block of each type. After a reserved IPv6 CIDR block of a type is allocated to a VPC, you can reserve another IPv6 CIDR of the type.
         */
        public Builder ipv6Isp(String ipv6Isp) {
            this.putQueryParameter("Ipv6Isp", ipv6Isp);
            this.ipv6Isp = ipv6Isp;
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
         * The region ID of the VPC.
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

        @Override
        public AllocateVpcIpv6CidrRequest build() {
            return new AllocateVpcIpv6CidrRequest(this);
        } 

    } 

}
