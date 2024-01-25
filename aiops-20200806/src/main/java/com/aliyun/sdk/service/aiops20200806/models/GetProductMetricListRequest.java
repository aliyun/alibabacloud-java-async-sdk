// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductMetricListRequest} extends {@link RequestModel}
 *
 * <p>GetProductMetricListRequest</p>
 */
public class GetProductMetricListRequest extends Request {
    private GetProductMetricListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductMetricListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetProductMetricListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetProductMetricListRequest request) {
            super(request);
        } 

        @Override
        public GetProductMetricListRequest build() {
            return new GetProductMetricListRequest(this);
        } 

    } 

}
