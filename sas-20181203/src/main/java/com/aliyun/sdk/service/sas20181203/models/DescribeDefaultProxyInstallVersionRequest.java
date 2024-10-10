// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefaultProxyInstallVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefaultProxyInstallVersionRequest</p>
 */
public class DescribeDefaultProxyInstallVersionRequest extends Request {
    private DescribeDefaultProxyInstallVersionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultProxyInstallVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDefaultProxyInstallVersionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDefaultProxyInstallVersionRequest request) {
            super(request);
        } 

        @Override
        public DescribeDefaultProxyInstallVersionRequest build() {
            return new DescribeDefaultProxyInstallVersionRequest(this);
        } 

    } 

}
