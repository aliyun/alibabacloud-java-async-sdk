// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstallCodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstallCodesRequest</p>
 */
public class DescribeInstallCodesRequest extends Request {
    private DescribeInstallCodesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstallCodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeInstallCodesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeInstallCodesRequest request) {
            super(request);
        } 

        @Override
        public DescribeInstallCodesRequest build() {
            return new DescribeInstallCodesRequest(this);
        } 

    } 

}
