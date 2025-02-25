// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualWareHouseStatusSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeVirtualWareHouseStatusSetRequest</p>
 */
public class DescribeVirtualWareHouseStatusSetRequest extends Request {
    private DescribeVirtualWareHouseStatusSetRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualWareHouseStatusSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVirtualWareHouseStatusSetRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVirtualWareHouseStatusSetRequest request) {
            super(request);
        } 

        @Override
        public DescribeVirtualWareHouseStatusSetRequest build() {
            return new DescribeVirtualWareHouseStatusSetRequest(this);
        } 

    } 

}
