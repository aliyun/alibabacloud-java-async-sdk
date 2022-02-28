// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageStatisticsRequest</p>
 */
public class DescribeImageStatisticsRequest extends Request {
    private DescribeImageStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeImageStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeImageStatisticsRequest response) {
            super(response);
        } 

        @Override
        public DescribeImageStatisticsRequest build() {
            return new DescribeImageStatisticsRequest(this);
        } 

    } 

}
