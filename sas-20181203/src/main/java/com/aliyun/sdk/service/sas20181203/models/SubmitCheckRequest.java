// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCheckRequest} extends {@link RequestModel}
 *
 * <p>SubmitCheckRequest</p>
 */
public class SubmitCheckRequest extends Request {
    private SubmitCheckRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<SubmitCheckRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(SubmitCheckRequest request) {
            super(request);
        } 

        @Override
        public SubmitCheckRequest build() {
            return new SubmitCheckRequest(this);
        } 

    } 

}
