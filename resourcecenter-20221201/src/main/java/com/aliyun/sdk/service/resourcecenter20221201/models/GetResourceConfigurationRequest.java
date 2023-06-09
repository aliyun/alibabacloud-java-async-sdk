// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetResourceConfigurationRequest</p>
 */
public class GetResourceConfigurationRequest extends Request {
    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceRegionId")
    @Validation(required = true)
    private String resourceRegionId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetResourceConfigurationRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetResourceConfigurationRequest, Builder> {
        private String resourceId; 
        private String resourceRegionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceConfigurationRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The ID of the resource.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The region ID of the resource.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * For more information about the resource types supported by Resource Center, see [Services that work with Resource Center](~~477798~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetResourceConfigurationRequest build() {
            return new GetResourceConfigurationRequest(this);
        } 

    } 

}
