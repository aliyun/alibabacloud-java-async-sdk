// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplatesRequest} extends {@link RequestModel}
 *
 * <p>GetTemplatesRequest</p>
 */
public class GetTemplatesRequest extends Request {
    private GetTemplatesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetTemplatesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetTemplatesRequest request) {
            super(request);
        } 

        @Override
        public GetTemplatesRequest build() {
            return new GetTemplatesRequest(this);
        } 

    } 

}
