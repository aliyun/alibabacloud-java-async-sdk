// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenOnsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenOnsServiceRequest</p>
 */
public class OpenOnsServiceRequest extends Request {
    private OpenOnsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenOnsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenOnsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenOnsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenOnsServiceRequest build() {
            return new OpenOnsServiceRequest(this);
        } 

    } 

}
