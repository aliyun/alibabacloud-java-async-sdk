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
 * {@link ListIpamPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamPoolsResponseBody</p>
 */
public class ListIpamPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamPools")
    private java.util.List<IpamPools> ipamPools;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<IpamPools> getIpamPools() {
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
        private java.util.List<IpamPools> ipamPools; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamPoolsResponseBody model) {
            this.count = model.count;
            this.ipamPools = model.ipamPools;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The IPAM pools.</p>
         */
        public Builder ipamPools(java.util.List<IpamPools> ipamPools) {
            this.ipamPools = ipamPools;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
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
         * <p>B54867DE-83DC-56B4-A57E-69A03119D0B1</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceIpamPoolId")
        private String sourceIpamPoolId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        public java.util.List<Tags> getTags() {
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
            private String resourceGroupId; 
            private String sourceIpamPoolId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(IpamPools model) {
                this.allocationDefaultCidrMask = model.allocationDefaultCidrMask;
                this.allocationMaxCidrMask = model.allocationMaxCidrMask;
                this.allocationMinCidrMask = model.allocationMinCidrMask;
                this.autoImport = model.autoImport;
                this.createTime = model.createTime;
                this.hasSubPool = model.hasSubPool;
                this.ipVersion = model.ipVersion;
                this.ipamId = model.ipamId;
                this.ipamPoolDescription = model.ipamPoolDescription;
                this.ipamPoolId = model.ipamPoolId;
                this.ipamPoolName = model.ipamPoolName;
                this.ipamRegionId = model.ipamRegionId;
                this.ipamScopeId = model.ipamScopeId;
                this.ipamScopeType = model.ipamScopeType;
                this.isShared = model.isShared;
                this.ownerId = model.ownerId;
                this.poolDepth = model.poolDepth;
                this.poolRegionId = model.poolRegionId;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceIpamPoolId = model.sourceIpamPoolId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The default network mask assigned to the IPAM pool.</p>
             * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder allocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
                this.allocationDefaultCidrMask = allocationDefaultCidrMask;
                return this;
            }

            /**
             * <p>The maximum network mask assigned to the IPAM pool.</p>
             * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder allocationMaxCidrMask(Integer allocationMaxCidrMask) {
                this.allocationMaxCidrMask = allocationMaxCidrMask;
                return this;
            }

            /**
             * <p>The minimum network mask assigned to the IPAM pool.</p>
             * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder allocationMinCidrMask(Integer allocationMinCidrMask) {
                this.allocationMinCidrMask = allocationMinCidrMask;
                return this;
            }

            /**
             * <p>Whether the pool has the auto-import feature enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoImport(Boolean autoImport) {
                this.autoImport = autoImport;
                return this;
            }

            /**
             * <p>The time when the IPAM pool was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-19T16:49:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the pool is a subpool. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasSubPool(Boolean hasSubPool) {
                this.hasSubPool = hasSubPool;
                return this;
            }

            /**
             * <p>The IP version. Only <strong>IPv4</strong> may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-b5mtlx3q7xcnyr****</p>
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * <p>The description of the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder ipamPoolDescription(String ipamPoolDescription) {
                this.ipamPoolDescription = ipamPoolDescription;
                return this;
            }

            /**
             * <p>The ID of the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-pool-6rcq3tobayc20t****</p>
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * <p>The name of the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipamPoolName(String ipamPoolName) {
                this.ipamPoolName = ipamPoolName;
                return this;
            }

            /**
             * <p>The ID of the region where the IPAM to which the IPAM pool belongs is hosted.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder ipamRegionId(String ipamRegionId) {
                this.ipamRegionId = ipamRegionId;
                return this;
            }

            /**
             * <p>The ID of the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-scope-glfmcyldpm8lsy****</p>
             */
            public Builder ipamScopeId(String ipamScopeId) {
                this.ipamScopeId = ipamScopeId;
                return this;
            }

            /**
             * <p>The type of the IPAM scope. Valid values:</p>
             * <ul>
             * <li><strong>public</strong></li>
             * <li><strong>private</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder ipamScopeType(String ipamScopeType) {
                this.ipamScopeType = ipamScopeType;
                return this;
            }

            /**
             * <p>Whether it is a shared pool.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShared(Boolean isShared) {
                this.isShared = isShared;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account of the owner for the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456******</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The depth of the IPAM pool. Valid values: <strong>0 to 10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder poolDepth(Integer poolDepth) {
                this.poolDepth = poolDepth;
                return this;
            }

            /**
             * <p>The effective region of the IPAM pool. The ID of the effective region for the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder poolRegionId(String poolRegionId) {
                this.poolRegionId = poolRegionId;
                return this;
            }

            /**
             * <p>The ID of the region where the operation is called.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the source IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-pool-lfnwi4jok1ss0g****</p>
             */
            public Builder sourceIpamPoolId(String sourceIpamPoolId) {
                this.sourceIpamPoolId = sourceIpamPoolId;
                return this;
            }

            /**
             * <p>The status of the IPAM pool. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong>: indicates that the creation is complete.</li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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

            public IpamPools build() {
                return new IpamPools(this);
            } 

        } 

    }
}
