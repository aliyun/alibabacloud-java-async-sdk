// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListContainerDefenseRuleResponseBody</p>
 */
public class ListContainerDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContainerDefenseRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerDefenseRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List < List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The rules.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContainerDefenseRuleResponseBody build() {
            return new ListContainerDefenseRuleResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("ClusterIdList")
        private String clusterIdList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private Integer ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSwitch")
        private Integer ruleSwitch;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        private List(Builder builder) {
            this.clusterCount = builder.clusterCount;
            this.clusterIdList = builder.clusterIdList;
            this.description = builder.description;
            this.ruleAction = builder.ruleAction;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleSwitch = builder.ruleSwitch;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return clusterIdList
         */
        public String getClusterIdList() {
            return this.clusterIdList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleAction
         */
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSwitch
         */
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private Integer clusterCount; 
            private String clusterIdList; 
            private String description; 
            private Integer ruleAction; 
            private Long ruleId; 
            private String ruleName; 
            private Integer ruleSwitch; 
            private Integer ruleType; 

            /**
             * The total number of clusters.
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * The clusters specified in the rule.
             */
            public Builder clusterIdList(String clusterIdList) {
                this.clusterIdList = clusterIdList;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The action specified in the rule. Valid values:
             * <p>
             * 
             * *   **1**: alert
             * *   **2**: block
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **1**: system rule
             * *   **2**: custom rule
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LastRowKey")
        private String lastRowKey;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.lastRowKey = builder.lastRowKey;
            this.nextToken = builder.nextToken;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lastRowKey
         */
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private String lastRowKey; 
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The key of the last data entry.
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * The query credential.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
