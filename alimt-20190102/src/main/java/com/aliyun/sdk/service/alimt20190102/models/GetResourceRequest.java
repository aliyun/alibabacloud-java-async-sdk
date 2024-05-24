// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceRequest} extends {@link RequestModel}
 *
 * <p>GetResourceRequest</p>
 */
public class GetResourceRequest extends Request {
    private GetResourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetResourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetResourceRequest request) {
            super(request);
        } 

        @Override
        public GetResourceRequest build() {
            return new GetResourceRequest(this);
        } 

    } 

}
