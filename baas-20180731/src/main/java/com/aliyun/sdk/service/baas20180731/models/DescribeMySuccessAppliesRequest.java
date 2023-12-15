// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMySuccessAppliesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMySuccessAppliesRequest</p>
 */
public class DescribeMySuccessAppliesRequest extends Request {
    private DescribeMySuccessAppliesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMySuccessAppliesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMySuccessAppliesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMySuccessAppliesRequest request) {
            super(request);
        } 

        @Override
        public DescribeMySuccessAppliesRequest build() {
            return new DescribeMySuccessAppliesRequest(this);
        } 

    } 

}
