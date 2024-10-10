// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The asset auto-tagging rules.</p>
         */
        public Builder autoTagRuleList(java.util.List < AutoTagRuleList> autoTagRuleList) {
            this.autoTagRuleList = autoTagRuleList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E67FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAutoTagRulesResponseBody build() {
            return new ListAutoTagRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoTagRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoTagRulesResponseBody</p>
     */
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
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>558463566374****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614674401000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The expression of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;groups&quot;:&quot;0&quot;,&quot;fieldValueType&quot;:&quot;string&quot;,&quot;field&quot;:&quot;internetIp&quot;,&quot;operator&quot;:&quot;equals&quot;,&quot;value&quot;:&quot;12.0.0.1&quot;}]</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>900029</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timestamp when the rule was last updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614674401000</p>
             */
            public Builder modifiedTimestamp(Long modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>describe</p>
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_test_rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The tag specified by the operation type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tagId&quot;:4577447}</p>
             */
            public Builder tagContext(String tagContext) {
                this.tagContext = tagContext;
                return this;
            }

            /**
             * <p>The operation type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>group</strong></li>
             * <li><strong>tag</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>group</p>
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
    /**
     * 
     * {@link ListAutoTagRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoTagRulesResponseBody</p>
     */
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>196</p>
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
