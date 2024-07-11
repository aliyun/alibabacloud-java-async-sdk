// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

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

            /**
             * 标签键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。
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
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewInstance")
        private Boolean autoRenewInstance;

        @com.aliyun.core.annotation.NameInMap("ClassicEndpoint")
        private String classicEndpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("SupportEIP")
        private Boolean supportEIP;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Instances(Builder builder) {
            this.autoRenewInstance = builder.autoRenewInstance;
            this.classicEndpoint = builder.classicEndpoint;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.maxEipTps = builder.maxEipTps;
            this.maxQueue = builder.maxQueue;
            this.maxTps = builder.maxTps;
            this.maxVhost = builder.maxVhost;
            this.orderCreateTime = builder.orderCreateTime;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean autoRenewInstance; 
            private String classicEndpoint; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private Integer maxEipTps; 
            private Integer maxQueue; 
            private Integer maxTps; 
            private Integer maxVhost; 
            private Long orderCreateTime; 
            private String orderType; 
            private String privateEndpoint; 
            private String publicEndpoint; 
            private String status; 
            private Integer storageSize; 
            private Boolean supportEIP; 
            private java.util.List < Tags> tags; 

            /**
             * Indicates whether the instance is automatically renewed.
             */
            public Builder autoRenewInstance(Boolean autoRenewInstance) {
                this.autoRenewInstance = autoRenewInstance;
                return this;
            }

            /**
             * The endpoint that is used to access the instance over the classic network. This parameter is no longer available.
             */
            public Builder classicEndpoint(String classicEndpoint) {
                this.classicEndpoint = classicEndpoint;
                return this;
            }

            /**
             * The timestamp that indicates when the instance expires. Unit: milliseconds.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The instance ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The instance type.
             * <p>
             * 
             * *   PROFESSIONAL: Professional Edition
             * *   ENTERPRISE: Enterprise Edition
             * *   VIP: Enterprise Platinum Edition
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum number of Internet-based transactions per second (TPS) for the instance.
             */
            public Builder maxEipTps(Integer maxEipTps) {
                this.maxEipTps = maxEipTps;
                return this;
            }

            /**
             * The maximum number of queues on the instance.
             */
            public Builder maxQueue(Integer maxQueue) {
                this.maxQueue = maxQueue;
                return this;
            }

            /**
             * The maximum number of VPC-based TPS for the instance.
             */
            public Builder maxTps(Integer maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * The maximum number of vhosts on the instance.
             */
            public Builder maxVhost(Integer maxVhost) {
                this.maxVhost = maxVhost;
                return this;
            }

            /**
             * The timestamp that indicates when the order was created. Unit: milliseconds.
             */
            public Builder orderCreateTime(Long orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   PrePaid: the subscription billing method.
             * *   POST_PAID: the pay-as-you-go billing method.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The virtual private cloud (VPC) endpoint of the instance.
             */
            public Builder privateEndpoint(String privateEndpoint) {
                this.privateEndpoint = privateEndpoint;
                return this;
            }

            /**
             * The public endpoint of the instance.
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * The instance status. Valid values:
             * <p>
             * 
             * *   DEPLOYING: The instance is being deployed.
             * *   EXPIRED: The instance is expired.
             * *   SERVING: The instance is running.
             * *   RELEASED: The instance is released.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The disk size. Unit: GB.
             * <p>
             * 
             * >  For Professional Edition instances and Enterprise Edition instances, this parameter is unavailable and \*\*-1\*\* is returned.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * Indicates whether the instance supports elastic IP addresses (EIPs).
             */
            public Builder supportEIP(Boolean supportEIP) {
                this.supportEIP = supportEIP;
                return this;
            }

            /**
             * 标签列表。
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.instances = builder.instances;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
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
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Instances> instances; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The maximum number of entries returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
