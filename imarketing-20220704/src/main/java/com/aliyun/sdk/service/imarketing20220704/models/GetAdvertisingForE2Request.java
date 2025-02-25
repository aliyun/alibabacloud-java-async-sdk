// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvertisingForE2Request} extends {@link RequestModel}
 *
 * <p>GetAdvertisingForE2Request</p>
 */
public class GetAdvertisingForE2Request extends Request {
    private GetAdvertisingForE2Request(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvertisingForE2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAdvertisingForE2Request, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAdvertisingForE2Request request) {
            super(request);
        } 

        @Override
        public GetAdvertisingForE2Request build() {
            return new GetAdvertisingForE2Request(this);
        } 

    } 

}
