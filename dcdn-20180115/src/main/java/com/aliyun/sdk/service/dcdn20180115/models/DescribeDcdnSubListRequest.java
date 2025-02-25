// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSubListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSubListRequest</p>
 */
public class DescribeDcdnSubListRequest extends Request {
    private DescribeDcdnSubListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSubListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSubListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSubListRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnSubListRequest build() {
            return new DescribeDcdnSubListRequest(this);
        } 

    } 

}
