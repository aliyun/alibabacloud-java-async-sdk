// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoginSwitchConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoginSwitchConfigsRequest</p>
 */
public class DescribeLoginSwitchConfigsRequest extends Request {
    private DescribeLoginSwitchConfigsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoginSwitchConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeLoginSwitchConfigsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeLoginSwitchConfigsRequest request) {
            super(request);
        } 

        @Override
        public DescribeLoginSwitchConfigsRequest build() {
            return new DescribeLoginSwitchConfigsRequest(this);
        } 

    } 

}
