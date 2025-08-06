// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link DescribeAnycastServerRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnycastServerRegionsRequest</p>
 */
public class DescribeAnycastServerRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLocation")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The access area from which you use the Anycast EIP to communicate with the Internet.</p>
         * <p>Set the value to <strong>international</strong>, which specifies the areas outside the Chinese mainland.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>international</p>
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
