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
 * {@link CreateVSwitchRequest} extends {@link RequestModel}
 *
 * <p>CreateVSwitchRequest</p>
 */
public class CreateVSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrMask")
    private Integer cidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private Integer ipv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrMask")
    private Integer ipv6CidrMask;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIpv6CidrBlock")
    private String vpcIpv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateVSwitchRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.cidrMask = builder.cidrMask;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.ipv6CidrMask = builder.ipv6CidrMask;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.vSwitchName = builder.vSwitchName;
        this.vpcId = builder.vpcId;
        this.vpcIpv6CidrBlock = builder.vpcIpv6CidrBlock;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVSwitchRequest create() {
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
     * @return cidrMask
     */
    public Integer getCidrMask() {
        return this.cidrMask;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipv6CidrBlock
     */
    public Integer getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return ipv6CidrMask
     */
    public Integer getIpv6CidrMask() {
        return this.ipv6CidrMask;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcIpv6CidrBlock
     */
    public String getVpcIpv6CidrBlock() {
        return this.vpcIpv6CidrBlock;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateVSwitchRequest, Builder> {
        private String cidrBlock; 
        private Integer cidrMask; 
        private String clientToken; 
        private String description; 
        private Integer ipv6CidrBlock; 
        private Integer ipv6CidrMask; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String vSwitchName; 
        private String vpcId; 
        private String vpcIpv6CidrBlock; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVSwitchRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.cidrMask = request.cidrMask;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.ipv6CidrMask = request.ipv6CidrMask;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.vSwitchName = request.vSwitchName;
            this.vpcId = request.vpcId;
            this.vpcIpv6CidrBlock = request.vpcIpv6CidrBlock;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The CIDR block of the vSwitch. The vSwitch CIDR block must meet the following requirements: </p>
         * <ul>
         * <li><p>The mask length of the vSwitch CIDR block must be 16 to 29 bits.  </p>
         * </li>
         * <li><p>The vSwitch CIDR block must be a subset of the CIDR block of the VPC to which the vSwitch belongs. </p>
         * </li>
         * <li><p>The vSwitch CIDR block cannot be the same as the destination CIDR block of a route entry in the VPC, but can be a subset of the destination CIDR block. </p>
         * </li>
         * <li><p>The vSwitch CIDR block cannot be within the following reserved address ranges: 100.64.0.0/10, 127.0.0.0/8, 169.254.0.0/16, or 224.0.0.0/4.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After a vSwitch is created, you cannot modify its CIDR block.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The mask length of the IPv4 CIDR block of the vSwitch.</p>
         * <blockquote>
         * <p>The mask length of the vSwitch IPv4 CIDR block must be 16 to 29 bits. You must specify at least one of CidrBlock and CidrMask.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder cidrMask(Integer cidrMask) {
            this.putQueryParameter("CidrMask", cidrMask);
            this.cidrMask = cidrMask;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the vSwitch.  </p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>vSwitch</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The last 8 bits of the IPv6 CIDR block of the vSwitch. Valid values: <strong>0</strong> to <strong>255</strong>.
         * You can specify this parameter to assign an IPv6 CIDR block to the vSwitch only when the VPC to which the vSwitch belongs has IPv6 enabled. After the IPv6 CIDR block is assigned, it cannot be changed to another CIDR block. Make sure that the CIDR block does not overlap with those of other vSwitches in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder ipv6CidrBlock(Integer ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>The subnet mask of the IPv6 CIDR block of the vSwitch. You can specify this parameter to assign an IPv6 CIDR block to the vSwitch only when the VPC to which the vSwitch belongs has IPv6 enabled.</p>
         * <blockquote>
         * <p>Only 64 is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder ipv6CidrMask(Integer ipv6CidrMask) {
            this.putQueryParameter("Ipv6CidrMask", ipv6CidrMask);
            this.ipv6CidrMask = ipv6CidrMask;
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
         * <p>The region ID of the vSwitch to create.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The tags of the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the vSwitch. </p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>vSwitch-1</p>
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the vSwitch belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-257gqcdfvx6n****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The IPv6 CIDR block of the VPC. If the VPC to which the vSwitch belongs has multiple IPv6 CIDR blocks, you can specify this parameter to determine the IPv6 CIDR block range for the vSwitch. If you do not specify this parameter, the IPv6 CIDR block assigned when IPv6 was enabled for the VPC is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:6a::/56</p>
         */
        public Builder vpcIpv6CidrBlock(String vpcIpv6CidrBlock) {
            this.putQueryParameter("VpcIpv6CidrBlock", vpcIpv6CidrBlock);
            this.vpcIpv6CidrBlock = vpcIpv6CidrBlock;
            return this;
        }

        /**
         * <p>The ID of the zone in which to create the vSwitch.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query the zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateVSwitchRequest build() {
            return new CreateVSwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVSwitchRequest} extends {@link TeaModel}
     *
     * <p>CreateVSwitchRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
