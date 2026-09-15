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
 * {@link DescribeNatGatewaysRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatGatewaysRequest</p>
 */
public class DescribeNatGatewaysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailabilityMode")
    private String availabilityMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatType")
    private String natType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

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
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeNatGatewaysRequest(Builder builder) {
        super(builder);
        this.availabilityMode = builder.availabilityMode;
        this.dryRun = builder.dryRun;
        this.instanceChargeType = builder.instanceChargeType;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.natType = builder.natType;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spec = builder.spec;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availabilityMode
     */
    public String getAvailabilityMode() {
        return this.availabilityMode;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natType
     */
    public String getNatType() {
        return this.natType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeNatGatewaysRequest, Builder> {
        private String availabilityMode; 
        private Boolean dryRun; 
        private String instanceChargeType; 
        private String name; 
        private String natGatewayId; 
        private String natType; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spec; 
        private String status; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatGatewaysRequest request) {
            super(request);
            this.availabilityMode = request.availabilityMode;
            this.dryRun = request.dryRun;
            this.instanceChargeType = request.instanceChargeType;
            this.name = request.name;
            this.natGatewayId = request.natGatewayId;
            this.natType = request.natType;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spec = request.spec;
            this.status = request.status;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AvailabilityMode.
         */
        public Builder availabilityMode(String availabilityMode) {
            this.putQueryParameter("AvailabilityMode", availabilityMode);
            this.availabilityMode = availabilityMode;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM user authorization, and missing parameter values. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. After the request passes the dry run, a 2xx HTTP status code is returned and the resource status is queried. This is the Normal request behavior.</p>
         * </li>
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
         * <p>&lt;props=&quot;china&quot;&gt;The billing method of the NAT gateway instance that you want to query. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * <li><strong>PrePaid</strong>: the legacy subscription billing method. New purchases under the subscription billing method are no longer supported.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;The billing method of the NAT gateway instance that you want to query. Valid value: <strong>PostPaid</strong> (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The name of the NAT gateway that you want to query.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1uewa15k4iy5770****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The type of the NAT gateway. Valid value: <strong>Enhanced</strong> (enhanced NAT gateway).</p>
         * 
         * <strong>example:</strong>
         * <p>Enhanced</p>
         */
        public Builder natType(String natType) {
            this.putQueryParameter("NatType", natType);
            this.natType = natType;
            return this;
        }

        /**
         * <p>The type of the NAT gateway that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet NAT gateway.</li>
         * <li><strong>intranet</strong>: VPC NAT gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway that you want to query.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
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
         * <p>The ID of the resource group to which the NAT gateway that you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;The specification of the Internet NAT gateway. This parameter is supported only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong> (legacy subscription Internet NAT gateway) to create a NAT gateway with defined specifications. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>Small</strong> (default): small.</li>
         * <li><strong>Middle</strong>: medium.</li>
         * <li><strong>Large</strong>: large.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;The specification of the NAT gateway. Leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>中国站示例值：Small，国际站示例值：无需填写</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The status of the NAT gateway that you want to query. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The NAT gateway is being created. Creating a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Creating</strong> state until the operation is complete.</p>
         * </li>
         * <li><p><strong>Available</strong>: The NAT gateway is available. This is a stable state after the NAT gateway is created.</p>
         * </li>
         * <li><p><strong>Modifying</strong>: The NAT gateway is being modified. Modifying a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Modifying</strong> state until the operation is complete.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The NAT gateway is being deleted. Deleting a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Deleting</strong> state until the operation is complete.</p>
         * </li>
         * <li><p><strong>Converting</strong>: The NAT gateway is being upgraded from a standard NAT gateway to an enhanced NAT gateway. This is an asynchronous operation. The NAT gateway remains in the <strong>Converting</strong> state until the operation is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the NAT gateway that you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72z****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID of the NAT gateway.</p>
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
        public DescribeNatGatewaysRequest build() {
            return new DescribeNatGatewaysRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatGatewaysRequest} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysRequest</p>
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
             * <p>The tag key of the NAT gateway instance. You can specify up to 20 tag keys.</p>
             * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the NAT gateway instance. You can specify up to 20 tag values.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>valueTest</p>
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
