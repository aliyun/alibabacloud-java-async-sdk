// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(Data data) {
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

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
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
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class InstancesTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        private InstancesTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancesTags create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(InstancesTags model) {
                this.tags = model.tags;
            } 

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public InstancesTags build() {
                return new InstancesTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("ClassicEndpoint")
        private String classicEndpoint;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxEIPTPS")
        private Integer maxEIPTPS;

        @com.aliyun.core.annotation.NameInMap("MaxQueue")
        private Integer maxQueue;

        @com.aliyun.core.annotation.NameInMap("MaxTPS")
        private Integer maxTPS;

        @com.aliyun.core.annotation.NameInMap("MaxVhost")
        private Integer maxVhost;

        @com.aliyun.core.annotation.NameInMap("OrderCreate")
        private Long orderCreate;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PrivateEndpoint")
        private String privateEndpoint;

        @com.aliyun.core.annotation.NameInMap("PublicEndpoint")
        private String publicEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("SupportEIP")
        private Boolean supportEIP;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private InstancesTags tags;

        private Instances(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.classicEndpoint = builder.classicEndpoint;
            this.expire = builder.expire;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.maxEIPTPS = builder.maxEIPTPS;
            this.maxQueue = builder.maxQueue;
            this.maxTPS = builder.maxTPS;
            this.maxVhost = builder.maxVhost;
            this.orderCreate = builder.orderCreate;
            this.orderType = builder.orderType;
            this.privateEndpoint = builder.privateEndpoint;
            this.publicEndpoint = builder.publicEndpoint;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.supportEIP = builder.supportEIP;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return classicEndpoint
         */
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
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
         * @return maxEIPTPS
         */
        public Integer getMaxEIPTPS() {
            return this.maxEIPTPS;
        }

        /**
         * @return maxQueue
         */
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        /**
         * @return maxTPS
         */
        public Integer getMaxTPS() {
            return this.maxTPS;
        }

        /**
         * @return maxVhost
         */
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        /**
         * @return orderCreate
         */
        public Long getOrderCreate() {
            return this.orderCreate;
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
         * @return tags
         */
        public InstancesTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String classicEndpoint; 
            private Long expire; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private Integer maxEIPTPS; 
            private Integer maxQueue; 
            private Integer maxTPS; 
            private Integer maxVhost; 
            private Long orderCreate; 
            private String orderType; 
            private String privateEndpoint; 
            private String publicEndpoint; 
            private String status; 
            private Integer storageSize; 
            private Boolean supportEIP; 
            private InstancesTags tags; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.autoRenew = model.autoRenew;
                this.classicEndpoint = model.classicEndpoint;
                this.expire = model.expire;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.maxEIPTPS = model.maxEIPTPS;
                this.maxQueue = model.maxQueue;
                this.maxTPS = model.maxTPS;
                this.maxVhost = model.maxVhost;
                this.orderCreate = model.orderCreate;
                this.orderType = model.orderType;
                this.privateEndpoint = model.privateEndpoint;
                this.publicEndpoint = model.publicEndpoint;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.supportEIP = model.supportEIP;
                this.tags = model.tags;
            } 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
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
             * Expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
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
             * MaxEIPTPS.
             */
            public Builder maxEIPTPS(Integer maxEIPTPS) {
                this.maxEIPTPS = maxEIPTPS;
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
             * MaxTPS.
             */
            public Builder maxTPS(Integer maxTPS) {
                this.maxTPS = maxTPS;
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
             * OrderCreate.
             */
            public Builder orderCreate(Long orderCreate) {
                this.orderCreate = orderCreate;
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
             * Tags.
             */
            public Builder tags(InstancesTags tags) {
                this.tags = tags;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

        private Data(Builder builder) {
            this.instances = builder.instances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
            return this.instances;
        }

        public static final class Builder {
            private java.util.List<Instances> instances; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instances = model.instances;
            } 

            /**
             * Instances.
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
