// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterPrefixListAssociationRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterPrefixListAssociationRequest</p>
 */
public class ListTransitRouterPrefixListAssociationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHop")
    private String nextHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
    private String nextHopInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    private Long ownerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    private String prefixListId;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterTableId")
    private String transitRouterTableId;

    private ListTransitRouterPrefixListAssociationRequest(Builder builder) {
        super(builder);
        this.nextHop = builder.nextHop;
        this.nextHopInstanceId = builder.nextHopInstanceId;
        this.nextHopType = builder.nextHopType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.ownerUid = builder.ownerUid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.prefixListId = builder.prefixListId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterTableId = builder.transitRouterTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterPrefixListAssociationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return nextHopInstanceId
     */
    public String getNextHopInstanceId() {
        return this.nextHopInstanceId;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
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
     * @return ownerUid
     */
    public Long getOwnerUid() {
        return this.ownerUid;
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
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterTableId
     */
    public String getTransitRouterTableId() {
        return this.transitRouterTableId;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterPrefixListAssociationRequest, Builder> {
        private String nextHop; 
        private String nextHopInstanceId; 
        private String nextHopType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long ownerUid; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String prefixListId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private String transitRouterId; 
        private String transitRouterTableId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterPrefixListAssociationRequest request) {
            super(request);
            this.nextHop = request.nextHop;
            this.nextHopInstanceId = request.nextHopInstanceId;
            this.nextHopType = request.nextHopType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.ownerUid = request.ownerUid;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.prefixListId = request.prefixListId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterTableId = request.transitRouterTableId;
        } 

        /**
         * The ID of the next hop.
         * <p>
         * 
         * > Set the value to **BlackHole** if you want to query the prefix list that generates blackhole routes.
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * The ID of the network instance associated with the next hop connection.
         */
        public Builder nextHopInstanceId(String nextHopInstanceId) {
            this.putQueryParameter("NextHopInstanceId", nextHopInstanceId);
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }

        /**
         * The type of the next hop. Valid values:
         * <p>
         * 
         * *   **BlackHole**: The prefix list that generates blackhole routes.
         * *   **VPC**: The prefix list whose next hop is a virtual private cloud (VPC) connection.
         * *   **VBR**: The prefix list whose next hop is a virtual border router (VBR) connection.
         * *   **TR**: The prefix list whose next hop is an inter-region connection on the transit router.
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
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
         * The ID of the Alibaba Cloud account to which the prefix list belongs.
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **100**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the prefix list.
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * The ID of the region where the transit router is deployed.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
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
         * The status of the prefix list. Valid values:
         * <p>
         * 
         * *   **Active**
         * *   **Updating**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the transit router.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * The ID of the route table of the transit router.
         */
        public Builder transitRouterTableId(String transitRouterTableId) {
            this.putQueryParameter("TransitRouterTableId", transitRouterTableId);
            this.transitRouterTableId = transitRouterTableId;
            return this;
        }

        @Override
        public ListTransitRouterPrefixListAssociationRequest build() {
            return new ListTransitRouterPrefixListAssociationRequest(this);
        } 

    } 

}
