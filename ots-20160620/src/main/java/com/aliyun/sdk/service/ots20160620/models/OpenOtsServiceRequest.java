// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenOtsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenOtsServiceRequest</p>
 */
public class OpenOtsServiceRequest extends Request {
    private OpenOtsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenOtsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenOtsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenOtsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenOtsServiceRequest build() {
            return new OpenOtsServiceRequest(this);
        } 

    } 

}
