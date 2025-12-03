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
 * {@link DescribeScreenDataMapRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenDataMapRequest</p>
 */
public class DescribeScreenDataMapRequest extends Request {
    private DescribeScreenDataMapRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenDataMapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenDataMapRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenDataMapRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenDataMapRequest build() {
            return new DescribeScreenDataMapRequest(this);
        } 

    } 

}
