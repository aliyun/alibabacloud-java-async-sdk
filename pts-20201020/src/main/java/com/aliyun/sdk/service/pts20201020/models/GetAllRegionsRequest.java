// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllRegionsRequest} extends {@link RequestModel}
 *
 * <p>GetAllRegionsRequest</p>
 */
public class GetAllRegionsRequest extends Request {
    private GetAllRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAllRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAllRegionsRequest request) {
            super(request);
        } 

        @Override
        public GetAllRegionsRequest build() {
            return new GetAllRegionsRequest(this);
        } 

    } 

}
