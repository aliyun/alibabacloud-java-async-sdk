// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestPasterRequest} extends {@link RequestModel}
 *
 * <p>RequestPasterRequest</p>
 */
public class RequestPasterRequest extends Request {
    private RequestPasterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestPasterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestPasterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestPasterRequest request) {
            super(request);
        } 

        @Override
        public RequestPasterRequest build() {
            return new RequestPasterRequest(this);
        } 

    } 

}
