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
 * {@link ListGroupsForResourceServerResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForResourceServerResponseBody</p>
 */
public class ListGroupsForResourceServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListGroupsForResourceServerResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsForResourceServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
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
        private java.util.List<Groups> groups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGroupsForResourceServerResponseBody model) {
            this.groups = model.groups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Groups.
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
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

        public ListGroupsForResourceServerResponseBody build() {
            return new ListGroupsForResourceServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsForResourceServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForResourceServerResponseBody</p>
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
     * {@link ListGroupsForResourceServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForResourceServerResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopes")
        private java.util.List<ResourceServerScopes> resourceServerScopes;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.resourceServerScopes = builder.resourceServerScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resourceServerScopes
         */
        public java.util.List<ResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

        public static final class Builder {
            private String groupId; 
            private String instanceId; 
            private java.util.List<ResourceServerScopes> resourceServerScopes; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.instanceId = model.instanceId;
                this.resourceServerScopes = model.resourceServerScopes;
            } 

            /**
             * <p>用户组的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>group_nbsomva32b6utec3hgi7scxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
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
             * <p>资源服务Scope权限集合</p>
             */
            public Builder resourceServerScopes(java.util.List<ResourceServerScopes> resourceServerScopes) {
                this.resourceServerScopes = resourceServerScopes;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
