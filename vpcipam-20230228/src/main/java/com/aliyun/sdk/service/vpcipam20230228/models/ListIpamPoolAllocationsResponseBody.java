// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIpamPoolAllocationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamPoolAllocationsResponseBody</p>
 */
public class ListIpamPoolAllocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocations")
    private java.util.List < IpamPoolAllocations> ipamPoolAllocations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamPoolAllocationsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamPoolAllocations = builder.ipamPoolAllocations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamPoolAllocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipamPoolAllocations
     */
    public java.util.List < IpamPoolAllocations> getIpamPoolAllocations() {
        return this.ipamPoolAllocations;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
        private Long count; 
        private java.util.List < IpamPoolAllocations> ipamPoolAllocations; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * IpamPoolAllocations.
         */
        public Builder ipamPoolAllocations(java.util.List < IpamPoolAllocations> ipamPoolAllocations) {
            this.ipamPoolAllocations = ipamPoolAllocations;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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

        public ListIpamPoolAllocationsResponseBody build() {
            return new ListIpamPoolAllocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamPoolAllocationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamPoolAllocationsResponseBody</p>
     */
    public static class IpamPoolAllocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationDescription")
        private String ipamPoolAllocationDescription;

        @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
        private String ipamPoolAllocationId;

        @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
        private String ipamPoolAllocationName;

        @com.aliyun.core.annotation.NameInMap("IpamPoolId")
        private String ipamPoolId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IpamPoolAllocations(Builder builder) {
            this.cidr = builder.cidr;
            this.creationTime = builder.creationTime;
            this.ipamPoolAllocationDescription = builder.ipamPoolAllocationDescription;
            this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
            this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
            this.ipamPoolId = builder.ipamPoolId;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
            this.sourceCidr = builder.sourceCidr;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamPoolAllocations create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ipamPoolAllocationDescription
         */
        public String getIpamPoolAllocationDescription() {
            return this.ipamPoolAllocationDescription;
        }

        /**
         * @return ipamPoolAllocationId
         */
        public String getIpamPoolAllocationId() {
            return this.ipamPoolAllocationId;
        }

        /**
         * @return ipamPoolAllocationName
         */
        public String getIpamPoolAllocationName() {
            return this.ipamPoolAllocationName;
        }

        /**
         * @return ipamPoolId
         */
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cidr; 
            private String creationTime; 
            private String ipamPoolAllocationDescription; 
            private String ipamPoolAllocationId; 
            private String ipamPoolAllocationName; 
            private String ipamPoolId; 
            private String regionId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceRegionId; 
            private String resourceType; 
            private String sourceCidr; 
            private String status; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * IpamPoolAllocationDescription.
             */
            public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
                this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
                return this;
            }

            /**
             * IpamPoolAllocationId.
             */
            public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
                this.ipamPoolAllocationId = ipamPoolAllocationId;
                return this;
            }

            /**
             * IpamPoolAllocationName.
             */
            public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
                this.ipamPoolAllocationName = ipamPoolAllocationName;
                return this;
            }

            /**
             * IpamPoolId.
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpamPoolAllocations build() {
                return new IpamPoolAllocations(this);
            } 

        } 

    }
}
