// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgUserAgreementRequest} extends {@link RequestModel}
 *
 * <p>DescribeEmgUserAgreementRequest</p>
 */
public class DescribeEmgUserAgreementRequest extends Request {
    private DescribeEmgUserAgreementRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmgUserAgreementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEmgUserAgreementRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEmgUserAgreementRequest request) {
            super(request);
        } 

        @Override
        public DescribeEmgUserAgreementRequest build() {
            return new DescribeEmgUserAgreementRequest(this);
        } 

    } 

}
