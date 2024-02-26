// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagRequest} extends {@link RequestModel}
 *
 * <p>CreateTagRequest</p>
 */
public class CreateTagRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Key")
    @Validation(required = true, maxLength = 64)
    private String key;

    @Body
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Body
    @NameInMap("Value")
    @Validation(required = true, maxLength = 64)
    private String value;

    private CreateTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateTagRequest, Builder> {
        private String regionId; 
        private String key; 
        private String resourceId; 
        private String resourceType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.value = request.value;
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
         * Key.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateTagRequest build() {
            return new CreateTagRequest(this);
        } 

    } 

}
