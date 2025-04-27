// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewInstance")
        private Boolean autoRenewInstance;

        @com.aliyun.core.annotation.NameInMap("ClassicEndpoint")
        private String classicEndpoint;

        @com.aliyun.core.annotation.NameInMap("EncryptedInstance")
        private Boolean encryptedInstance;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxEipTps")
        private Integer maxEipTps;

        @com.aliyun.core.annotation.NameInMap("MaxQueue")
        private Integer maxQueue;

        @com.aliyun.core.annotation.NameInMap("MaxTps")
        private Integer maxTps;

        @com.aliyun.core.annotation.NameInMap("MaxVhost")
        private Integer maxVhost;

        @com.aliyun.core.annotation.NameInMap("OrderCreateTime")
        private Long orderCreateTime;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PrivateEndpoint")
        private String privateEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicEndpoint")
        private String publicEndpoint;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("SupportEIP")
        private Boolean supportEIP;

        @com.aliyun.core.annotation.NameInMap("SupportTracing")
        private Boolean supportTracing;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TracingStorageTime")
        private Integer tracingStorageTime;

        private Data(Builder builder) {
            this.autoRenewInstance = builder.autoRenewInstance;
            this.classicEndpoint = builder.classicEndpoint;
            this.encryptedInstance = builder.encryptedInstance;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.kmsKeyId = builder.kmsKeyId;
            this.maxConnections = builder.maxConnections;
            this.maxEipTps = builder.maxEipTps;
            this.maxQueue = builder.maxQueue;
            this.maxTps = builder.maxTps;
            this.maxVhost = builder.maxVhost;
            this.orderCreateTime = builder.orderCreateTime;
            this.orderType = builder.orderType;
            this.privateEndpoint = builder.privateEndpoint;
            this.publicEndpoint = builder.publicEndpoint;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.supportEIP = builder.supportEIP;
            this.supportTracing = builder.supportTracing;
            this.tags = builder.tags;
            this.tracingStorageTime = builder.tracingStorageTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoRenewInstance
         */
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        /**
         * @return classicEndpoint
         */
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        /**
         * @return encryptedInstance
         */
        public Boolean getEncryptedInstance() {
            return this.encryptedInstance;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
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
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxEipTps
         */
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        /**
         * @return maxQueue
         */
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        /**
         * @return maxTps
         */
        public Integer getMaxTps() {
            return this.maxTps;
        }

        /**
         * @return maxVhost
         */
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        /**
         * @return orderCreateTime
         */
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return privateEndpoint
         */
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        /**
         * @return publicEndpoint
         */
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return supportEIP
         */
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        /**
         * @return supportTracing
         */
        public Boolean getSupportTracing() {
            return this.supportTracing;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tracingStorageTime
         */
        public Integer getTracingStorageTime() {
            return this.tracingStorageTime;
        }

        public static final class Builder {
            private Boolean autoRenewInstance; 
            private String classicEndpoint; 
            private Boolean encryptedInstance; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String kmsKeyId; 
            private Integer maxConnections; 
            private Integer maxEipTps; 
            private Integer maxQueue; 
            private Integer maxTps; 
            private Integer maxVhost; 
            private Long orderCreateTime; 
            private String orderType; 
            private String privateEndpoint; 
            private String publicEndpoint; 
            private String resourceGroupId; 
            private String status; 
            private Integer storageSize; 
            private Boolean supportEIP; 
            private Boolean supportTracing; 
            private java.util.List<Tags> tags; 
            private Integer tracingStorageTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoRenewInstance = model.autoRenewInstance;
                this.classicEndpoint = model.classicEndpoint;
                this.encryptedInstance = model.encryptedInstance;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.kmsKeyId = model.kmsKeyId;
                this.maxConnections = model.maxConnections;
                this.maxEipTps = model.maxEipTps;
                this.maxQueue = model.maxQueue;
                this.maxTps = model.maxTps;
                this.maxVhost = model.maxVhost;
                this.orderCreateTime = model.orderCreateTime;
                this.orderType = model.orderType;
                this.privateEndpoint = model.privateEndpoint;
                this.publicEndpoint = model.publicEndpoint;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.supportEIP = model.supportEIP;
                this.supportTracing = model.supportTracing;
                this.tags = model.tags;
                this.tracingStorageTime = model.tracingStorageTime;
            } 

            /**
             * AutoRenewInstance.
             */
            public Builder autoRenewInstance(Boolean autoRenewInstance) {
                this.autoRenewInstance = autoRenewInstance;
                return this;
            }

            /**
             * ClassicEndpoint.
             */
            public Builder classicEndpoint(String classicEndpoint) {
                this.classicEndpoint = classicEndpoint;
                return this;
            }

            /**
             * EncryptedInstance.
             */
            public Builder encryptedInstance(Boolean encryptedInstance) {
                this.encryptedInstance = encryptedInstance;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * KmsKeyId.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxEipTps.
             */
            public Builder maxEipTps(Integer maxEipTps) {
                this.maxEipTps = maxEipTps;
                return this;
            }

            /**
             * MaxQueue.
             */
            public Builder maxQueue(Integer maxQueue) {
                this.maxQueue = maxQueue;
                return this;
            }

            /**
             * MaxTps.
             */
            public Builder maxTps(Integer maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * MaxVhost.
             */
            public Builder maxVhost(Integer maxVhost) {
                this.maxVhost = maxVhost;
                return this;
            }

            /**
             * OrderCreateTime.
             */
            public Builder orderCreateTime(Long orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * PrivateEndpoint.
             */
            public Builder privateEndpoint(String privateEndpoint) {
                this.privateEndpoint = privateEndpoint;
                return this;
            }

            /**
             * PublicEndpoint.
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * SupportEIP.
             */
            public Builder supportEIP(Boolean supportEIP) {
                this.supportEIP = supportEIP;
                return this;
            }

            /**
             * SupportTracing.
             */
            public Builder supportTracing(Boolean supportTracing) {
                this.supportTracing = supportTracing;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TracingStorageTime.
             */
            public Builder tracingStorageTime(Integer tracingStorageTime) {
                this.tracingStorageTime = tracingStorageTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
