// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeTemplateRequest</p>
 */
public class GetResourceTypeTemplateRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetResourceTypeTemplateRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<GetResourceTypeTemplateRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeTemplateRequest response) {
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
        public GetResourceTypeTemplateRequest build() {
            return new GetResourceTypeTemplateRequest(this);
        } 

    } 

}
