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
 * {@link DescribeFirewallDropStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFirewallDropStatisticsRequest</p>
 */
public class DescribeFirewallDropStatisticsRequest extends Request {
    private DescribeFirewallDropStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallDropStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeFirewallDropStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeFirewallDropStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeFirewallDropStatisticsRequest build() {
            return new DescribeFirewallDropStatisticsRequest(this);
        } 

    } 

}
