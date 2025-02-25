// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProductsRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductsRequest</p>
 */
public class DescribeProductsRequest extends Request {
    private DescribeProductsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeProductsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeProductsRequest request) {
            super(request);
        } 

        @Override
        public DescribeProductsRequest build() {
            return new DescribeProductsRequest(this);
        } 

    } 

}
