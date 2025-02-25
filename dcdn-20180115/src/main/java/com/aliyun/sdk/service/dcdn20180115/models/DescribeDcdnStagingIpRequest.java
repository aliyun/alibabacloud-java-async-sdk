// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnStagingIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnStagingIpRequest</p>
 */
public class DescribeDcdnStagingIpRequest extends Request {
    private DescribeDcdnStagingIpRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnStagingIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnStagingIpRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnStagingIpRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnStagingIpRequest build() {
            return new DescribeDcdnStagingIpRequest(this);
        } 

    } 

}
