// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentConfigRequest</p>
 */
public class DescribeMonitoringAgentConfigRequest extends Request {
    private DescribeMonitoringAgentConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMonitoringAgentConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringAgentConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeMonitoringAgentConfigRequest build() {
            return new DescribeMonitoringAgentConfigRequest(this);
        } 

    } 

}
