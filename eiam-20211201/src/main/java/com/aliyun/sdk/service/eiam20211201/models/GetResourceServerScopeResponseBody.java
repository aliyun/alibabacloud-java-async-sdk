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
 * {@link GetResourceServerScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceServerScopeResponseBody</p>
 */
public class GetResourceServerScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceServerScope")
    private ResourceServerScope resourceServerScope;

    private GetResourceServerScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceServerScope = builder.resourceServerScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceServerScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceServerScope
     */
    public ResourceServerScope getResourceServerScope() {
        return this.resourceServerScope;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceServerScope resourceServerScope; 

        private Builder() {
        } 

        private Builder(GetResourceServerScopeResponseBody model) {
            this.requestId = model.requestId;
            this.resourceServerScope = model.resourceServerScope;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceServerScope.
         */
        public Builder resourceServerScope(ResourceServerScope resourceServerScope) {
            this.resourceServerScope = resourceServerScope;
            return this;
        }

        public GetResourceServerScopeResponseBody build() {
            return new GetResourceServerScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceServerScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceServerScopeResponseBody</p>
     */
    public static class ResourceServerScope extends TeaModel {
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

        private ResourceServerScope(Builder builder) {
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

        public static ResourceServerScope create() {
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

            private Builder(ResourceServerScope model) {
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
             * <p>User:Read:ALL</p>
             */
            public Builder resourceServerScopeValue(String resourceServerScopeValue) {
                this.resourceServerScopeValue = resourceServerScopeValue;
                return this;
            }

            public ResourceServerScope build() {
                return new ResourceServerScope(this);
            } 

        } 

    }
}
