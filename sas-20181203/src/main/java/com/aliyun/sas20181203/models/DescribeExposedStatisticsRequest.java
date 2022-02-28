// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedStatisticsRequest</p>
 */
public class DescribeExposedStatisticsRequest extends Request {
    private DescribeExposedStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeExposedStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedStatisticsRequest response) {
            super(response);
        } 

        @Override
        public DescribeExposedStatisticsRequest build() {
            return new DescribeExposedStatisticsRequest(this);
        } 

    } 

}
