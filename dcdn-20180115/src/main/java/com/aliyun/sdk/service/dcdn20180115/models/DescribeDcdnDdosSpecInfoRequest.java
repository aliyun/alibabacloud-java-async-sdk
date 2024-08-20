// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDdosSpecInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDdosSpecInfoRequest</p>
 */
public class DescribeDcdnDdosSpecInfoRequest extends Request {
    private DescribeDcdnDdosSpecInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDdosSpecInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDdosSpecInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDdosSpecInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnDdosSpecInfoRequest build() {
            return new DescribeDcdnDdosSpecInfoRequest(this);
        } 

    } 

}
