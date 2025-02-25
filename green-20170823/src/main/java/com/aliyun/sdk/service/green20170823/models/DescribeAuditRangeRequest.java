// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditRangeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditRangeRequest</p>
 */
public class DescribeAuditRangeRequest extends Request {
    private DescribeAuditRangeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAuditRangeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditRangeRequest request) {
            super(request);
        } 

        @Override
        public DescribeAuditRangeRequest build() {
            return new DescribeAuditRangeRequest(this);
        } 

    } 

}
