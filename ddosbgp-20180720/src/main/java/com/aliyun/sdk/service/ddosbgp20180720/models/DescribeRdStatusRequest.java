// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdStatusRequest</p>
 */
public class DescribeRdStatusRequest extends Request {
    private DescribeRdStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRdStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRdStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeRdStatusRequest build() {
            return new DescribeRdStatusRequest(this);
        } 

    } 

}
