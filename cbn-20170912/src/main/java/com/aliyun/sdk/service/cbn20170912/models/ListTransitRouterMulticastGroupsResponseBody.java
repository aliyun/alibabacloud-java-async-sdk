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
 * {@link ListTransitRouterMulticastGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterMulticastGroupsResponseBody</p>
 */
public class ListTransitRouterMulticastGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastGroups")
    private java.util.List<TransitRouterMulticastGroups> transitRouterMulticastGroups;

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
    public java.util.List<TransitRouterMulticastGroups> getTransitRouterMulticastGroups() {
        return this.transitRouterMulticastGroups;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TransitRouterMulticastGroups> transitRouterMulticastGroups; 

        private Builder() {
        } 

        private Builder(ListTransitRouterMulticastGroupsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.transitRouterMulticastGroups = model.transitRouterMulticastGroups;
        } 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FB3C4A16-0933-5850-9D43-0C3EA37BCBFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of multicast groups.</p>
         */
        public Builder transitRouterMulticastGroups(java.util.List<TransitRouterMulticastGroups> transitRouterMulticastGroups) {
            this.transitRouterMulticastGroups = transitRouterMulticastGroups;
            return this;
        }

        public ListTransitRouterMulticastGroupsResponseBody build() {
            return new ListTransitRouterMulticastGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterMulticastGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterMulticastGroupsResponseBody</p>
     */
    public static class TransitRouterMulticastGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIpAddress")
        private String groupIpAddress;

        @com.aliyun.core.annotation.NameInMap("GroupMember")
        private Boolean groupMember;

        @com.aliyun.core.annotation.NameInMap("GroupSource")
        private Boolean groupSource;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PeerTransitRouterMulticastDomainId")
        private String peerTransitRouterMulticastDomainId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
        private String transitRouterMulticastDomainId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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

            private Builder() {
            } 

            private Builder(TransitRouterMulticastGroups model) {
                this.groupIpAddress = model.groupIpAddress;
                this.groupMember = model.groupMember;
                this.groupSource = model.groupSource;
                this.memberType = model.memberType;
                this.networkInterfaceId = model.networkInterfaceId;
                this.peerTransitRouterMulticastDomainId = model.peerTransitRouterMulticastDomainId;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceType = model.resourceType;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterMulticastDomainId = model.transitRouterMulticastDomainId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The IP address of the multicast group to which the multicast resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>239.XX.XX.2</p>
             */
            public Builder groupIpAddress(String groupIpAddress) {
                this.groupIpAddress = groupIpAddress;
                return this;
            }

            /**
             * <p>Indicates whether the multicast resource is a multicast member. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder groupMember(Boolean groupMember) {
                this.groupMember = groupMember;
                return this;
            }

            /**
             * <p>Indicates whether the multicast resource is a multicast source. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder groupSource(Boolean groupSource) {
                this.groupSource = groupSource;
                return this;
            }

            /**
             * <p>The type of the multicast source.</p>
             * <p>If the value is <strong>Static</strong>, the multicast source is manually specified.</p>
             * 
             * <strong>example:</strong>
             * <p>Static</p>
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * <p>The ID of the ENI, which is a multicast resource.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-p0weuda3lszwzjly****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the multicast domain associated with the multicast resource that is deployed across regions.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-mcast-domain-91wpg6wbhchjeq****</p>
             */
            public Builder peerTransitRouterMulticastDomainId(String peerTransitRouterMulticastDomainId) {
                this.peerTransitRouterMulticastDomainId = peerTransitRouterMulticastDomainId;
                return this;
            }

            /**
             * <p>The ID of the resource associated with the multicast resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-p0w9alkte4w2htrqe****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the multicast resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The type of the multicast resource. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: The multicast resource is in a VPC.</li>
             * <li><strong>TR</strong>: The multicast resource is deployed across regions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The type of the multicast member.</p>
             * <p>If the value is <strong>Static</strong>, the multicast member is manually specified.</p>
             * 
             * <strong>example:</strong>
             * <p>Static</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The status of the multicast resource. Valid values:</p>
             * <ul>
             * <li><strong>Registering</strong>: being created</li>
             * <li><strong>Registered</strong>: available</li>
             * <li><strong>Deregistering</strong>: being deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Registered</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-g3kz2k3u76amsk****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The ID of the multicast domain.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-mcast-domain-kx0vk0v7fz8kx4****</p>
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the multicast resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
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
