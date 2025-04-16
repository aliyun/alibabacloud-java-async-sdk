// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetClusterQueueInfoByEnvResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterQueueInfoByEnvResponseBody</p>
 */
public class GetClusterQueueInfoByEnvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetClusterQueueInfoByEnvResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterQueueInfoByEnvResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetClusterQueueInfoByEnvResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
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

        public GetClusterQueueInfoByEnvResponseBody build() {
            return new GetClusterQueueInfoByEnvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterQueueInfoByEnvResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterQueueInfoByEnvResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateAt")
        private String createAt;

        @com.aliyun.core.annotation.NameInMap("FlinkImageRegistry")
        private String flinkImageRegistry;

        @com.aliyun.core.annotation.NameInMap("FlinkImageRepository")
        private String flinkImageRepository;

        @com.aliyun.core.annotation.NameInMap("FlinkImageTag")
        private String flinkImageTag;

        @com.aliyun.core.annotation.NameInMap("FlinkVersion")
        private String flinkVersion;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("MaxVcore")
        private String maxVcore;

        @com.aliyun.core.annotation.NameInMap("ModifiedAt")
        private String modifiedAt;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("ResourceVersion")
        private String resourceVersion;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("VvpClusterType")
        private String vvpClusterType;

        private Data(Builder builder) {
            this.annotations = builder.annotations;
            this.clusterId = builder.clusterId;
            this.createAt = builder.createAt;
            this.flinkImageRegistry = builder.flinkImageRegistry;
            this.flinkImageRepository = builder.flinkImageRepository;
            this.flinkImageTag = builder.flinkImageTag;
            this.flinkVersion = builder.flinkVersion;
            this.labels = builder.labels;
            this.maxVcore = builder.maxVcore;
            this.modifiedAt = builder.modifiedAt;
            this.namespace = builder.namespace;
            this.queueName = builder.queueName;
            this.resourceVersion = builder.resourceVersion;
            this.spec = builder.spec;
            this.vvpClusterType = builder.vvpClusterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createAt
         */
        public String getCreateAt() {
            return this.createAt;
        }

        /**
         * @return flinkImageRegistry
         */
        public String getFlinkImageRegistry() {
            return this.flinkImageRegistry;
        }

        /**
         * @return flinkImageRepository
         */
        public String getFlinkImageRepository() {
            return this.flinkImageRepository;
        }

        /**
         * @return flinkImageTag
         */
        public String getFlinkImageTag() {
            return this.flinkImageTag;
        }

        /**
         * @return flinkVersion
         */
        public String getFlinkVersion() {
            return this.flinkVersion;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return maxVcore
         */
        public String getMaxVcore() {
            return this.maxVcore;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return resourceVersion
         */
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return vvpClusterType
         */
        public String getVvpClusterType() {
            return this.vvpClusterType;
        }

        public static final class Builder {
            private String annotations; 
            private String clusterId; 
            private String createAt; 
            private String flinkImageRegistry; 
            private String flinkImageRepository; 
            private String flinkImageTag; 
            private String flinkVersion; 
            private String labels; 
            private String maxVcore; 
            private String modifiedAt; 
            private String namespace; 
            private String queueName; 
            private String resourceVersion; 
            private String spec; 
            private String vvpClusterType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotations = model.annotations;
                this.clusterId = model.clusterId;
                this.createAt = model.createAt;
                this.flinkImageRegistry = model.flinkImageRegistry;
                this.flinkImageRepository = model.flinkImageRepository;
                this.flinkImageTag = model.flinkImageTag;
                this.flinkVersion = model.flinkVersion;
                this.labels = model.labels;
                this.maxVcore = model.maxVcore;
                this.modifiedAt = model.modifiedAt;
                this.namespace = model.namespace;
                this.queueName = model.queueName;
                this.resourceVersion = model.resourceVersion;
                this.spec = model.spec;
                this.vvpClusterType = model.vvpClusterType;
            } 

            /**
             * Annotations.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateAt.
             */
            public Builder createAt(String createAt) {
                this.createAt = createAt;
                return this;
            }

            /**
             * FlinkImageRegistry.
             */
            public Builder flinkImageRegistry(String flinkImageRegistry) {
                this.flinkImageRegistry = flinkImageRegistry;
                return this;
            }

            /**
             * FlinkImageRepository.
             */
            public Builder flinkImageRepository(String flinkImageRepository) {
                this.flinkImageRepository = flinkImageRepository;
                return this;
            }

            /**
             * FlinkImageTag.
             */
            public Builder flinkImageTag(String flinkImageTag) {
                this.flinkImageTag = flinkImageTag;
                return this;
            }

            /**
             * FlinkVersion.
             */
            public Builder flinkVersion(String flinkVersion) {
                this.flinkVersion = flinkVersion;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MaxVcore.
             */
            public Builder maxVcore(String maxVcore) {
                this.maxVcore = maxVcore;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * ResourceVersion.
             */
            public Builder resourceVersion(String resourceVersion) {
                this.resourceVersion = resourceVersion;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * VvpClusterType.
             */
            public Builder vvpClusterType(String vvpClusterType) {
                this.vvpClusterType = vvpClusterType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
