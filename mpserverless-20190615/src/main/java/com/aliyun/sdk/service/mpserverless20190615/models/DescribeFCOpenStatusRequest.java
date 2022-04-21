// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFCOpenStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeFCOpenStatusRequest</p>
 */
public class DescribeFCOpenStatusRequest extends Request {
    private DescribeFCOpenStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFCOpenStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeFCOpenStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeFCOpenStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeFCOpenStatusRequest build() {
            return new DescribeFCOpenStatusRequest(this);
        } 

    } 

}
