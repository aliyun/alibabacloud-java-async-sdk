// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeUserTrailCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserTrailCountRequest</p>
 */
public class DescribeUserTrailCountRequest extends Request {
    private DescribeUserTrailCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTrailCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUserTrailCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUserTrailCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeUserTrailCountRequest build() {
            return new DescribeUserTrailCountRequest(this);
        } 

    } 

}
