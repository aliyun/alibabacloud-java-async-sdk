// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnKvAccountRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnKvAccountRequest</p>
 */
public class DescribeDcdnKvAccountRequest extends Request {
    private DescribeDcdnKvAccountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnKvAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnKvAccountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnKvAccountRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnKvAccountRequest build() {
            return new DescribeDcdnKvAccountRequest(this);
        } 

    } 

}
