// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSlotRequest} extends {@link RequestModel}
 *
 * <p>UpdateSlotRequest</p>
 */
public class UpdateSlotRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("SlotId")
    @Validation(required = true)
    private String slotId;

    @Body
    @NameInMap("Capacity")
    @Validation(required = true)
    private String capacity;

    @Body
    @NameInMap("Description")
    @Validation(maxLength = 1024)
    private String description;

    @Body
    @NameInMap("LifeCycle")
    private SlotLifeCycle lifeCycle;

    @Body
    @NameInMap("Name")
    @Validation(maxLength = 64)
    private String name;

    @Body
    @NameInMap("StorageType")
    @Validation(required = true)
    private String storageType;

    @Body
    @NameInMap("StorageUri")
    @Validation(required = true)
    private String storageUri;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private UpdateSlotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.slotId = builder.slotId;
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.lifeCycle = builder.lifeCycle;
        this.name = builder.name;
        this.storageType = builder.storageType;
        this.storageUri = builder.storageUri;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSlotRequest create() {
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
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
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

    public static final class Builder extends Request.Builder<UpdateSlotRequest, Builder> {
        private String regionId; 
        private String slotId; 
        private String capacity; 
        private String description; 
        private SlotLifeCycle lifeCycle; 
        private String name; 
        private String storageType; 
        private String storageUri; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSlotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.slotId = request.slotId;
            this.capacity = request.capacity;
            this.description = request.description;
            this.lifeCycle = request.lifeCycle;
            this.name = request.name;
            this.storageType = request.storageType;
            this.storageUri = request.storageUri;
            this.tags = request.tags;
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
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(String capacity) {
            this.putBodyParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * LifeCycle.
         */
        public Builder lifeCycle(SlotLifeCycle lifeCycle) {
            this.putBodyParameter("LifeCycle", lifeCycle);
            this.lifeCycle = lifeCycle;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putBodyParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * StorageUri.
         */
        public Builder storageUri(String storageUri) {
            this.putBodyParameter("StorageUri", storageUri);
            this.storageUri = storageUri;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateSlotRequest build() {
            return new UpdateSlotRequest(this);
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
}
