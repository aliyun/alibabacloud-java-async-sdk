// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIPRangeListRequest} extends {@link RequestModel}
 *
 * <p>DescribeIPRangeListRequest</p>
 */
public class DescribeIPRangeListRequest extends Request {
    private DescribeIPRangeListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPRangeListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeIPRangeListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeIPRangeListRequest request) {
            super(request);
        } 

        @Override
        public DescribeIPRangeListRequest build() {
            return new DescribeIPRangeListRequest(this);
        } 

    } 

}
