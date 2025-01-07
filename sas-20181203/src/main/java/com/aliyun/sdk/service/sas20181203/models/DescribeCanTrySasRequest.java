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
 * {@link DescribeCanTrySasRequest} extends {@link RequestModel}
 *
 * <p>DescribeCanTrySasRequest</p>
 */
public class DescribeCanTrySasRequest extends Request {
    private DescribeCanTrySasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCanTrySasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCanTrySasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCanTrySasRequest request) {
            super(request);
        } 

        @Override
        public DescribeCanTrySasRequest build() {
            return new DescribeCanTrySasRequest(this);
        } 

    } 

}
