// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllowRequest} extends {@link RequestModel}
 *
 * <p>AllowRequest</p>
 */
public class AllowRequest extends Request {
    private AllowRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<AllowRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(AllowRequest request) {
            super(request);
        } 

        @Override
        public AllowRequest build() {
            return new AllowRequest(this);
        } 

    } 

}
