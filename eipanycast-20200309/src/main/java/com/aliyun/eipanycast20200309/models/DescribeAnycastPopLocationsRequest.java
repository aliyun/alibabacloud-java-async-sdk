// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String serviceLocation; 

        /**
         * <p>ServiceLocation.</p>
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        public DescribeAnycastPopLocationsRequest build() {
            return new DescribeAnycastPopLocationsRequest(this);
        } 

    } 

}
