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
 * {@link CreateSlotsRequest} extends {@link RequestModel}
 *
 * <p>CreateSlotsRequest</p>
 */
public class CreateSlotsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Slots")
    private java.util.List<Slots> slots;

    private CreateSlotsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dryRun = builder.dryRun;
        this.slots = builder.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlotsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return slots
     */
    public java.util.List<Slots> getSlots() {
        return this.slots;
    }

    public static final class Builder extends Request.Builder<CreateSlotsRequest, Builder> {
        private String regionId; 
        private Boolean dryRun; 
        private java.util.List<Slots> slots; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlotsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dryRun = request.dryRun;
            this.slots = request.slots;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Slots.
         */
        public Builder slots(java.util.List<Slots> slots) {
            this.putBodyParameter("Slots", slots);
            this.slots = slots;
            return this;
        }

        @Override
        public CreateSlotsRequest build() {
            return new CreateSlotsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSlotsRequest} extends {@link TeaModel}
     *
     * <p>CreateSlotsRequest</p>
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
    /**
     * 
     * {@link CreateSlotsRequest} extends {@link TeaModel}
     *
     * <p>CreateSlotsRequest</p>
     */
    public static class Slots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndpointIds")
        private String endpointIds;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IoType")
        private String ioType;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private SlotLifeCycle lifeCycle;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String name;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUri")
        @com.aliyun.core.annotation.Validation(required = true)
        private String storageUri;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Slots(Builder builder) {
            this.capacity = builder.capacity;
            this.description = builder.description;
            this.endpointIds = builder.endpointIds;
            this.instanceId = builder.instanceId;
            this.ioType = builder.ioType;
            this.lifeCycle = builder.lifeCycle;
            this.name = builder.name;
            this.storageType = builder.storageType;
            this.storageUri = builder.storageUri;
            this.tags = builder.tags;
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
         * @return endpointIds
         */
        public String getEndpointIds() {
            return this.endpointIds;
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

        public static final class Builder {
            private String capacity; 
            private String description; 
            private String endpointIds; 
            private String instanceId; 
            private String ioType; 
            private SlotLifeCycle lifeCycle; 
            private String name; 
            private String storageType; 
            private String storageUri; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Slots model) {
                this.capacity = model.capacity;
                this.description = model.description;
                this.endpointIds = model.endpointIds;
                this.instanceId = model.instanceId;
                this.ioType = model.ioType;
                this.lifeCycle = model.lifeCycle;
                this.name = model.name;
                this.storageType = model.storageType;
                this.storageUri = model.storageUri;
                this.tags = model.tags;
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
             * EndpointIds.
             */
            public Builder endpointIds(String endpointIds) {
                this.endpointIds = endpointIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>inst-my1tk3jggooi5uwks5</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://pai-vision-data-hz2.oss-cn-hangzhou-internal.aliyuncs.com/data/VOCdevkit/VOC2007/ImageSets/Main/val.txt</p>
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

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
}
