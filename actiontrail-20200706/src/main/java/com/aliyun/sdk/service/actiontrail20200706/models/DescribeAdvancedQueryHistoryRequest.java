// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeAdvancedQueryHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvancedQueryHistoryRequest</p>
 */
public class DescribeAdvancedQueryHistoryRequest extends Request {
    private DescribeAdvancedQueryHistoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvancedQueryHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAdvancedQueryHistoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvancedQueryHistoryRequest request) {
            super(request);
        } 

        @Override
        public DescribeAdvancedQueryHistoryRequest build() {
            return new DescribeAdvancedQueryHistoryRequest(this);
        } 

    } 

}
