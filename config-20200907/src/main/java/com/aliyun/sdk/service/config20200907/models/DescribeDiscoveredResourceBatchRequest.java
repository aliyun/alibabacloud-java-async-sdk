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
 * {@link DescribeDiscoveredResourceBatchRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiscoveredResourceBatchRequest</p>
 */
public class DescribeDiscoveredResourceBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private String regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    private DescribeDiscoveredResourceBatchRequest(Builder builder) {
        super(builder);
        this.regions = builder.regions;
        this.resourceIds = builder.resourceIds;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiscoveredResourceBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<DescribeDiscoveredResourceBatchRequest, Builder> {
        private String regions; 
        private String resourceIds; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiscoveredResourceBatchRequest request) {
            super(request);
            this.regions = request.regions;
            this.resourceIds = request.resourceIds;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * Regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public DescribeDiscoveredResourceBatchRequest build() {
            return new DescribeDiscoveredResourceBatchRequest(this);
        } 

    } 

}
