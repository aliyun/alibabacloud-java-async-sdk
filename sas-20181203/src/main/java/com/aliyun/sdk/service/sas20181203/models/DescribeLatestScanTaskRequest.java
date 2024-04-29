// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLatestScanTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeLatestScanTaskRequest</p>
 */
public class DescribeLatestScanTaskRequest extends Request {
    private DescribeLatestScanTaskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeLatestScanTaskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeLatestScanTaskRequest request) {
            super(request);
        } 

        @Override
        public DescribeLatestScanTaskRequest build() {
            return new DescribeLatestScanTaskRequest(this);
        } 

    } 

}
