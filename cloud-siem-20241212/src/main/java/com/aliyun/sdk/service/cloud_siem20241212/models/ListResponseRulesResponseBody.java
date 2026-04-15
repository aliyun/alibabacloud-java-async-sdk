// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListResponseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResponseRulesResponseBody</p>
 */
public class ListResponseRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseRules")
    private java.util.List<ResponseRules> responseRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResponseRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.responseRules = builder.responseRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResponseRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return responseRules
     */
    public java.util.List<ResponseRules> getResponseRules() {
        return this.responseRules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResponseRules> responseRules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResponseRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.responseRules = model.responseRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResponseRules.
         */
        public Builder responseRules(java.util.List<ResponseRules> responseRules) {
            this.responseRules = responseRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResponseRulesResponseBody build() {
            return new ListResponseRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResponseRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResponseRulesResponseBody</p>
     */
    public static class ResponseRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ResponseActionConfig")
        private String responseActionConfig;

        @com.aliyun.core.annotation.NameInMap("ResponseActionType")
        private String responseActionType;

        @com.aliyun.core.annotation.NameInMap("ResponseExecutionCondition")
        private String responseExecutionCondition;

        @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
        private String responseRuleId;

        @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
        private String responseRuleName;

        @com.aliyun.core.annotation.NameInMap("ResponseRulePriority")
        private Integer responseRulePriority;

        @com.aliyun.core.annotation.NameInMap("ResponseRuleStatus")
        private Integer responseRuleStatus;

        @com.aliyun.core.annotation.NameInMap("ResponseRuleType")
        private String responseRuleType;

        @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
        private String responseTriggerType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ResponseRules(Builder builder) {
            this.createTime = builder.createTime;
            this.responseActionConfig = builder.responseActionConfig;
            this.responseActionType = builder.responseActionType;
            this.responseExecutionCondition = builder.responseExecutionCondition;
            this.responseRuleId = builder.responseRuleId;
            this.responseRuleName = builder.responseRuleName;
            this.responseRulePriority = builder.responseRulePriority;
            this.responseRuleStatus = builder.responseRuleStatus;
            this.responseRuleType = builder.responseRuleType;
            this.responseTriggerType = builder.responseTriggerType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return responseActionConfig
         */
        public String getResponseActionConfig() {
            return this.responseActionConfig;
        }

        /**
         * @return responseActionType
         */
        public String getResponseActionType() {
            return this.responseActionType;
        }

        /**
         * @return responseExecutionCondition
         */
        public String getResponseExecutionCondition() {
            return this.responseExecutionCondition;
        }

        /**
         * @return responseRuleId
         */
        public String getResponseRuleId() {
            return this.responseRuleId;
        }

        /**
         * @return responseRuleName
         */
        public String getResponseRuleName() {
            return this.responseRuleName;
        }

        /**
         * @return responseRulePriority
         */
        public Integer getResponseRulePriority() {
            return this.responseRulePriority;
        }

        /**
         * @return responseRuleStatus
         */
        public Integer getResponseRuleStatus() {
            return this.responseRuleStatus;
        }

        /**
         * @return responseRuleType
         */
        public String getResponseRuleType() {
            return this.responseRuleType;
        }

        /**
         * @return responseTriggerType
         */
        public String getResponseTriggerType() {
            return this.responseTriggerType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String responseActionConfig; 
            private String responseActionType; 
            private String responseExecutionCondition; 
            private String responseRuleId; 
            private String responseRuleName; 
            private Integer responseRulePriority; 
            private Integer responseRuleStatus; 
            private String responseRuleType; 
            private String responseTriggerType; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ResponseRules model) {
                this.createTime = model.createTime;
                this.responseActionConfig = model.responseActionConfig;
                this.responseActionType = model.responseActionType;
                this.responseExecutionCondition = model.responseExecutionCondition;
                this.responseRuleId = model.responseRuleId;
                this.responseRuleName = model.responseRuleName;
                this.responseRulePriority = model.responseRulePriority;
                this.responseRuleStatus = model.responseRuleStatus;
                this.responseRuleType = model.responseRuleType;
                this.responseTriggerType = model.responseTriggerType;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ResponseActionConfig.
             */
            public Builder responseActionConfig(String responseActionConfig) {
                this.responseActionConfig = responseActionConfig;
                return this;
            }

            /**
             * ResponseActionType.
             */
            public Builder responseActionType(String responseActionType) {
                this.responseActionType = responseActionType;
                return this;
            }

            /**
             * ResponseExecutionCondition.
             */
            public Builder responseExecutionCondition(String responseExecutionCondition) {
                this.responseExecutionCondition = responseExecutionCondition;
                return this;
            }

            /**
             * ResponseRuleId.
             */
            public Builder responseRuleId(String responseRuleId) {
                this.responseRuleId = responseRuleId;
                return this;
            }

            /**
             * ResponseRuleName.
             */
            public Builder responseRuleName(String responseRuleName) {
                this.responseRuleName = responseRuleName;
                return this;
            }

            /**
             * ResponseRulePriority.
             */
            public Builder responseRulePriority(Integer responseRulePriority) {
                this.responseRulePriority = responseRulePriority;
                return this;
            }

            /**
             * ResponseRuleStatus.
             */
            public Builder responseRuleStatus(Integer responseRuleStatus) {
                this.responseRuleStatus = responseRuleStatus;
                return this;
            }

            /**
             * ResponseRuleType.
             */
            public Builder responseRuleType(String responseRuleType) {
                this.responseRuleType = responseRuleType;
                return this;
            }

            /**
             * ResponseTriggerType.
             */
            public Builder responseTriggerType(String responseTriggerType) {
                this.responseTriggerType = responseTriggerType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResponseRules build() {
                return new ResponseRules(this);
            } 

        } 

    }
}
