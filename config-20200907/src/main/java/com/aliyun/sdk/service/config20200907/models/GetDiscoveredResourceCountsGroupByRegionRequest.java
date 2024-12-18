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
 * {@link GetDiscoveredResourceCountsGroupByRegionRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceCountsGroupByRegionRequest</p>
 */
public class GetDiscoveredResourceCountsGroupByRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private GetDiscoveredResourceCountsGroupByRegionRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceCountsGroupByRegionRequest create() {
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

    public static final class Builder extends Request.Builder<GetDiscoveredResourceCountsGroupByRegionRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceCountsGroupByRegionRequest request) {
            super(request);
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The resource type.</p>
         * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
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
        public GetDiscoveredResourceCountsGroupByRegionRequest build() {
            return new GetDiscoveredResourceCountsGroupByRegionRequest(this);
        } 

    } 

}
