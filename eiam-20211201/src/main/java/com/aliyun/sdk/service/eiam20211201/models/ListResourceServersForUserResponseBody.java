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
 * {@link ListResourceServersForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceServersForUserResponseBody</p>
 */
public class ListResourceServersForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceServers")
    private java.util.List<ResourceServers> resourceServers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListResourceServersForUserResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceServers = builder.resourceServers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceServersForUserResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceServers
     */
    public java.util.List<ResourceServers> getResourceServers() {
        return this.resourceServers;
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
        private String requestId; 
        private java.util.List<ResourceServers> resourceServers; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceServersForUserResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resourceServers = model.resourceServers;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceServers.
         */
        public Builder resourceServers(java.util.List<ResourceServers> resourceServers) {
            this.resourceServers = resourceServers;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceServersForUserResponseBody build() {
            return new ListResourceServersForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceServersForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceServersForUserResponseBody</p>
     */
    public static class ResourceServerScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasDirectAuthorization")
        private Boolean hasDirectAuthorization;

        @com.aliyun.core.annotation.NameInMap("HasInheritAuthorization")
        private Boolean hasInheritAuthorization;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeId")
        private String resourceServerScopeId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeName")
        private String resourceServerScopeName;

        private ResourceServerScopes(Builder builder) {
            this.hasDirectAuthorization = builder.hasDirectAuthorization;
            this.hasInheritAuthorization = builder.hasInheritAuthorization;
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
         * @return hasDirectAuthorization
         */
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        /**
         * @return hasInheritAuthorization
         */
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
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
            private Boolean hasDirectAuthorization; 
            private Boolean hasInheritAuthorization; 
            private String resourceServerScopeId; 
            private String resourceServerScopeName; 

            private Builder() {
            } 

            private Builder(ResourceServerScopes model) {
                this.hasDirectAuthorization = model.hasDirectAuthorization;
                this.hasInheritAuthorization = model.hasInheritAuthorization;
                this.resourceServerScopeId = model.resourceServerScopeId;
                this.resourceServerScopeName = model.resourceServerScopeName;
            } 

            /**
             * <p>直接分配给当前用户的权限，视为直接授权。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDirectAuthorization(Boolean hasDirectAuthorization) {
                this.hasDirectAuthorization = hasDirectAuthorization;
                return this;
            }

            /**
             * <p>通过用户隶属的组织、组获取的权限，视为继承权限。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasInheritAuthorization(Boolean hasInheritAuthorization) {
                this.hasInheritAuthorization = hasInheritAuthorization;
                return this;
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
             * <p>Read All User</p>
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
     * {@link ListResourceServersForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceServersForUserResponseBody</p>
     */
    public static class ResourceServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerIdentifier")
        private String resourceServerIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopes")
        private java.util.List<ResourceServerScopes> resourceServerScopes;

        private ResourceServers(Builder builder) {
            this.applicationId = builder.applicationId;
            this.instanceId = builder.instanceId;
            this.resourceServerIdentifier = builder.resourceServerIdentifier;
            this.resourceServerScopes = builder.resourceServerScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceServers create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resourceServerIdentifier
         */
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        /**
         * @return resourceServerScopes
         */
        public java.util.List<ResourceServerScopes> getResourceServerScopes() {
            return this.resourceServerScopes;
        }

        public static final class Builder {
            private String applicationId; 
            private String instanceId; 
            private String resourceServerIdentifier; 
            private java.util.List<ResourceServerScopes> resourceServerScopes; 

            private Builder() {
            } 

            private Builder(ResourceServers model) {
                this.applicationId = model.applicationId;
                this.instanceId = model.instanceId;
                this.resourceServerIdentifier = model.resourceServerIdentifier;
                this.resourceServerScopes = model.resourceServerScopes;
            } 

            /**
             * <p>资源服务应用的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>app_nbsomva32b6utec3hgi7scxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
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
             * ResourceServerIdentifier.
             */
            public Builder resourceServerIdentifier(String resourceServerIdentifier) {
                this.resourceServerIdentifier = resourceServerIdentifier;
                return this;
            }

            /**
             * <p>资源服务Scope权限集合</p>
             */
            public Builder resourceServerScopes(java.util.List<ResourceServerScopes> resourceServerScopes) {
                this.resourceServerScopes = resourceServerScopes;
                return this;
            }

            public ResourceServers build() {
                return new ResourceServers(this);
            } 

        } 

    }
}
