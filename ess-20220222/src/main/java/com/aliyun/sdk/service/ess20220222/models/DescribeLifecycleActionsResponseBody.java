// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleActionsResponseBody</p>
 */
public class DescribeLifecycleActionsResponseBody extends TeaModel {
    @NameInMap("LifecycleActions")
    private java.util.List < LifecycleActions> lifecycleActions;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * LifecycleActions.
         */
        public Builder lifecycleActions(java.util.List < LifecycleActions> lifecycleActions) {
            this.lifecycleActions = lifecycleActions;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public DescribeLifecycleActionsResponseBody build() {
            return new DescribeLifecycleActionsResponseBody(this);
        } 

    } 

    public static class LifecycleActions extends TeaModel {
        @NameInMap("InstanceIds")
        private java.util.List < String > instanceIds;

        @NameInMap("LifecycleActionResult")
        private String lifecycleActionResult;

        @NameInMap("LifecycleActionStatus")
        private String lifecycleActionStatus;

        @NameInMap("LifecycleActionToken")
        private String lifecycleActionToken;

        @NameInMap("LifecycleHookId")
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
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * LifecycleActionResult.
             */
            public Builder lifecycleActionResult(String lifecycleActionResult) {
                this.lifecycleActionResult = lifecycleActionResult;
                return this;
            }

            /**
             * LifecycleActionStatus.
             */
            public Builder lifecycleActionStatus(String lifecycleActionStatus) {
                this.lifecycleActionStatus = lifecycleActionStatus;
                return this;
            }

            /**
             * LifecycleActionToken.
             */
            public Builder lifecycleActionToken(String lifecycleActionToken) {
                this.lifecycleActionToken = lifecycleActionToken;
                return this;
            }

            /**
             * LifecycleHookId.
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
