// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    private NotificationConfigurationModels notificationConfigurationModels;

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
    public NotificationConfigurationModels getNotificationConfigurationModels() {
        return this.notificationConfigurationModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NotificationConfigurationModels notificationConfigurationModels; 
        private String requestId; 

        /**
         * NotificationConfigurationModels.
         */
        public Builder notificationConfigurationModels(NotificationConfigurationModels notificationConfigurationModels) {
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
    public static class NotificationConfigurationModel extends TeaModel {
        @NameInMap("NotificationArn")
        private String notificationArn;

        @NameInMap("NotificationTypes")
        private NotificationTypes notificationTypes;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        private NotificationConfigurationModel(Builder builder) {
            this.notificationArn = builder.notificationArn;
            this.notificationTypes = builder.notificationTypes;
            this.scalingGroupId = builder.scalingGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationConfigurationModel create() {
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
        public NotificationTypes getNotificationTypes() {
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
            private NotificationTypes notificationTypes; 
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
            public Builder notificationTypes(NotificationTypes notificationTypes) {
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

            public NotificationConfigurationModel build() {
                return new NotificationConfigurationModel(this);
            } 

        } 

    }
    public static class NotificationConfigurationModels extends TeaModel {
        @NameInMap("NotificationConfigurationModel")
        private java.util.List < NotificationConfigurationModel> notificationConfigurationModel;

        private NotificationConfigurationModels(Builder builder) {
            this.notificationConfigurationModel = builder.notificationConfigurationModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationConfigurationModels create() {
            return builder().build();
        }

        /**
         * @return notificationConfigurationModel
         */
        public java.util.List < NotificationConfigurationModel> getNotificationConfigurationModel() {
            return this.notificationConfigurationModel;
        }

        public static final class Builder {
            private java.util.List < NotificationConfigurationModel> notificationConfigurationModel; 

            /**
             * NotificationConfigurationModel.
             */
            public Builder notificationConfigurationModel(java.util.List < NotificationConfigurationModel> notificationConfigurationModel) {
                this.notificationConfigurationModel = notificationConfigurationModel;
                return this;
            }

            public NotificationConfigurationModels build() {
                return new NotificationConfigurationModels(this);
            } 

        } 

    }
}
