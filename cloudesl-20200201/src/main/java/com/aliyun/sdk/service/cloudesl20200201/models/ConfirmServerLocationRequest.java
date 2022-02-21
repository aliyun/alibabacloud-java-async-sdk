// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmServerLocationRequest} extends {@link RequestModel}
 *
 * <p>ConfirmServerLocationRequest</p>
 */
public class ConfirmServerLocationRequest extends Request {
    private ConfirmServerLocationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmServerLocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ConfirmServerLocationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ConfirmServerLocationRequest response) {
            super(response);
        } 

        @Override
        public ConfirmServerLocationRequest build() {
            return new ConfirmServerLocationRequest(this);
        } 

    } 

}
