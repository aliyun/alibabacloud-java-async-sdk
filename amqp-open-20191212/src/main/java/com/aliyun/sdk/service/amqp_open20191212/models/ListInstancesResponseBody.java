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

        private Builder(ListInstancesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CCBB1225-C392-480E-8C7F-D09AB2CD2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Instances(Builder builder) {
            this.autoRenewInstance = builder.autoRenewInstance;
            this.classicEndpoint = builder.classicEndpoint;
            this.encryptedInstance = builder.encryptedInstance;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.kmsKeyId = builder.kmsKeyId;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.autoRenewInstance = model.autoRenewInstance;
                this.classicEndpoint = model.classicEndpoint;
                this.encryptedInstance = model.encryptedInstance;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.kmsKeyId = model.kmsKeyId;
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
                this.tags = model.tags;
            } 

            /**
             * <p>Indicates whether the instance is automatically renewed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewInstance(Boolean autoRenewInstance) {
                this.autoRenewInstance = autoRenewInstance;
                return this;
            }

            /**
             * <p>The endpoint that is used to access the instance over the classic network. This parameter is no longer available.</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-st21x7kv****.not-support</p>
             */
            public Builder classicEndpoint(String classicEndpoint) {
                this.classicEndpoint = classicEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether the encryption at rest feature is enabled for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encryptedInstance(Boolean encryptedInstance) {
                this.encryptedInstance = encryptedInstance;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the instance expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1651507200000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-st21x7kv****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-st21x7kv****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * <ul>
             * <li>PROFESSIONAL: Professional Edition</li>
             * <li>ENTERPRISE: Enterprise Edition</li>
             * <li>VIP: Enterprise Platinum Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>professional</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used for the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>key-bjj66c2a893vmhawtq5fd</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The maximum number of Internet-based transactions per second (TPS) for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>24832</p>
             */
            public Builder maxEipTps(Integer maxEipTps) {
                this.maxEipTps = maxEipTps;
                return this;
            }

            /**
             * <p>The maximum number of queues on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxQueue(Integer maxQueue) {
                this.maxQueue = maxQueue;
                return this;
            }

            /**
             * <p>The maximum number of VPC-based TPS for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder maxTps(Integer maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * <p>The maximum number of vhosts on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxVhost(Integer maxVhost) {
                this.maxVhost = maxVhost;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the order was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1572441939000</p>
             */
            public Builder orderCreateTime(Long orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PrePaid: the subscription billing method.</li>
             * <li>POST_PAID: the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRE_PAID</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
             */
            public Builder privateEndpoint(String privateEndpoint) {
                this.privateEndpoint = privateEndpoint;
                return this;
            }

            /**
             * <p>The public endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek3axfj2w4czrq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li>DEPLOYING: The instance is being deployed.</li>
             * <li>EXPIRED: The instance is expired.</li>
             * <li>SERVING: The instance is running.</li>
             * <li>RELEASED: The instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SERVING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The disk size. Unit: GB.</p>
             * <blockquote>
             * <p> For Professional Edition instances and Enterprise Edition instances, this parameter is unavailable and **-1** is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>Indicates whether the instance supports elastic IP addresses (EIPs).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportEIP(Boolean supportEIP) {
                this.supportEIP = supportEIP;
                return this;
            }

            /**
             * <p>The tags that are added to the instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

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
        public java.util.List<Instances> getInstances() {
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
            private java.util.List<Instances> instances; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instances = model.instances;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The instances.</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>caebacccb2be03f84eb48b699f0a****</p>
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
