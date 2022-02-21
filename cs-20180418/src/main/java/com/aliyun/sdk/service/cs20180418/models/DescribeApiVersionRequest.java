// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiVersionRequest</p>
 */
public class DescribeApiVersionRequest extends Request {
    private DescribeApiVersionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeApiVersionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeApiVersionRequest response) {
            super(response);
        } 

        @Override
        public DescribeApiVersionRequest build() {
            return new DescribeApiVersionRequest(this);
        } 

    } 

}
