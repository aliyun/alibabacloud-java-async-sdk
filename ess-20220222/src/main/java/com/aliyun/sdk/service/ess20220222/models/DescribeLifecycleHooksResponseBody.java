// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeLifecycleHooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleHooksResponseBody</p>
 */
public class DescribeLifecycleHooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecycleHooks")
    private java.util.List<LifecycleHooks> lifecycleHooks;

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
    public java.util.List<LifecycleHooks> getLifecycleHooks() {
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
        private java.util.List<LifecycleHooks> lifecycleHooks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details about the lifecycle hooks.</p>
         */
        public Builder lifecycleHooks(java.util.List<LifecycleHooks> lifecycleHooks) {
            this.lifecycleHooks = lifecycleHooks;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of lifecycle hooks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecycleHooksResponseBody build() {
            return new DescribeLifecycleHooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLifecycleHooksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecycleHooksResponseBody</p>
     */
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
             * <p>The next action that is performed after the lifecycle hook times out.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * <p>The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action that is specified by DefaultResult.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * <p>The ID of the lifecycle hook.</p>
             * 
             * <strong>example:</strong>
             * <p>ash-bp19d1032y9kij96****</p>
             */
            public Builder lifecycleHookId(String lifecycleHookId) {
                this.lifecycleHookId = lifecycleHookId;
                return this;
            }

            /**
             * <p>The name of the lifecycle hook.</p>
             * 
             * <strong>example:</strong>
             * <p>lifecyclehook****</p>
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * <p>The status of the lifecycle hook. Valid values:</p>
             * <ul>
             * <li>Active: The lifecycle hook is enabled.</li>
             * <li>InActive: The lifecycle hook is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder lifecycleHookStatus(String lifecycleHookStatus) {
                this.lifecycleHookStatus = lifecycleHookStatus;
                return this;
            }

            /**
             * <p>The type of the scaling activity to which the lifecycle hook applies.</p>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * <p>The ARN of the notification recipient when the lifecycle hook takes effect. The value of this parameter must be in one of the following formats:</p>
             * <ul>
             * <li>If you do not create a notification rule, specify the value in the <code>acs:ess:{region-id}:{account-id}:null/null</code> format.</li>
             * <li>If you specify a Simple Message Queue (SMQ, formerly MNS) queue as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code> format.</li>
             * <li>If you specify an SMQ as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code> format.</li>
             * <li>If you specify a CloudOps Orchestration Service (OOS) template as the notification recipient, specify the value in the <code>acs:oos:{region-id}:{account-id}:template/{templatename}</code> format.</li>
             * <li>If you specify an event bus as the notification recipient, specify the value in the <code>acs:eventbridge:{region-id}:{account-id}:eventbus/default</code> format.</li>
             * </ul>
             * <p>The variables in the preceding value formats have the following meanings:</p>
             * <ul>
             * <li>region-id: the region ID of your scaling group.</li>
             * <li>account-id: the ID of your Alibaba Cloud account.</li>
             * <li>queuename: the name of the SMQ queue.</li>
             * <li>topicname: the name of the SMQ topic.</li>
             * <li>templatename: the name of the OOS template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:ess:cn-beijing:161456884340****:null/null</p>
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * <p>The fixed string that is included in a notification that Auto Scaling sends when the lifecycle hook takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Lifecycle Hook.</p>
             */
            public Builder notificationMetadata(String notificationMetadata) {
                this.notificationMetadata = notificationMetadata;
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

            public LifecycleHooks build() {
                return new LifecycleHooks(this);
            } 

        } 

    }
}
