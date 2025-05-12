// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("kernel_version")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Object meta;

        @com.aliyun.core.annotation.NameInMap("os_arch")
        private String osArch;

        @com.aliyun.core.annotation.NameInMap("os_health_score")
        private String osHealthScore;

        @com.aliyun.core.annotation.NameInMap("os_name")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("os_name_id")
        private String osNameId;

        @com.aliyun.core.annotation.NameInMap("os_version")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("os_version_id")
        private String osVersionId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.instance = builder.instance;
            this.kernelVersion = builder.kernelVersion;
            this.meta = builder.meta;
            this.osArch = builder.osArch;
            this.osHealthScore = builder.osHealthScore;
            this.osName = builder.osName;
            this.osNameId = builder.osNameId;
            this.osVersion = builder.osVersion;
            this.osVersionId = builder.osVersionId;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return meta
         */
        public Object getMeta() {
            return this.meta;
        }

        /**
         * @return osArch
         */
        public String getOsArch() {
            return this.osArch;
        }

        /**
         * @return osHealthScore
         */
        public String getOsHealthScore() {
            return this.osHealthScore;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return osNameId
         */
        public String getOsNameId() {
            return this.osNameId;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return osVersionId
         */
        public String getOsVersionId() {
            return this.osVersionId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String instance; 
            private String kernelVersion; 
            private Object meta; 
            private String osArch; 
            private String osHealthScore; 
            private String osName; 
            private String osNameId; 
            private String osVersion; 
            private String osVersionId; 
            private String region; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.instance = model.instance;
                this.kernelVersion = model.kernelVersion;
                this.meta = model.meta;
                this.osArch = model.osArch;
                this.osHealthScore = model.osHealthScore;
                this.osName = model.osName;
                this.osNameId = model.osNameId;
                this.osVersion = model.osVersion;
                this.osVersionId = model.osVersionId;
                this.region = model.region;
                this.status = model.status;
            } 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * kernel_version.
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(Object meta) {
                this.meta = meta;
                return this;
            }

            /**
             * os_arch.
             */
            public Builder osArch(String osArch) {
                this.osArch = osArch;
                return this;
            }

            /**
             * os_health_score.
             */
            public Builder osHealthScore(String osHealthScore) {
                this.osHealthScore = osHealthScore;
                return this;
            }

            /**
             * os_name.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * os_name_id.
             */
            public Builder osNameId(String osNameId) {
                this.osNameId = osNameId;
                return this;
            }

            /**
             * os_version.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * os_version_id.
             */
            public Builder osVersionId(String osVersionId) {
                this.osVersionId = osVersionId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
