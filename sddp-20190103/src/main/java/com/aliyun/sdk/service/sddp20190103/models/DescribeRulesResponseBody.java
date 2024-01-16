// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array that consists of the sensitive data detection rules.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Category")
        private Integer category;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Content")
        private String content;

        @NameInMap("ContentCategory")
        private String contentCategory;

        @NameInMap("CustomType")
        private Integer customType;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HitTotalCount")
        private Integer hitTotalCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("MajorKey")
        private String majorKey;

        @NameInMap("MatchType")
        private Integer matchType;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductId")
        private Long productId;

        @NameInMap("RiskLevelId")
        private Long riskLevelId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("StatExpress")
        private String statExpress;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupportForm")
        private Integer supportForm;

        @NameInMap("Target")
        private String target;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("WarnLevel")
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
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.statExpress = builder.statExpress;
            this.status = builder.status;
            this.supportForm = builder.supportForm;
            this.target = builder.target;
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
            private String name; 
            private String productCode; 
            private Long productId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String statExpress; 
            private Integer status; 
            private Integer supportForm; 
            private String target; 
            private Long userId; 
            private Integer warnLevel; 

            /**
             * The content type of the sensitive data detection rule. Valid values:
             * <p>
             * 
             * *   **0**: keyword
             * *   **2**: regular expression
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * The name of the content type of the sensitive data detection rule.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * The content in the sensitive data detection rule.
             * <p>
             * 
             * >  A built-in detection rule whose CustomType is 0 does not return the content of the rule.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The type of the content in the sensitive data detection rule. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.
             */
            public Builder contentCategory(String contentCategory) {
                this.contentCategory = contentCategory;
                return this;
            }

            /**
             * The type of the sensitive data detection rule.
             * <p>
             * 
             * *   0: built-in rule
             * *   1: custom rule
             */
            public Builder customType(Integer customType) {
                this.customType = customType;
                return this;
            }

            /**
             * The description of the sensitive data detection rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the account that is used to create the sensitive data detection rule.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The time when the sensitive data detection rule is created. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the sensitive data detection rule is modified. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The parent group type of the rule.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The number of times that the sensitive data detection rule is hit.
             */
            public Builder hitTotalCount(Integer hitTotalCount) {
                this.hitTotalCount = hitTotalCount;
                return this;
            }

            /**
             * The ID of the sensitive data detection rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The username of the account that is used to create the sensitive data detection rule.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * The key of the primary dimension.
             */
            public Builder majorKey(String majorKey) {
                this.majorKey = majorKey;
                return this;
            }

            /**
             * The match type. Valid values:
             * <p>
             * 
             * *   **1**: rule-based match
             * *   **2**: dictionary-based match
             */
            public Builder matchType(Integer matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * The name of the sensitive data detection rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the service to which the data asset belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the service to which the sensitive data detection rule is applied. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:
             * <p>
             * 
             * *   **1**: N/A, which indicates that no sensitive data is detected.
             * *   **2**: S1, which indicates the low sensitivity level.
             * *   **3**: S2, which indicates the medium sensitivity level.
             * *   **4**: S3, which indicates the high sensitivity level.
             * *   **5**: S4, which indicates the highest sensitivity level.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * The sensitivity level of data that hits the sensitive data detection rule. Valid values:
             * <p>
             * 
             * *   **N/A**: indicates that no sensitive data is detected.
             * *   **S1**: indicates the low sensitivity level.
             * *   **S2**: indicates the medium sensitivity level.
             * *   **S3**: indicates the high sensitivity level.
             * *   **S4**: indicates the highest sensitivity level.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * The statistical expression.
             */
            public Builder statExpress(String statExpress) {
                this.statExpress = statExpress;
                return this;
            }

            /**
             * The status of the sensitive data detection rule. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The data asset type that is supported by the sensitive data detection rule. Valid values:
             * <p>
             * 
             * *   **0**: all data assets
             * *   **1**: structured data assets
             * *   **2**: unstructured data assets
             */
            public Builder supportForm(Integer supportForm) {
                this.supportForm = supportForm;
                return this;
            }

            /**
             * The name of the service to which the data asset belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The ID of the account that is used to create the sensitive data detection rule.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The severity level. Valid values:
             * <p>
             * 
             * *   **1**: low
             * *   **2**: medium
             * *   **3**: high
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
