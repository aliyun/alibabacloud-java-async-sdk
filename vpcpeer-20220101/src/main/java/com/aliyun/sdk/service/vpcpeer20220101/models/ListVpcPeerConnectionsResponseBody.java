// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

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
 * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcPeerConnectionsResponseBody</p>
 */
public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcPeerConnects")
    private java.util.List<VpcPeerConnects> vpcPeerConnects;

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
    public java.util.List<VpcPeerConnects> getVpcPeerConnects() {
        return this.vpcPeerConnects;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VpcPeerConnects> vpcPeerConnects; 

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If the value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED39DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details of the VPC peering connections.</p>
         */
        public Builder vpcPeerConnects(java.util.List<VpcPeerConnects> vpcPeerConnects) {
            this.vpcPeerConnects = vpcPeerConnects;
            return this;
        }

        public ListVpcPeerConnectionsResponseBody build() {
            return new ListVpcPeerConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPeerConnectionsResponseBody</p>
     */
    public static class AcceptingVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("Ipv6Cidrs")
        private java.util.List<String> ipv6Cidrs;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> ipv4Cidrs; 
            private java.util.List<String> ipv6Cidrs; 
            private String vpcId; 

            /**
             * <p>The CIDR block of the accepter VPC.</p>
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * <p>The IPv6 CIDR block of the accepter VPC.</p>
             */
            public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * <p>The ID of the accepter VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vzjkp2q1xgnind****</p>
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
    /**
     * 
     * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPeerConnectionsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPeerConnectionsResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("Ipv6Cidrs")
        private java.util.List<String> ipv6Cidrs;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> ipv4Cidrs; 
            private java.util.List<String> ipv6Cidrs; 
            private String vpcId; 

            /**
             * <p>The CIDR block of the requester VPC.</p>
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * <p>The IPv6 CIDR block of the requester VPC.</p>
             */
            public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * <p>The ID of the requester VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1gsk7h12ew7oegk****</p>
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
    /**
     * 
     * {@link ListVpcPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPeerConnectionsResponseBody</p>
     */
    public static class VpcPeerConnects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptingOwnerUid")
        private Long acceptingOwnerUid;

        @com.aliyun.core.annotation.NameInMap("AcceptingRegionId")
        private String acceptingRegionId;

        @com.aliyun.core.annotation.NameInMap("AcceptingVpc")
        private AcceptingVpc acceptingVpc;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BizStatus")
        private String bizStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private String gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LinkType")
        private String linkType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Vpc")
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
            this.linkType = builder.linkType;
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
        public Long getAcceptingOwnerUid() {
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
         * @return linkType
         */
        public String getLinkType() {
            return this.linkType;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private Long acceptingOwnerUid; 
            private String acceptingRegionId; 
            private AcceptingVpc acceptingVpc; 
            private Integer bandwidth; 
            private String bizStatus; 
            private String description; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String instanceId; 
            private String linkType; 
            private String name; 
            private Long ownerId; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private Vpc vpc; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the accepter VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder acceptingOwnerUid(Long acceptingOwnerUid) {
                this.acceptingOwnerUid = acceptingOwnerUid;
                return this;
            }

            /**
             * <p>The region ID of the accepter VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder acceptingRegionId(String acceptingRegionId) {
                this.acceptingRegionId = acceptingRegionId;
                return this;
            }

            /**
             * <p>The details of the accepter VPC.</p>
             */
            public Builder acceptingVpc(AcceptingVpc acceptingVpc) {
                this.acceptingVpc = acceptingVpc;
                return this;
            }

            /**
             * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value is an integer greater than 0.</p>
             * <blockquote>
             * <p> If the value is set to -1, it indicates that no limit is imposed on the bandwidth.</p>
             * </blockquote>
             * <p>Default value:</p>
             * <ul>
             * <li>The default bandwidth of an inter-region VPC peering connection is <strong>1024</strong> Mbit/s.</li>
             * <li>The default bandwidth of an intra-region VPC peering connection is <strong>-1</strong> Mbit/s.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The business status of the VPC peering connection. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * <p>The description of the VPC peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the VPC peering connection was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-24T09:02:36Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The expiration time of the VPC peering connection. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
             * <p>The expiration time is returned only when the <strong>Status</strong> of the VPC peering connection is <strong>Accepting</strong> or <strong>Expired</strong>. Otherwise, <strong>null</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-01T09:02:36Z</p>
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The time when the VPC peering connection was modified. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-24T19:20:45Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the VPC peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>pcc-lnk0m24khwvtkm****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The link type of the VPC peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>Gold</p>
             */
            public Builder linkType(String linkType) {
                this.linkType = linkType;
                return this;
            }

            /**
             * <p>The name of the VPC peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vpcpeer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the requester VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the requester VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2gvbs746gt4q</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the VPC peering connection. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Accepting</strong></li>
             * <li><strong>Updating</strong></li>
             * <li><strong>Rejected</strong></li>
             * <li><strong>Expired</strong></li>
             * <li><strong>Activated</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * <p>For more information about the status of VPC peering connections, see <a href="https://help.aliyun.com/document_detail/418507.html">Overview of VPC peering connections</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Activated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The details of the requester VPC.</p>
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
