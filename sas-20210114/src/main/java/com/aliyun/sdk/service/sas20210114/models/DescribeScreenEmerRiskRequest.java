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
 * {@link DescribeScreenEmerRiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenEmerRiskRequest</p>
 */
public class DescribeScreenEmerRiskRequest extends Request {
    private DescribeScreenEmerRiskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenEmerRiskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenEmerRiskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenEmerRiskRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenEmerRiskRequest build() {
            return new DescribeScreenEmerRiskRequest(this);
        } 

    } 

}
