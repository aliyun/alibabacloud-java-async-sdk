// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnassociateVpcCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>UnassociateVpcCidrBlockRequest</p>
 */
public class UnassociateVpcCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPv6CidrBlock")
    private String iPv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
    private String secondaryCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private UnassociateVpcCidrBlockRequest(Builder builder) {
        super(builder);
        this.iPv6CidrBlock = builder.iPv6CidrBlock;
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

    public static UnassociateVpcCidrBlockRequest create() {
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

    public static final class Builder extends Request.Builder<UnassociateVpcCidrBlockRequest, Builder> {
        private String iPv6CidrBlock; 
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

        private Builder(UnassociateVpcCidrBlockRequest request) {
            super(request);
            this.iPv6CidrBlock = request.iPv6CidrBlock;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The secondary IPv6 CIDR block to be deleted.</p>
         * <blockquote>
         * <p> You must set one of the <strong>Ipv6CidrBlock</strong> and <strong>SecondaryCidrBlock</strong> parameters.</p>
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
         * <p>The region ID of the VPC to which the secondary CIDR block to be deleted belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The secondary IPv4 CIDR block to be deleted.</p>
         * <blockquote>
         * <p> You must set one of the <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong> parameters.</p>
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
         * <p>The ID of the VPC from which you want to delete a secondary CIDR block.</p>
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
        public UnassociateVpcCidrBlockRequest build() {
            return new UnassociateVpcCidrBlockRequest(this);
        } 

    } 

}
