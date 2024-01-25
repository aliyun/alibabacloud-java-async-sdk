// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiGenericProxyRequest} extends {@link RequestModel}
 *
 * <p>OpenApiGenericProxyRequest</p>
 */
public class OpenApiGenericProxyRequest extends Request {
    private OpenApiGenericProxyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiGenericProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenApiGenericProxyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenApiGenericProxyRequest request) {
            super(request);
        } 

        @Override
        public OpenApiGenericProxyRequest build() {
            return new OpenApiGenericProxyRequest(this);
        } 

    } 

}
