// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualWareHouseClassSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeVirtualWareHouseClassSetRequest</p>
 */
public class DescribeVirtualWareHouseClassSetRequest extends Request {
    private DescribeVirtualWareHouseClassSetRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualWareHouseClassSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVirtualWareHouseClassSetRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVirtualWareHouseClassSetRequest request) {
            super(request);
        } 

        @Override
        public DescribeVirtualWareHouseClassSetRequest build() {
            return new DescribeVirtualWareHouseClassSetRequest(this);
        } 

    } 

}
