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
 * {@link DeleteRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteRouteEntryRequest</p>
 */
public class DeleteRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    private String nextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopList")
    private java.util.List<NextHopList> nextHopList;

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
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    private DeleteRouteEntryRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.dryRun = builder.dryRun;
        this.nextHopId = builder.nextHopId;
        this.nextHopList = builder.nextHopList;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryId = builder.routeEntryId;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return nextHopId
     */
    public String getNextHopId() {
        return this.nextHopId;
    }

    /**
     * @return nextHopList
     */
    public java.util.List<NextHopList> getNextHopList() {
        return this.nextHopList;
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder extends Request.Builder<DeleteRouteEntryRequest, Builder> {
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String nextHopId; 
        private java.util.List<NextHopList> nextHopList; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryId; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRouteEntryRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.dryRun = request.dryRun;
            this.nextHopId = request.nextHopId;
            this.nextHopList = request.nextHopList;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryId = request.routeEntryId;
            this.routeTableId = request.routeTableId;
        } 

        /**
         * <p>The destination CIDR block of the route. IPv4 CIDR blocks, IPv6 CIDR blocks, prefix list CIDR blocks, and prefix list instance IDs are supported. This parameter is mutually exclusive with the RouteEntryId parameter.</p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required. Configure the <strong>NextHopId</strong> or <strong>NextHopList</strong> parameter as needed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <p><strong>true</strong>: performs a dry run without deleting the route. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</p>
         * <p><strong>false</strong> (default): sends a normal request. If the check succeeds, a 2xx HTTP status code is returned and the route is deleted.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the next hop instance.</p>
         * <ul>
         * <li>To delete a non-ECMP route, specify <strong>NextHopId</strong>. Do not specify <strong>NextHopList</strong>.</li>
         * <li>To delete an ECMP route, specify <strong>NextHopList</strong>. Do not specify <strong>NextHopId</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4urzd****</p>
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * <p>The information about the next hop instances of the ECMP route. A maximum of 16 next hop instances are supported.</p>
         */
        public Builder nextHopList(java.util.List<NextHopList> nextHopList) {
            this.putQueryParameter("NextHopList", nextHopList);
            this.nextHopList = nextHopList;
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
         * <p>The ID of the region where the route table resides.</p>
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
         * <p>The ID of the route that you want to delete. This parameter is mutually exclusive with the DestinationCidrBlock parameter.</p>
         * <blockquote>
         * <p>If the <strong>DestinationCidrBlock</strong> parameter is not specified, the <strong>RouteEntryId</strong> parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnpv****</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * <p>The ID of the route table that contains the route.  </p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required. Configure the <strong>NextHopId</strong> or <strong>NextHopList</strong> parameter as needed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze3jgygk9bmsj23s****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public DeleteRouteEntryRequest build() {
            return new DeleteRouteEntryRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRouteEntryRequest} extends {@link TeaModel}
     *
     * <p>DeleteRouteEntryRequest</p>
     */
    public static class NextHopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        private NextHopList(Builder builder) {
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHopList create() {
            return builder().build();
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        public static final class Builder {
            private String nextHopId; 
            private String nextHopType; 

            private Builder() {
            } 

            private Builder(NextHopList model) {
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
            } 

            /**
             * <p>The ID of the next hop instance of the ECMP route. A maximum of 16 next hop instances are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zeo3xzyf38r43cd****</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The type of the next hop of the ECMP route. Set the value to <strong>RouterInterface</strong> (router interface). A maximum of 16 next hop instances are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>RouterInterface</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            public NextHopList build() {
                return new NextHopList(this);
            } 

        } 

    }
}
