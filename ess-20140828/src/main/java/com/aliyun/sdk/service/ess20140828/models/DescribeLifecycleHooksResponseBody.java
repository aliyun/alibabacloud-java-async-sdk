// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleHooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleHooksResponseBody</p>
 */
public class DescribeLifecycleHooksResponseBody extends TeaModel {
    @NameInMap("LifecycleHooks")
    private LifecycleHooks lifecycleHooks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public LifecycleHooks getLifecycleHooks() {
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
        private LifecycleHooks lifecycleHooks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * LifecycleHooks.
         */
        public Builder lifecycleHooks(LifecycleHooks lifecycleHooks) {
            this.lifecycleHooks = lifecycleHooks;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecycleHooksResponseBody build() {
            return new DescribeLifecycleHooksResponseBody(this);
        } 

    } 

    public static class LifecycleHook extends TeaModel {
        @NameInMap("DefaultResult")
        private String defaultResult;

        @NameInMap("HeartbeatTimeout")
        private Integer heartbeatTimeout;

        @NameInMap("LifecycleHookId")
        private String lifecycleHookId;

        @NameInMap("LifecycleHookName")
        private String lifecycleHookName;

        @NameInMap("LifecycleTransition")
        private String lifecycleTransition;

        @NameInMap("NotificationArn")
        private String notificationArn;

        @NameInMap("NotificationMetadata")
        private String notificationMetadata;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        private LifecycleHook(Builder builder) {
            this.defaultResult = builder.defaultResult;
            this.heartbeatTimeout = builder.heartbeatTimeout;
            this.lifecycleHookId = builder.lifecycleHookId;
            this.lifecycleHookName = builder.lifecycleHookName;
            this.lifecycleTransition = builder.lifecycleTransition;
            this.notificationArn = builder.notificationArn;
            this.notificationMetadata = builder.notificationMetadata;
            this.scalingGroupId = builder.scalingGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHook create() {
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
            private String lifecycleTransition; 
            private String notificationArn; 
            private String notificationMetadata; 
            private String scalingGroupId; 

            /**
             * DefaultResult.
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * HeartbeatTimeout.
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * LifecycleHookId.
             */
            public Builder lifecycleHookId(String lifecycleHookId) {
                this.lifecycleHookId = lifecycleHookId;
                return this;
            }

            /**
             * LifecycleHookName.
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * LifecycleTransition.
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * NotificationArn.
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * NotificationMetadata.
             */
            public Builder notificationMetadata(String notificationMetadata) {
                this.notificationMetadata = notificationMetadata;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            public LifecycleHook build() {
                return new LifecycleHook(this);
            } 

        } 

    }
    public static class LifecycleHooks extends TeaModel {
        @NameInMap("LifecycleHook")
        private java.util.List < LifecycleHook> lifecycleHook;

        private LifecycleHooks(Builder builder) {
            this.lifecycleHook = builder.lifecycleHook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHooks create() {
            return builder().build();
        }

        /**
         * @return lifecycleHook
         */
        public java.util.List < LifecycleHook> getLifecycleHook() {
            return this.lifecycleHook;
        }

        public static final class Builder {
            private java.util.List < LifecycleHook> lifecycleHook; 

            /**
             * LifecycleHook.
             */
            public Builder lifecycleHook(java.util.List < LifecycleHook> lifecycleHook) {
                this.lifecycleHook = lifecycleHook;
                return this;
            }

            public LifecycleHooks build() {
                return new LifecycleHooks(this);
            } 

        } 

    }
}
