// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeUserTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserTagsRequest</p>
 */
public class DescribeUserTagsRequest extends Request {
    private DescribeUserTagsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUserTagsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUserTagsRequest request) {
            super(request);
        } 

        @Override
        public DescribeUserTagsRequest build() {
            return new DescribeUserTagsRequest(this);
        } 

    } 

}
