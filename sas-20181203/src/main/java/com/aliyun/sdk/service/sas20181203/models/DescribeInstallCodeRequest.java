// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstallCodeRequest</p>
 */
public class DescribeInstallCodeRequest extends Request {
    private DescribeInstallCodeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstallCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeInstallCodeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeInstallCodeRequest request) {
            super(request);
        } 

        @Override
        public DescribeInstallCodeRequest build() {
            return new DescribeInstallCodeRequest(this);
        } 

    } 

}
