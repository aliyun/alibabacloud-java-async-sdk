// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckProductOpenRequest} extends {@link RequestModel}
 *
 * <p>CheckProductOpenRequest</p>
 */
public class CheckProductOpenRequest extends Request {
    private CheckProductOpenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckProductOpenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckProductOpenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckProductOpenRequest response) {
            super(response);
        } 

        @Override
        public CheckProductOpenRequest build() {
            return new CheckProductOpenRequest(this);
        } 

    } 

}
