// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReportDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeReportDataRequest</p>
 */
public class DescribeReportDataRequest extends Request {
    private DescribeReportDataRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReportDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeReportDataRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeReportDataRequest request) {
            super(request);
        } 

        @Override
        public DescribeReportDataRequest build() {
            return new DescribeReportDataRequest(this);
        } 

    } 

}
