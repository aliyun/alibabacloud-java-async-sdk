// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNumberDistrictInfoStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeNumberDistrictInfoStatusRequest</p>
 */
public class DescribeNumberDistrictInfoStatusRequest extends Request {
    private DescribeNumberDistrictInfoStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNumberDistrictInfoStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeNumberDistrictInfoStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeNumberDistrictInfoStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeNumberDistrictInfoStatusRequest build() {
            return new DescribeNumberDistrictInfoStatusRequest(this);
        } 

    } 

}
