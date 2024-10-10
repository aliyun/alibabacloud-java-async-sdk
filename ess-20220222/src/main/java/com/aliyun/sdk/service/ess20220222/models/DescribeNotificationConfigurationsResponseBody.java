// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The notification settings.</p>
         */
        public Builder notificationConfigurationModels(java.util.List < NotificationConfigurationModels> notificationConfigurationModels) {
            this.notificationConfigurationModels = notificationConfigurationModels;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNotificationConfigurationsResponseBody build() {
            return new DescribeNotificationConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNotificationConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNotificationConfigurationsResponseBody</p>
     */
    public static class NotificationConfigurationModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotificationArn")
        private String notificationArn;

        @com.aliyun.core.annotation.NameInMap("NotificationTypes")
        private java.util.List < String > notificationTypes;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private NotificationConfigurationModels(Builder builder) {
            this.notificationArn = builder.notificationArn;
            this.notificationTypes = builder.notificationTypes;
            this.scalingGroupId = builder.scalingGroupId;
            this.timeZone = builder.timeZone;
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

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String notificationArn; 
            private java.util.List < String > notificationTypes; 
            private String scalingGroupId; 
            private String timeZone; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the notification method. The following list describes the value formats of this parameter:</p>
             * <ul>
             * <li>If you use CloudMonitor as the notification method, the value format of this parameter is acs:ess:{region-id}:{account-id}:cloudmonitor.</li>
             * <li>If you use a Message Service (MNS) queue as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
             * <li>If you use an MNS topic as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
             * </ul>
             * <p>The variables in the preceding formats have the following meanings:</p>
             * <ul>
             * <li>region-id: the region ID of the scaling group.</li>
             * <li>account-id: the ID of the Alibaba Cloud account.</li>
             * <li>queuename: the name of the MNS queue.</li>
             * <li>topicname: the name of the MNS topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-beijing:161456884340****:topic/modifyLifecycleHo****</p>
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * <p>The types of the notifications.</p>
             */
            public Builder notificationTypes(java.util.List < String > notificationTypes) {
                this.notificationTypes = notificationTypes;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1igpak5ft1flyp****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The time zone of the notification. The value must be in UTC. For example, a value of UTC+8 indicates that the time is 8 hours ahead of Coordinated Universal Time, and a value of UTC-7 indicates that the time is 7 hours behind Coordinated Universal Time.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public NotificationConfigurationModels build() {
                return new NotificationConfigurationModels(this);
            } 

        } 

    }
}
