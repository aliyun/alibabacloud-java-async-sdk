// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeVccRequest} extends {@link RequestModel}
 *
 * <p>InitializeVccRequest</p>
 */
public class InitializeVccRequest extends Request {
    private InitializeVccRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeVccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitializeVccRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitializeVccRequest request) {
            super(request);
        } 

        @Override
        public InitializeVccRequest build() {
            return new InitializeVccRequest(this);
        } 

    } 

}
