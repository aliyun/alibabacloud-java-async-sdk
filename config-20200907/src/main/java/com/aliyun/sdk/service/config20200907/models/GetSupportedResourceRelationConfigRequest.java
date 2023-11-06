// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedResourceRelationConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSupportedResourceRelationConfigRequest</p>
 */
public class GetSupportedResourceRelationConfigRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetSupportedResourceRelationConfigRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupportedResourceRelationConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetSupportedResourceRelationConfigRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetSupportedResourceRelationConfigRequest request) {
            super(request);
            this.resourceType = request.resourceType;
        } 

        /**
         * The resource type.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetSupportedResourceRelationConfigRequest build() {
            return new GetSupportedResourceRelationConfigRequest(this);
        } 

    } 

}
