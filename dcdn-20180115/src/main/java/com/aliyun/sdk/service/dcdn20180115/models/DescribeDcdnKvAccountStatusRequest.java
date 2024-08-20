// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnKvAccountStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnKvAccountStatusRequest</p>
 */
public class DescribeDcdnKvAccountStatusRequest extends Request {
    private DescribeDcdnKvAccountStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnKvAccountStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnKvAccountStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnKvAccountStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnKvAccountStatusRequest build() {
            return new DescribeDcdnKvAccountStatusRequest(this);
        } 

    } 

}
