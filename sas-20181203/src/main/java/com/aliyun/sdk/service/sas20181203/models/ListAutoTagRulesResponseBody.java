// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoTagRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoTagRulesResponseBody</p>
 */
public class ListAutoTagRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoTagRuleList")
    private java.util.List < AutoTagRuleList> autoTagRuleList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAutoTagRulesResponseBody(Builder builder) {
        this.autoTagRuleList = builder.autoTagRuleList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoTagRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoTagRuleList
     */
    public java.util.List < AutoTagRuleList> getAutoTagRuleList() {
        return this.autoTagRuleList;
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

    public static final class Builder {
        private java.util.List < AutoTagRuleList> autoTagRuleList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The asset auto-tagging rules.
         */
        public Builder autoTagRuleList(java.util.List < AutoTagRuleList> autoTagRuleList) {
            this.autoTagRuleList = autoTagRuleList;
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

        public ListAutoTagRulesResponseBody build() {
            return new ListAutoTagRulesResponseBody(this);
        } 

    } 

    public static class AutoTagRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimestamp")
        private Long modifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TagContext")
        private String tagContext;

        @com.aliyun.core.annotation.NameInMap("TagType")
        private String tagType;

        private AutoTagRuleList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.createTimestamp = builder.createTimestamp;
            this.expression = builder.expression;
            this.id = builder.id;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.ruleDesc = builder.ruleDesc;
            this.ruleName = builder.ruleName;
            this.tagContext = builder.tagContext;
            this.tagType = builder.tagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoTagRuleList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return modifiedTimestamp
         */
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return tagContext
         */
        public String getTagContext() {
            return this.tagContext;
        }

        /**
         * @return tagType
         */
        public String getTagType() {
            return this.tagType;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long createTimestamp; 
            private String expression; 
            private Integer id; 
            private Long modifiedTimestamp; 
            private String ruleDesc; 
            private String ruleName; 
            private String tagContext; 
            private String tagType; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The timestamp when the rule was created. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The expression of the rule.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The timestamp when the rule was last updated. Unit: milliseconds.
             */
            public Builder modifiedTimestamp(Long modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
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
             * The tag specified by the operation type of the rule.
             */
            public Builder tagContext(String tagContext) {
                this.tagContext = tagContext;
                return this;
            }

            /**
             * The operation type of the rule. Valid values:
             * <p>
             * 
             * *   **group**
             * *   **tag**
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            public AutoTagRuleList build() {
                return new AutoTagRuleList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
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
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
