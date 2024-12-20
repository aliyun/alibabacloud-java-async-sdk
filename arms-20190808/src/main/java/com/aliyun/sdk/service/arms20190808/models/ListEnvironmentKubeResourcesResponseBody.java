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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * Annotations.
             */
            public Builder annotations(java.util.Map<String, String> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
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
             * ApiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Object spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
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
