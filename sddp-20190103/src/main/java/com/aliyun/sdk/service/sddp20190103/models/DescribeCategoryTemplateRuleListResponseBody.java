// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryTemplateRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoryTemplateRuleListResponseBody</p>
 */
public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCategoryTemplateRuleListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryTemplateRuleListResponseBody create() {
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
         * The list of rules.
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
         * The total number of rules in the template.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCategoryTemplateRuleListResponseBody build() {
            return new DescribeCategoryTemplateRuleListResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdentificationRuleIds")
        private String identificationRuleIds;

        @com.aliyun.core.annotation.NameInMap("IdentificationScope")
        private String identificationScope;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Items(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.identificationRuleIds = builder.identificationRuleIds;
            this.identificationScope = builder.identificationScope;
            this.name = builder.name;
            this.riskLevelId = builder.riskLevelId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identificationRuleIds
         */
        public String getIdentificationRuleIds() {
            return this.identificationRuleIds;
        }

        /**
         * @return identificationScope
         */
        public String getIdentificationScope() {
            return this.identificationScope;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String identificationRuleIds; 
            private String identificationScope; 
            private String name; 
            private Long riskLevelId; 
            private Integer status; 

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The unique ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The IDs of sensitive data types. Multiple IDs are separated by commas (,).
             */
            public Builder identificationRuleIds(String identificationRuleIds) {
                this.identificationRuleIds = identificationRuleIds;
                return this;
            }

            /**
             * The scan scope of the rule. The value is a JSON array of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:
             * <p>
             * 
             * *   **Asset**: the data asset type. Valid values: RDS, DRDS, PolarDB, OTS, ADB, and OceanBase. The value is of the STRING type.
             * 
             * *   **Content**: the scan scope. The value is of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:
             * 
             *     *   **Range**: the matching condition. Valid values: Instance, database, table, column, project, bucket, and object. The value project is valid only for data assets in MaxCompute. The values bucket and object are valid only for data assets in Object Storage Service (OSS). The value of this parameter is of the STRING type.
             *     *   **Operator**: the operator. Valid values: equals, regex, prefix, and suffix. The operator equals indicates a full match. The operator regex indicates a match by regular expression. The operator prefix indicates a match by prefix. The operator suffix indicates a match by suffix.
             *     *   **Value**: the matching content. The value is of the STRING type.
             */
            public Builder identificationScope(String identificationScope) {
                this.identificationScope = identificationScope;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The sensitivity level of the data that is not compliant with the rule. Valid values: **1** to **11**.
             * <p>
             * 
             * *   **1**: No sensitive data is detected.
             * *   **2**: indicates the S1 sensitivity level.
             * *   **3**: indicates the S2 sensitivity level.
             * *   **4**: indicates the S3 sensitivity level.
             * *   **5**: indicates the S4 sensitivity level.
             * *   **6**: indicates the S5 sensitivity level.
             * *   **7**: indicates the S6 sensitivity level.
             * *   **8**: indicates the S7 sensitivity level.
             * *   **9**: indicates the S8 sensitivity level.
             * *   **10**: indicates the S9 sensitivity level.
             * *   **11**: indicates the S10 sensitivity level.
             * *   **null**: indicates all preceding sensitivity levels.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             * *   **null**: all states
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
