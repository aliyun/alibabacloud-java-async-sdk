// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestBackgroundRequest} extends {@link RequestModel}
 *
 * <p>RequestBackgroundRequest</p>
 */
public class RequestBackgroundRequest extends Request {
    private RequestBackgroundRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestBackgroundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestBackgroundRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestBackgroundRequest request) {
            super(request);
        } 

        @Override
        public RequestBackgroundRequest build() {
            return new RequestBackgroundRequest(this);
        } 

    } 

}
