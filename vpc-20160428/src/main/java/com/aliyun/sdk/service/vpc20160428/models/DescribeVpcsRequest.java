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
 * {@link DescribeVpcsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcsRequest</p>
 */
public class DescribeVpcsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetId")
    private String dhcpOptionsSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcName")
    private String vpcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
    private Long vpcOwnerId;

    private DescribeVpcsRequest(Builder builder) {
        super(builder);
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dryRun = builder.dryRun;
        this.enableIpv6 = builder.enableIpv6;
        this.isDefault = builder.isDefault;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
        this.vpcOwnerId = builder.vpcOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return vpcOwnerId
     */
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcsRequest, Builder> {
        private String dhcpOptionsSetId; 
        private Boolean dryRun; 
        private Boolean enableIpv6; 
        private Boolean isDefault; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private String vpcName; 
        private Long vpcOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcsRequest request) {
            super(request);
            this.dhcpOptionsSetId = request.dhcpOptionsSetId;
            this.dryRun = request.dryRun;
            this.enableIpv6 = request.enableIpv6;
            this.isDefault = request.isDefault;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.vpcName = request.vpcName;
            this.vpcOwnerId = request.vpcOwnerId;
        } 

        /**
         * <p>The ID of the DHCP options set.</p>
         * 
         * <strong>example:</strong>
         * <p>dopt-o6w0df4epg9zo8isy****</p>
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.putQueryParameter("DhcpOptionsSetId", dhcpOptionsSetId);
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system prechecks whether your AccessKey pair is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and VPCs are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Query for VPCs in the specified region that have enabled IPv6 CIDR blocks. The value is empty by default, which means no filtering based on IPv6 availability is conducted. Valid values:</p>
         * <ul>
         * <li><p>false: disabled</p>
         * </li>
         * <li><p>true: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>Specifies whether to query the default VPC in the specified region. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the VPC.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group to which the VPC to be queried belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxvfvazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The VPC ID.</p>
         * <p>You can specify up to 20 VPC IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b1xjllp3ve5yze****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc-1</p>
         */
        public Builder vpcName(String vpcName) {
            this.putQueryParameter("VpcName", vpcName);
            this.vpcName = vpcName;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        public Builder vpcOwnerId(Long vpcOwnerId) {
            this.putQueryParameter("VpcOwnerId", vpcOwnerId);
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        @Override
        public DescribeVpcsRequest build() {
            return new DescribeVpcsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcsRequest} extends {@link TeaModel}
     *
     * <p>DescribeVpcsRequest</p>
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
             * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
