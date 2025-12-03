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
 * {@link DescribeScreenCloudHcRiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenCloudHcRiskRequest</p>
 */
public class DescribeScreenCloudHcRiskRequest extends Request {
    private DescribeScreenCloudHcRiskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenCloudHcRiskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenCloudHcRiskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenCloudHcRiskRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenCloudHcRiskRequest build() {
            return new DescribeScreenCloudHcRiskRequest(this);
        } 

    } 

}
