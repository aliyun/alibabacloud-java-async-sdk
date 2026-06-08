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
 * {@link ListResourceServerScopesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceServerScopesResponseBody</p>
 */
public class ListResourceServerScopesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceServerScopes")
    private java.util.List<ResourceServerScopes> resourceServerScopes;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourceServerScopesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.resourceServerScopes = builder.resourceServerScopes;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceServerScopesResponseBody create() {
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
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceServerScopes
     */
    public java.util.List<ResourceServerScopes> getResourceServerScopes() {
        return this.resourceServerScopes;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private java.util.List<ResourceServerScopes> resourceServerScopes; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceServerScopesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.resourceServerScopes = model.resourceServerScopes;
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
         * PreviousToken.
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
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
         * ResourceServerScopes.
         */
        public Builder resourceServerScopes(java.util.List<ResourceServerScopes> resourceServerScopes) {
            this.resourceServerScopes = resourceServerScopes;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceServerScopesResponseBody build() {
            return new ListResourceServerScopesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceServerScopesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceServerScopesResponseBody</p>
     */
    public static class ResourceServerScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationType")
        private String authorizationType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeId")
        private String resourceServerScopeId;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeName")
        private String resourceServerScopeName;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeType")
        private String resourceServerScopeType;

        @com.aliyun.core.annotation.NameInMap("ResourceServerScopeValue")
        private String resourceServerScopeValue;

        private ResourceServerScopes(Builder builder) {
            this.applicationId = builder.applicationId;
            this.authorizationType = builder.authorizationType;
            this.instanceId = builder.instanceId;
            this.resourceServerScopeId = builder.resourceServerScopeId;
            this.resourceServerScopeName = builder.resourceServerScopeName;
            this.resourceServerScopeType = builder.resourceServerScopeType;
            this.resourceServerScopeValue = builder.resourceServerScopeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceServerScopes create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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

        /**
         * @return resourceServerScopeType
         */
        public String getResourceServerScopeType() {
            return this.resourceServerScopeType;
        }

        /**
         * @return resourceServerScopeValue
         */
        public String getResourceServerScopeValue() {
            return this.resourceServerScopeValue;
        }

        public static final class Builder {
            private String applicationId; 
            private String authorizationType; 
            private String instanceId; 
            private String resourceServerScopeId; 
            private String resourceServerScopeName; 
            private String resourceServerScopeType; 
            private String resourceServerScopeValue; 

            private Builder() {
            } 

            private Builder(ResourceServerScopes model) {
                this.applicationId = model.applicationId;
                this.authorizationType = model.authorizationType;
                this.instanceId = model.instanceId;
                this.resourceServerScopeId = model.resourceServerScopeId;
                this.resourceServerScopeName = model.resourceServerScopeName;
                this.resourceServerScopeType = model.resourceServerScopeType;
                this.resourceServerScopeValue = model.resourceServerScopeValue;
            } 

            /**
             * <p>IDaaS EIAM 应用Id</p>
             * 
             * <strong>example:</strong>
             * <p>app_xxxxxxxxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * AuthorizationType.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_xxxxxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IDaaS EIAM ResourceServer下权限Id</p>
             * 
             * <strong>example:</strong>
             * <p>rss_xxxxxxxxxxx</p>
             */
            public Builder resourceServerScopeId(String resourceServerScopeId) {
                this.resourceServerScopeId = resourceServerScopeId;
                return this;
            }

            /**
             * <p>IDaaS EIAM ResourceServer下权限名称</p>
             * 
             * <strong>example:</strong>
             * <p>读取全部用户</p>
             */
            public Builder resourceServerScopeName(String resourceServerScopeName) {
                this.resourceServerScopeName = resourceServerScopeName;
                return this;
            }

            /**
             * <p>IDaaS EIAM ResourceServer下权限类型</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
             */
            public Builder resourceServerScopeType(String resourceServerScopeType) {
                this.resourceServerScopeType = resourceServerScopeType;
                return this;
            }

            /**
             * <p>IDaaS EIAM ResourceServer下权限值</p>
             * 
             * <strong>example:</strong>
             * <p>User:Write:ALL</p>
             */
            public Builder resourceServerScopeValue(String resourceServerScopeValue) {
                this.resourceServerScopeValue = resourceServerScopeValue;
                return this;
            }

            public ResourceServerScopes build() {
                return new ResourceServerScopes(this);
            } 

        } 

    }
}
