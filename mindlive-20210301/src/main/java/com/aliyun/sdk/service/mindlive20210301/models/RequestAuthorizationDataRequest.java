// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestAuthorizationDataRequest} extends {@link RequestModel}
 *
 * <p>RequestAuthorizationDataRequest</p>
 */
public class RequestAuthorizationDataRequest extends Request {
    private RequestAuthorizationDataRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestAuthorizationDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestAuthorizationDataRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestAuthorizationDataRequest request) {
            super(request);
        } 

        @Override
        public RequestAuthorizationDataRequest build() {
            return new RequestAuthorizationDataRequest(this);
        } 

    } 

}
