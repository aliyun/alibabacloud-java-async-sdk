// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Capacity")
    @Validation(required = true)
    private String capacity;

    @Body
    @NameInMap("Description")
    @Validation(maxLength = 1024)
    private String description;

    @Body
    @NameInMap("MaxEndpoint")
    private String maxEndpoint;

    @Body
    @NameInMap("MaxSlot")
    private String maxSlot;

    @Body
    @NameInMap("Name")
    @Validation(maxLength = 64)
    private String name;

    @Body
    @NameInMap("PaymentType")
    @Validation(required = true)
    private String paymentType;

    @Body
    @NameInMap("ProviderType")
    private String providerType;

    @Body
    @NameInMap("StorageType")
    private String storageType;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.maxEndpoint = builder.maxEndpoint;
        this.maxSlot = builder.maxSlot;
        this.name = builder.name;
        this.paymentType = builder.paymentType;
        this.providerType = builder.providerType;
        this.storageType = builder.storageType;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
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
     * @return maxEndpoint
     */
    public String getMaxEndpoint() {
        return this.maxEndpoint;
    }

    /**
     * @return maxSlot
     */
    public String getMaxSlot() {
        return this.maxSlot;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private String capacity; 
        private String description; 
        private String maxEndpoint; 
        private String maxSlot; 
        private String name; 
        private String paymentType; 
        private String providerType; 
        private String storageType; 
        private java.util.List < Tags> tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.capacity = request.capacity;
            this.description = request.description;
            this.maxEndpoint = request.maxEndpoint;
            this.maxSlot = request.maxSlot;
            this.name = request.name;
            this.paymentType = request.paymentType;
            this.providerType = request.providerType;
            this.storageType = request.storageType;
            this.tags = request.tags;
            this.type = request.type;
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
         * MaxEndpoint.
         */
        public Builder maxEndpoint(String maxEndpoint) {
            this.putBodyParameter("MaxEndpoint", maxEndpoint);
            this.maxEndpoint = maxEndpoint;
            return this;
        }

        /**
         * MaxSlot.
         */
        public Builder maxSlot(String maxSlot) {
            this.putBodyParameter("MaxSlot", maxSlot);
            this.maxSlot = maxSlot;
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
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ProviderType.
         */
        public Builder providerType(String providerType) {
            this.putBodyParameter("ProviderType", providerType);
            this.providerType = providerType;
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
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
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
