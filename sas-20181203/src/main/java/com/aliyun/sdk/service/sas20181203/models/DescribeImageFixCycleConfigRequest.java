// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixCycleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageFixCycleConfigRequest</p>
 */
public class DescribeImageFixCycleConfigRequest extends Request {
    private DescribeImageFixCycleConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFixCycleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeImageFixCycleConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeImageFixCycleConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeImageFixCycleConfigRequest build() {
            return new DescribeImageFixCycleConfigRequest(this);
        } 

    } 

}
