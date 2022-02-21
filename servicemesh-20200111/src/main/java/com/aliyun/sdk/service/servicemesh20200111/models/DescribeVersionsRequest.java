// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionsRequest</p>
 */
public class DescribeVersionsRequest extends Request {
    private DescribeVersionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVersionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVersionsRequest response) {
            super(response);
        } 

        @Override
        public DescribeVersionsRequest build() {
            return new DescribeVersionsRequest(this);
        } 

    } 

}
