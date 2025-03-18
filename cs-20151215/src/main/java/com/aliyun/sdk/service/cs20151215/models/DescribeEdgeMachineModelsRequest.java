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
 * {@link DescribeEdgeMachineModelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeMachineModelsRequest</p>
 */
public class DescribeEdgeMachineModelsRequest extends Request {
    private DescribeEdgeMachineModelsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEdgeMachineModelsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeMachineModelsRequest request) {
            super(request);
        } 

        @Override
        public DescribeEdgeMachineModelsRequest build() {
            return new DescribeEdgeMachineModelsRequest(this);
        } 

    } 

}
