// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeProductCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductCodeRequest</p>
 */
public class DescribeProductCodeRequest extends Request {
    private DescribeProductCodeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeProductCodeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeProductCodeRequest request) {
            super(request);
        } 

        @Override
        public DescribeProductCodeRequest build() {
            return new DescribeProductCodeRequest(this);
        } 

    } 

}
