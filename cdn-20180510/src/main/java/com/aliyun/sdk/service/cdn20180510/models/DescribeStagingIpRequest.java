// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStagingIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeStagingIpRequest</p>
 */
public class DescribeStagingIpRequest extends Request {
    private DescribeStagingIpRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStagingIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeStagingIpRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeStagingIpRequest request) {
            super(request);
        } 

        @Override
        public DescribeStagingIpRequest build() {
            return new DescribeStagingIpRequest(this);
        } 

    } 

}
