// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeCtrlInstanceMemberAccountsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCtrlInstanceMemberAccountsRequest</p>
 */
public class DescribeCtrlInstanceMemberAccountsRequest extends Request {
    private DescribeCtrlInstanceMemberAccountsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCtrlInstanceMemberAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCtrlInstanceMemberAccountsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCtrlInstanceMemberAccountsRequest request) {
            super(request);
        } 

        @Override
        public DescribeCtrlInstanceMemberAccountsRequest build() {
            return new DescribeCtrlInstanceMemberAccountsRequest(this);
        } 

    } 

}
