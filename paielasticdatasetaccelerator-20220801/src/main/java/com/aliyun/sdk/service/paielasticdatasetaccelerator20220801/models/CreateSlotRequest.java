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
 * {@link CreateSlotRequest} extends {@link RequestModel}
 *
 * <p>CreateSlotRequest</p>
 */
public class CreateSlotRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Capacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String capacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndpointIds")
    private String endpointIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IoType")
    private String ioType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LifeCycle")
    private SlotLifeCycle lifeCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorageUri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
    public java.util.List<Endpoints> getEndpoints() {
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
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateSlotRequest, Builder> {
        private String regionId; 
        private String capacity; 
        private String description; 
        private String endpointIds; 
        private java.util.List<Endpoints> endpoints; 
        private String instanceId; 
        private String ioType; 
        private SlotLifeCycle lifeCycle; 
        private String name; 
        private String storageType; 
        private String storageUri; 
        private java.util.List<Tags> tags; 

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0G</p>
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
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.putBodyParameter("Endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-my1tk3jggooi5uwks5</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageType(String storageType) {
            this.putBodyParameter("StorageType", storageType);
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
            this.putBodyParameter("StorageUri", storageUri);
            this.storageUri = storageUri;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateSlotRequest build() {
            return new CreateSlotRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSlotRequest} extends {@link TeaModel}
     *
     * <p>CreateSlotRequest</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.name = model.name;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

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
    /**
     * 
     * {@link CreateSlotRequest} extends {@link TeaModel}
     *
     * <p>CreateSlotRequest</p>
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
