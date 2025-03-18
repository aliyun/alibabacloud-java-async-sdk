// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserQuotaRequest</p>
 */
public class DescribeUserQuotaRequest extends Request {
    private DescribeUserQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUserQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUserQuotaRequest request) {
            super(request);
        } 

        @Override
        public DescribeUserQuotaRequest build() {
            return new DescribeUserQuotaRequest(this);
        } 

    } 

}
