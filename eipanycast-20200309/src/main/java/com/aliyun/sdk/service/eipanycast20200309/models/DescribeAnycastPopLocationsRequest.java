// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastPopLocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnycastPopLocationsRequest</p>
 */
public class DescribeAnycastPopLocationsRequest extends Request {
    @Query
    @NameInMap("ServiceLocation")
    private String serviceLocation;

    private DescribeAnycastPopLocationsRequest(Builder builder) {
        super(builder);
        this.serviceLocation = builder.serviceLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastPopLocationsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAnycastPopLocationsRequest, Builder> {
        private String serviceLocation; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAnycastPopLocationsRequest request) {
            super(request);
            this.serviceLocation = request.serviceLocation;
        } 

        /**
         * The access area of the Anycast elastic IP address (EIP).
         * <p>
         * 
         * Set the value to **international**, which specifies the regions outside the Chinese mainland.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        @Override
        public DescribeAnycastPopLocationsRequest build() {
            return new DescribeAnycastPopLocationsRequest(this);
        } 

    } 

}
