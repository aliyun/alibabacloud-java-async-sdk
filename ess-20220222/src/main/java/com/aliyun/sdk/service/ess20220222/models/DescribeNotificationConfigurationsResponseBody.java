// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNotificationConfigurationsResponseBody</p>
 */
public class DescribeNotificationConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotificationConfigurationModels")
    private java.util.List < NotificationConfigurationModels> notificationConfigurationModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNotificationConfigurationsResponseBody(Builder builder) {
        this.notificationConfigurationModels = builder.notificationConfigurationModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNotificationConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return notificationConfigurationModels
     */
    public java.util.List < NotificationConfigurationModels> getNotificationConfigurationModels() {
        return this.notificationConfigurationModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NotificationConfigurationModels> notificationConfigurationModels; 
        private String requestId; 

        /**
         * Details of the notifications.
         */
        public Builder notificationConfigurationModels(java.util.List < NotificationConfigurationModels> notificationConfigurationModels) {
            this.notificationConfigurationModels = notificationConfigurationModels;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNotificationConfigurationsResponseBody build() {
            return new DescribeNotificationConfigurationsResponseBody(this);
        } 

    } 

    public static class NotificationConfigurationModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotificationArn")
        private String notificationArn;

        @com.aliyun.core.annotation.NameInMap("NotificationTypes")
        private java.util.List < String > notificationTypes;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        private NotificationConfigurationModels(Builder builder) {
            this.notificationArn = builder.notificationArn;
            this.notificationTypes = builder.notificationTypes;
            this.scalingGroupId = builder.scalingGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationConfigurationModels create() {
            return builder().build();
        }

        /**
         * @return notificationArn
         */
        public String getNotificationArn() {
            return this.notificationArn;
        }

        /**
         * @return notificationTypes
         */
        public java.util.List < String > getNotificationTypes() {
            return this.notificationTypes;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public static final class Builder {
            private String notificationArn; 
            private java.util.List < String > notificationTypes; 
            private String scalingGroupId; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the notification method. The following list describes the value formats of this parameter:
             * <p>
             * 
             * *   If you use CloudMonitor as the notification method, the value format of this parameter is acs:ess:{region-id}:{account-id}:cloudmonitor.
             * *   If you use a Message Service (MNS) queue as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:queue/{queuename}.
             * *   If you use an MNS topic as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:topic/{topicname}.
             * 
             * The variables in the preceding formats have the following meanings:
             * 
             * *   region-id: the region ID of the scaling group.
             * *   account-id: the ID of the Alibaba Cloud account.
             * *   queuename: the name of the MNS queue.
             * *   topicname: the name of the MNS topic.
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * The types of the notifications.
             */
            public Builder notificationTypes(java.util.List < String > notificationTypes) {
                this.notificationTypes = notificationTypes;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            public NotificationConfigurationModels build() {
                return new NotificationConfigurationModels(this);
            } 

        } 

    }
}
