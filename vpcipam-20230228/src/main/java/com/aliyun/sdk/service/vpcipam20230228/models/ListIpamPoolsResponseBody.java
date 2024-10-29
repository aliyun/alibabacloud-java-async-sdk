// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIpamPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamPoolsResponseBody</p>
 */
public class ListIpamPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamPools")
    private java.util.List < IpamPools> ipamPools;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamPoolsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamPools = builder.ipamPools;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamPoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipamPools
     */
    public java.util.List < IpamPools> getIpamPools() {
        return this.ipamPools;
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
        private java.util.List < IpamPools> ipamPools; 
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
         * IpamPools.
         */
        public Builder ipamPools(java.util.List < IpamPools> ipamPools) {
            this.ipamPools = ipamPools;
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

        public ListIpamPoolsResponseBody build() {
            return new ListIpamPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamPoolsResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link ListIpamPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamPoolsResponseBody</p>
     */
    public static class IpamPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationDefaultCidrMask")
        private Integer allocationDefaultCidrMask;

        @com.aliyun.core.annotation.NameInMap("AllocationMaxCidrMask")
        private Integer allocationMaxCidrMask;

        @com.aliyun.core.annotation.NameInMap("AllocationMinCidrMask")
        private Integer allocationMinCidrMask;

        @com.aliyun.core.annotation.NameInMap("AutoImport")
        private Boolean autoImport;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("HasSubPool")
        private Boolean hasSubPool;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamPoolDescription")
        private String ipamPoolDescription;

        @com.aliyun.core.annotation.NameInMap("IpamPoolId")
        private String ipamPoolId;

        @com.aliyun.core.annotation.NameInMap("IpamPoolName")
        private String ipamPoolName;

        @com.aliyun.core.annotation.NameInMap("IpamRegionId")
        private String ipamRegionId;

        @com.aliyun.core.annotation.NameInMap("IpamScopeId")
        private String ipamScopeId;

        @com.aliyun.core.annotation.NameInMap("IpamScopeType")
        private String ipamScopeType;

        @com.aliyun.core.annotation.NameInMap("IsShared")
        private Boolean isShared;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PoolDepth")
        private Integer poolDepth;

        @com.aliyun.core.annotation.NameInMap("PoolRegionId")
        private String poolRegionId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceIpamPoolId")
        private String sourceIpamPoolId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private IpamPools(Builder builder) {
            this.allocationDefaultCidrMask = builder.allocationDefaultCidrMask;
            this.allocationMaxCidrMask = builder.allocationMaxCidrMask;
            this.allocationMinCidrMask = builder.allocationMinCidrMask;
            this.autoImport = builder.autoImport;
            this.createTime = builder.createTime;
            this.hasSubPool = builder.hasSubPool;
            this.ipVersion = builder.ipVersion;
            this.ipamId = builder.ipamId;
            this.ipamPoolDescription = builder.ipamPoolDescription;
            this.ipamPoolId = builder.ipamPoolId;
            this.ipamPoolName = builder.ipamPoolName;
            this.ipamRegionId = builder.ipamRegionId;
            this.ipamScopeId = builder.ipamScopeId;
            this.ipamScopeType = builder.ipamScopeType;
            this.isShared = builder.isShared;
            this.ownerId = builder.ownerId;
            this.poolDepth = builder.poolDepth;
            this.poolRegionId = builder.poolRegionId;
            this.regionId = builder.regionId;
            this.sourceIpamPoolId = builder.sourceIpamPoolId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamPools create() {
            return builder().build();
        }

        /**
         * @return allocationDefaultCidrMask
         */
        public Integer getAllocationDefaultCidrMask() {
            return this.allocationDefaultCidrMask;
        }

        /**
         * @return allocationMaxCidrMask
         */
        public Integer getAllocationMaxCidrMask() {
            return this.allocationMaxCidrMask;
        }

        /**
         * @return allocationMinCidrMask
         */
        public Integer getAllocationMinCidrMask() {
            return this.allocationMinCidrMask;
        }

        /**
         * @return autoImport
         */
        public Boolean getAutoImport() {
            return this.autoImport;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hasSubPool
         */
        public Boolean getHasSubPool() {
            return this.hasSubPool;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamPoolDescription
         */
        public String getIpamPoolDescription() {
            return this.ipamPoolDescription;
        }

        /**
         * @return ipamPoolId
         */
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        /**
         * @return ipamPoolName
         */
        public String getIpamPoolName() {
            return this.ipamPoolName;
        }

        /**
         * @return ipamRegionId
         */
        public String getIpamRegionId() {
            return this.ipamRegionId;
        }

        /**
         * @return ipamScopeId
         */
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        /**
         * @return ipamScopeType
         */
        public String getIpamScopeType() {
            return this.ipamScopeType;
        }

        /**
         * @return isShared
         */
        public Boolean getIsShared() {
            return this.isShared;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return poolDepth
         */
        public Integer getPoolDepth() {
            return this.poolDepth;
        }

        /**
         * @return poolRegionId
         */
        public String getPoolRegionId() {
            return this.poolRegionId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceIpamPoolId
         */
        public String getSourceIpamPoolId() {
            return this.sourceIpamPoolId;
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

        public static final class Builder {
            private Integer allocationDefaultCidrMask; 
            private Integer allocationMaxCidrMask; 
            private Integer allocationMinCidrMask; 
            private Boolean autoImport; 
            private String createTime; 
            private Boolean hasSubPool; 
            private String ipVersion; 
            private String ipamId; 
            private String ipamPoolDescription; 
            private String ipamPoolId; 
            private String ipamPoolName; 
            private String ipamRegionId; 
            private String ipamScopeId; 
            private String ipamScopeType; 
            private Boolean isShared; 
            private Long ownerId; 
            private Integer poolDepth; 
            private String poolRegionId; 
            private String regionId; 
            private String sourceIpamPoolId; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * AllocationDefaultCidrMask.
             */
            public Builder allocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
                this.allocationDefaultCidrMask = allocationDefaultCidrMask;
                return this;
            }

            /**
             * AllocationMaxCidrMask.
             */
            public Builder allocationMaxCidrMask(Integer allocationMaxCidrMask) {
                this.allocationMaxCidrMask = allocationMaxCidrMask;
                return this;
            }

            /**
             * AllocationMinCidrMask.
             */
            public Builder allocationMinCidrMask(Integer allocationMinCidrMask) {
                this.allocationMinCidrMask = allocationMinCidrMask;
                return this;
            }

            /**
             * AutoImport.
             */
            public Builder autoImport(Boolean autoImport) {
                this.autoImport = autoImport;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HasSubPool.
             */
            public Builder hasSubPool(Boolean hasSubPool) {
                this.hasSubPool = hasSubPool;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * IpamId.
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * IpamPoolDescription.
             */
            public Builder ipamPoolDescription(String ipamPoolDescription) {
                this.ipamPoolDescription = ipamPoolDescription;
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
             * IpamPoolName.
             */
            public Builder ipamPoolName(String ipamPoolName) {
                this.ipamPoolName = ipamPoolName;
                return this;
            }

            /**
             * IpamRegionId.
             */
            public Builder ipamRegionId(String ipamRegionId) {
                this.ipamRegionId = ipamRegionId;
                return this;
            }

            /**
             * IpamScopeId.
             */
            public Builder ipamScopeId(String ipamScopeId) {
                this.ipamScopeId = ipamScopeId;
                return this;
            }

            /**
             * IpamScopeType.
             */
            public Builder ipamScopeType(String ipamScopeType) {
                this.ipamScopeType = ipamScopeType;
                return this;
            }

            /**
             * IsShared.
             */
            public Builder isShared(Boolean isShared) {
                this.isShared = isShared;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * PoolDepth.
             */
            public Builder poolDepth(Integer poolDepth) {
                this.poolDepth = poolDepth;
                return this;
            }

            /**
             * PoolRegionId.
             */
            public Builder poolRegionId(String poolRegionId) {
                this.poolRegionId = poolRegionId;
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
             * SourceIpamPoolId.
             */
            public Builder sourceIpamPoolId(String sourceIpamPoolId) {
                this.sourceIpamPoolId = sourceIpamPoolId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public IpamPools build() {
                return new IpamPools(this);
            } 

        } 

    }
}
