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
 * {@link ListPrometheusVirtualInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusVirtualInstancesResponseBody</p>
 */
public class ListPrometheusVirtualInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPrometheusVirtualInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusVirtualInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrometheusVirtualInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Instance information.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusVirtualInstancesResponseBody build() {
            return new ListPrometheusVirtualInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusVirtualInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusVirtualInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
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

        private Instances(Builder builder) {
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

        public static Instances create() {
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

            private Builder(Instances model) {
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
             * <p>1750315319946</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>HTTP API URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
             */
            public Builder httpApiUrl(String httpApiUrl) {
                this.httpApiUrl = httpApiUrl;
                return this;
            }

            /**
             * <p>Applicable data source type: PROMETHEUS_DS</p>
             * <p>Prometheus instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rw-b8cfbbe94194ac37fe83f3d2d16a</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Applicable query type: CMS_BASIC_QUERY.</p>
             * <p>Namespace of the metric</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-cloudspe</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17073812345</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
