// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRPCPathTestRequest} extends {@link RequestModel}
 *
 * <p>CreateRPCPathTestRequest</p>
 */
public class CreateRPCPathTestRequest extends Request {
    private CreateRPCPathTestRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRPCPathTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateRPCPathTestRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateRPCPathTestRequest response) {
            super(response);
        } 

        @Override
        public CreateRPCPathTestRequest build() {
            return new CreateRPCPathTestRequest(this);
        } 

    } 

}
