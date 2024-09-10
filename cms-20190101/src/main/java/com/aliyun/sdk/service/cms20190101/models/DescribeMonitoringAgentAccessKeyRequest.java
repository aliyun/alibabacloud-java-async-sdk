// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentAccessKeyRequest</p>
 */
public class DescribeMonitoringAgentAccessKeyRequest extends Request {
    private DescribeMonitoringAgentAccessKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentAccessKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMonitoringAgentAccessKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringAgentAccessKeyRequest request) {
            super(request);
        } 

        @Override
        public DescribeMonitoringAgentAccessKeyRequest build() {
            return new DescribeMonitoringAgentAccessKeyRequest(this);
        } 

    } 

}
