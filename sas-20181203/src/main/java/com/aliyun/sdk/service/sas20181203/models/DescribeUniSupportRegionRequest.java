// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUniSupportRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniSupportRegionRequest</p>
 */
public class DescribeUniSupportRegionRequest extends Request {
    private DescribeUniSupportRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniSupportRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUniSupportRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUniSupportRegionRequest request) {
            super(request);
        } 

        @Override
        public DescribeUniSupportRegionRequest build() {
            return new DescribeUniSupportRegionRequest(this);
        } 

    } 

}
