// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeRequest</p>
 */
public class GetResourceTypeRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetResourceTypeRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetResourceTypeRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeRequest request) {
            super(request);
            this.resourceType = request.resourceType;
        } 

        /**
         * The type of the resource.
         * <p>
         * 
         * For more information about resource types supported by Resource Orchestration Service (ROS), see [List of resource types by service](~~127039~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetResourceTypeRequest build() {
            return new GetResourceTypeRequest(this);
        } 

    } 

}
