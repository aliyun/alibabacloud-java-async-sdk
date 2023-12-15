// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMySuccessAppliesRequest} extends {@link RequestModel}
 *
 * <p>GetMySuccessAppliesRequest</p>
 */
public class GetMySuccessAppliesRequest extends Request {
    private GetMySuccessAppliesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMySuccessAppliesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMySuccessAppliesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMySuccessAppliesRequest request) {
            super(request);
        } 

        @Override
        public GetMySuccessAppliesRequest build() {
            return new GetMySuccessAppliesRequest(this);
        } 

    } 

}
