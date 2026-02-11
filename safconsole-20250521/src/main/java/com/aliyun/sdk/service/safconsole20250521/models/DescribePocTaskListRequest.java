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
 * {@link DescribePocTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribePocTaskListRequest</p>
 */
public class DescribePocTaskListRequest extends Request {
    private DescribePocTaskListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePocTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribePocTaskListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribePocTaskListRequest request) {
            super(request);
        } 

        @Override
        public DescribePocTaskListRequest build() {
            return new DescribePocTaskListRequest(this);
        } 

    } 

}
