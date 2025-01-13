// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRulesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>An array that consists of the sensitive data detection rules.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentCategory")
        private String contentCategory;

        @com.aliyun.core.annotation.NameInMap("CustomType")
        private Integer customType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HitTotalCount")
        private Integer hitTotalCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("MajorKey")
        private String majorKey;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private Integer matchType;

        @com.aliyun.core.annotation.NameInMap("ModelRuleIds")
        private String modelRuleIds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("StatExpress")
        private String statExpress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupportForm")
        private Integer supportForm;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TemplateRuleIds")
        private String templateRuleIds;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("WarnLevel")
        private Integer warnLevel;

        private Items(Builder builder) {
            this.category = builder.category;
            this.categoryName = builder.categoryName;
            this.content = builder.content;
            this.contentCategory = builder.contentCategory;
            this.customType = builder.customType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.hitTotalCount = builder.hitTotalCount;
            this.id = builder.id;
            this.loginName = builder.loginName;
            this.majorKey = builder.majorKey;
            this.matchType = builder.matchType;
            this.modelRuleIds = builder.modelRuleIds;
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.statExpress = builder.statExpress;
            this.status = builder.status;
            this.supportForm = builder.supportForm;
            this.target = builder.target;
            this.templateRuleIds = builder.templateRuleIds;
            this.userId = builder.userId;
            this.warnLevel = builder.warnLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentCategory
         */
        public String getContentCategory() {
            return this.contentCategory;
        }

        /**
         * @return customType
         */
        public Integer getCustomType() {
            return this.customType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hitTotalCount
         */
        public Integer getHitTotalCount() {
            return this.hitTotalCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return majorKey
         */
        public String getMajorKey() {
            return this.majorKey;
        }

        /**
         * @return matchType
         */
        public Integer getMatchType() {
            return this.matchType;
        }

        /**
         * @return modelRuleIds
         */
        public String getModelRuleIds() {
            return this.modelRuleIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return statExpress
         */
        public String getStatExpress() {
            return this.statExpress;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supportForm
         */
        public Integer getSupportForm() {
            return this.supportForm;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return templateRuleIds
         */
        public String getTemplateRuleIds() {
            return this.templateRuleIds;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return warnLevel
         */
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

        public static final class Builder {
            private Integer category; 
            private String categoryName; 
            private String content; 
            private String contentCategory; 
            private Integer customType; 
            private String description; 
            private String displayName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupId; 
            private Integer hitTotalCount; 
            private Long id; 
            private String loginName; 
            private String majorKey; 
            private Integer matchType; 
            private String modelRuleIds; 
            private String name; 
            private String productCode; 
            private Long productId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String statExpress; 
            private Integer status; 
            private Integer supportForm; 
            private String target; 
            private String templateRuleIds; 
            private Long userId; 
            private Integer warnLevel; 

            /**
             * <p>The content type of the sensitive data detection rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: keyword</li>
             * <li><strong>2</strong>: regular expression</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The name of the content type of the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Regular expression</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The content in the sensitive data detection rule.</p>
             * <blockquote>
             * <p> A built-in detection rule whose CustomType is 0 does not return the content of the rule.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>(?:\D|^)((?:(?:25[0-4]|2[0-4]\d|1\d{2}|[1-9]\d{1})\.)(?:(?:25[0-5]|2[0-4]\d|[01]?\d?\d)\.){2}(?:25[0-5]|2[0-4]\d|1[0-9]\d|[1-9]\d|[1-9]))(?:\D|$)</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The type of the content in the sensitive data detection rule. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentCategory(String contentCategory) {
                this.contentCategory = contentCategory;
                return this;
            }

            /**
             * <p>The type of the sensitive data detection rule.</p>
             * <ul>
             * <li>0: built-in rule</li>
             * <li>1: custom rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customType(Integer customType) {
                this.customType = customType;
                return this;
            }

            /**
             * <p>The description of the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The sensitive data detection rule is used to detect IP addresses.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the account that is used to create the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>****test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the sensitive data detection rule is created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545277010000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the sensitive data detection rule is modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545277010000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The parent group type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>4_1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The number of times that the sensitive data detection rule is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder hitTotalCount(Integer hitTotalCount) {
                this.hitTotalCount = hitTotalCount;
                return this;
            }

            /**
             * <p>The ID of the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username of the account that is used to create the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>det1111</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The key of the primary dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder majorKey(String majorKey) {
                this.majorKey = majorKey;
                return this;
            }

            /**
             * <p>The match type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: rule-based match</li>
             * <li><strong>2</strong>: dictionary-based match</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchType(Integer matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * ModelRuleIds.
             */
            public Builder modelRuleIds(String modelRuleIds) {
                this.modelRuleIds = modelRuleIds;
                return this;
            }

            /**
             * <p>The name of the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>IP address</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
             * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
             * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
             * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
             * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The sensitivity level of data that hits the sensitive data detection rule. Valid values:</p>
             * <ul>
             * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
             * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
             * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
             * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
             * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The statistical expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder statExpress(String statExpress) {
                this.statExpress = statExpress;
                return this;
            }

            /**
             * <p>The status of the sensitive data detection rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The data asset type that is supported by the sensitive data detection rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: all data assets</li>
             * <li><strong>1</strong>: structured data assets</li>
             * <li><strong>2</strong>: unstructured data assets</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder supportForm(Integer supportForm) {
                this.supportForm = supportForm;
                return this;
            }

            /**
             * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TemplateRuleIds.
             */
            public Builder templateRuleIds(String templateRuleIds) {
                this.templateRuleIds = templateRuleIds;
                return this;
            }

            /**
             * <p>The ID of the account that is used to create the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The severity level. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: low</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder warnLevel(Integer warnLevel) {
                this.warnLevel = warnLevel;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
