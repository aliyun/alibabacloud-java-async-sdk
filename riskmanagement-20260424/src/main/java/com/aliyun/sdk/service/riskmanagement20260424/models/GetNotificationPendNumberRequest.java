// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetNotificationPendNumberRequest} extends {@link RequestModel}
 *
 * <p>GetNotificationPendNumberRequest</p>
 */
public class GetNotificationPendNumberRequest extends Request {
    private GetNotificationPendNumberRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotificationPendNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetNotificationPendNumberRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetNotificationPendNumberRequest request) {
            super(request);
        } 

        @Override
        public GetNotificationPendNumberRequest build() {
            return new GetNotificationPendNumberRequest(this);
        } 

    } 

}
