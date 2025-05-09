// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeDeliveryAddressRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeliveryAddressRequest</p>
 */
public class DescribeDeliveryAddressRequest extends Request {
    private DescribeDeliveryAddressRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeliveryAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDeliveryAddressRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDeliveryAddressRequest request) {
            super(request);
        } 

        @Override
        public DescribeDeliveryAddressRequest build() {
            return new DescribeDeliveryAddressRequest(this);
        } 

    } 

}
