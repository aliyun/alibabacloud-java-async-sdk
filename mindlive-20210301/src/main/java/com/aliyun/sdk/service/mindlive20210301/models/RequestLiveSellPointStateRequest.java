// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLiveSellPointStateRequest} extends {@link RequestModel}
 *
 * <p>RequestLiveSellPointStateRequest</p>
 */
public class RequestLiveSellPointStateRequest extends Request {
    private RequestLiveSellPointStateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLiveSellPointStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestLiveSellPointStateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestLiveSellPointStateRequest request) {
            super(request);
        } 

        @Override
        public RequestLiveSellPointStateRequest build() {
            return new RequestLiveSellPointStateRequest(this);
        } 

    } 

}
