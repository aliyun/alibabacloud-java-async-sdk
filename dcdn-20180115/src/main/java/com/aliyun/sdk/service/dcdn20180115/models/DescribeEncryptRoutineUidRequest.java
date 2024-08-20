// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptRoutineUidRequest} extends {@link RequestModel}
 *
 * <p>DescribeEncryptRoutineUidRequest</p>
 */
public class DescribeEncryptRoutineUidRequest extends Request {
    private DescribeEncryptRoutineUidRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptRoutineUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEncryptRoutineUidRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEncryptRoutineUidRequest request) {
            super(request);
        } 

        @Override
        public DescribeEncryptRoutineUidRequest build() {
            return new DescribeEncryptRoutineUidRequest(this);
        } 

    } 

}
