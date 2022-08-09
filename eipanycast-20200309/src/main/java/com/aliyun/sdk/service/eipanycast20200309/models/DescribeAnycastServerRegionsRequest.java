// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastServerRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnycastServerRegionsRequest</p>
 */
public class DescribeAnycastServerRegionsRequest extends Request {
    @Query
    @NameInMap("ServiceLocation")
    @Validation(required = true)
    private String serviceLocation;

    private DescribeAnycastServerRegionsRequest(Builder builder) {
        super(builder);
        this.serviceLocation = builder.serviceLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastServerRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public static final class Builder extends Request.Builder<DescribeAnycastServerRegionsRequest, Builder> {
        private String serviceLocation; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAnycastServerRegionsRequest request) {
            super(request);
            this.serviceLocation = request.serviceLocation;
        } 

        /**
         * ServiceLocation.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        @Override
        public DescribeAnycastServerRegionsRequest build() {
            return new DescribeAnycastServerRegionsRequest(this);
        } 

    } 

}
