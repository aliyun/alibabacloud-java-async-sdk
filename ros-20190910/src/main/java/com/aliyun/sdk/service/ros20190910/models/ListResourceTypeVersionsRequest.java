// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypeVersionsRequest</p>
 */
public class ListResourceTypeVersionsRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private ListResourceTypeVersionsRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypeVersionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListResourceTypeVersionsRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypeVersionsRequest request) {
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
        public ListResourceTypeVersionsRequest build() {
            return new ListResourceTypeVersionsRequest(this);
        } 

    } 

}
