// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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

        private Builder(GetResourceTypeRequest response) {
            super(response);
            this.resourceType = response.resourceType;
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
        public GetResourceTypeRequest build() {
            return new GetResourceTypeRequest(this);
        } 

    } 

}
