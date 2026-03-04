// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListNotificationRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListNotificationRecordsRequest</p>
 */
public class ListNotificationRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationKeys;

    private ListNotificationRecordsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.notificationKeys = builder.notificationKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return notificationKeys
     */
    public String getNotificationKeys() {
        return this.notificationKeys;
    }

    public static final class Builder extends Request.Builder<ListNotificationRecordsRequest, Builder> {
        private String instanceId; 
        private String notificationKeys; 

        private Builder() {
            super();
        } 

        private Builder(ListNotificationRecordsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.notificationKeys = request.notificationKeys;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;job-468a63a2-<strong><strong>-</strong></strong>-<strong><strong>-b1ecf726d4be&quot;,&quot;job-532a63a2-</strong></strong>-<strong><strong>-</strong></strong>-bcccc26d4cc&quot;]</p>
         */
        public Builder notificationKeys(String notificationKeys) {
            this.putQueryParameter("NotificationKeys", notificationKeys);
            this.notificationKeys = notificationKeys;
            return this;
        }

        @Override
        public ListNotificationRecordsRequest build() {
            return new ListNotificationRecordsRequest(this);
        } 

    } 

}
