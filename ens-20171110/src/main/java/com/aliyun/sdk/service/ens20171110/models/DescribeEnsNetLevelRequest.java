// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetLevelRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsNetLevelRequest</p>
 */
public class DescribeEnsNetLevelRequest extends Request {
    private DescribeEnsNetLevelRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetLevelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEnsNetLevelRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsNetLevelRequest request) {
            super(request);
        } 

        @Override
        public DescribeEnsNetLevelRequest build() {
            return new DescribeEnsNetLevelRequest(this);
        } 

    } 

}
