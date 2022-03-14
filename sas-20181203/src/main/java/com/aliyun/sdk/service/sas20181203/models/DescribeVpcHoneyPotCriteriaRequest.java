// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHoneyPotCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcHoneyPotCriteriaRequest</p>
 */
public class DescribeVpcHoneyPotCriteriaRequest extends Request {
    private DescribeVpcHoneyPotCriteriaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHoneyPotCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeVpcHoneyPotCriteriaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcHoneyPotCriteriaRequest request) {
            super(request);
        } 

        @Override
        public DescribeVpcHoneyPotCriteriaRequest build() {
            return new DescribeVpcHoneyPotCriteriaRequest(this);
        } 

    } 

}
