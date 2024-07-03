// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleActionsResponseBody</p>
 */
public class DescribeLifecycleActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecycleActions")
    private java.util.List < LifecycleActions> lifecycleActions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLifecycleActionsResponseBody(Builder builder) {
        this.lifecycleActions = builder.lifecycleActions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecycleActionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return lifecycleActions
     */
    public java.util.List < LifecycleActions> getLifecycleActions() {
        return this.lifecycleActions;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < LifecycleActions> lifecycleActions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The actions of the lifecycle hook.
         */
        public Builder lifecycleActions(java.util.List < LifecycleActions> lifecycleActions) {
            this.lifecycleActions = lifecycleActions;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of the queried lifecycle actions.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecycleActionsResponseBody build() {
            return new DescribeLifecycleActionsResponseBody(this);
        } 

    } 

    public static class LifecycleActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List < String > instanceIds;

        @com.aliyun.core.annotation.NameInMap("LifecycleActionResult")
        private String lifecycleActionResult;

        @com.aliyun.core.annotation.NameInMap("LifecycleActionStatus")
        private String lifecycleActionStatus;

        @com.aliyun.core.annotation.NameInMap("LifecycleActionToken")
        private String lifecycleActionToken;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookId")
        private String lifecycleHookId;

        private LifecycleActions(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.lifecycleActionResult = builder.lifecycleActionResult;
            this.lifecycleActionStatus = builder.lifecycleActionStatus;
            this.lifecycleActionToken = builder.lifecycleActionToken;
            this.lifecycleHookId = builder.lifecycleHookId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleActions create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return lifecycleActionResult
         */
        public String getLifecycleActionResult() {
            return this.lifecycleActionResult;
        }

        /**
         * @return lifecycleActionStatus
         */
        public String getLifecycleActionStatus() {
            return this.lifecycleActionStatus;
        }

        /**
         * @return lifecycleActionToken
         */
        public String getLifecycleActionToken() {
            return this.lifecycleActionToken;
        }

        /**
         * @return lifecycleHookId
         */
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

        public static final class Builder {
            private java.util.List < String > instanceIds; 
            private String lifecycleActionResult; 
            private String lifecycleActionStatus; 
            private String lifecycleActionToken; 
            private String lifecycleHookId; 

            /**
             * The IDs of the ECS instances on which the lifecycle hook takes effect
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * The subsequent action that Auto Scaling performs after the lifecycle hook times out. Valid values:
             * <p>
             * 
             * *   CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.
             * *   ABANDON: Auto Scaling releases ECS instances that are created during scale-out events, or removes ECS instances from the scaling group during scale-in events.
             */
            public Builder lifecycleActionResult(String lifecycleActionResult) {
                this.lifecycleActionResult = lifecycleActionResult;
                return this;
            }

            /**
             * The status of the lifecycle hook action.
             */
            public Builder lifecycleActionStatus(String lifecycleActionStatus) {
                this.lifecycleActionStatus = lifecycleActionStatus;
                return this;
            }

            /**
             * The token of the lifecycle hook action.
             */
            public Builder lifecycleActionToken(String lifecycleActionToken) {
                this.lifecycleActionToken = lifecycleActionToken;
                return this;
            }

            /**
             * The ID of the lifecycle hook.
             */
            public Builder lifecycleHookId(String lifecycleHookId) {
                this.lifecycleHookId = lifecycleHookId;
                return this;
            }

            public LifecycleActions build() {
                return new LifecycleActions(this);
            } 

        } 

    }
}
