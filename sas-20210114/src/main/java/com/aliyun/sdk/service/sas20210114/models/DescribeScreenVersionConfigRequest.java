// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenVersionConfigRequest</p>
 */
public class DescribeScreenVersionConfigRequest extends Request {
    private DescribeScreenVersionConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenVersionConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenVersionConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenVersionConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenVersionConfigRequest build() {
            return new DescribeScreenVersionConfigRequest(this);
        } 

    } 

}
