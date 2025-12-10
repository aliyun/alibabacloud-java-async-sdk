// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link EnableResourceGroupNotificationRequest} extends {@link RequestModel}
 *
 * <p>EnableResourceGroupNotificationRequest</p>
 */
public class EnableResourceGroupNotificationRequest extends Request {
    private EnableResourceGroupNotificationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceGroupNotificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableResourceGroupNotificationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableResourceGroupNotificationRequest request) {
            super(request);
        } 

        @Override
        public EnableResourceGroupNotificationRequest build() {
            return new EnableResourceGroupNotificationRequest(this);
        } 

    } 

}
