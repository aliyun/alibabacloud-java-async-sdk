// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeResourceLifeCycleEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceLifeCycleEventsRequest</p>
 */
public class DescribeResourceLifeCycleEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private DescribeResourceLifeCycleEventsRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLifeCycleEventsRequest create() {
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

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<DescribeResourceLifeCycleEventsRequest, Builder> {
        private String resourceType; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceLifeCycleEventsRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.serviceName = request.serviceName;
        } 

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public DescribeResourceLifeCycleEventsRequest build() {
            return new DescribeResourceLifeCycleEventsRequest(this);
        } 

    } 

}
