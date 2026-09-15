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
 * {@link ModifyVpcAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcAttributeRequest</p>
 */
public class ModifyVpcAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDnsHostname")
    private Boolean enableDnsHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIPv6")
    private Boolean enableIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

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
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcName")
    private String vpcName;

    private ModifyVpcAttributeRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.enableDnsHostname = builder.enableDnsHostname;
        this.enableIPv6 = builder.enableIPv6;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.ipv6Isp = builder.ipv6Isp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableDnsHostname
     */
    public Boolean getEnableDnsHostname() {
        return this.enableDnsHostname;
    }

    /**
     * @return enableIPv6
     */
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    public static final class Builder extends Request.Builder<ModifyVpcAttributeRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private Boolean enableDnsHostname; 
        private Boolean enableIPv6; 
        private String ipv6CidrBlock; 
        private String ipv6Isp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vpcId; 
        private String vpcName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcAttributeRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.enableDnsHostname = request.enableDnsHostname;
            this.enableIPv6 = request.enableIPv6;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.ipv6Isp = request.ipv6Isp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vpcId = request.vpcId;
            this.vpcName = request.vpcName;
        } 

        /**
         * <p>The new IPv4 CIDR block of the VPC.</p>
         * <p>You can expand or shrink the CIDR block within the original IPv4 CIDR block of the VPC. The recommended subnet mask is 16 to 28 bits. If you shrink the IPv4 CIDR block of the VPC and IP addresses that are already in use fall outside the target CIDR block, the modification fails.</p>
         * <blockquote>
         * <p>Modifying the IPv4 CIDR block of a VPC does not affect existing services.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The new description of the VPC.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my VPC.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the DNS hostname feature. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableDnsHostname(Boolean enableDnsHostname) {
            this.putQueryParameter("EnableDnsHostname", enableDnsHostname);
            this.enableDnsHostname = enableDnsHostname;
            return this;
        }

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableIPv6(Boolean enableIPv6) {
            this.putQueryParameter("EnableIPv6", enableIPv6);
            this.enableIPv6 = enableIPv6;
            return this;
        }

        /**
         * <p>The IPv6 CIDR block of the VPC.
         * When you enable IPv6 for a VPC, the system will assign an IPv6 CIDR block. To specify an IPv6 CIDR block, you need to first invoke the <a href="https://help.aliyun.com/document_detail/448916.html">AllocateVpcIpv6Cidr</a> operation to reserve the specified IPv6 CIDR block, and then pass it in.</p>
         * <blockquote>
         * <p>For a VPC that already has IPv6 enabled, you cannot modify the IPv6 CIDR block by passing in this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:6a::/56</p>
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): Alibaba Cloud BGP IPv6.</li>
         * <li><strong>ChinaMobile</strong>: China Mobile (single-ISP).</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom (single-ISP).</li>
         * <li><strong>ChinaTelecom</strong>: China Telecom (single-ISP).</li>
         * </ul>
         * <blockquote>
         * <p>If you are a user who has the single-ISP bandwidth whitelist enabled, you can set this parameter to <strong>ChinaTelecom</strong> (China Telecom), <strong>ChinaUnicom</strong> (China Unicom), or <strong>ChinaMobile</strong> (China Mobile).</p>
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
         * <p>The region ID of the VPC.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the VPC that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1qtbach57ywecf****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The new name of the VPC.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc-1</p>
         */
        public Builder vpcName(String vpcName) {
            this.putQueryParameter("VpcName", vpcName);
            this.vpcName = vpcName;
            return this;
        }

        @Override
        public ModifyVpcAttributeRequest build() {
            return new ModifyVpcAttributeRequest(this);
        } 

    } 

}
