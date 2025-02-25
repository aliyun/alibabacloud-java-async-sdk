// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTopRiskyResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTopRiskyResourcesRequest</p>
 */
public class DescribeTopRiskyResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DescribeTopRiskyResourcesRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopRiskyResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTopRiskyResourcesRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTopRiskyResourcesRequest request) {
            super(request);
            this.resourceType = request.resourceType;
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
        public DescribeTopRiskyResourcesRequest build() {
            return new DescribeTopRiskyResourcesRequest(this);
        } 

    } 

}
