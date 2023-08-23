// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNotificationConfigurationsResponseBody</p>
 */
public class DescribeNotificationConfigurationsResponseBody extends TeaModel {
    @NameInMap("NotificationConfigurationModels")
    private java.util.List < NotificationConfigurationModels> notificationConfigurationModels;

    @NameInMap("RequestId")
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
         * NotificationConfigurationModels.
         */
        public Builder notificationConfigurationModels(java.util.List < NotificationConfigurationModels> notificationConfigurationModels) {
            this.notificationConfigurationModels = notificationConfigurationModels;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("NotificationArn")
        private String notificationArn;

        @NameInMap("NotificationTypes")
        private java.util.List < String > notificationTypes;

        @NameInMap("ScalingGroupId")
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
             * NotificationArn.
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * NotificationTypes.
             */
            public Builder notificationTypes(java.util.List < String > notificationTypes) {
                this.notificationTypes = notificationTypes;
                return this;
            }

            /**
             * ScalingGroupId.
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
