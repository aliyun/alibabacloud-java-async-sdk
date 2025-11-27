// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListActionPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionPlansResponseBody</p>
 */
public class ListActionPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionPlans")
    private java.util.List<ActionPlans> actionPlans;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListActionPlansResponseBody(Builder builder) {
        this.actionPlans = builder.actionPlans;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionPlansResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlans
     */
    public java.util.List<ActionPlans> getActionPlans() {
        return this.actionPlans;
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
        private java.util.List<ActionPlans> actionPlans; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListActionPlansResponseBody model) {
            this.actionPlans = model.actionPlans;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of execution plan results.</p>
         */
        public Builder actionPlans(java.util.List<ActionPlans> actionPlans) {
            this.actionPlans = actionPlans;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86scXXXXXXXXXX</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total data count under the current request conditions (optional; not returned by default).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListActionPlansResponseBody build() {
            return new ListActionPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActionPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListActionPlansResponseBody</p>
     */
    public static class ActionPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionPlanId")
        private String actionPlanId;

        @com.aliyun.core.annotation.NameInMap("ActionPlanName")
        private String actionPlanName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ActionPlans(Builder builder) {
            this.actionPlanId = builder.actionPlanId;
            this.actionPlanName = builder.actionPlanName;
            this.createTime = builder.createTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionPlans create() {
            return builder().build();
        }

        /**
         * @return actionPlanId
         */
        public String getActionPlanId() {
            return this.actionPlanId;
        }

        /**
         * @return actionPlanName
         */
        public String getActionPlanName() {
            return this.actionPlanName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String actionPlanId; 
            private String actionPlanName; 
            private String createTime; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(ActionPlans model) {
                this.actionPlanId = model.actionPlanId;
                this.actionPlanName = model.actionPlanName;
                this.createTime = model.createTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-hz036ubmx2qmw93k****</p>
             */
            public Builder actionPlanId(String actionPlanId) {
                this.actionPlanId = actionPlanId;
                return this;
            }

            /**
             * <p>The name of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>TestActionPlan</p>
             */
            public Builder actionPlanName(String actionPlanName) {
                this.actionPlanName = actionPlanName;
                return this;
            }

            /**
             * <p>The time when the execution plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10 17:58:24</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of the execution plan. The possible values are as follows:</p>
             * <ul>
             * <li>Active Instant tasks are dynamically managed only when the execution plan is in the Active state.</li>
             * <li>Inactive Instant tasks are no longer managed by execution plans in the Inactive state.</li>
             * <li>Deleting: The execution plan is being deleted. You cannot modify the parameters of an execution plan in this state.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the execution plan was last modified. The time follows the ISO 8601 standard and UTC +0. The format is yyyy-MM-ddTHH:mmZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10 17:58:24</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ActionPlans build() {
                return new ActionPlans(this);
            } 

        } 

    }
}
