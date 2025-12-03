// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenSummaryInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenSummaryInfoRequest</p>
 */
public class DescribeScreenSummaryInfoRequest extends Request {
    private DescribeScreenSummaryInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenSummaryInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenSummaryInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenSummaryInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenSummaryInfoRequest build() {
            return new DescribeScreenSummaryInfoRequest(this);
        } 

    } 

}
