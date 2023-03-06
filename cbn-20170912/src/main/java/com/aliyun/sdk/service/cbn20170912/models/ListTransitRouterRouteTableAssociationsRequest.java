// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTableAssociationsRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteTableAssociationsRequest</p>
 */
public class ListTransitRouterRouteTableAssociationsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @Query
    @NameInMap("TransitRouterAttachmentResourceId")
    private String transitRouterAttachmentResourceId;

    @Query
    @NameInMap("TransitRouterAttachmentResourceType")
    private String transitRouterAttachmentResourceType;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    private ListTransitRouterRouteTableAssociationsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterAttachmentResourceId = builder.transitRouterAttachmentResourceId;
        this.transitRouterAttachmentResourceType = builder.transitRouterAttachmentResourceType;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTableAssociationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterAttachmentResourceId
     */
    public String getTransitRouterAttachmentResourceId() {
        return this.transitRouterAttachmentResourceId;
    }

    /**
     * @return transitRouterAttachmentResourceType
     */
    public String getTransitRouterAttachmentResourceType() {
        return this.transitRouterAttachmentResourceType;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterRouteTableAssociationsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private String transitRouterAttachmentId; 
        private String transitRouterAttachmentResourceId; 
        private String transitRouterAttachmentResourceType; 
        private String transitRouterRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteTableAssociationsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterAttachmentResourceId = request.transitRouterAttachmentResourceId;
            this.transitRouterAttachmentResourceType = request.transitRouterAttachmentResourceType;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
        } 

        /**
         * The number of entries to return on each page. Default value: **50**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no subsequent query is to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The status of the associated forwarding correlation. Valid values:
         * <p>
         * 
         * *   **Active**: The associated forwarding correlation is available.
         * *   **Associating**: The associated forwarding correlation is being created.
         * *   **Dissociating**: The associated forwarding correlation is being deleted.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the network instance connection.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * The ID of the next hop.
         */
        public Builder transitRouterAttachmentResourceId(String transitRouterAttachmentResourceId) {
            this.putQueryParameter("TransitRouterAttachmentResourceId", transitRouterAttachmentResourceId);
            this.transitRouterAttachmentResourceId = transitRouterAttachmentResourceId;
            return this;
        }

        /**
         * The type of next hop. Valid values:
         * <p>
         * 
         * *   **VPC**: virtual private cloud (VPC)
         * *   **VBR**: virtual border router (VBR)
         * *   **TR**: transit router
         * *   **VPN**: VPN attachment
         */
        public Builder transitRouterAttachmentResourceType(String transitRouterAttachmentResourceType) {
            this.putQueryParameter("TransitRouterAttachmentResourceType", transitRouterAttachmentResourceType);
            this.transitRouterAttachmentResourceType = transitRouterAttachmentResourceType;
            return this;
        }

        /**
         * The ID of the route table of the Enterprise Edition transit router.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        @Override
        public ListTransitRouterRouteTableAssociationsRequest build() {
            return new ListTransitRouterRouteTableAssociationsRequest(this);
        } 

    } 

}
