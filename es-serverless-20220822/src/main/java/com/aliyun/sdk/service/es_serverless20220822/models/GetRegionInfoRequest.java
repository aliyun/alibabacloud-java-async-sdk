// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRegionInfoRequest</p>
 */
public class GetRegionInfoRequest extends Request {
    private GetRegionInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRegionInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRegionInfoRequest request) {
            super(request);
        } 

        @Override
        public GetRegionInfoRequest build() {
            return new GetRegionInfoRequest(this);
        } 

    } 

}
