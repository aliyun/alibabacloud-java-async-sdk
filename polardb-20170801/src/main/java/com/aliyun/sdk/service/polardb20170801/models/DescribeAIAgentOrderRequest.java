// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAIAgentOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIAgentOrderRequest</p>
 */
public class DescribeAIAgentOrderRequest extends Request {
    private DescribeAIAgentOrderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIAgentOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAIAgentOrderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAIAgentOrderRequest request) {
            super(request);
        } 

        @Override
        public DescribeAIAgentOrderRequest build() {
            return new DescribeAIAgentOrderRequest(this);
        } 

    } 

}
