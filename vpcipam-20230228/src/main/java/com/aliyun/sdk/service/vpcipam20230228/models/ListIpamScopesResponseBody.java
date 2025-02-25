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
 * {@link ListIpamScopesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamScopesResponseBody</p>
 */
public class ListIpamScopesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamScopes")
    private java.util.List<IpamScopes> ipamScopes;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamScopesResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamScopes = builder.ipamScopes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamScopesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipamScopes
     */
    public java.util.List<IpamScopes> getIpamScopes() {
        return this.ipamScopes;
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
        private java.util.List<IpamScopes> ipamScopes; 
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
         * IpamScopes.
         */
        public Builder ipamScopes(java.util.List<IpamScopes> ipamScopes) {
            this.ipamScopes = ipamScopes;
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

        public ListIpamScopesResponseBody build() {
            return new ListIpamScopesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamScopesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamScopesResponseBody</p>
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
     * {@link ListIpamScopesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamScopesResponseBody</p>
     */
    public static class IpamScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamScopeDescription")
        private String ipamScopeDescription;

        @com.aliyun.core.annotation.NameInMap("IpamScopeId")
        private String ipamScopeId;

        @com.aliyun.core.annotation.NameInMap("IpamScopeName")
        private String ipamScopeName;

        @com.aliyun.core.annotation.NameInMap("IpamScopeType")
        private String ipamScopeType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PoolCount")
        private Integer poolCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private IpamScopes(Builder builder) {
            this.createTime = builder.createTime;
            this.ipamId = builder.ipamId;
            this.ipamScopeDescription = builder.ipamScopeDescription;
            this.ipamScopeId = builder.ipamScopeId;
            this.ipamScopeName = builder.ipamScopeName;
            this.ipamScopeType = builder.ipamScopeType;
            this.isDefault = builder.isDefault;
            this.ownerId = builder.ownerId;
            this.poolCount = builder.poolCount;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamScopes create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamScopeDescription
         */
        public String getIpamScopeDescription() {
            return this.ipamScopeDescription;
        }

        /**
         * @return ipamScopeId
         */
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        /**
         * @return ipamScopeName
         */
        public String getIpamScopeName() {
            return this.ipamScopeName;
        }

        /**
         * @return ipamScopeType
         */
        public String getIpamScopeType() {
            return this.ipamScopeType;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return poolCount
         */
        public Integer getPoolCount() {
            return this.poolCount;
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

        public static final class Builder {
            private String createTime; 
            private String ipamId; 
            private String ipamScopeDescription; 
            private String ipamScopeId; 
            private String ipamScopeName; 
            private String ipamScopeType; 
            private Boolean isDefault; 
            private Long ownerId; 
            private Integer poolCount; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * IpamScopeDescription.
             */
            public Builder ipamScopeDescription(String ipamScopeDescription) {
                this.ipamScopeDescription = ipamScopeDescription;
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
             * IpamScopeName.
             */
            public Builder ipamScopeName(String ipamScopeName) {
                this.ipamScopeName = ipamScopeName;
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
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
             * PoolCount.
             */
            public Builder poolCount(Integer poolCount) {
                this.poolCount = poolCount;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public IpamScopes build() {
                return new IpamScopes(this);
            } 

        } 

    }
}
