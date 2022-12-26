// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockFileTypeSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebLockFileTypeSummaryRequest</p>
 */
public class DescribeWebLockFileTypeSummaryRequest extends Request {
    private DescribeWebLockFileTypeSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockFileTypeSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeWebLockFileTypeSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeWebLockFileTypeSummaryRequest request) {
            super(request);
        } 

        @Override
        public DescribeWebLockFileTypeSummaryRequest build() {
            return new DescribeWebLockFileTypeSummaryRequest(this);
        } 

    } 

}
