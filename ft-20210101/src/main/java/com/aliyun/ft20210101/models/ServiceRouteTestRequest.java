// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceRouteTestRequest} extends {@link RequestModel}
 *
 * <p>ServiceRouteTestRequest</p>
 */
public class ServiceRouteTestRequest extends Request {
    private ServiceRouteTestRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceRouteTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ServiceRouteTestRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ServiceRouteTestRequest response) {
            super(response);
        } 

        @Override
        public ServiceRouteTestRequest build() {
            return new ServiceRouteTestRequest(this);
        } 

    } 

}
