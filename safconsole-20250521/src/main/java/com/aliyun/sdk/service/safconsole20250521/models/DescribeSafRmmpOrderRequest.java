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
 * {@link DescribeSafRmmpOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeSafRmmpOrderRequest</p>
 */
public class DescribeSafRmmpOrderRequest extends Request {
    private DescribeSafRmmpOrderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafRmmpOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSafRmmpOrderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSafRmmpOrderRequest request) {
            super(request);
        } 

        @Override
        public DescribeSafRmmpOrderRequest build() {
            return new DescribeSafRmmpOrderRequest(this);
        } 

    } 

}
