// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditCallbackListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditCallbackListRequest</p>
 */
public class DescribeAuditCallbackListRequest extends Request {
    private DescribeAuditCallbackListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditCallbackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAuditCallbackListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditCallbackListRequest request) {
            super(request);
        } 

        @Override
        public DescribeAuditCallbackListRequest build() {
            return new DescribeAuditCallbackListRequest(this);
        } 

    } 

}
