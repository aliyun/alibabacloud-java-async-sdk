// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceStatusRequest</p>
 */
public class GetServiceStatusRequest extends Request {
    private GetServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetServiceStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetServiceStatusRequest request) {
            super(request);
        } 

        @Override
        public GetServiceStatusRequest build() {
            return new GetServiceStatusRequest(this);
        } 

    } 

}
