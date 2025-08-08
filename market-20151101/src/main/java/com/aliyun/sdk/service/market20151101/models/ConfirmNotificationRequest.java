// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link ConfirmNotificationRequest} extends {@link RequestModel}
 *
 * <p>ConfirmNotificationRequest</p>
 */
public class ConfirmNotificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationRequestId;

    private ConfirmNotificationRequest(Builder builder) {
        super(builder);
        this.notificationRequestId = builder.notificationRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmNotificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notificationRequestId
     */
    public String getNotificationRequestId() {
        return this.notificationRequestId;
    }

    public static final class Builder extends Request.Builder<ConfirmNotificationRequest, Builder> {
        private String notificationRequestId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmNotificationRequest request) {
            super(request);
            this.notificationRequestId = request.notificationRequestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deab3673236843a3b378c7d8d25c5f01</p>
         */
        public Builder notificationRequestId(String notificationRequestId) {
            this.putQueryParameter("NotificationRequestId", notificationRequestId);
            this.notificationRequestId = notificationRequestId;
            return this;
        }

        @Override
        public ConfirmNotificationRequest build() {
            return new ConfirmNotificationRequest(this);
        } 

    } 

}
