// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeModelOssTokenRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelOssTokenRequest</p>
 */
public class DescribeModelOssTokenRequest extends Request {
    private DescribeModelOssTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOssTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeModelOssTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeModelOssTokenRequest request) {
            super(request);
        } 

        @Override
        public DescribeModelOssTokenRequest build() {
            return new DescribeModelOssTokenRequest(this);
        } 

    } 

}
