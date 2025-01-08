// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvironmentKubeResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentKubeResourcesResponseBody</p>
 */
public class ListEnvironmentKubeResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEnvironmentKubeResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentKubeResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentKubeResourcesResponseBody build() {
            return new ListEnvironmentKubeResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentKubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentKubeResourcesResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.Map<String, String> annotations;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private Metadata(Builder builder) {
            this.annotations = builder.annotations;
            this.labels = builder.labels;
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private java.util.Map<String, String> annotations; 
            private java.util.Map<String, String> labels; 
            private String name; 
            private String namespace; 

            /**
             * <p>The annotations.</p>
             */
            public Builder annotations(java.util.Map<String, String> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prometheus-ack-arms-prometheus-c577b6cc8-mvdwd</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnvironmentKubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentKubeResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Object spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Object status;

        private Data(Builder builder) {
            this.apiVersion = builder.apiVersion;
            this.kind = builder.kind;
            this.metadata = builder.metadata;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return spec
         */
        public Object getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public Object getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiVersion; 
            private String kind; 
            private Metadata metadata; 
            private Object spec; 
            private Object status; 

            /**
             * <p>The version number of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Pod</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The metadata.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The resource specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;dnsPolicy&quot;: &quot;ClusterFirst&quot;,
             *         &quot;nodeName&quot;: &quot;cn-hangzhou.172.16.0.60&quot;,
             *         &quot;terminationGracePeriodSeconds&quot;: 30,
             *         &quot;enableServiceLinks&quot;: true,
             *         &quot;serviceAccountName&quot;: &quot;arms-prom-operator&quot;,
             *         &quot;volumes&quot;: [
             *           {
             *             &quot;name&quot;: &quot;certs&quot;,
             *             &quot;secret&quot;: {
             *               &quot;secretName&quot;: &quot;arms-prometheus-ack-arms-prometheus-cert&quot;,
             *               &quot;defaultMode&quot;: 420
             *             }
             *           }</p>
             */
            public Builder spec(Object spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>run</p>
             */
            public Builder status(Object status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
