// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        @Validation(maxLength = 64)
        private String key;

        @NameInMap("Value")
        @Validation(maxLength = 64)
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
    public static class Instances extends TeaModel {
        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("IoType")
        private String ioType;

        @NameInMap("MaxEndpoint")
        private Integer maxEndpoint;

        @NameInMap("MaxSlot")
        private Integer maxSlot;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("ProviderType")
        private String providerType;

        @NameInMap("Status")
        private InstanceStatus status;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Uuid")
        private String uuid;

        private Instances(Builder builder) {
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

        public static Instances create() {
            return builder().build();
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
        public java.util.List < Tags> getTags() {
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
            private InstanceStatus status; 
            private String storageType; 
            private java.util.List < Tags> tags; 
            private String type; 
            private String userId; 
            private String uuid; 

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
             * 数据集加速实例的最大挂载点个数。
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
             * 数据集加速实例的资源提供者类型。
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
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
             * 数据集加速实例的存储类型。
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
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

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
