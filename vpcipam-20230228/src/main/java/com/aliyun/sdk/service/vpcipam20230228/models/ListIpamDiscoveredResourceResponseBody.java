// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamDiscoveredResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamDiscoveredResourceResponseBody</p>
 */
public class ListIpamDiscoveredResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("IpamDiscoveredResources")
    private java.util.List<IpamDiscoveredResources> ipamDiscoveredResources;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamDiscoveredResourceResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamDiscoveredResources = builder.ipamDiscoveredResources;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamDiscoveredResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamDiscoveredResources
     */
    public java.util.List<IpamDiscoveredResources> getIpamDiscoveredResources() {
        return this.ipamDiscoveredResources;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<IpamDiscoveredResources> ipamDiscoveredResources; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamDiscoveredResourceResponseBody model) {
            this.count = model.count;
            this.ipamDiscoveredResources = model.ipamDiscoveredResources;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of resources.</p>
         */
        public Builder ipamDiscoveredResources(java.util.List<IpamDiscoveredResources> ipamDiscoveredResources) {
            this.ipamDiscoveredResources = ipamDiscoveredResources;
            return this;
        }

        /**
         * <p>The maximum number of entries on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, it indicates the token that is used for the next query.</li>
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
         * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamDiscoveredResourceResponseBody build() {
            return new ListIpamDiscoveredResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamDiscoveredResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamDiscoveredResourceResponseBody</p>
     */
    public static class IpCountDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FreeIpCount")
        private String freeIpCount;

        @com.aliyun.core.annotation.NameInMap("TotalIpCount")
        private String totalIpCount;

        @com.aliyun.core.annotation.NameInMap("UsedIpCount")
        private String usedIpCount;

        private IpCountDetail(Builder builder) {
            this.freeIpCount = builder.freeIpCount;
            this.totalIpCount = builder.totalIpCount;
            this.usedIpCount = builder.usedIpCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpCountDetail create() {
            return builder().build();
        }

        /**
         * @return freeIpCount
         */
        public String getFreeIpCount() {
            return this.freeIpCount;
        }

        /**
         * @return totalIpCount
         */
        public String getTotalIpCount() {
            return this.totalIpCount;
        }

        /**
         * @return usedIpCount
         */
        public String getUsedIpCount() {
            return this.usedIpCount;
        }

        public static final class Builder {
            private String freeIpCount; 
            private String totalIpCount; 
            private String usedIpCount; 

            private Builder() {
            } 

            private Builder(IpCountDetail model) {
                this.freeIpCount = model.freeIpCount;
                this.totalIpCount = model.totalIpCount;
                this.usedIpCount = model.usedIpCount;
            } 

            /**
             * FreeIpCount.
             */
            public Builder freeIpCount(String freeIpCount) {
                this.freeIpCount = freeIpCount;
                return this;
            }

            /**
             * TotalIpCount.
             */
            public Builder totalIpCount(String totalIpCount) {
                this.totalIpCount = totalIpCount;
                return this;
            }

            /**
             * UsedIpCount.
             */
            public Builder usedIpCount(String usedIpCount) {
                this.usedIpCount = usedIpCount;
                return this;
            }

            public IpCountDetail build() {
                return new IpCountDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIpamDiscoveredResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamDiscoveredResourceResponseBody</p>
     */
    public static class IpamDiscoveredResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("DiscoveryTime")
        private String discoveryTime;

        @com.aliyun.core.annotation.NameInMap("IpCountDetail")
        private IpCountDetail ipCountDetail;

        @com.aliyun.core.annotation.NameInMap("IpUsage")
        private String ipUsage;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
        private String ipamResourceDiscoveryId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IpamDiscoveredResources(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cidr = builder.cidr;
            this.discoveryTime = builder.discoveryTime;
            this.ipCountDetail = builder.ipCountDetail;
            this.ipUsage = builder.ipUsage;
            this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
            this.sourceCidr = builder.sourceCidr;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamDiscoveredResources create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return discoveryTime
         */
        public String getDiscoveryTime() {
            return this.discoveryTime;
        }

        /**
         * @return ipCountDetail
         */
        public IpCountDetail getIpCountDetail() {
            return this.ipCountDetail;
        }

        /**
         * @return ipUsage
         */
        public String getIpUsage() {
            return this.ipUsage;
        }

        /**
         * @return ipamResourceDiscoveryId
         */
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
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
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String cidr; 
            private String discoveryTime; 
            private IpCountDetail ipCountDetail; 
            private String ipUsage; 
            private String ipamResourceDiscoveryId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceRegionId; 
            private String resourceType; 
            private String sourceCidr; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(IpamDiscoveredResources model) {
                this.aliUid = model.aliUid;
                this.cidr = model.cidr;
                this.discoveryTime = model.discoveryTime;
                this.ipCountDetail = model.ipCountDetail;
                this.ipUsage = model.ipUsage;
                this.ipamResourceDiscoveryId = model.ipamResourceDiscoveryId;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
                this.sourceCidr = model.sourceCidr;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The CIDR block of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/32</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the resource was discovered.</p>
             * <blockquote>
             * <p> If the resource has not been modified since it was created, the discovery time remains unchanged.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder discoveryTime(String discoveryTime) {
                this.discoveryTime = discoveryTime;
                return this;
            }

            /**
             * IpCountDetail.
             */
            public Builder ipCountDetail(IpCountDetail ipCountDetail) {
                this.ipCountDetail = ipCountDetail;
                return this;
            }

            /**
             * <p>The IP usage in decimal form.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipUsage(String ipUsage) {
                this.ipUsage = ipUsage;
                return this;
            }

            /**
             * <p>The ID of resource discovery instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf611fp465c7dyb4z****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The ID of the region to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VSwitch</strong></li>
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
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf611fp465c7dyb4z****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IpamDiscoveredResources build() {
                return new IpamDiscoveredResources(this);
            } 

        } 

    }
}
