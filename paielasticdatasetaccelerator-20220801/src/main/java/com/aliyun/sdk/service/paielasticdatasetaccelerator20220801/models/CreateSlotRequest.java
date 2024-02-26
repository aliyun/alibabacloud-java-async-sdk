// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlotRequest} extends {@link RequestModel}
 *
 * <p>CreateSlotRequest</p>
 */
public class CreateSlotRequest extends Request {
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
    @NameInMap("EndpointIds")
    private String endpointIds;

    @Body
    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("IoType")
    private String ioType;

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

    private CreateSlotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.endpointIds = builder.endpointIds;
        this.endpoints = builder.endpoints;
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

    public static CreateSlotRequest create() {
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
     * @return endpointIds
     */
    public String getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
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

    public static final class Builder extends Request.Builder<CreateSlotRequest, Builder> {
        private String regionId; 
        private String capacity; 
        private String description; 
        private String endpointIds; 
        private java.util.List < Endpoints> endpoints; 
        private String instanceId; 
        private String ioType; 
        private SlotLifeCycle lifeCycle; 
        private String name; 
        private String storageType; 
        private String storageUri; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.capacity = request.capacity;
            this.description = request.description;
            this.endpointIds = request.endpointIds;
            this.endpoints = request.endpoints;
            this.instanceId = request.instanceId;
            this.ioType = request.ioType;
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
         * EndpointIds.
         */
        public Builder endpointIds(String endpointIds) {
            this.putBodyParameter("EndpointIds", endpointIds);
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * Endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.putBodyParameter("Endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IoType.
         */
        public Builder ioType(String ioType) {
            this.putBodyParameter("IoType", ioType);
            this.ioType = ioType;
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
        public CreateSlotRequest build() {
            return new CreateSlotRequest(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private Endpoints(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String name; 
            private String type; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
