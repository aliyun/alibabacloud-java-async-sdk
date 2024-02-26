// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagRequest</p>
 */
public class DeleteTagRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Key")
    @Validation(required = true, maxLength = 64)
    private String key;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private DeleteTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTagRequest, Builder> {
        private String regionId; 
        private String key; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
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
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DeleteTagRequest build() {
            return new DeleteTagRequest(this);
        } 

    } 

}
