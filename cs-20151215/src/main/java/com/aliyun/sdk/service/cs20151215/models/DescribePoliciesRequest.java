// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribePoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribePoliciesRequest</p>
 */
public class DescribePoliciesRequest extends Request {
    private DescribePoliciesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribePoliciesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribePoliciesRequest request) {
            super(request);
        } 

        @Override
        public DescribePoliciesRequest build() {
            return new DescribePoliciesRequest(this);
        } 

    } 

}
