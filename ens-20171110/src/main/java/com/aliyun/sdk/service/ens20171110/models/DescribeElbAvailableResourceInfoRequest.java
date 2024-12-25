// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeElbAvailableResourceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeElbAvailableResourceInfoRequest</p>
 */
public class DescribeElbAvailableResourceInfoRequest extends Request {
    private DescribeElbAvailableResourceInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElbAvailableResourceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeElbAvailableResourceInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeElbAvailableResourceInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeElbAvailableResourceInfoRequest build() {
            return new DescribeElbAvailableResourceInfoRequest(this);
        } 

    } 

}
