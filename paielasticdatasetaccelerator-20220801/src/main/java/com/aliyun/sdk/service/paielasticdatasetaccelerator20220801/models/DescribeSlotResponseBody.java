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
 * {@link DescribeSlotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlotResponseBody</p>
 */
public class DescribeSlotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private String capacity;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IoType")
    private String ioType;

    @com.aliyun.core.annotation.NameInMap("LifeCycle")
    private SlotLifeCycle lifeCycle;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private SlotStatus status;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("StorageUri")
    private String storageUri;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeSlotResponseBody(Builder builder) {
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.instanceId = builder.instanceId;
        this.ioType = builder.ioType;
        this.lifeCycle = builder.lifeCycle;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.storageType = builder.storageType;
        this.storageUri = builder.storageUri;
        this.tags = builder.tags;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlotResponseBody create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ioType
     */
    public String getIoType() {
        return this.ioType;
    }

    /**
     * @return lifeCycle
     */
    public SlotLifeCycle getLifeCycle() {
        return this.lifeCycle;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public SlotStatus getStatus() {
        return this.status;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return storageUri
     */
    public String getStorageUri() {
        return this.storageUri;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private String instanceId; 
        private String ioType; 
        private SlotLifeCycle lifeCycle; 
        private String name; 
        private String ownerId; 
        private String requestId; 
        private SlotStatus status; 
        private String storageType; 
        private String storageUri; 
        private java.util.List<Tags> tags; 
        private String userId; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(DescribeSlotResponseBody model) {
            this.capacity = model.capacity;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.instanceId = model.instanceId;
            this.ioType = model.ioType;
            this.lifeCycle = model.lifeCycle;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.storageType = model.storageType;
            this.storageUri = model.storageUri;
            this.tags = model.tags;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>数据集加速槽的读写类型。</p>
         * 
         * <strong>example:</strong>
         * <p>readonly</p>
         */
        public Builder ioType(String ioType) {
            this.ioType = ioType;
            return this;
        }

        /**
         * LifeCycle.
         */
        public Builder lifeCycle(SlotLifeCycle lifeCycle) {
            this.lifeCycle = lifeCycle;
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
        public Builder status(SlotStatus status) {
            this.status = status;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * StorageUri.
         */
        public Builder storageUri(String storageUri) {
            this.storageUri = storageUri;
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

        public DescribeSlotResponseBody build() {
            return new DescribeSlotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlotResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlotResponseBody</p>
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
}
