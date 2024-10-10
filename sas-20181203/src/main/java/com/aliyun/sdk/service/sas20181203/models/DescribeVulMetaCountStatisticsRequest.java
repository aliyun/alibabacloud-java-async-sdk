// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVulMetaCountStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulMetaCountStatisticsRequest</p>
 */
public class DescribeVulMetaCountStatisticsRequest extends Request {
    private DescribeVulMetaCountStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulMetaCountStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVulMetaCountStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVulMetaCountStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeVulMetaCountStatisticsRequest build() {
            return new DescribeVulMetaCountStatisticsRequest(this);
        } 

    } 

}
