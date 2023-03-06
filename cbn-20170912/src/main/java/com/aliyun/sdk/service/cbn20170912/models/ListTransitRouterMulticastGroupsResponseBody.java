// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterMulticastGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterMulticastGroupsResponseBody</p>
 */
public class ListTransitRouterMulticastGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterMulticastGroups")
    private java.util.List < TransitRouterMulticastGroups> transitRouterMulticastGroups;

    private ListTransitRouterMulticastGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterMulticastGroups = builder.transitRouterMulticastGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterMulticastGroupsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return transitRouterMulticastGroups
     */
    public java.util.List < TransitRouterMulticastGroups> getTransitRouterMulticastGroups() {
        return this.transitRouterMulticastGroups;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterMulticastGroups> transitRouterMulticastGroups; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** was not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of multicast groups.
         */
        public Builder transitRouterMulticastGroups(java.util.List < TransitRouterMulticastGroups> transitRouterMulticastGroups) {
            this.transitRouterMulticastGroups = transitRouterMulticastGroups;
            return this;
        }

        public ListTransitRouterMulticastGroupsResponseBody build() {
            return new ListTransitRouterMulticastGroupsResponseBody(this);
        } 

    } 

    public static class TransitRouterMulticastGroups extends TeaModel {
        @NameInMap("GroupIpAddress")
        private String groupIpAddress;

        @NameInMap("GroupMember")
        private Boolean groupMember;

        @NameInMap("GroupSource")
        private Boolean groupSource;

        @NameInMap("MemberType")
        private String memberType;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("PeerTransitRouterMulticastDomainId")
        private String peerTransitRouterMulticastDomainId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @NameInMap("TransitRouterMulticastDomainId")
        private String transitRouterMulticastDomainId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private TransitRouterMulticastGroups(Builder builder) {
            this.groupIpAddress = builder.groupIpAddress;
            this.groupMember = builder.groupMember;
            this.groupSource = builder.groupSource;
            this.memberType = builder.memberType;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.peerTransitRouterMulticastDomainId = builder.peerTransitRouterMulticastDomainId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceType = builder.resourceType;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterMulticastGroups create() {
            return builder().build();
        }

        /**
         * @return groupIpAddress
         */
        public String getGroupIpAddress() {
            return this.groupIpAddress;
        }

        /**
         * @return groupMember
         */
        public Boolean getGroupMember() {
            return this.groupMember;
        }

        /**
         * @return groupSource
         */
        public Boolean getGroupSource() {
            return this.groupSource;
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return peerTransitRouterMulticastDomainId
         */
        public String getPeerTransitRouterMulticastDomainId() {
            return this.peerTransitRouterMulticastDomainId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
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
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
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
         * @return transitRouterMulticastDomainId
         */
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String groupIpAddress; 
            private Boolean groupMember; 
            private Boolean groupSource; 
            private String memberType; 
            private String networkInterfaceId; 
            private String peerTransitRouterMulticastDomainId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceType; 
            private String sourceType; 
            private String status; 
            private String transitRouterAttachmentId; 
            private String transitRouterMulticastDomainId; 
            private String vSwitchId; 

            /**
             * The IP address of the multicast group to which the multicast resource belongs.
             */
            public Builder groupIpAddress(String groupIpAddress) {
                this.groupIpAddress = groupIpAddress;
                return this;
            }

            /**
             * Indicates whether the multicast resource is a multicast member. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder groupMember(Boolean groupMember) {
                this.groupMember = groupMember;
                return this;
            }

            /**
             * Indicates whether the multicast resource is a multicast source. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder groupSource(Boolean groupSource) {
                this.groupSource = groupSource;
                return this;
            }

            /**
             * The type of the multicast source.
             * <p>
             * 
             * If the value is **Static**, the multicast source is manually specified.
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * The ID of the ENI, which is a multicast resource.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The ID of the multicast domain associated with the multicast resource that is deployed across regions.
             */
            public Builder peerTransitRouterMulticastDomainId(String peerTransitRouterMulticastDomainId) {
                this.peerTransitRouterMulticastDomainId = peerTransitRouterMulticastDomainId;
                return this;
            }

            /**
             * The ID of the resource associated with the multicast resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the multicast resource belongs.
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * The type of the multicast resource. Valid values:
             * <p>
             * 
             * *   **VPC**: The multicast resource is in a VPC.
             * *   **TR**: The multicast resource is deployed across regions.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The type of the multicast member.
             * <p>
             * 
             * If the value is **Static**, the multicast member is manually specified.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The status of the multicast resource. Valid values:
             * <p>
             * 
             * *   **Registering**: being created
             * *   **Registered**: available
             * *   **Deregistering**: being deleted
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the network instance connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The ID of the multicast domain.
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * The ID of the vSwitch to which the multicast resource belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public TransitRouterMulticastGroups build() {
                return new TransitRouterMulticastGroups(this);
            } 

        } 

    }
}
