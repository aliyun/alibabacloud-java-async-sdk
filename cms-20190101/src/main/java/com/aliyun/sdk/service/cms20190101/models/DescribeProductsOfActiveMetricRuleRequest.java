// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductsOfActiveMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductsOfActiveMetricRuleRequest</p>
 */
public class DescribeProductsOfActiveMetricRuleRequest extends Request {
    private DescribeProductsOfActiveMetricRuleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsOfActiveMetricRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeProductsOfActiveMetricRuleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeProductsOfActiveMetricRuleRequest request) {
            super(request);
        } 

        @Override
        public DescribeProductsOfActiveMetricRuleRequest build() {
            return new DescribeProductsOfActiveMetricRuleRequest(this);
        } 

    } 

}
