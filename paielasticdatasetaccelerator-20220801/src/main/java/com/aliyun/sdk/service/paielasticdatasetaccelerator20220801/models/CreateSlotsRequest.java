// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlotsRequest} extends {@link RequestModel}
 *
 * <p>CreateSlotsRequest</p>
 */
public class CreateSlotsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("Slots")
    private java.util.List < Slots> slots;

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
    public java.util.List < Slots> getSlots() {
        return this.slots;
    }

    public static final class Builder extends Request.Builder<CreateSlotsRequest, Builder> {
        private String regionId; 
        private Boolean dryRun; 
        private java.util.List < Slots> slots; 

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
        public Builder slots(java.util.List < Slots> slots) {
            this.putBodyParameter("Slots", slots);
            this.slots = slots;
            return this;
        }

        @Override
        public CreateSlotsRequest build() {
            return new CreateSlotsRequest(this);
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
    public static class Slots extends TeaModel {
        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("Description")
        @Validation(maxLength = 1024)
        private String description;

        @NameInMap("EndpointIds")
        private String endpointIds;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("IoType")
        private String ioType;

        @NameInMap("LifeCycle")
        private SlotLifeCycle lifeCycle;

        @NameInMap("Name")
        @Validation(maxLength = 64)
        private String name;

        @NameInMap("StorageType")
        @Validation(required = true)
        private String storageType;

        @NameInMap("StorageUri")
        @Validation(required = true)
        private String storageUri;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 

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
             * InstanceId.
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

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
}
