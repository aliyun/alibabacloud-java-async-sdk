// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRequest} extends {@link RequestModel}
 *
 * <p>VerifyRequest</p>
 */
public class VerifyRequest extends Request {
    private VerifyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<VerifyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(VerifyRequest request) {
            super(request);
        } 

        @Override
        public VerifyRequest build() {
            return new VerifyRequest(this);
        } 

    } 

}
