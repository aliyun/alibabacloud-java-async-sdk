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
 * {@link DescribeCategoryTemplateRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoryTemplateRuleListResponseBody</p>
 */
public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
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
         * <p>The list of rules.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>136082B3-B21F-5E9D-B68E-991FFD205D24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of rules in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCategoryTemplateRuleListResponseBody build() {
            return new DescribeCategoryTemplateRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCategoryTemplateRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCategoryTemplateRuleListResponseBody</p>
     */
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
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Rule for identifying ID card numbers</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IDs of sensitive data types. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1001,1002</p>
             */
            public Builder identificationRuleIds(String identificationRuleIds) {
                this.identificationRuleIds = identificationRuleIds;
                return this;
            }

            /**
             * <p>The scan scope of the rule. The value is a JSON array of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
             * <ul>
             * <li><p><strong>Asset</strong>: the data asset type. Valid values: RDS, DRDS, PolarDB, OTS, ADB, and OceanBase. The value is of the STRING type.</p>
             * </li>
             * <li><p><strong>Content</strong>: the scan scope. The value is of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
             * <ul>
             * <li><strong>Range</strong>: the matching condition. Valid values: Instance, database, table, column, project, bucket, and object. The value project is valid only for data assets in MaxCompute. The values bucket and object are valid only for data assets in Object Storage Service (OSS). The value of this parameter is of the STRING type.</li>
             * <li><strong>Operator</strong>: the operator. Valid values: equals, regex, prefix, and suffix. The operator equals indicates a full match. The operator regex indicates a match by regular expression. The operator prefix indicates a match by prefix. The operator suffix indicates a match by suffix.</li>
             * <li><strong>Value</strong>: the matching content. The value is of the STRING type.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;database&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;table&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;column&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;project&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;table&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;column&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]}]</p>
             */
            public Builder identificationScope(String identificationScope) {
                this.identificationScope = identificationScope;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ID card number</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: <strong>1</strong> to <strong>11</strong>.</p>
             * <ul>
             * <li><strong>1</strong>: No sensitive data is detected.</li>
             * <li><strong>2</strong>: indicates the S1 sensitivity level.</li>
             * <li><strong>3</strong>: indicates the S2 sensitivity level.</li>
             * <li><strong>4</strong>: indicates the S3 sensitivity level.</li>
             * <li><strong>5</strong>: indicates the S4 sensitivity level.</li>
             * <li><strong>6</strong>: indicates the S5 sensitivity level.</li>
             * <li><strong>7</strong>: indicates the S6 sensitivity level.</li>
             * <li><strong>8</strong>: indicates the S7 sensitivity level.</li>
             * <li><strong>9</strong>: indicates the S8 sensitivity level.</li>
             * <li><strong>10</strong>: indicates the S9 sensitivity level.</li>
             * <li><strong>11</strong>: indicates the S10 sensitivity level.</li>
             * <li><strong>null</strong>: indicates all preceding sensitivity levels.</li>
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
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>null</strong>: all states</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
