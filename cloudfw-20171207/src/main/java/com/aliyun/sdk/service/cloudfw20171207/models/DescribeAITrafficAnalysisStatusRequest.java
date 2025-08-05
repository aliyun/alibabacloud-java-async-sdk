// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAITrafficAnalysisStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeAITrafficAnalysisStatusRequest</p>
 */
public class DescribeAITrafficAnalysisStatusRequest extends Request {
    private DescribeAITrafficAnalysisStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAITrafficAnalysisStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAITrafficAnalysisStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAITrafficAnalysisStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeAITrafficAnalysisStatusRequest build() {
            return new DescribeAITrafficAnalysisStatusRequest(this);
        } 

    } 

}
