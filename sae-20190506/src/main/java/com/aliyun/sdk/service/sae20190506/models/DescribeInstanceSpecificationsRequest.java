// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeInstanceSpecificationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSpecificationsRequest</p>
 */
public class DescribeInstanceSpecificationsRequest extends Request {
    private DescribeInstanceSpecificationsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecificationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeInstanceSpecificationsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSpecificationsRequest request) {
            super(request);
        } 

        @Override
        public DescribeInstanceSpecificationsRequest build() {
            return new DescribeInstanceSpecificationsRequest(this);
        } 

    } 

}
