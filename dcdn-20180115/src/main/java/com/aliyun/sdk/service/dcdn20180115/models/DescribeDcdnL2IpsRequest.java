// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnL2IpsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnL2IpsRequest</p>
 */
public class DescribeDcdnL2IpsRequest extends Request {
    private DescribeDcdnL2IpsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnL2IpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnL2IpsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnL2IpsRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnL2IpsRequest build() {
            return new DescribeDcdnL2IpsRequest(this);
        } 

    } 

}
