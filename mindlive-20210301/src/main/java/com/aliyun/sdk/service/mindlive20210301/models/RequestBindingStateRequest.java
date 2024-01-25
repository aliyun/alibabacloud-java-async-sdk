// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestBindingStateRequest} extends {@link RequestModel}
 *
 * <p>RequestBindingStateRequest</p>
 */
public class RequestBindingStateRequest extends Request {
    private RequestBindingStateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestBindingStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestBindingStateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestBindingStateRequest request) {
            super(request);
        } 

        @Override
        public RequestBindingStateRequest build() {
            return new RequestBindingStateRequest(this);
        } 

    } 

}
