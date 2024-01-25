// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenHbrServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenHbrServiceRequest</p>
 */
public class OpenHbrServiceRequest extends Request {
    private OpenHbrServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenHbrServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenHbrServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenHbrServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenHbrServiceRequest build() {
            return new OpenHbrServiceRequest(this);
        } 

    } 

}
