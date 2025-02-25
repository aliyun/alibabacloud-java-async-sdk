// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringConfigRequest</p>
 */
public class DescribeMonitoringConfigRequest extends Request {
    private DescribeMonitoringConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMonitoringConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeMonitoringConfigRequest build() {
            return new DescribeMonitoringConfigRequest(this);
        } 

    } 

}
