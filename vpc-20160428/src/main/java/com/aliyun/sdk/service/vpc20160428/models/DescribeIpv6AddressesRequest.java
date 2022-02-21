// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6AddressesRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpv6AddressesRequest</p>
 */
public class DescribeIpv6AddressesRequest extends Request {
    @Query
    @NameInMap("AssociatedInstanceId")
    private String associatedInstanceId;

    @Query
    @NameInMap("AssociatedInstanceType")
    private String associatedInstanceType;

    @Query
    @NameInMap("Ipv6Address")
    private String ipv6Address;

    @Query
    @NameInMap("Ipv6AddressId")
    private String ipv6AddressId;

    @Query
    @NameInMap("Ipv6InternetBandwidthId")
    private String ipv6InternetBandwidthId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

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
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private DescribeIpv6AddressesRequest(Builder builder) {
        super(builder);
        this.associatedInstanceId = builder.associatedInstanceId;
        this.associatedInstanceType = builder.associatedInstanceType;
        this.ipv6Address = builder.ipv6Address;
        this.ipv6AddressId = builder.ipv6AddressId;
        this.ipv6InternetBandwidthId = builder.ipv6InternetBandwidthId;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6AddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedInstanceId
     */
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    /**
     * @return associatedInstanceType
     */
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    /**
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return ipv6AddressId
     */
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * @return ipv6InternetBandwidthId
     */
    public String getIpv6InternetBandwidthId() {
        return this.ipv6InternetBandwidthId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeIpv6AddressesRequest, Builder> {
        private String associatedInstanceId; 
        private String associatedInstanceType; 
        private String ipv6Address; 
        private String ipv6AddressId; 
        private String ipv6InternetBandwidthId; 
        private String name; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpv6AddressesRequest response) {
            super(response);
            this.associatedInstanceId = response.associatedInstanceId;
            this.associatedInstanceType = response.associatedInstanceType;
            this.ipv6Address = response.ipv6Address;
            this.ipv6AddressId = response.ipv6AddressId;
            this.ipv6InternetBandwidthId = response.ipv6InternetBandwidthId;
            this.name = response.name;
            this.networkType = response.networkType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.vSwitchId = response.vSwitchId;
            this.vpcId = response.vpcId;
        } 

        /**
         * AssociatedInstanceId.
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            this.putQueryParameter("AssociatedInstanceId", associatedInstanceId);
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * AssociatedInstanceType.
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            this.putQueryParameter("AssociatedInstanceType", associatedInstanceType);
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * Ipv6Address.
         */
        public Builder ipv6Address(String ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * Ipv6AddressId.
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.putQueryParameter("Ipv6AddressId", ipv6AddressId);
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * Ipv6InternetBandwidthId.
         */
        public Builder ipv6InternetBandwidthId(String ipv6InternetBandwidthId) {
            this.putQueryParameter("Ipv6InternetBandwidthId", ipv6InternetBandwidthId);
            this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetworkType.
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeIpv6AddressesRequest build() {
            return new DescribeIpv6AddressesRequest(this);
        } 

    } 

}
