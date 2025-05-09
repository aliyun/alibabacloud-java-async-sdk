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
 * {@link DescribeLogStoreInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogStoreInfoRequest</p>
 */
public class DescribeLogStoreInfoRequest extends Request {
    private DescribeLogStoreInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeLogStoreInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeLogStoreInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeLogStoreInfoRequest build() {
            return new DescribeLogStoreInfoRequest(this);
        } 

    } 

}
