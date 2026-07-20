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
 * {@link GetNotificationContactsRequest} extends {@link RequestModel}
 *
 * <p>GetNotificationContactsRequest</p>
 */
public class GetNotificationContactsRequest extends Request {
    private GetNotificationContactsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotificationContactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetNotificationContactsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetNotificationContactsRequest request) {
            super(request);
        } 

        @Override
        public GetNotificationContactsRequest build() {
            return new GetNotificationContactsRequest(this);
        } 

    } 

}
