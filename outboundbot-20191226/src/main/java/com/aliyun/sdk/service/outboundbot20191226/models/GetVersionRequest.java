// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVersionRequest} extends {@link RequestModel}
 *
 * <p>GetVersionRequest</p>
 */
public class GetVersionRequest extends Request {
    private GetVersionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetVersionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetVersionRequest request) {
            super(request);
        } 

        @Override
        public GetVersionRequest build() {
            return new GetVersionRequest(this);
        } 

    } 

}
