// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderItemListRequest} extends {@link RequestModel}
 *
 * <p>GetOrderItemListRequest</p>
 */
public class GetOrderItemListRequest extends Request {
    private GetOrderItemListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOrderItemListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOrderItemListRequest request) {
            super(request);
        } 

        @Override
        public GetOrderItemListRequest build() {
            return new GetOrderItemListRequest(this);
        } 

    } 

}
