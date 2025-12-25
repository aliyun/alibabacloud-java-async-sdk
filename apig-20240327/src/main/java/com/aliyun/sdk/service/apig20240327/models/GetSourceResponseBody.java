// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceResponseBody</p>
 */
public class GetSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceResponseBody create() {
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
    public Data getData() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DE10E3C0-A676-5169-812D-6610AACBFAFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSourceResponseBody build() {
            return new GetSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceResponseBody</p>
     */
    public static class K8SSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        private K8SSourceInfo(Builder builder) {
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8SSourceInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private String clusterId; 

            private Builder() {
            } 

            private Builder(K8SSourceInfo model) {
                this.clusterId = model.clusterId;
            } 

            /**
             * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c2d290b2d8b5d4935864cace5f0173f31</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public K8SSourceInfo build() {
                return new K8SSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceResponseBody</p>
     */
    public static class NacosSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NacosSourceInfo(Builder builder) {
            this.address = builder.address;
            this.clusterId = builder.clusterId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosSourceInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
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

        public static final class Builder {
            private String address; 
            private String clusterId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(NacosSourceInfo model) {
                this.address = model.address;
                this.clusterId = model.clusterId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The endpoint of the Nacos instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fluss-cn-w7k4hann601</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The Nacos instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-cfn47q7oh001</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NacosSourceInfo build() {
                return new NacosSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("k8SSourceInfo")
        private K8SSourceInfo k8SSourceInfo;

        @com.aliyun.core.annotation.NameInMap("nacosSourceInfo")
        private NacosSourceInfo nacosSourceInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Data(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.gatewayId = builder.gatewayId;
            this.k8SSourceInfo = builder.k8SSourceInfo;
            this.nacosSourceInfo = builder.nacosSourceInfo;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceId = builder.sourceId;
            this.type = builder.type;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return k8SSourceInfo
         */
        public K8SSourceInfo getK8SSourceInfo() {
            return this.k8SSourceInfo;
        }

        /**
         * @return nacosSourceInfo
         */
        public NacosSourceInfo getNacosSourceInfo() {
            return this.nacosSourceInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String gatewayId; 
            private K8SSourceInfo k8SSourceInfo; 
            private NacosSourceInfo nacosSourceInfo; 
            private String name; 
            private String resourceGroupId; 
            private String sourceId; 
            private String type; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTimestamp = model.createTimestamp;
                this.gatewayId = model.gatewayId;
                this.k8SSourceInfo = model.k8SSourceInfo;
                this.nacosSourceInfo = model.nacosSourceInfo;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceId = model.sourceId;
                this.type = model.type;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cq2vundlhtg***</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>Kubernetes source information.</p>
             */
            public Builder k8SSourceInfo(K8SSourceInfo k8SSourceInfo) {
                this.k8SSourceInfo = k8SSourceInfo;
                return this;
            }

            /**
             * <p>The source information when the source type is MSE_NACOS.</p>
             */
            public Builder nacosSourceInfo(NacosSourceInfo nacosSourceInfo) {
                this.nacosSourceInfo = nacosSourceInfo;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>import-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz4us4iruleja</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src-crdddallhtgt***</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>K8S</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
