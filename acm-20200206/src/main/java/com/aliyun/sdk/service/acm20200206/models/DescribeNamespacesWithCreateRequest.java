// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesWithCreateRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespacesWithCreateRequest</p>
 */
public class DescribeNamespacesWithCreateRequest extends Request {
    private DescribeNamespacesWithCreateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespacesWithCreateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeNamespacesWithCreateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespacesWithCreateRequest response) {
            super(response);
        } 

        @Override
        public DescribeNamespacesWithCreateRequest build() {
            return new DescribeNamespacesWithCreateRequest(this);
        } 

    } 

}
