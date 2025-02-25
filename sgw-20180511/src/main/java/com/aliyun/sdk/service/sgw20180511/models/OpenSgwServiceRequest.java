// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenSgwServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenSgwServiceRequest</p>
 */
public class OpenSgwServiceRequest extends Request {
    private OpenSgwServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenSgwServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenSgwServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenSgwServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenSgwServiceRequest build() {
            return new OpenSgwServiceRequest(this);
        } 

    } 

}
