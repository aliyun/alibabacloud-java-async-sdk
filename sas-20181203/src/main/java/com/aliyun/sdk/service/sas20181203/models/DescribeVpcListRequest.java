// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcListRequest</p>
 */
public class DescribeVpcListRequest extends Request {
    private DescribeVpcListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVpcListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcListRequest request) {
            super(request);
        } 

        @Override
        public DescribeVpcListRequest build() {
            return new DescribeVpcListRequest(this);
        } 

    } 

}
