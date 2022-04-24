// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerListRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerListRequest</p>
 */
public class GetCustomerListRequest extends Request {
    private GetCustomerListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCustomerListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCustomerListRequest request) {
            super(request);
        } 

        @Override
        public GetCustomerListRequest build() {
            return new GetCustomerListRequest(this);
        } 

    } 

}
