// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link SubscribeRequest} extends {@link RequestModel}
 *
 * <p>SubscribeRequest</p>
 */
public class SubscribeRequest extends Request {
    private SubscribeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<SubscribeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(SubscribeRequest request) {
            super(request);
        } 

        @Override
        public SubscribeRequest build() {
            return new SubscribeRequest(this);
        } 

    } 

}
