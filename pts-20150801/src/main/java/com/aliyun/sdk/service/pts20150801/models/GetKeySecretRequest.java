// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKeySecretRequest} extends {@link RequestModel}
 *
 * <p>GetKeySecretRequest</p>
 */
public class GetKeySecretRequest extends Request {
    private GetKeySecretRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeySecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetKeySecretRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetKeySecretRequest request) {
            super(request);
        } 

        @Override
        public GetKeySecretRequest build() {
            return new GetKeySecretRequest(this);
        } 

    } 

}
