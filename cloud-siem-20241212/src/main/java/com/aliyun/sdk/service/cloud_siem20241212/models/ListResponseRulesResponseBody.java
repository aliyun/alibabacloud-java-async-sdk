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
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position from which the current call starts reading. An empty value indicates that all data has been read.</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The list of automatic response rules.</p>
         */
        public Builder responseRules(java.util.List<ResponseRules> responseRules) {
            this.responseRules = responseRules;
            return this;
        }

        /**
         * <p>The total number of records that match the request conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
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

        @com.aliyun.core.annotation.NameInMap("ResponseRuleRemark")
        private String responseRuleRemark;

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
            this.responseRuleRemark = builder.responseRuleRemark;
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
         * @return responseRuleRemark
         */
        public String getResponseRuleRemark() {
            return this.responseRuleRemark;
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
            private String responseRuleRemark; 
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
                this.responseRuleRemark = model.responseRuleRemark;
                this.responseRuleStatus = model.responseRuleStatus;
                this.responseRuleType = model.responseRuleType;
                this.responseTriggerType = model.responseTriggerType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1769843323000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The action configuration of the automatic response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
             */
            public Builder responseActionConfig(String responseActionConfig) {
                this.responseActionConfig = responseActionConfig;
                return this;
            }

            /**
             * <p>The action type of the automatic response rule. Valid values:</p>
             * <ul>
             * <li>doPlaybook: execute a playbook</li>
             * <li>changeEventStatus: update event status</li>
             * <li>changeThreatLevel: update event threat level</li>
             * <li>addEventTag: add an event label</li>
             * <li>deleteEventTag: delete an event label</li>
             * <li>alertWhitelist: add alert to whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>doPlaybook</p>
             */
            public Builder responseActionType(String responseActionType) {
                this.responseActionType = responseActionType;
                return this;
            }

            /**
             * <p>The trigger condition configuration of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;threat_level&quot;},&quot;operator&quot;:&quot;equals&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;suspicious&quot;}}]</p>
             */
            public Builder responseExecutionCondition(String responseExecutionCondition) {
                this.responseExecutionCondition = responseExecutionCondition;
                return this;
            }

            /**
             * <p>The ID of the automatic response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>403235</p>
             */
            public Builder responseRuleId(String responseRuleId) {
                this.responseRuleId = responseRuleId;
                return this;
            }

            /**
             * <p>The name of the automatic response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Send Notification When Generating Urgent Incident</p>
             */
            public Builder responseRuleName(String responseRuleName) {
                this.responseRuleName = responseRuleName;
                return this;
            }

            /**
             * <p>The execution priority of the automatic response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder responseRulePriority(Integer responseRulePriority) {
                this.responseRulePriority = responseRulePriority;
                return this;
            }

            /**
             * ResponseRuleRemark.
             */
            public Builder responseRuleRemark(String responseRuleRemark) {
                this.responseRuleRemark = responseRuleRemark;
                return this;
            }

            /**
             * <p>The status of the automatic response rule. Valid values:</p>
             * <ul>
             * <li>0: disabled</li>
             * <li>100: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder responseRuleStatus(Integer responseRuleStatus) {
                this.responseRuleStatus = responseRuleStatus;
                return this;
            }

            /**
             * <p>The type of the response rule. Valid values:</p>
             * <ul>
             * <li>preset: predefined</li>
             * <li>custom: custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder responseRuleType(String responseRuleType) {
                this.responseRuleType = responseRuleType;
                return this;
            }

            /**
             * <p>The trigger type of the automatic response rule. Valid values:</p>
             * <ul>
             * <li>event: event occurred</li>
             * <li>event_update: event updated</li>
             * <li>alert: alert occurred</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>event</p>
             */
            public Builder responseTriggerType(String responseTriggerType) {
                this.responseTriggerType = responseTriggerType;
                return this;
            }

            /**
             * <p>The time when the rule was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1769843323000</p>
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
