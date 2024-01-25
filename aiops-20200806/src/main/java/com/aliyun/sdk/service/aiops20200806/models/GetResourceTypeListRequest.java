// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeListRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeListRequest</p>
 */
public class GetResourceTypeListRequest extends Request {
    private GetResourceTypeListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetResourceTypeListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeListRequest request) {
            super(request);
        } 

        @Override
        public GetResourceTypeListRequest build() {
            return new GetResourceTypeListRequest(this);
        } 

    } 

}
