// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreatePrometheusVirtualInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrometheusVirtualInstanceResponseBody</p>
 */
public class CreatePrometheusVirtualInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePrometheusVirtualInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusVirtualInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePrometheusVirtualInstanceResponseBody model) {
            this.instance = model.instance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Instance ID</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrometheusVirtualInstanceResponseBody build() {
            return new CreatePrometheusVirtualInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrometheusVirtualInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePrometheusVirtualInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("httpApiUrl")
        private String httpApiUrl;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Instance(Builder builder) {
            this.createdAt = builder.createdAt;
            this.httpApiUrl = builder.httpApiUrl;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return httpApiUrl
         */
        public String getHttpApiUrl() {
            return this.httpApiUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createdAt; 
            private String httpApiUrl; 
            private String instanceId; 
            private String namespace; 
            private String regionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.createdAt = model.createdAt;
                this.httpApiUrl = model.httpApiUrl;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.regionId = model.regionId;
                this.userId = model.userId;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1751520976660</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>HTTP API query address</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
             */
            public Builder httpApiUrl(String httpApiUrl) {
                this.httpApiUrl = httpApiUrl;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>rw-e815960b4c9ebc5c3d89790c7e82</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Cloud product</p>
             * 
             * <strong>example:</strong>
             * <p>ack-csi-fuse</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhengzhou-jva</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>167212345678</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
