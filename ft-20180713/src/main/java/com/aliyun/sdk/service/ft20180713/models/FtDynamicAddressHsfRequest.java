// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressHsfRequest} extends {@link RequestModel}
 *
 * <p>FtDynamicAddressHsfRequest</p>
 */
public class FtDynamicAddressHsfRequest extends Request {
    private FtDynamicAddressHsfRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtDynamicAddressHsfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<FtDynamicAddressHsfRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(FtDynamicAddressHsfRequest request) {
            super(request);
        } 

        @Override
        public FtDynamicAddressHsfRequest build() {
            return new FtDynamicAddressHsfRequest(this);
        } 

    } 

}
