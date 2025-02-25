// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlotsResponseBody</p>
 */
public class ListSlotsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Slots")
    private java.util.List < Slots> slots;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSlotsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slots = builder.slots;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slots
     */
    public java.util.List < Slots> getSlots() {
        return this.slots;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Slots> slots; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Slots.
         */
        public Builder slots(java.util.List < Slots> slots) {
            this.slots = slots;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSlotsResponseBody build() {
            return new ListSlotsResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Status")
        private EndpointStatus status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private Endpoints(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
            this.uuid = builder.uuid;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
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
         * @return status
         */
        public EndpointStatus getStatus() {
            return this.status;
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

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String ownerId; 
            private EndpointStatus status; 
            private String type; 
            private String userId; 
            private String uuid; 
            private String vpcId; 
            private String vswitchId; 

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
             * Status.
             */
            public Builder status(EndpointStatus status) {
                this.status = status;
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

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class Slots extends TeaModel {
        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("Description")
        private String description;

        @NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IoType")
        private String ioType;

        @NameInMap("LifeCycle")
        private SlotLifeCycle lifeCycle;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Status")
        private SlotStatus status;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("StorageUri")
        private String storageUri;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Uuid")
        private String uuid;

        private Slots(Builder builder) {
            this.capacity = builder.capacity;
            this.description = builder.description;
            this.endpoints = builder.endpoints;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.ioType = builder.ioType;
            this.lifeCycle = builder.lifeCycle;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
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

        public static Slots create() {
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
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Endpoints> endpoints; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private String ioType; 
            private SlotLifeCycle lifeCycle; 
            private String name; 
            private String ownerId; 
            private SlotStatus status; 
            private String storageType; 
            private String storageUri; 
            private java.util.List < Tags> tags; 
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
             * Endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
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
             * 数据集加速槽的读写类型。
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
            public Builder tags(java.util.List < Tags> tags) {
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

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
}
