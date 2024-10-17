// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTablesResponseBody</p>
 */
public class DescribeTablesResponseBody extends TeaModel {
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

    private DescribeTablesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTablesResponseBody create() {
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
         * <p>An array that consists of tables.</p>
         */
        public Builder items(java.util.List < Items> items) {
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
         * <p>13</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTablesResponseBody build() {
            return new DescribeTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTablesResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        private RuleList(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
            this.riskLevelId = builder.riskLevelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
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

        public static final class Builder {
            private Long count; 
            private String name; 
            private Long riskLevelId; 

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Rule name</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>1</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTablesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveRatio")
        private String sensitiveRatio;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.id = builder.id;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.name = builder.name;
            this.owner = builder.owner;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleList = builder.ruleList;
            this.sensitive = builder.sensitive;
            this.sensitiveCount = builder.sensitiveCount;
            this.sensitiveRatio = builder.sensitiveRatio;
            this.tenantName = builder.tenantName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
        public String getProductId() {
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
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return sensitiveCount
         */
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return sensitiveRatio
         */
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long creationTime; 
            private Long id; 
            private String instanceDescription; 
            private Long instanceId; 
            private String instanceName; 
            private String name; 
            private String owner; 
            private String productCode; 
            private String productId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private java.util.List < RuleList> ruleList; 
            private Boolean sensitive; 
            private Integer sensitiveCount; 
            private String sensitiveRatio; 
            private String tenantName; 
            private Integer totalCount; 

            /**
             * <p>The point in time when the table was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1536751124000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Description 1</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The ID of the data asset to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the data asset to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Asset 1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>gxdata</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtdep-239-******</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the service to which the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>. For more information about the types of data assets from which DSC can scan for sensitive data, see <a href="https://help.aliyun.com/document_detail/212906.html">Supported data assets</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the service to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The sensitivity level of the table. Each sensitivity level ID corresponds to a sensitivity level name. Valid values:</p>
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
             * <p>The name of the sensitivity level for the table. Valid values:</p>
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
             * <p>The information about the sensitive data detection rules that are hit.</p>
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>Indicates whether the table contains sensitive fields. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The total number of sensitive fields in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The percentage of sensitive fields in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>21%</p>
             */
            public Builder sensitiveRatio(String sensitiveRatio) {
                this.sensitiveRatio = sensitiveRatio;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant 1</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The total number of fields in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
