// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceCenterServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetResourceCenterServiceStatusRequest</p>
 */
public class GetResourceCenterServiceStatusRequest extends Request {
    private GetResourceCenterServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceCenterServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetResourceCenterServiceStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetResourceCenterServiceStatusRequest request) {
            super(request);
        } 

        @Override
        public GetResourceCenterServiceStatusRequest build() {
            return new GetResourceCenterServiceStatusRequest(this);
        } 

    } 

}
