// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateVpcCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>AssociateVpcCidrBlockRequest</p>
 */
public class AssociateVpcCidrBlockRequest extends Request {
    @Query
    @NameInMap("IPv6CidrBlock")
    private String iPv6CidrBlock;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("IpamPoolId")
    private String ipamPoolId;

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

    @Query
    @NameInMap("SecondaryCidrBlock")
    private String secondaryCidrBlock;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private AssociateVpcCidrBlockRequest(Builder builder) {
        super(builder);
        this.iPv6CidrBlock = builder.iPv6CidrBlock;
        this.ipVersion = builder.ipVersion;
        this.ipamPoolId = builder.ipamPoolId;
        this.ipv6Isp = builder.ipv6Isp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryCidrBlock = builder.secondaryCidrBlock;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateVpcCidrBlockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iPv6CidrBlock
     */
    public String getIPv6CidrBlock() {
        return this.iPv6CidrBlock;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
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

    /**
     * @return secondaryCidrBlock
     */
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AssociateVpcCidrBlockRequest, Builder> {
        private String iPv6CidrBlock; 
        private String ipVersion; 
        private String ipamPoolId; 
        private String ipv6Isp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondaryCidrBlock; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateVpcCidrBlockRequest request) {
            super(request);
            this.iPv6CidrBlock = request.iPv6CidrBlock;
            this.ipVersion = request.ipVersion;
            this.ipamPoolId = request.ipamPoolId;
            this.ipv6Isp = request.ipv6Isp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
            this.vpcId = request.vpcId;
        } 

        /**
         * The IPv6 CIDR block to be added.
         * <p>
         * 
         * >  You must and can specify only one of **SecondaryCidrBlock** and **Ipv6CidrBlock**.
         */
        public Builder iPv6CidrBlock(String iPv6CidrBlock) {
            this.putQueryParameter("IPv6CidrBlock", iPv6CidrBlock);
            this.iPv6CidrBlock = iPv6CidrBlock;
            return this;
        }

        /**
         * The version of the IP address. Valid values:
         * <p>
         * 
         * *   **IPV4**: the IPv4 address.
         * *   **IPV6**: the IPv6 address. If you set **IpVersion** to **IPV6** and do not specify **SecondaryCidrBlock**, you can add a secondary IPv6 CIDR block to the VPC.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The ID of the IP Address Manager (IPAM) pool that contains IPv4 addresses.
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.putQueryParameter("IpamPoolId", ipamPoolId);
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * The type of the IPv6 CIDR block. Valid values:
         * <p>
         * 
         * *   **BGP** (default)
         * *   **ChinaMobile**
         * *   **ChinaUnicom**
         * *   **ChinaTelecom**
         * 
         * >  If your Alibaba Cloud account is allowed to activate single-ISP bandwidth, you can set this parameter to **ChinaTelecom**, **ChinaUnicom**, or **ChinaMobile**.
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
         * The region ID of the VPC to which you want to add a secondary CIDR block.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the region ID.
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
         * The IPv4 CIDR block to be added. Take note of the following requirements:
         * <p>
         * 
         * *   You can specify one of the following standard IPv4 CIDR blocks or their subnets as the secondary IPv4 CIDR block of the VPC: 192.168.0.0/16, 172.16.0.0/12, and 10.0.0.0/8.
         * *   You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, or their subnets as the secondary IPv4 CIDR block of the VPC.
         * 
         * The CIDR block must meet the following requirements:
         * 
         * *   The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.
         * *   The CIDR block cannot overlap with the primary CIDR block or an existing secondary CIDR block of the VPC.
         * 
         * >  You must and can specify only one of **SecondaryCidrBlock** and **Ipv6CidrBlock**.
         */
        public Builder secondaryCidrBlock(String secondaryCidrBlock) {
            this.putQueryParameter("SecondaryCidrBlock", secondaryCidrBlock);
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }

        /**
         * The ID of the VPC to which you want to add a secondary CIDR block.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AssociateVpcCidrBlockRequest build() {
            return new AssociateVpcCidrBlockRequest(this);
        } 

    } 

}
