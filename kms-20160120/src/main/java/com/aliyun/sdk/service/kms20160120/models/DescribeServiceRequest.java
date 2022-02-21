// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceRequest</p>
 */
public class DescribeServiceRequest extends Request {
    private DescribeServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceRequest response) {
            super(response);
        } 

        @Override
        public DescribeServiceRequest build() {
            return new DescribeServiceRequest(this);
        } 

    } 

}
