// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetSupportedResourceRelationConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSupportedResourceRelationConfigRequest</p>
 */
public class GetSupportedResourceRelationConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
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
