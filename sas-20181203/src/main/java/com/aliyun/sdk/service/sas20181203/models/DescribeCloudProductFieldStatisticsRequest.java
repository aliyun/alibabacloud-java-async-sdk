// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudProductFieldStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudProductFieldStatisticsRequest</p>
 */
public class DescribeCloudProductFieldStatisticsRequest extends Request {
    private DescribeCloudProductFieldStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudProductFieldStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCloudProductFieldStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudProductFieldStatisticsRequest response) {
            super(response);
        } 

        @Override
        public DescribeCloudProductFieldStatisticsRequest build() {
            return new DescribeCloudProductFieldStatisticsRequest(this);
        } 

    } 

}
