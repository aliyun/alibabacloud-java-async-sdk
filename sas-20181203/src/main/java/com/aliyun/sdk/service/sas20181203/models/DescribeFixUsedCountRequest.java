// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeFixUsedCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeFixUsedCountRequest</p>
 */
public class DescribeFixUsedCountRequest extends Request {
    private DescribeFixUsedCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFixUsedCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeFixUsedCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeFixUsedCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeFixUsedCountRequest build() {
            return new DescribeFixUsedCountRequest(this);
        } 

    } 

}
