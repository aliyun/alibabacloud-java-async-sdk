// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleHooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleHooksResponseBody</p>
 */
public class DescribeLifecycleHooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecycleHooks")
    private java.util.List < LifecycleHooks> lifecycleHooks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLifecycleHooksResponseBody(Builder builder) {
        this.lifecycleHooks = builder.lifecycleHooks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecycleHooksResponseBody create() {
        return builder().build();
    }

    /**
     * @return lifecycleHooks
     */
    public java.util.List < LifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LifecycleHooks> lifecycleHooks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the lifecycle hooks.
         */
        public Builder lifecycleHooks(java.util.List < LifecycleHooks> lifecycleHooks) {
            this.lifecycleHooks = lifecycleHooks;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of lifecycle hooks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecycleHooksResponseBody build() {
            return new DescribeLifecycleHooksResponseBody(this);
        } 

    } 

    public static class LifecycleHooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultResult")
        private String defaultResult;

        @com.aliyun.core.annotation.NameInMap("HeartbeatTimeout")
        private Integer heartbeatTimeout;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookId")
        private String lifecycleHookId;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookName")
        private String lifecycleHookName;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookStatus")
        private String lifecycleHookStatus;

        @com.aliyun.core.annotation.NameInMap("LifecycleTransition")
        private String lifecycleTransition;

        @com.aliyun.core.annotation.NameInMap("NotificationArn")
        private String notificationArn;

        @com.aliyun.core.annotation.NameInMap("NotificationMetadata")
        private String notificationMetadata;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        private LifecycleHooks(Builder builder) {
            this.defaultResult = builder.defaultResult;
            this.heartbeatTimeout = builder.heartbeatTimeout;
            this.lifecycleHookId = builder.lifecycleHookId;
            this.lifecycleHookName = builder.lifecycleHookName;
            this.lifecycleHookStatus = builder.lifecycleHookStatus;
            this.lifecycleTransition = builder.lifecycleTransition;
            this.notificationArn = builder.notificationArn;
            this.notificationMetadata = builder.notificationMetadata;
            this.scalingGroupId = builder.scalingGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHooks create() {
            return builder().build();
        }

        /**
         * @return defaultResult
         */
        public String getDefaultResult() {
            return this.defaultResult;
        }

        /**
         * @return heartbeatTimeout
         */
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        /**
         * @return lifecycleHookId
         */
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

        /**
         * @return lifecycleHookName
         */
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        /**
         * @return lifecycleHookStatus
         */
        public String getLifecycleHookStatus() {
            return this.lifecycleHookStatus;
        }

        /**
         * @return lifecycleTransition
         */
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        /**
         * @return notificationArn
         */
        public String getNotificationArn() {
            return this.notificationArn;
        }

        /**
         * @return notificationMetadata
         */
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public static final class Builder {
            private String defaultResult; 
            private Integer heartbeatTimeout; 
            private String lifecycleHookId; 
            private String lifecycleHookName; 
            private String lifecycleHookStatus; 
            private String lifecycleTransition; 
            private String notificationArn; 
            private String notificationMetadata; 
            private String scalingGroupId; 

            /**
             * The action that Auto Scaling performs after the lifecycle hook ends.
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * The period of time before the lifecycle hook ends. Auto Scaling performs the specified action after the lifecycle hook ends.
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * The ID of the lifecycle hook.
             */
            public Builder lifecycleHookId(String lifecycleHookId) {
                this.lifecycleHookId = lifecycleHookId;
                return this;
            }

            /**
             * The name of the lifecycle hook.
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * The status of the lifecycle hook. Valid values:
             * <p>
             * 
             * *   Active
             * *   InActive
             */
            public Builder lifecycleHookStatus(String lifecycleHookStatus) {
                this.lifecycleHookStatus = lifecycleHookStatus;
                return this;
            }

            /**
             * The type of the scaling activity to which the lifecycle hook applies.
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the method that is used by Auto Scaling to send notifications when the lifecycle hook takes effect. Specify the value in one of the following formats:
             * <p>
             * 
             * *   If you do not create a notification rule, specify the value in the `acs:ess:{region-id}:{account-id}:null/null` format.
             * *   If you specify a Message Service (MNS) queue as the notification method, specify the value in the `acs:mns:{region-id}:{account-id}:queue/{queuename}` format.
             * *   If you specify an MNS topic as the notification method, specify the value in the `acs:mns:{region-id}:{account-id}:topic/{topicname}` format.
             * *   If you specify an Operation Orchestration Service (OOS) template as the notification method, specify the value in the `acs:oos:{region-id}:{account-id}:template/{templatename}` format.
             * 
             * The variables in the preceding parameter formats have the following meanings:
             * 
             * *   region-id: the region ID of the scaling group.
             * *   account-id: the ID of the Alibaba Cloud account.
             * *   queuename: the name of the MNS queue.
             * *   topicname: the name of the MNS topic.
             * *   templatename: the name of the OOS template.
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * The fixed string that is included in a notification. Auto Scaling sends the notification when the lifecycle hook takes effect.
             */
            public Builder notificationMetadata(String notificationMetadata) {
                this.notificationMetadata = notificationMetadata;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            public LifecycleHooks build() {
                return new LifecycleHooks(this);
            } 

        } 

    }
}
