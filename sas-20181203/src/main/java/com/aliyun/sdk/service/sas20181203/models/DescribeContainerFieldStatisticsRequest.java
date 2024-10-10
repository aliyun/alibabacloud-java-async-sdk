// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerFieldStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerFieldStatisticsRequest</p>
 */
public class DescribeContainerFieldStatisticsRequest extends Request {
    private DescribeContainerFieldStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerFieldStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeContainerFieldStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerFieldStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeContainerFieldStatisticsRequest build() {
            return new DescribeContainerFieldStatisticsRequest(this);
        } 

    } 

}
