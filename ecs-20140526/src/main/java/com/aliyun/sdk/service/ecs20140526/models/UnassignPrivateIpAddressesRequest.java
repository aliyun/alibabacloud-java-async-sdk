// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link UnassignPrivateIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>UnassignPrivateIpAddressesRequest</p>
 */
public class UnassignPrivateIpAddressesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
    private java.util.List<String> ipv4Prefix;

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
    private java.util.List<String> privateIpAddress;

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

    private UnassignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ipv4Prefix = builder.ipv4Prefix;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignPrivateIpAddressesRequest create() {
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
     * @return ipv4Prefix
     */
    public java.util.List<String> getIpv4Prefix() {
        return this.ipv4Prefix;
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
    public java.util.List<String> getPrivateIpAddress() {
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

    public static final class Builder extends Request.Builder<UnassignPrivateIpAddressesRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<String> ipv4Prefix; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List<String> privateIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UnassignPrivateIpAddressesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ipv4Prefix = request.ipv4Prefix;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * <p>The IPv4 prefixes to unassign.</p>
         */
        public Builder ipv4Prefix(java.util.List<String> ipv4Prefix) {
            this.putQueryParameter("Ipv4Prefix", ipv4Prefix);
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp67acfmxazb4ph****</p>
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
         * <p>The secondary private IP addresses to unassign.</p>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        public Builder privateIpAddress(java.util.List<String> privateIpAddress) {
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

        @Override
        public UnassignPrivateIpAddressesRequest build() {
            return new UnassignPrivateIpAddressesRequest(this);
        } 

    } 

}
