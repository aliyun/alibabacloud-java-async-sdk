// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSecSpecInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSecSpecInfoRequest</p>
 */
public class DescribeDcdnSecSpecInfoRequest extends Request {
    private DescribeDcdnSecSpecInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSecSpecInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSecSpecInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSecSpecInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnSecSpecInfoRequest build() {
            return new DescribeDcdnSecSpecInfoRequest(this);
        } 

    } 

}
