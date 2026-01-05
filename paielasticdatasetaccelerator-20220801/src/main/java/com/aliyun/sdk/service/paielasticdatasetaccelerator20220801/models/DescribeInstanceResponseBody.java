// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private String capacity;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("IoType")
    private String ioType;

    @com.aliyun.core.annotation.NameInMap("MaxEndpoint")
    private Integer maxEndpoint;

    @com.aliyun.core.annotation.NameInMap("MaxSlot")
    private Integer maxSlot;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private InstanceStatus status;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeInstanceResponseBody(Builder builder) {
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.ioType = builder.ioType;
        this.maxEndpoint = builder.maxEndpoint;
        this.maxSlot = builder.maxSlot;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.paymentType = builder.paymentType;
        this.providerType = builder.providerType;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.storageType = builder.storageType;
        this.tags = builder.tags;
        this.type = builder.type;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacity
     */
    public String getCapacity() {
        return this.capacity;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return ioType
     */
    public String getIoType() {
        return this.ioType;
    }

    /**
     * @return maxEndpoint
     */
    public Integer getMaxEndpoint() {
        return this.maxEndpoint;
    }

    /**
     * @return maxSlot
     */
    public Integer getMaxSlot() {
        return this.maxSlot;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public InstanceStatus getStatus() {
        return this.status;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String capacity; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String ioType; 
        private Integer maxEndpoint; 
        private Integer maxSlot; 
        private String name; 
        private String ownerId; 
        private String paymentType; 
        private String providerType; 
        private String requestId; 
        private InstanceStatus status; 
        private String storageType; 
        private java.util.List<Tags> tags; 
        private String type; 
        private String userId; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(DescribeInstanceResponseBody model) {
            this.capacity = model.capacity;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.ioType = model.ioType;
            this.maxEndpoint = model.maxEndpoint;
            this.maxSlot = model.maxSlot;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.paymentType = model.paymentType;
            this.providerType = model.providerType;
            this.requestId = model.requestId;
            this.status = model.status;
            this.storageType = model.storageType;
            this.tags = model.tags;
            this.type = model.type;
            this.userId = model.userId;
            this.uuid = model.uuid;
        } 

        /**
         * Capacity.
         */
        public Builder capacity(String capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * IoType.
         */
        public Builder ioType(String ioType) {
            this.ioType = ioType;
            return this;
        }

        /**
         * <p>数据集加速实例的最大挂载点个数。</p>
         */
        public Builder maxEndpoint(Integer maxEndpoint) {
            this.maxEndpoint = maxEndpoint;
            return this;
        }

        /**
         * MaxSlot.
         */
        public Builder maxSlot(Integer maxSlot) {
            this.maxSlot = maxSlot;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>数据集加速实例的资源提供者类型。</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(InstanceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * <p>数据集加速实例的存储类型。</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
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
}
