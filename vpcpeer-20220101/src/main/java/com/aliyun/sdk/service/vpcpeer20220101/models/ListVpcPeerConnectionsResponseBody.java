// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcPeerConnectionsResponseBody</p>
 */
public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpcPeerConnects")
    private java.util.List < VpcPeerConnects> vpcPeerConnects;

    private ListVpcPeerConnectionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcPeerConnects = builder.vpcPeerConnects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcPeerConnectionsResponseBody create() {
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
     * @return vpcPeerConnects
     */
    public java.util.List < VpcPeerConnects> getVpcPeerConnects() {
        return this.vpcPeerConnects;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VpcPeerConnects> vpcPeerConnects; 

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next queries are sent.
         * *   If the value of **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The details of the VPC peering connections.
         */
        public Builder vpcPeerConnects(java.util.List < VpcPeerConnects> vpcPeerConnects) {
            this.vpcPeerConnects = vpcPeerConnects;
            return this;
        }

        public ListVpcPeerConnectionsResponseBody build() {
            return new ListVpcPeerConnectionsResponseBody(this);
        } 

    } 

    public static class AcceptingVpc extends TeaModel {
        @NameInMap("Ipv4Cidrs")
        private java.util.List < String > ipv4Cidrs;

        @NameInMap("Ipv6Cidrs")
        private java.util.List < String > ipv6Cidrs;

        @NameInMap("VpcId")
        private String vpcId;

        private AcceptingVpc(Builder builder) {
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.ipv6Cidrs = builder.ipv6Cidrs;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcceptingVpc create() {
            return builder().build();
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List < String > getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List < String > getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > ipv4Cidrs; 
            private java.util.List < String > ipv6Cidrs; 
            private String vpcId; 

            /**
             * The CIDR block of the accepter VPC.
             */
            public Builder ipv4Cidrs(java.util.List < String > ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * The IPv6 CIDR block of the accepter VPC.
             */
            public Builder ipv6Cidrs(java.util.List < String > ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * The ID of the accepter VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AcceptingVpc build() {
                return new AcceptingVpc(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Vpc extends TeaModel {
        @NameInMap("Ipv4Cidrs")
        private java.util.List < String > ipv4Cidrs;

        @NameInMap("Ipv6Cidrs")
        private java.util.List < String > ipv6Cidrs;

        @NameInMap("VpcId")
        private String vpcId;

        private Vpc(Builder builder) {
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.ipv6Cidrs = builder.ipv6Cidrs;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List < String > getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List < String > getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > ipv4Cidrs; 
            private java.util.List < String > ipv6Cidrs; 
            private String vpcId; 

            /**
             * The CIDR block of the requester VPC.
             */
            public Builder ipv4Cidrs(java.util.List < String > ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * The IPv6 CIDR block of the requester VPC.
             */
            public Builder ipv6Cidrs(java.util.List < String > ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * The ID of the requester VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    public static class VpcPeerConnects extends TeaModel {
        @NameInMap("AcceptingOwnerUid")
        private Integer acceptingOwnerUid;

        @NameInMap("AcceptingRegionId")
        private String acceptingRegionId;

        @NameInMap("AcceptingVpc")
        private AcceptingVpc acceptingVpc;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BizStatus")
        private String bizStatus;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtExpired")
        private String gmtExpired;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private Integer ownerId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Vpc")
        private Vpc vpc;

        private VpcPeerConnects(Builder builder) {
            this.acceptingOwnerUid = builder.acceptingOwnerUid;
            this.acceptingRegionId = builder.acceptingRegionId;
            this.acceptingVpc = builder.acceptingVpc;
            this.bandwidth = builder.bandwidth;
            this.bizStatus = builder.bizStatus;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcPeerConnects create() {
            return builder().build();
        }

        /**
         * @return acceptingOwnerUid
         */
        public Integer getAcceptingOwnerUid() {
            return this.acceptingOwnerUid;
        }

        /**
         * @return acceptingRegionId
         */
        public String getAcceptingRegionId() {
            return this.acceptingRegionId;
        }

        /**
         * @return acceptingVpc
         */
        public AcceptingVpc getAcceptingVpc() {
            return this.acceptingVpc;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bizStatus
         */
        public String getBizStatus() {
            return this.bizStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtExpired
         */
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public Integer getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private Integer acceptingOwnerUid; 
            private String acceptingRegionId; 
            private AcceptingVpc acceptingVpc; 
            private Integer bandwidth; 
            private String bizStatus; 
            private String description; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String instanceId; 
            private String name; 
            private Integer ownerId; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private Vpc vpc; 

            /**
             * The ID of the Alibaba Cloud account to which the accepter VPC belongs.
             */
            public Builder acceptingOwnerUid(Integer acceptingOwnerUid) {
                this.acceptingOwnerUid = acceptingOwnerUid;
                return this;
            }

            /**
             * The region ID of the accepter VPC.
             */
            public Builder acceptingRegionId(String acceptingRegionId) {
                this.acceptingRegionId = acceptingRegionId;
                return this;
            }

            /**
             * The details of the accepter VPC.
             */
            public Builder acceptingVpc(AcceptingVpc acceptingVpc) {
                this.acceptingVpc = acceptingVpc;
                return this;
            }

            /**
             * The bandwidth of the VPC peering connection. Unit: Mbit/s. The value is an integer greater than 0.
             * <p>
             * 
             * >  If the value is set to -1, it indicates that no limit is imposed on the bandwidth.
             * 
             * Default value:
             * 
             * *   The default bandwidth of an inter-region VPC peering connection is **1024** Mbit/s.
             * *   The default bandwidth of an intra-region VPC peering connection is **-1** Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The business status of the VPC peering connection. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * The description of the VPC peering connection.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the VPC peering connection was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The expiration time of the VPC peering connection. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.
             * <p>
             * 
             * The expiration time is returned only when the **Status** of the VPC peering connection is **Accepting** or **Expired**. Otherwise, **null** is returned.
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * The time when the VPC peering connection was modified. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the VPC peering connection.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the VPC peering connection.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the requester VPC belongs.
             */
            public Builder ownerId(Integer ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The region ID of the requester VPC.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the VPC peering connection. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Accepting**
             * *   **Updating**
             * *   **Rejected**
             * *   **Expired**
             * *   **Activated**
             * *   **Deleting**
             * *   **Deleted**
             * 
             * For more information about the status of VPC peering connections, see [Overview of VPC peering connections](~~418507~~).
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The details of the requester VPC.
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public VpcPeerConnects build() {
                return new VpcPeerConnects(this);
            } 

        } 

    }
}
