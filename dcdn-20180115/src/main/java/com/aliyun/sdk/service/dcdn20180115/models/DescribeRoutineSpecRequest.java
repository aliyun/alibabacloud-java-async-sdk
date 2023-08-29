// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineSpecRequest</p>
 */
public class DescribeRoutineSpecRequest extends Request {
    private DescribeRoutineSpecRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRoutineSpecRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineSpecRequest request) {
            super(request);
        } 

        @Override
        public DescribeRoutineSpecRequest build() {
            return new DescribeRoutineSpecRequest(this);
        } 

    } 

}
