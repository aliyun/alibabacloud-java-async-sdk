// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulFixStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulFixStatisticsRequest</p>
 */
public class DescribeVulFixStatisticsRequest extends Request {
    private DescribeVulFixStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulFixStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVulFixStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVulFixStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeVulFixStatisticsRequest build() {
            return new DescribeVulFixStatisticsRequest(this);
        } 

    } 

}
