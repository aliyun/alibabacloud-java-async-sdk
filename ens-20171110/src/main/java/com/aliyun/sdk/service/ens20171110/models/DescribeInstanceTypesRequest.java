// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypesRequest</p>
 */
public class DescribeInstanceTypesRequest extends Request {
    private DescribeInstanceTypesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeInstanceTypesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypesRequest request) {
            super(request);
        } 

        @Override
        public DescribeInstanceTypesRequest build() {
            return new DescribeInstanceTypesRequest(this);
        } 

    } 

}
