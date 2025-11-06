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
 * {@link InstancePreivewResponseBody} extends {@link TeaModel}
 *
 * <p>InstancePreivewResponseBody</p>
 */
public class InstancePreivewResponseBody extends TeaModel {
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

    private InstancePreivewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstancePreivewResponseBody create() {
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

        private Builder(InstancePreivewResponseBody model) {
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

        public InstancePreivewResponseBody build() {
            return new InstancePreivewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstancePreivewResponseBody} extends {@link TeaModel}
     *
     * <p>InstancePreivewResponseBody</p>
     */
    public static class TagsVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagsVO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsVO create() {
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

            private Builder(TagsVO model) {
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

            public TagsVO build() {
                return new TagsVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstancePreivewResponseBody} extends {@link TeaModel}
     *
     * <p>InstancePreivewResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagsVO")
        private java.util.List<TagsVO> tagsVO;

        private Tags(Builder builder) {
            this.tagsVO = builder.tagsVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagsVO
         */
        public java.util.List<TagsVO> getTagsVO() {
            return this.tagsVO;
        }

        public static final class Builder {
            private java.util.List<TagsVO> tagsVO; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagsVO = model.tagsVO;
            } 

            /**
             * TagsVO.
             */
            public Builder tagsVO(java.util.List<TagsVO> tagsVO) {
                this.tagsVO = tagsVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstancePreivewResponseBody} extends {@link TeaModel}
     *
     * <p>InstancePreivewResponseBody</p>
     */
    public static class InstancesVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("CeaseStatus")
        private Boolean ceaseStatus;

        @com.aliyun.core.annotation.NameInMap("ClassicEndpoint")
        private String classicEndpoint;

        @com.aliyun.core.annotation.NameInMap("EnableDlqTtl")
        private Boolean enableDlqTtl;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InvisibleTime")
        private Integer invisibleTime;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("MaxBindingCount")
        private Integer maxBindingCount;

        @com.aliyun.core.annotation.NameInMap("MaxConnectionChannelCount")
        private Integer maxConnectionChannelCount;

        @com.aliyun.core.annotation.NameInMap("MaxConnectionCount")
        private Integer maxConnectionCount;

        @com.aliyun.core.annotation.NameInMap("MaxConsumeRetryTime")
        private Integer maxConsumeRetryTime;

        @com.aliyun.core.annotation.NameInMap("MaxEIPTPS")
        private Integer maxEIPTPS;

        @com.aliyun.core.annotation.NameInMap("MaxExchangeCount")
        private Integer maxExchangeCount;

        @com.aliyun.core.annotation.NameInMap("MaxMsgBodyByte")
        private Integer maxMsgBodyByte;

        @com.aliyun.core.annotation.NameInMap("MaxMsgDelayHour")
        private Integer maxMsgDelayHour;

        @com.aliyun.core.annotation.NameInMap("MaxMsgTraceTime")
        private Integer maxMsgTraceTime;

        @com.aliyun.core.annotation.NameInMap("MaxQueue")
        private Integer maxQueue;

        @com.aliyun.core.annotation.NameInMap("MaxQueueConsumerCount")
        private Integer maxQueueConsumerCount;

        @com.aliyun.core.annotation.NameInMap("MaxRetryInterval")
        private Integer maxRetryInterval;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTimes")
        private Integer maxRetryTimes;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServerlessRate")
        private Double serverlessRate;

        @com.aliyun.core.annotation.NameInMap("ServerlessSwitch")
        private Boolean serverlessSwitch;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("SupportEIP")
        private Boolean supportEIP;

        @com.aliyun.core.annotation.NameInMap("SupportMsgTrace")
        private Boolean supportMsgTrace;

        @com.aliyun.core.annotation.NameInMap("SupportOpenSourceAuth")
        private Boolean supportOpenSourceAuth;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UsedQueue")
        private Integer usedQueue;

        @com.aliyun.core.annotation.NameInMap("UsedVhost")
        private Integer usedVhost;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private InstancesVO(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.ceaseStatus = builder.ceaseStatus;
            this.classicEndpoint = builder.classicEndpoint;
            this.enableDlqTtl = builder.enableDlqTtl;
            this.encrypted = builder.encrypted;
            this.expire = builder.expire;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.invisibleTime = builder.invisibleTime;
            this.kmsKeyId = builder.kmsKeyId;
            this.maxBindingCount = builder.maxBindingCount;
            this.maxConnectionChannelCount = builder.maxConnectionChannelCount;
            this.maxConnectionCount = builder.maxConnectionCount;
            this.maxConsumeRetryTime = builder.maxConsumeRetryTime;
            this.maxEIPTPS = builder.maxEIPTPS;
            this.maxExchangeCount = builder.maxExchangeCount;
            this.maxMsgBodyByte = builder.maxMsgBodyByte;
            this.maxMsgDelayHour = builder.maxMsgDelayHour;
            this.maxMsgTraceTime = builder.maxMsgTraceTime;
            this.maxQueue = builder.maxQueue;
            this.maxQueueConsumerCount = builder.maxQueueConsumerCount;
            this.maxRetryInterval = builder.maxRetryInterval;
            this.maxRetryTimes = builder.maxRetryTimes;
            this.maxTPS = builder.maxTPS;
            this.maxVhost = builder.maxVhost;
            this.orderCreate = builder.orderCreate;
            this.orderType = builder.orderType;
            this.privateEndpoint = builder.privateEndpoint;
            this.publicEndpoint = builder.publicEndpoint;
            this.resourceGroupId = builder.resourceGroupId;
            this.serverlessRate = builder.serverlessRate;
            this.serverlessSwitch = builder.serverlessSwitch;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.supportEIP = builder.supportEIP;
            this.supportMsgTrace = builder.supportMsgTrace;
            this.supportOpenSourceAuth = builder.supportOpenSourceAuth;
            this.tags = builder.tags;
            this.usedQueue = builder.usedQueue;
            this.usedVhost = builder.usedVhost;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancesVO create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return ceaseStatus
         */
        public Boolean getCeaseStatus() {
            return this.ceaseStatus;
        }

        /**
         * @return classicEndpoint
         */
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        /**
         * @return enableDlqTtl
         */
        public Boolean getEnableDlqTtl() {
            return this.enableDlqTtl;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
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
         * @return invisibleTime
         */
        public Integer getInvisibleTime() {
            return this.invisibleTime;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return maxBindingCount
         */
        public Integer getMaxBindingCount() {
            return this.maxBindingCount;
        }

        /**
         * @return maxConnectionChannelCount
         */
        public Integer getMaxConnectionChannelCount() {
            return this.maxConnectionChannelCount;
        }

        /**
         * @return maxConnectionCount
         */
        public Integer getMaxConnectionCount() {
            return this.maxConnectionCount;
        }

        /**
         * @return maxConsumeRetryTime
         */
        public Integer getMaxConsumeRetryTime() {
            return this.maxConsumeRetryTime;
        }

        /**
         * @return maxEIPTPS
         */
        public Integer getMaxEIPTPS() {
            return this.maxEIPTPS;
        }

        /**
         * @return maxExchangeCount
         */
        public Integer getMaxExchangeCount() {
            return this.maxExchangeCount;
        }

        /**
         * @return maxMsgBodyByte
         */
        public Integer getMaxMsgBodyByte() {
            return this.maxMsgBodyByte;
        }

        /**
         * @return maxMsgDelayHour
         */
        public Integer getMaxMsgDelayHour() {
            return this.maxMsgDelayHour;
        }

        /**
         * @return maxMsgTraceTime
         */
        public Integer getMaxMsgTraceTime() {
            return this.maxMsgTraceTime;
        }

        /**
         * @return maxQueue
         */
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        /**
         * @return maxQueueConsumerCount
         */
        public Integer getMaxQueueConsumerCount() {
            return this.maxQueueConsumerCount;
        }

        /**
         * @return maxRetryInterval
         */
        public Integer getMaxRetryInterval() {
            return this.maxRetryInterval;
        }

        /**
         * @return maxRetryTimes
         */
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serverlessRate
         */
        public Double getServerlessRate() {
            return this.serverlessRate;
        }

        /**
         * @return serverlessSwitch
         */
        public Boolean getServerlessSwitch() {
            return this.serverlessSwitch;
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
         * @return supportMsgTrace
         */
        public Boolean getSupportMsgTrace() {
            return this.supportMsgTrace;
        }

        /**
         * @return supportOpenSourceAuth
         */
        public Boolean getSupportOpenSourceAuth() {
            return this.supportOpenSourceAuth;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return usedQueue
         */
        public Integer getUsedQueue() {
            return this.usedQueue;
        }

        /**
         * @return usedVhost
         */
        public Integer getUsedVhost() {
            return this.usedVhost;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Boolean ceaseStatus; 
            private String classicEndpoint; 
            private Boolean enableDlqTtl; 
            private Boolean encrypted; 
            private Long expire; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private Integer invisibleTime; 
            private String kmsKeyId; 
            private Integer maxBindingCount; 
            private Integer maxConnectionChannelCount; 
            private Integer maxConnectionCount; 
            private Integer maxConsumeRetryTime; 
            private Integer maxEIPTPS; 
            private Integer maxExchangeCount; 
            private Integer maxMsgBodyByte; 
            private Integer maxMsgDelayHour; 
            private Integer maxMsgTraceTime; 
            private Integer maxQueue; 
            private Integer maxQueueConsumerCount; 
            private Integer maxRetryInterval; 
            private Integer maxRetryTimes; 
            private Integer maxTPS; 
            private Integer maxVhost; 
            private Long orderCreate; 
            private String orderType; 
            private String privateEndpoint; 
            private String publicEndpoint; 
            private String resourceGroupId; 
            private Double serverlessRate; 
            private Boolean serverlessSwitch; 
            private String status; 
            private Integer storageSize; 
            private Boolean supportEIP; 
            private Boolean supportMsgTrace; 
            private Boolean supportOpenSourceAuth; 
            private Tags tags; 
            private Integer usedQueue; 
            private Integer usedVhost; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(InstancesVO model) {
                this.autoRenew = model.autoRenew;
                this.ceaseStatus = model.ceaseStatus;
                this.classicEndpoint = model.classicEndpoint;
                this.enableDlqTtl = model.enableDlqTtl;
                this.encrypted = model.encrypted;
                this.expire = model.expire;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.invisibleTime = model.invisibleTime;
                this.kmsKeyId = model.kmsKeyId;
                this.maxBindingCount = model.maxBindingCount;
                this.maxConnectionChannelCount = model.maxConnectionChannelCount;
                this.maxConnectionCount = model.maxConnectionCount;
                this.maxConsumeRetryTime = model.maxConsumeRetryTime;
                this.maxEIPTPS = model.maxEIPTPS;
                this.maxExchangeCount = model.maxExchangeCount;
                this.maxMsgBodyByte = model.maxMsgBodyByte;
                this.maxMsgDelayHour = model.maxMsgDelayHour;
                this.maxMsgTraceTime = model.maxMsgTraceTime;
                this.maxQueue = model.maxQueue;
                this.maxQueueConsumerCount = model.maxQueueConsumerCount;
                this.maxRetryInterval = model.maxRetryInterval;
                this.maxRetryTimes = model.maxRetryTimes;
                this.maxTPS = model.maxTPS;
                this.maxVhost = model.maxVhost;
                this.orderCreate = model.orderCreate;
                this.orderType = model.orderType;
                this.privateEndpoint = model.privateEndpoint;
                this.publicEndpoint = model.publicEndpoint;
                this.resourceGroupId = model.resourceGroupId;
                this.serverlessRate = model.serverlessRate;
                this.serverlessSwitch = model.serverlessSwitch;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.supportEIP = model.supportEIP;
                this.supportMsgTrace = model.supportMsgTrace;
                this.supportOpenSourceAuth = model.supportOpenSourceAuth;
                this.tags = model.tags;
                this.usedQueue = model.usedQueue;
                this.usedVhost = model.usedVhost;
                this.version = model.version;
            } 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * CeaseStatus.
             */
            public Builder ceaseStatus(Boolean ceaseStatus) {
                this.ceaseStatus = ceaseStatus;
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
             * EnableDlqTtl.
             */
            public Builder enableDlqTtl(Boolean enableDlqTtl) {
                this.enableDlqTtl = enableDlqTtl;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
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
             * InvisibleTime.
             */
            public Builder invisibleTime(Integer invisibleTime) {
                this.invisibleTime = invisibleTime;
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
             * MaxBindingCount.
             */
            public Builder maxBindingCount(Integer maxBindingCount) {
                this.maxBindingCount = maxBindingCount;
                return this;
            }

            /**
             * MaxConnectionChannelCount.
             */
            public Builder maxConnectionChannelCount(Integer maxConnectionChannelCount) {
                this.maxConnectionChannelCount = maxConnectionChannelCount;
                return this;
            }

            /**
             * MaxConnectionCount.
             */
            public Builder maxConnectionCount(Integer maxConnectionCount) {
                this.maxConnectionCount = maxConnectionCount;
                return this;
            }

            /**
             * MaxConsumeRetryTime.
             */
            public Builder maxConsumeRetryTime(Integer maxConsumeRetryTime) {
                this.maxConsumeRetryTime = maxConsumeRetryTime;
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
             * MaxExchangeCount.
             */
            public Builder maxExchangeCount(Integer maxExchangeCount) {
                this.maxExchangeCount = maxExchangeCount;
                return this;
            }

            /**
             * MaxMsgBodyByte.
             */
            public Builder maxMsgBodyByte(Integer maxMsgBodyByte) {
                this.maxMsgBodyByte = maxMsgBodyByte;
                return this;
            }

            /**
             * MaxMsgDelayHour.
             */
            public Builder maxMsgDelayHour(Integer maxMsgDelayHour) {
                this.maxMsgDelayHour = maxMsgDelayHour;
                return this;
            }

            /**
             * MaxMsgTraceTime.
             */
            public Builder maxMsgTraceTime(Integer maxMsgTraceTime) {
                this.maxMsgTraceTime = maxMsgTraceTime;
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
             * MaxQueueConsumerCount.
             */
            public Builder maxQueueConsumerCount(Integer maxQueueConsumerCount) {
                this.maxQueueConsumerCount = maxQueueConsumerCount;
                return this;
            }

            /**
             * MaxRetryInterval.
             */
            public Builder maxRetryInterval(Integer maxRetryInterval) {
                this.maxRetryInterval = maxRetryInterval;
                return this;
            }

            /**
             * MaxRetryTimes.
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ServerlessRate.
             */
            public Builder serverlessRate(Double serverlessRate) {
                this.serverlessRate = serverlessRate;
                return this;
            }

            /**
             * ServerlessSwitch.
             */
            public Builder serverlessSwitch(Boolean serverlessSwitch) {
                this.serverlessSwitch = serverlessSwitch;
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
             * SupportMsgTrace.
             */
            public Builder supportMsgTrace(Boolean supportMsgTrace) {
                this.supportMsgTrace = supportMsgTrace;
                return this;
            }

            /**
             * SupportOpenSourceAuth.
             */
            public Builder supportOpenSourceAuth(Boolean supportOpenSourceAuth) {
                this.supportOpenSourceAuth = supportOpenSourceAuth;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UsedQueue.
             */
            public Builder usedQueue(Integer usedQueue) {
                this.usedQueue = usedQueue;
                return this;
            }

            /**
             * UsedVhost.
             */
            public Builder usedVhost(Integer usedVhost) {
                this.usedVhost = usedVhost;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public InstancesVO build() {
                return new InstancesVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstancePreivewResponseBody} extends {@link TeaModel}
     *
     * <p>InstancePreivewResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstancesVO")
        private java.util.List<InstancesVO> instancesVO;

        private Instances(Builder builder) {
            this.instancesVO = builder.instancesVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instancesVO
         */
        public java.util.List<InstancesVO> getInstancesVO() {
            return this.instancesVO;
        }

        public static final class Builder {
            private java.util.List<InstancesVO> instancesVO; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instancesVO = model.instancesVO;
            } 

            /**
             * InstancesVO.
             */
            public Builder instancesVO(java.util.List<InstancesVO> instancesVO) {
                this.instancesVO = instancesVO;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstancePreivewResponseBody} extends {@link TeaModel}
     *
     * <p>InstancePreivewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExchangeNum")
        private Integer exchangeNum;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Instances instances;

        @com.aliyun.core.annotation.NameInMap("QueueNum")
        private Integer queueNum;

        @com.aliyun.core.annotation.NameInMap("VhostNum")
        private Integer vhostNum;

        private Data(Builder builder) {
            this.exchangeNum = builder.exchangeNum;
            this.instanceNum = builder.instanceNum;
            this.instances = builder.instances;
            this.queueNum = builder.queueNum;
            this.vhostNum = builder.vhostNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exchangeNum
         */
        public Integer getExchangeNum() {
            return this.exchangeNum;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return queueNum
         */
        public Integer getQueueNum() {
            return this.queueNum;
        }

        /**
         * @return vhostNum
         */
        public Integer getVhostNum() {
            return this.vhostNum;
        }

        public static final class Builder {
            private Integer exchangeNum; 
            private Integer instanceNum; 
            private Instances instances; 
            private Integer queueNum; 
            private Integer vhostNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.exchangeNum = model.exchangeNum;
                this.instanceNum = model.instanceNum;
                this.instances = model.instances;
                this.queueNum = model.queueNum;
                this.vhostNum = model.vhostNum;
            } 

            /**
             * ExchangeNum.
             */
            public Builder exchangeNum(Integer exchangeNum) {
                this.exchangeNum = exchangeNum;
                return this;
            }

            /**
             * InstanceNum.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * QueueNum.
             */
            public Builder queueNum(Integer queueNum) {
                this.queueNum = queueNum;
                return this;
            }

            /**
             * VhostNum.
             */
            public Builder vhostNum(Integer vhostNum) {
                this.vhostNum = vhostNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
