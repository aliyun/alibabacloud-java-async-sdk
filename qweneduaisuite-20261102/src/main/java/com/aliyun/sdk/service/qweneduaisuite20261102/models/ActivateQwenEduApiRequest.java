// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link ActivateQwenEduApiRequest} extends {@link RequestModel}
 *
 * <p>ActivateQwenEduApiRequest</p>
 */
public class ActivateQwenEduApiRequest extends Request {
    private ActivateQwenEduApiRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateQwenEduApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ActivateQwenEduApiRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ActivateQwenEduApiRequest request) {
            super(request);
        } 

        @Override
        public ActivateQwenEduApiRequest build() {
            return new ActivateQwenEduApiRequest(this);
        } 

    } 

}
