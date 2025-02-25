// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
    private java.util.List<String> networkInterfaceIds;

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
    private java.util.List<String> peerTransitRouterMulticastDomains;

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
    private java.util.List<String> vSwitchIds;

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
    public java.util.List<String> getNetworkInterfaceIds() {
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
    public java.util.List<String> getPeerTransitRouterMulticastDomains() {
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
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterMulticastGroupsRequest, Builder> {
        private String clientToken; 
        private String groupIpAddress; 
        private Boolean isGroupMember; 
        private Boolean isGroupSource; 
        private Long maxResults; 
        private java.util.List<String> networkInterfaceIds; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List<String> peerTransitRouterMulticastDomains; 
        private String resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String transitRouterAttachmentId; 
        private String transitRouterMulticastDomainId; 
        private java.util.List<String> vSwitchIds; 

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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
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
         * <p>The IP address of the multicast group.</p>
         * <p>Each multicast group is identified by its IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>239.XX.XX.2</p>
         */
        public Builder groupIpAddress(String groupIpAddress) {
            this.putQueryParameter("GroupIpAddress", groupIpAddress);
            this.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * <p>Specified whether to query the multicast members. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified together with the IsGroupMember parameter.</li>
         * <li>If you do not set IsGroupMember or IsGroupSource, both the multicast sources and members are queried.</li>
         * <li>If you set only one of them or both of them, the specified values prevail.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isGroupMember(Boolean isGroupMember) {
            this.putQueryParameter("IsGroupMember", isGroupMember);
            this.isGroupMember = isGroupMember;
            return this;
        }

        /**
         * <p>Specifies whether to query the multicast sources. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified together with the IsGroupMember parameter.</li>
         * </ul>
         * <ul>
         * <li>If you do not specify IsGroupMember or IsGroupSource, both the multicast sources and members are queried.</li>
         * <li>If you specify only one of them or both of them, the specified values prevail.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isGroupSource(Boolean isGroupSource) {
            this.putQueryParameter("IsGroupSource", isGroupSource);
            this.isGroupSource = isGroupSource;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The IDs of ENIs.</p>
         */
        public Builder networkInterfaceIds(java.util.List<String> networkInterfaceIds) {
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If this is your first query and no next queries are to be sent, ignore this parameter.</li>
         * <li>If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
         * <p>The ID of the inter-region multicast domain.</p>
         */
        public Builder peerTransitRouterMulticastDomains(java.util.List<String> peerTransitRouterMulticastDomains) {
            this.putQueryParameter("PeerTransitRouterMulticastDomains", peerTransitRouterMulticastDomains);
            this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
            return this;
        }

        /**
         * <p>The ID of the resource associated with the multicast resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w9alkte4w2htrqe****</p>
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
         * <p>The type of the multicast resource. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: queries multicast resources by VPC.</li>
         * <li><strong>TR</strong>: queries multicast resources that are also deployed in a different region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the network instance connection</p>
         * <p>You must configure one of the TransitRouterMulticastDomainId and TransitRouterAttachmentId parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-g3kz2k3u76amsk****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * <p>The ID of the multicast domain.</p>
         * <p>You must configure one of the TransitRouterMulticastDomainId and TransitRouterAttachmentId parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-5mjb5gjb6dgu98****</p>
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * <p>The vSwitch IDs.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
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
