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
 * {@link ListInstancesWithEcsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesWithEcsInfoResponseBody</p>
 */
public class ListInstancesWithEcsInfoResponseBody extends TeaModel {
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

    private ListInstancesWithEcsInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesWithEcsInfoResponseBody create() {
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

        private Builder(ListInstancesWithEcsInfoResponseBody model) {
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

        public ListInstancesWithEcsInfoResponseBody build() {
            return new ListInstancesWithEcsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesWithEcsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesWithEcsInfoResponseBody</p>
     */
    public static class InstanceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tag_key")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tag_value")
        private String tagValue;

        private InstanceTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(InstanceTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * tag_key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tag_value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public InstanceTag build() {
                return new InstanceTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesWithEcsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesWithEcsInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instance_name")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("instance_tag")
        private java.util.List<InstanceTag> instanceTag;

        @com.aliyun.core.annotation.NameInMap("kernel_version")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("os_arch")
        private String osArch;

        @com.aliyun.core.annotation.NameInMap("os_health_score")
        private String osHealthScore;

        @com.aliyun.core.annotation.NameInMap("os_name")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("private_ip")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("public_ip")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resource_group_name")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceTag = builder.instanceTag;
            this.kernelVersion = builder.kernelVersion;
            this.osArch = builder.osArch;
            this.osHealthScore = builder.osHealthScore;
            this.osName = builder.osName;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceTag
         */
        public java.util.List<InstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
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
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String instanceId; 
            private String instanceName; 
            private java.util.List<InstanceTag> instanceTag; 
            private String kernelVersion; 
            private String osArch; 
            private String osHealthScore; 
            private String osName; 
            private String privateIp; 
            private String publicIp; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceTag = model.instanceTag;
                this.kernelVersion = model.kernelVersion;
                this.osArch = model.osArch;
                this.osHealthScore = model.osHealthScore;
                this.osName = model.osName;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
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
             * instance_id.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instance_name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * instance_tag.
             */
            public Builder instanceTag(java.util.List<InstanceTag> instanceTag) {
                this.instanceTag = instanceTag;
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
             * private_ip.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * public_ip.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * resource_group_id.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resource_group_name.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
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
