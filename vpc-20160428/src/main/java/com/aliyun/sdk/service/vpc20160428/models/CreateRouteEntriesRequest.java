// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteEntriesRequest</p>
 */
public class CreateRouteEntriesRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteEntries")
    @Validation(required = true)
    private java.util.List < RouteEntries> routeEntries;

    private CreateRouteEntriesRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntries = builder.routeEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return routeEntries
     */
    public java.util.List < RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static final class Builder extends Request.Builder<CreateRouteEntriesRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < RouteEntries> routeEntries; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteEntriesRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntries = request.routeEntries;
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
         * The ID of the region where the route table is created.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * RouteEntries.
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
            this.putQueryParameter("RouteEntries", routeEntries);
            this.routeEntries = routeEntries;
            return this;
        }

        @Override
        public CreateRouteEntriesRequest build() {
            return new CreateRouteEntriesRequest(this);
        } 

    } 

    public static class RouteEntries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DstCidrBlock")
        @Validation(required = true)
        private String dstCidrBlock;

        @NameInMap("IpVersion")
        private Integer ipVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("NextHop")
        @Validation(required = true)
        private String nextHop;

        @NameInMap("NextHopType")
        @Validation(required = true)
        private String nextHopType;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        private String routeTableId;

        private RouteEntries(Builder builder) {
            this.description = builder.description;
            this.dstCidrBlock = builder.dstCidrBlock;
            this.ipVersion = builder.ipVersion;
            this.name = builder.name;
            this.nextHop = builder.nextHop;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstCidrBlock
         */
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String description; 
            private String dstCidrBlock; 
            private Integer ipVersion; 
            private String name; 
            private String nextHop; 
            private String nextHopType; 
            private String routeTableId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination CIDR block of the custom route entry. Both IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks. Make sure that the destination CIDR block meets the following requirements:
             * <p>
             * 
             * *   The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.
             * *   The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * The version of the IP protocol. You can specify up to 50 IP protocol versions. Valid values:
             * <p>
             * 
             * *   **IPv4**
             * *   **IPv6**
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The name of the custom route entry that you want to add. You can specify up to 50 names.
             * <p>
             * 
             * The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the next hop of the custom route entry. You can specify up to 50 next hop IDs.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * The type of next hop. You can specify up to 50 next hop types. Valid values:
             * <p>
             * 
             * *   **Instance**: Elastic Compute Service (ECS) instance. This is the default value.
             * *   **HaVip**: high-availability virtual IP address (HAVIP).
             * *   **RouterInterface**: router interface.
             * *   **NetworkInterface**: elastic network interface (ENI).
             * *   **VpnGateway**: VPN gateway.
             * *   **IPv6Gateway**: IPv6 gateway.
             * *   **NatGateway**: NAT gateway.
             * *   **Attachment**: transit router.
             * *   **VpcPeer**: VPC peering connection.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The ID of the route table to which you want to add the custom route entry. You can specify up to 50 route table IDs.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteEntries build() {
                return new RouteEntries(this);
            } 

        } 

    }
}
