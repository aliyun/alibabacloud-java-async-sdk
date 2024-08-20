// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSLSRealTimeLogTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSLSRealTimeLogTypeRequest</p>
 */
public class DescribeDcdnSLSRealTimeLogTypeRequest extends Request {
    private DescribeDcdnSLSRealTimeLogTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSLSRealTimeLogTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSLSRealTimeLogTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSLSRealTimeLogTypeRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnSLSRealTimeLogTypeRequest build() {
            return new DescribeDcdnSLSRealTimeLogTypeRequest(this);
        } 

    } 

}
