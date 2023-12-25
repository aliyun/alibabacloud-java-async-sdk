// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNotificationTypesResponseBody</p>
 */
public class DescribeNotificationTypesResponseBody extends TeaModel {
    @NameInMap("NotificationTypes")
    private java.util.List < String > notificationTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNotificationTypesResponseBody(Builder builder) {
        this.notificationTypes = builder.notificationTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNotificationTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return notificationTypes
     */
    public java.util.List < String > getNotificationTypes() {
        return this.notificationTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > notificationTypes; 
        private String requestId; 

        /**
         * The types of the notifications.
         * <p>
         * 
         * *   AUTOSCALING:SCALE_OUT_SUCCESS: The scale-out activity succeeds.
         * *   AUTOSCALING:SCALE_IN_SUCCESS: The scale-in activity succeeds.
         * *   AUTOSCALING:SCALE_OUT_ERROR: The scale-out activity fails.
         * *   AUTOSCALING:SCALE_IN_ERROR: The scale-in activity fails.
         * *   AUTOSCALING:SCALE_REJECT: The request for scaling activities is rejected.
         * *   AUTOSCALING:SCALE_OUT_START: The scale-out activity starts.
         * *   AUTOSCALING:SCALE_IN_START: The scale-in activity starts.
         * *   AUTOSCALING:SCHEDULE_TASK_EXPIRING: Auto Scaling sends a notification when a scheduled task is about to expire.
         */
        public Builder notificationTypes(java.util.List < String > notificationTypes) {
            this.notificationTypes = notificationTypes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNotificationTypesResponseBody build() {
            return new DescribeNotificationTypesResponseBody(this);
        } 

    } 

}
