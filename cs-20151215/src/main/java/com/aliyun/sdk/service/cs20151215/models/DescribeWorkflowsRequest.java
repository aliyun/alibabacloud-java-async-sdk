// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowsRequest</p>
 */
public class DescribeWorkflowsRequest extends Request {
    private DescribeWorkflowsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkflowsRequest request) {
            super(request);
        } 

        @Override
        public DescribeWorkflowsRequest build() {
            return new DescribeWorkflowsRequest(this);
        } 

    } 

}
