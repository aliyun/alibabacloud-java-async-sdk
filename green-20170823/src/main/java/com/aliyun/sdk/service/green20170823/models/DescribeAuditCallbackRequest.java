// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditCallbackRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditCallbackRequest</p>
 */
public class DescribeAuditCallbackRequest extends Request {
    private DescribeAuditCallbackRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAuditCallbackRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditCallbackRequest request) {
            super(request);
        } 

        @Override
        public DescribeAuditCallbackRequest build() {
            return new DescribeAuditCallbackRequest(this);
        } 

    } 

}
