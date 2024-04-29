// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModuleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeModuleConfigRequest</p>
 */
public class DescribeModuleConfigRequest extends Request {
    private DescribeModuleConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModuleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeModuleConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeModuleConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeModuleConfigRequest build() {
            return new DescribeModuleConfigRequest(this);
        } 

    } 

}
