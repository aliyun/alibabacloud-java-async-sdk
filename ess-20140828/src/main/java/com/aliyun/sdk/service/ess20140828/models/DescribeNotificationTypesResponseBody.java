// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    private NotificationTypes notificationTypes;

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
    public NotificationTypes getNotificationTypes() {
        return this.notificationTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NotificationTypes notificationTypes; 
        private String requestId; 

        /**
         * NotificationTypes.
         */
        public Builder notificationTypes(NotificationTypes notificationTypes) {
            this.notificationTypes = notificationTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNotificationTypesResponseBody build() {
            return new DescribeNotificationTypesResponseBody(this);
        } 

    } 

    public static class NotificationTypes extends TeaModel {
        @NameInMap("NotificationType")
        private java.util.List < String > notificationType;

        private NotificationTypes(Builder builder) {
            this.notificationType = builder.notificationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationTypes create() {
            return builder().build();
        }

        /**
         * @return notificationType
         */
        public java.util.List < String > getNotificationType() {
            return this.notificationType;
        }

        public static final class Builder {
            private java.util.List < String > notificationType; 

            /**
             * NotificationType.
             */
            public Builder notificationType(java.util.List < String > notificationType) {
                this.notificationType = notificationType;
                return this;
            }

            public NotificationTypes build() {
                return new NotificationTypes(this);
            } 

        } 

    }
}
