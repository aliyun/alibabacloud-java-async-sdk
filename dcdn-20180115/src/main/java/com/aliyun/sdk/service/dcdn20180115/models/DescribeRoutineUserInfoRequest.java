// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineUserInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineUserInfoRequest</p>
 */
public class DescribeRoutineUserInfoRequest extends Request {
    private DescribeRoutineUserInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRoutineUserInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineUserInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeRoutineUserInfoRequest build() {
            return new DescribeRoutineUserInfoRequest(this);
        } 

    } 

}
