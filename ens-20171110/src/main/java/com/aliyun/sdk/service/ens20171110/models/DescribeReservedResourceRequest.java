// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeReservedResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeReservedResourceRequest</p>
 */
public class DescribeReservedResourceRequest extends Request {
    private DescribeReservedResourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeReservedResourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeReservedResourceRequest request) {
            super(request);
        } 

        @Override
        public DescribeReservedResourceRequest build() {
            return new DescribeReservedResourceRequest(this);
        } 

    } 

}
