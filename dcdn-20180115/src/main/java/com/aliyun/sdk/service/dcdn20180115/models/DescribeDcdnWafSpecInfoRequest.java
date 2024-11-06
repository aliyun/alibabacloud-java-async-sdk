// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafSpecInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafSpecInfoRequest</p>
 */
public class DescribeDcdnWafSpecInfoRequest extends Request {
    private DescribeDcdnWafSpecInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafSpecInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafSpecInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafSpecInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnWafSpecInfoRequest build() {
            return new DescribeDcdnWafSpecInfoRequest(this);
        } 

    } 

}
