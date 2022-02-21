// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>GetSupportedResourceTypesRequest</p>
 */
public class GetSupportedResourceTypesRequest extends Request {
    private GetSupportedResourceTypesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupportedResourceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSupportedResourceTypesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSupportedResourceTypesRequest response) {
            super(response);
        } 

        @Override
        public GetSupportedResourceTypesRequest build() {
            return new GetSupportedResourceTypesRequest(this);
        } 

    } 

}
