// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliyunXgipTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAliyunXgipTokenRequest</p>
 */
public class GetAliyunXgipTokenRequest extends Request {
    private GetAliyunXgipTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliyunXgipTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAliyunXgipTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAliyunXgipTokenRequest request) {
            super(request);
        } 

        @Override
        public GetAliyunXgipTokenRequest build() {
            return new GetAliyunXgipTokenRequest(this);
        } 

    } 

}
