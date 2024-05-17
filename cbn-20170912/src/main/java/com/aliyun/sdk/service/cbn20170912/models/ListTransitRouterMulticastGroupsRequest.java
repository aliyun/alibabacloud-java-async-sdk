// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterMulticastGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterMulticastGroupsRequest</p>
 */
public class ListTransitRouterMulticastGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIpAddress")
    private String groupIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGroupMember")
    private Boolean isGroupMember;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGroupSource")
    private Boolean isGroupSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
    private java.util.List < String > networkInterfaceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerTransitRouterMulticastDomains")
    private java.util.List < String > peerTransitRouterMulticastDomains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
    private String transitRouterMulticastDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    private ListTransitRouterMulticastGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.groupIpAddress = builder.groupIpAddress;
        this.isGroupMember = builder.isGroupMember;
        this.isGroupSource = builder.isGroupSource;
        this.maxResults = builder.maxResults;
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerTransitRouterMulticastDomains = builder.peerTransitRouterMulticastDomains;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterMulticastGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return groupIpAddress
     */
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * @return isGroupMember
     */
    public Boolean getIsGroupMember() {
        return this.isGroupMember;
    }

    /**
     * @return isGroupSource
     */
    public Boolean getIsGroupSource() {
        return this.isGroupSource;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List < String > getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
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
     * @return peerTransitRouterMulticastDomains
     */
    public java.util.List < String > getPeerTransitRouterMulticastDomains() {
        return this.peerTransitRouterMulticastDomains;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterMulticastGroupsRequest, Builder> {
        private String clientToken; 
        private String groupIpAddress; 
        private Boolean isGroupMember; 
        private Boolean isGroupSource; 
        private Long maxResults; 
        private java.util.List < String > networkInterfaceIds; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < String > peerTransitRouterMulticastDomains; 
        private String resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String transitRouterAttachmentId; 
        private String transitRouterMulticastDomainId; 
        private java.util.List < String > vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterMulticastGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.groupIpAddress = request.groupIpAddress;
            this.isGroupMember = request.isGroupMember;
            this.isGroupSource = request.isGroupSource;
            this.maxResults = request.maxResults;
            this.networkInterfaceIds = request.networkInterfaceIds;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerTransitRouterMulticastDomains = request.peerTransitRouterMulticastDomains;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterMulticastDomainId = request.transitRouterMulticastDomainId;
            this.vSwitchIds = request.vSwitchIds;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The IP address of the multicast group.
         * <p>
         * 
         * Each multicast group is identified by its IP address.
         */
        public Builder groupIpAddress(String groupIpAddress) {
            this.putQueryParameter("GroupIpAddress", groupIpAddress);
            this.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * Specified whether to query the multicast members. Valid values:
         * <p>
         * 
         * *   **false**
         * *   **true**
         * 
         * >- This parameter must be specified together with the IsGroupMember parameter.
         * >- If you do not set IsGroupMember or IsGroupSource, both the multicast sources and members are queried.
         * >- If you set only one of them or both of them, the specified values prevail.
         */
        public Builder isGroupMember(Boolean isGroupMember) {
            this.putQueryParameter("IsGroupMember", isGroupMember);
            this.isGroupMember = isGroupMember;
            return this;
        }

        /**
         * Specifies whether to query the multicast sources. Valid values:
         * <p>
         * 
         * *   **false**
         * *   **true**
         * 
         * > - This parameter must be specified together with the IsGroupMember parameter.
         * > *   If you do not specify IsGroupMember or IsGroupSource, both the multicast sources and members are queried.
         * > *   If you specify only one of them or both of them, the specified values prevail.
         */
        public Builder isGroupSource(Boolean isGroupSource) {
            this.putQueryParameter("IsGroupSource", isGroupSource);
            this.isGroupSource = isGroupSource;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The IDs of ENIs.
         */
        public Builder networkInterfaceIds(java.util.List < String > networkInterfaceIds) {
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If this is your first query and no next queries are to be sent, ignore this parameter.
         * *   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.
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
         * The ID of the inter-region multicast domain.
         */
        public Builder peerTransitRouterMulticastDomains(java.util.List < String > peerTransitRouterMulticastDomains) {
            this.putQueryParameter("PeerTransitRouterMulticastDomains", peerTransitRouterMulticastDomains);
            this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
            return this;
        }

        /**
         * The ID of the resource associated with the multicast resource.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * The type of the multicast resource. Valid values:
         * <p>
         * 
         * *   **VPC**: queries multicast resources by VPC.
         * *   **TR**: queries multicast resources that are also deployed in a different region.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the network instance connection
         * <p>
         * 
         * You must configure one of the TransitRouterMulticastDomainId and TransitRouterAttachmentId parameters.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * The ID of the multicast domain.
         * <p>
         * 
         * You must configure one of the TransitRouterMulticastDomainId and TransitRouterAttachmentId parameters.
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * The vSwitch IDs.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public ListTransitRouterMulticastGroupsRequest build() {
            return new ListTransitRouterMulticastGroupsRequest(this);
        } 

    } 

}
