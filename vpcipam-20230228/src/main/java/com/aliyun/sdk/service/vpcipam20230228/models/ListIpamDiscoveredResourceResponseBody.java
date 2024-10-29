// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
    private java.util.List < IpamDiscoveredResources> ipamDiscoveredResources;

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

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamDiscoveredResources
     */
    public java.util.List < IpamDiscoveredResources> getIpamDiscoveredResources() {
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
        private java.util.List < IpamDiscoveredResources> ipamDiscoveredResources; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * IpamDiscoveredResources.
         */
        public Builder ipamDiscoveredResources(java.util.List < IpamDiscoveredResources> ipamDiscoveredResources) {
            this.ipamDiscoveredResources = ipamDiscoveredResources;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
    public static class IpamDiscoveredResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("DiscoveryTime")
        private String discoveryTime;

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
            private String ipUsage; 
            private String ipamResourceDiscoveryId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceRegionId; 
            private String resourceType; 
            private String sourceCidr; 
            private String vpcId; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * DiscoveryTime.
             */
            public Builder discoveryTime(String discoveryTime) {
                this.discoveryTime = discoveryTime;
                return this;
            }

            /**
             * IpUsage.
             */
            public Builder ipUsage(String ipUsage) {
                this.ipUsage = ipUsage;
                return this;
            }

            /**
             * IpamResourceDiscoveryId.
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceOwnerId.
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SourceCidr.
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * VpcId.
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
