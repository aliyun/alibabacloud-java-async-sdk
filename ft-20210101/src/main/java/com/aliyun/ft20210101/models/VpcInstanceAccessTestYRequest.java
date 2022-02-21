// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcInstanceAccessTestYRequest} extends {@link RequestModel}
 *
 * <p>VpcInstanceAccessTestYRequest</p>
 */
public class VpcInstanceAccessTestYRequest extends Request {
    private VpcInstanceAccessTestYRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcInstanceAccessTestYRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<VpcInstanceAccessTestYRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(VpcInstanceAccessTestYRequest response) {
            super(response);
        } 

        @Override
        public VpcInstanceAccessTestYRequest build() {
            return new VpcInstanceAccessTestYRequest(this);
        } 

    } 

}
