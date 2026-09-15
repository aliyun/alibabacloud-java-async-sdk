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
 * {@link AssociateVpcCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>AssociateVpcCidrBlockRequest</p>
 */
public class AssociateVpcCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPv6CidrBlock")
    private String iPv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    private String ipamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrMask")
    private Integer ipv6CidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
    private String ipv6Isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
    private String secondaryCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrMask")
    private Integer secondaryCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private AssociateVpcCidrBlockRequest(Builder builder) {
        super(builder);
        this.iPv6CidrBlock = builder.iPv6CidrBlock;
        this.ipVersion = builder.ipVersion;
        this.ipamPoolId = builder.ipamPoolId;
        this.ipv6CidrMask = builder.ipv6CidrMask;
        this.ipv6Isp = builder.ipv6Isp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryCidrBlock = builder.secondaryCidrBlock;
        this.secondaryCidrMask = builder.secondaryCidrMask;
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
     * @return ipv6CidrMask
     */
    public Integer getIpv6CidrMask() {
        return this.ipv6CidrMask;
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
     * @return secondaryCidrMask
     */
    public Integer getSecondaryCidrMask() {
        return this.secondaryCidrMask;
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
        private Integer ipv6CidrMask; 
        private String ipv6Isp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondaryCidrBlock; 
        private Integer secondaryCidrMask; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateVpcCidrBlockRequest request) {
            super(request);
            this.iPv6CidrBlock = request.iPv6CidrBlock;
            this.ipVersion = request.ipVersion;
            this.ipamPoolId = request.ipamPoolId;
            this.ipv6CidrMask = request.ipv6CidrMask;
            this.ipv6Isp = request.ipv6Isp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
            this.secondaryCidrMask = request.secondaryCidrMask;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The specified IPv6 CIDR block of the VPC.</p>
         * <blockquote>
         * <p>You cannot specify both <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:6a::/56</p>
         */
        public Builder iPv6CidrBlock(String iPv6CidrBlock) {
            this.putQueryParameter("IPv6CidrBlock", iPv6CidrBlock);
            this.iPv6CidrBlock = iPv6CidrBlock;
            return this;
        }

        /**
         * <p>The version of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>IPV4</strong>: IPv4 address.</li>
         * <li><strong>IPV6</strong>: IPv6 address. When <strong>IpVersion</strong> is set to <strong>IPV6</strong> and <strong>SecondaryCidrBlock</strong> is not specified, a secondary IPv6 CIDR block is added to the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The instance ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-sycmt3p2a9v63i****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.putQueryParameter("IpamPoolId", ipamPoolId);
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * <p>The subnet mask used to add an IPv6 CIDR block from an IPAM pool to the VPC.</p>
         * <blockquote>
         * <p>When you use an IPAM pool to add a secondary IPv6 CIDR block to the VPC, you must specify at least one of IPv6CidrBlock or Ipv6CidrMask.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        public Builder ipv6CidrMask(Integer ipv6CidrMask) {
            this.putQueryParameter("Ipv6CidrMask", ipv6CidrMask);
            this.ipv6CidrMask = ipv6CidrMask;
            return this;
        }

        /**
         * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): Alibaba Cloud BGP IPv6.</li>
         * <li><strong>ChinaMobile</strong>: China Mobile (single ISP).</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP).</li>
         * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP).</li>
         * </ul>
         * <blockquote>
         * <p>If your account is included in the China single-ISP bandwidth whitelist, you can set this parameter to <strong>ChinaTelecom</strong> (China Telecom), <strong>ChinaUnicom</strong> (China Unicom), or <strong>ChinaMobile</strong> (China Mobile).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
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
         * <p>The region ID of the VPC to which you want to add a secondary CIDR block. </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-hangzhou</p>
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
         * <p>The secondary IPv4 CIDR block to add. The CIDR block must meet the following requirements:</p>
         * <ul>
         * <li>Use private IPv4 addresses specified in RFC 1918 as the secondary IPv4 CIDR block of the virtual private cloud (VPC). The subnet mask must be 16 to 28 bits in length. Examples: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.</li>
         * <li>You can use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the secondary IPv4 CIDR block of the virtual private cloud (VPC).</li>
         * </ul>
         * <p>Configuration limits:</p>
         * <ul>
         * <li><p>The CIDR block cannot start with 0. The subnet mask must be 16 to 28 bits in length.</p>
         * </li>
         * <li><p>The secondary CIDR block cannot overlap with the primary CIDR block or existing secondary CIDR blocks of the VPC.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not use an IPAM pool to add a secondary CIDR block to the VPC, you must specify either the <strong>SecondaryCidrBlock</strong> parameter or the <strong>Ipv6CidrBlock</strong> parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder secondaryCidrBlock(String secondaryCidrBlock) {
            this.putQueryParameter("SecondaryCidrBlock", secondaryCidrBlock);
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }

        /**
         * <p>The subnet mask used to add a secondary IPv4 CIDR block from an IPAM pool to the VPC.</p>
         * <blockquote>
         * <p>When you use an IPAM pool to add a secondary IPv4 CIDR block to the VPC, you must specify at least one of SecondaryCidrBlock or SecondaryCidrMask.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder secondaryCidrMask(Integer secondaryCidrMask) {
            this.putQueryParameter("SecondaryCidrMask", secondaryCidrMask);
            this.secondaryCidrMask = secondaryCidrMask;
            return this;
        }

        /**
         * <p>The ID of the VPC to which you want to add a secondary CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-o6wrloqsdqc9io3mg****</p>
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
