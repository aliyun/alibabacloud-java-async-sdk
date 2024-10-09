// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssignPrivateIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>AssignPrivateIpAddressesRequest</p>
 */
public class AssignPrivateIpAddressesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
    private java.util.List < String > ipv4Prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4PrefixCount")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer ipv4PrefixCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

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
    @com.aliyun.core.annotation.NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    private AssignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.ipv4Prefix = builder.ipv4Prefix;
        this.ipv4PrefixCount = builder.ipv4PrefixCount;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignPrivateIpAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv4Prefix
     */
    public java.util.List < String > getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * @return ipv4PrefixCount
     */
    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
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
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    public static final class Builder extends Request.Builder<AssignPrivateIpAddressesRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private java.util.List < String > ipv4Prefix; 
        private Integer ipv4PrefixCount; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < String > privateIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer secondaryPrivateIpAddressCount; 

        private Builder() {
            super();
        } 

        private Builder(AssignPrivateIpAddressesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.ipv4Prefix = request.ipv4Prefix;
            this.ipv4PrefixCount = request.ipv4PrefixCount;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The IPv4 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
         * </blockquote>
         */
        public Builder ipv4Prefix(java.util.List < String > ipv4Prefix) {
            this.putQueryParameter("Ipv4Prefix", ipv4Prefix);
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * <p>The number of IPv4 prefixes to be randomly generated for the ENI. Valid values: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            this.putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount);
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp67acfmxazb4p****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * <p>Secondary private IP address N to be automatically assigned from the CIDR block of the vSwitch that is connected to the ENI. Valid values of N:</p>
         * <ul>
         * <li>When the ENI is in the Available (<code>Available</code>) state, the valid values of N are 1 to 50.</li>
         * <li>When the ENI is in the InUse (<code>InUse</code>) state, the valid values of N are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * </ul>
         * <p>To assign secondary private IP addresses to the ENI, you must specify <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> but not both.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.1.**.**</code></p>
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The region ID of the ENI. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The number of private IP addresses to be automatically assigned from the CIDR block of the vSwitch that is connected to the ENI.</p>
         * <p>To assign secondary private IP addresses to the ENI, you must specify <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> but not both.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        @Override
        public AssignPrivateIpAddressesRequest build() {
            return new AssignPrivateIpAddressesRequest(this);
        } 

    } 

}
