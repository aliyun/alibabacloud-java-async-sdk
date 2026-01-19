// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListOrganizationalUnitsForResourceServerResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsForResourceServerResponseBody</p>
 */
public class ListOrganizationalUnitsForResourceServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OrganizationalUnits")
    private java.util.List<OrganizationalUnits> organizationalUnits;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOrganizationalUnitsForResourceServerResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.organizationalUnits = builder.organizationalUnits;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitsForResourceServerResponseBody create() {
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
     * @return organizationalUnits
     */
    public java.util.List<OrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<OrganizationalUnits> organizationalUnits; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOrganizationalUnitsForResourceServerResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.organizationalUnits = model.organizationalUnits;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrganizationalUnits.
         */
        public Builder organizationalUnits(java.util.List<OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
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

        public ListOrganizationalUnitsForResourceServerResponseBody build() {
            return new ListOrganizationalUnitsForResourceServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationalUnitsForResourceServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationalUnitsForResourceServerResponseBody</p>
     */
    public static class ResourceServerScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeId")
        private String resourceServerScopeId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeName")
        private String resourceServerScopeName;

        private ResourceServerScopes(Builder builder) {
            this.resourceServerScopeId = builder.resourceServerScopeId;
            this.resourceServerScopeName = builder.resourceServerScopeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceServerScopes create() {
            return builder().build();
        }

        /**
         * @return resourceServerScopeId
         */
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        /**
         * @return resourceServerScopeName
         */
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

        public static final class Builder {
            private String resourceServerScopeId; 
            private String resourceServerScopeName; 

            private Builder() {
            } 

            private Builder(ResourceServerScopes model) {
                this.resourceServerScopeId = model.resourceServerScopeId;
                this.resourceServerScopeName = model.resourceServerScopeName;
            } 

            /**
             * <p>ResourceServerScope唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
             */
            public Builder resourceServerScopeId(String resourceServerScopeId) {
                this.resourceServerScopeId = resourceServerScopeId;
                return this;
            }

            /**
             * <p>ResourceServerScope名称</p>
             * 
             * <strong>example:</strong>
             * <p>获取资源信息</p>
             */
            public Builder resourceServerScopeName(String resourceServerScopeName) {
                this.resourceServerScopeName = resourceServerScopeName;
                return this;
            }

            public ResourceServerScopes build() {
                return new ResourceServerScopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOrganizationalUnitsForResourceServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationalUnitsForResourceServerResponseBody</p>
     */
    public static class OrganizationalUnits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopes")
        private java.util.List<ResourceServerScopes> resourceServerScopes;

        private OrganizationalUnits(Builder builder) {
            this.instanceId = builder.instanceId;
            this.organizationalUnitId = builder.organizationalUnitId;
            this.resourceServerScopes = builder.resourceServerScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnits create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        /**
         * @return resourceServerScopes
         */
        public java.util.List<ResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

        public static final class Builder {
            private String instanceId; 
            private String organizationalUnitId; 
            private java.util.List<ResourceServerScopes> resourceServerScopes; 

            private Builder() {
            } 

            private Builder(OrganizationalUnits model) {
                this.instanceId = model.instanceId;
                this.organizationalUnitId = model.organizationalUnitId;
                this.resourceServerScopes = model.resourceServerScopes;
            } 

            /**
             * <p>实例唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_qsw77zl5vrllwzyrrfwbmpxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>组织的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>ou_nbsomva32b6utec3hgi7scxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * <p>资源服务Scope权限集合</p>
             */
            public Builder resourceServerScopes(java.util.List<ResourceServerScopes> resourceServerScopes) {
                this.resourceServerScopes = resourceServerScopes;
                return this;
            }

            public OrganizationalUnits build() {
                return new OrganizationalUnits(this);
            } 

        } 

    }
}
