// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMyBlockchainsRequest} extends {@link RequestModel}
 *
 * <p>GetMyBlockchainsRequest</p>
 */
public class GetMyBlockchainsRequest extends Request {
    private GetMyBlockchainsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyBlockchainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMyBlockchainsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMyBlockchainsRequest request) {
            super(request);
        } 

        @Override
        public GetMyBlockchainsRequest build() {
            return new GetMyBlockchainsRequest(this);
        } 

    } 

}
