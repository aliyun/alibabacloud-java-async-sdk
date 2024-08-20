// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCanaryEnvsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineCanaryEnvsRequest</p>
 */
public class DescribeRoutineCanaryEnvsRequest extends Request {
    private DescribeRoutineCanaryEnvsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineCanaryEnvsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRoutineCanaryEnvsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineCanaryEnvsRequest request) {
            super(request);
        } 

        @Override
        public DescribeRoutineCanaryEnvsRequest build() {
            return new DescribeRoutineCanaryEnvsRequest(this);
        } 

    } 

}
