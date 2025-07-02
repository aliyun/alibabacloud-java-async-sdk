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

        private Builder() {
        } 

        private Builder(ListIpamScopesResponseBody model) {
            this.count = model.count;
            this.ipamScopes = model.ipamScopes;
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
         * <p>The IPAM scopes.</p>
         */
        public Builder ipamScopes(java.util.List<IpamScopes> ipamScopes) {
            this.ipamScopes = ipamScopes;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>8859C501-97E7-53D4-B94B-2A9E16003B22</p>
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
             * <p>FinanceDept</p>
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

            private Builder() {
            } 

            private Builder(IpamScopes model) {
                this.createTime = model.createTime;
                this.ipamId = model.ipamId;
                this.ipamScopeDescription = model.ipamScopeDescription;
                this.ipamScopeId = model.ipamScopeId;
                this.ipamScopeName = model.ipamScopeName;
                this.ipamScopeType = model.ipamScopeType;
                this.isDefault = model.isDefault;
                this.ownerId = model.ownerId;
                this.poolCount = model.poolCount;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The time when the IPAM scope was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T03:12:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-ccxbnsbhew0d6t****</p>
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * <p>The description of the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder ipamScopeDescription(String ipamScopeDescription) {
                this.ipamScopeDescription = ipamScopeDescription;
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
             * <p>The name of the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipamScopeName(String ipamScopeName) {
                this.ipamScopeName = ipamScopeName;
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
             * <p>Indicates whether the scope is the default scope. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that owns the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456******</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The number of pools in the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder poolCount(Integer poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * <p>The region ID of the IPAM.</p>
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
             * <p>The status of the IPAM scope. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
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

            public IpamScopes build() {
                return new IpamScopes(this);
            } 

        } 

    }
}
