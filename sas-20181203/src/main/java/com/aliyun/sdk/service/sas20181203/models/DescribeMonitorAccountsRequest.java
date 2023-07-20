// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorAccountsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorAccountsRequest</p>
 */
public class DescribeMonitorAccountsRequest extends Request {
    private DescribeMonitorAccountsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorAccountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMonitorAccountsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorAccountsRequest request) {
            super(request);
        } 

        @Override
        public DescribeMonitorAccountsRequest build() {
            return new DescribeMonitorAccountsRequest(this);
        } 

    } 

}
