// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSpecRequest</p>
 */
public class DescribeInstanceSpecRequest extends Request {
    private DescribeInstanceSpecRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeInstanceSpecRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSpecRequest request) {
            super(request);
        } 

        @Override
        public DescribeInstanceSpecRequest build() {
            return new DescribeInstanceSpecRequest(this);
        } 

    } 

}
